package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import modelo.entidades.Libreria;
import vista.DialogoCrearCliente;
import vista.VentanaInicial;

public class Controlador implements ActionListener, ChangeListener{
	private VentanaInicial ventanaPrincipal;
	private DialogoCrearCliente dialogoCrearCliente;
	private Libreria libreria;
	public static final String A_CREAR_NUEVO_SITIO = "CREAR_NUEVO_SITIO";
	public static final String A_EDITAR_SITIO = "EDITAR_SITIO";
	public static final String A_BORRAR_SITIO = "BORRAR_SITIO";
	public static final String A_MOSTRAR_CREAR_SITIO = "MOSTRAR_CREAR_SITIO";
	public static final String A_ABRIR_ARCHIVO = "ABRIR_SITIO";
	public static final String A_GUARDAR_ARCHIVO = "GUARDAR_SITIO";
	public static final String A_MOSTRAR_EDITAR_SITIO = "MOSTAR_EDITAR_SITIO";
	public static final String A_BUSCAR_SITIO = "BUSCAR_SITIO";
	int id;
	

	public Controlador() {
		ventanaPrincipal = new VentanaInicial();
		dialogoCrearCliente = new DialogoCrearCliente(ventanaPrincipal, this);
		libreria = new Libreria();
		ventanaPrincipal.setVisible(true);

	}

	public VentanaInicial getVentanaPrincipal() {
		return ventanaPrincipal;
	}
	public DialogoCrearCliente getDialogoCrearCliente() {
		return dialogoCrearCliente;
	}
	public Libreria getLibreria() {
		return libreria;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void stateChanged(ChangeEvent e) {
		for (int i = 0; i < dialogoCrearCliente.getListaCheckboxsLibros().length; i++) {
			 if(dialogoCrearCliente.getListaCheckboxsLibros()[1].isSelected()== true){
				 System.out.println(dialogoCrearCliente.getListaCheckboxsLibros()[i].getText());
				 System.out.println("wfd");
			 }
			}
	}
	}