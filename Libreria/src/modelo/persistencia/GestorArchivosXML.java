package modelo.persistencia;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import modelo.entidades.Libro;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class GestorArchivosXML {

	public static final String RUTA = "src/files/";
	public static final String EXTENSION = ".xml";
	public static final String NOMBRE = "Nombre";
	public static final String ID = "id";
	public static final String INFORMACION = "Informacion"; 
	public static final String VALOR = "Valor";
	public static final String IMAGEN = "Imagen";
	public static final String NUMERO_VISITAS = "Visitas";

	public static void exportarArchivoXML(Libro libro){
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document archivo = builder.newDocument();

			Element cuerpo = archivo.createElement("SitiosTuristicos");
			archivo.appendChild(cuerpo);

			Attr atributos = archivo.createAttribute(ID);
			atributos.setValue(Integer.toString(libro.getId()));
			cuerpo.setAttributeNode(atributos);

			Element nombre = archivo.createElement(NOMBRE);
			nombre.appendChild(archivo.createTextNode(libro.getNombre()));				
			cuerpo.appendChild(nombre);

			Element informacion = archivo.createElement(INFORMACION);
			informacion.appendChild(archivo.createTextNode(libro.getEditorial()));
			cuerpo.appendChild(informacion);

			Element valor = archivo.createElement(VALOR);
			valor.appendChild(archivo.createTextNode(Double.toString(libro.getValor())));
			cuerpo.appendChild(valor);

			Element imagen = archivo.createElement(IMAGEN);
			imagen.appendChild(archivo.createTextNode(libro.getImagenPortada()));
			cuerpo.appendChild(imagen);

			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(archivo);
			StreamResult resultado = new StreamResult(new File(RUTA + libro.getNombre() + EXTENSION));

			try {
				transformer.transform(domSource, resultado);
			} catch (TransformerException e) {
				e.printStackTrace();
			}

		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (TransformerConfigurationException e) {
			e.printStackTrace();
		}
	}

	/**public static Libro importarArchivoXMl(){
		Libro sitio = null;
		File archivo = null;
		JFileChooser jf = new JFileChooser("/PROGRAMACION/Proyectos/GestorDeTurismo/src/files");
		int option = jf.showOpenDialog(null);
		if (option == JFileChooser.APPROVE_OPTION) {
			archivo = jf.getSelectedFile();
		}
		try {
			DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
			Document documento;
			try {
				documento = documentBuilder.parse(archivo);
				documento.getDocumentElement().normalize();
				Element doc = documento.getDocumentElement();
				NodeList lista = doc.getChildNodes();
				sitio = new Libro(Integer.parseInt(lista.item(0).getTextContent()), lista.item(1)getTextContent() , lista.item(2)getTextContent(), (Autor)lista.item(3)getTextContent(), lista.item(4)getTextContent(), lista.item(5)getTextContent(), lista.item(6)getTextContent(), lista.item(7)getTextContent(), lista.item(8)getTextContent());
			} catch (SAXException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
		return sitio;
	}**/
}