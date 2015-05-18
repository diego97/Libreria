package vista;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.util.LinkedList;

import javafx.stage.FileChooser;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.DefaultCaret;

import modelo.dao.DAOCliente;
import modelo.entidades.Cliente;
import modelo.util.Util;
import controlador.Controlador;

public class DialogoCrearCliente extends JDialog {

	private static final long serialVersionUID = 1L;
	public static final String TITULO = "Crear Cliente";
	private JLabel lbNombre;
	private JLabel lbDinero;
	private JTextField txNombre;
	private JTextField txDinero;
	private JLabel lbLibros;
	private JButton btnCrearCliente;
	private Controlador controlador;
	private Cliente sitioTuristico;


	public DialogoCrearCliente(VentanaInicial ventanaPrincipal, Controlador controlador) {
		super(ventanaPrincipal);
		this.controlador = controlador;
		setLocationRelativeTo(ventanaPrincipal);
		setTitle(TITULO);
		setSize(600, 600);
		setLocationRelativeTo(null);
		setLayout(null);
		setBackground(Color.black);

		lbNombre = new JLabel(ConstantesGUI.T_NOMBRE);
		lbNombre.setBounds(100, 50, 100, 50);

		add(lbNombre);

		txNombre = new JTextField();
		txNombre.setBounds(200, 60, 100, 20);

		add(txNombre);

		lbDinero = new JLabel(ConstantesGUI.T_VALOR);
		lbDinero.setBounds(100, 100, 100, 50);

		add(lbDinero);

		txDinero = new JTextField();
		txDinero.setBounds(200, 110, 100, 20);

		add(txDinero);

		lbLibros = new JLabel(ConstantesGUI.T_INFORMACION);
		lbLibros.setBounds(100, 150, 100, 50);

		add(lbLibros);

		btnCrearCliente = new JButton(ConstantesGUI.T_ITEM_NUEVO);
		btnCrearCliente.setBounds(250, 500, 150, 40);
		btnCrearCliente.setActionCommand(Controlador.A_CREAR_NUEVO_SITIO);
		btnCrearCliente.setActionCommand(Controlador.A_CREAR_NUEVO_SITIO);
		btnCrearCliente.addActionListener(controlador);
		btnCrearCliente.setIcon(ConstantesGUI.CHECK_IMAGE);
		btnCrearCliente.setDisabledIcon(ConstantesGUI.CHECK_IMAGE);
		btnCrearCliente.setOpaque(false);
		btnCrearCliente.setContentAreaFilled(false);
		add(btnCrearCliente);

	}

	public Cliente CrearSitio(){
		dispose();

		return DAOCliente.crearCliente(txNombre.getText(), Double.parseDouble(txDinero.getText()), null);
	}

	public JTextField getTxNombre() {
		return txNombre;
	}

	public void setTxNombre(JTextField txNombre) {
		this.txNombre = txNombre;
	}

	public JTextField getTxValor() {
		return txDinero;
	}

	public void setTxValor(JTextField txValor) {
		this.txDinero = txValor;
	}


	public static void main(String[] args) {
		DialogoCrearCliente d = new DialogoCrearCliente(null, null);
		d.setVisible(true);
	}
}