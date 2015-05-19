package vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controlador.Controlador;
import modelo.entidades.Autor;
import modelo.entidades.EnumGeneroLibro;

public class DialogoCrearLibro extends JDialog{

	private static final long serialVersionUID = 1L;
	private JLabel lbId;
	private JTextField txId;
	private JLabel lbNombre;
	private JTextField txNombre;
	private JLabel lbEditorial;
	private JTextField txEditorial;
	private JLabel lbAutor;
	private JComboBox<Autor> boxAutor;
	private JLabel lbValor;
	private JTextField txValor;
	private JLabel lbGenero;
	private JComboBox<EnumGeneroLibro> boxGenero;
	private JLabel lbPortada;
	private JButton btnSubirImagenPortada;
	private JLabel lbRuta;
	private JButton btnCrearLibro;
	private JButton btnCancelar;
	
	public DialogoCrearLibro() {
		setTitle(ConstantesGUI.T_CREAR_LIBRO);
		setSize(ConstantesGUI.ANCHO_DIALOGO, ConstantesGUI.ALTO_DIALOGO);
		setLayout(null);
		setLocationRelativeTo(null);
		setModal(true);
		
		lbId = new JLabel(ConstantesGUI.T_ID);
		lbId.setBounds(30, 50, 100, 50);
		add(lbId);
		
		txId = new JTextField();
		txId.setBounds(100, 60, 100, 25);
		add(txId);
		
		lbNombre = new JLabel(ConstantesGUI.T_NOMBRE);
		lbNombre.setBounds(30, 100, 100, 50);
		add(lbNombre);
		
		txNombre = new JTextField();
		txNombre.setBounds(100, 110, 100, 25);
		add(txNombre);
		
		lbEditorial = new JLabel(ConstantesGUI.T_EDITORIAL);
		lbEditorial.setBounds(30, 150, 100, 50);
		add(lbEditorial);
		
		txEditorial = new JTextField();
		txEditorial.setBounds(100, 160, 100, 25);
		add(txEditorial);
		
		lbAutor = new JLabel(ConstantesGUI.T_AUTOR);
		lbAutor.setBounds(30, 200, 100, 50);
		add(lbAutor);
		
		boxAutor = new JComboBox<Autor>();
		boxAutor.setBounds(100, 210, 200, 30);
		add(boxAutor);
		
		lbValor = new JLabel(ConstantesGUI.T_VALOR);
		lbValor.setBounds(30, 250, 100, 50);
		add(lbValor);
		
		txValor = new JTextField();
		txValor.setBounds(100, 260, 100, 25);
		add(txValor);
		
		lbGenero = new JLabel(ConstantesGUI.T_GENERO);
		lbGenero.setBounds(30, 300, 100, 50);
		add(lbGenero);
		
		boxGenero = new JComboBox<EnumGeneroLibro>();
		boxGenero.setBounds(100, 310, 200, 30);
		add(boxGenero);
		
		lbPortada = new JLabel(ConstantesGUI.T_PORTADA);
		lbPortada.setBounds(30, 350, 100, 50);
		add(lbPortada);
		
		btnSubirImagenPortada = new JButton("Subir Imagen");
		btnSubirImagenPortada.setBounds(100, 360, 150, 20);
		add(btnSubirImagenPortada);
		
		lbRuta = new JLabel("holl");
		lbRuta.setBounds(300, 345, 100, 50);
		add(lbRuta);
		
		btnCrearLibro = new JButton(ConstantesGUI.T_CREAR_LIBRO);
		btnCrearLibro.setBounds(350, 500, 100, 30);
		add(btnCrearLibro);
		
		btnCancelar = new JButton(ConstantesGUI.T_CANCELAR);
		btnCancelar.setBounds(50, 500, 100, 30);
		add(btnCancelar);
	}
	
	public static void main(String[] args) {
		DialogoCrearLibro d = new DialogoCrearLibro();
		d.setVisible(true);
	}
}