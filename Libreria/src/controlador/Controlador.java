package controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import vista.DialogoCrearCliente;
import vista.VentanaInicial;


public class Controlador implements ActionListener{
	private VentanaInicial ventanaPrincipal;
	private DialogoCrearCliente dialogoSitioTuristico;
	public static final String A_CREAR_NUEVO_SITIO = "CREAR_NUEVO_SITIO";
	public static final String A_EDITAR_SITIO = "EDITAR_SITIO";
	public static final String A_BORRAR_SITIO = "BORRAR_SITIO";
	public static final String A_MOSTRAR_CREAR_SITIO = "MOSTRAR_CREAR_SITIO";
	public static final String A_ABRIR_ARCHIVO = "ABRIR_SITIO";
	public static final String A_GUARDAR_ARCHIVO = "GUARDAR_SITIO";
	public static final String A_MOSTRAR_EDITAR_SITIO = "MOSTAR_EDITAR_SITIO";
	public static final String A_BUSCAR_SITIO = "BUSCAR_SITIO";
	int id;
	private JLabel labelAUX;

	public Controlador() {
		ventanaPrincipal = new VentanaInicial();
		dialogoSitioTuristico = new DialogoCrearCliente(ventanaPrincipal, this);
		ventanaPrincipal.setVisible(true);

	}

	public VentanaInicial getVentanaPrincipal() {
		return ventanaPrincipal;
	}

	public void setVentanaPrincipal(VentanaInicial ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
	}

	public DialogoCrearCliente getDialogoSitioTuristico() {
		return dialogoSitioTuristico;
	}

	public void setDialogoSitioTuristico(DialogoCrearCliente dialogoSitioTuristico) {
		this.dialogoSitioTuristico = dialogoSitioTuristico;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


}