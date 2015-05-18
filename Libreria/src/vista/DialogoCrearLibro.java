package vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
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
	private JComboBox<Autor> autor;
	private JLabel lbValor;
	private JTextField txValor;
	private JLabel lbGenero;
	private JComboBox<EnumGeneroLibro> genero;
	private JLabel lbPortada;
	private JButton btnSubirImagenPortada;
	private JLabel lbRuta;
	
	public DialogoCrearLibro() {
		setTitle(ConstantesGUI.T_CREAR_LIBRO);
		setSize(ConstantesGUI.ANCHO_DIALOGO, ConstantesGUI.ALTO_DIALOGO);
		setLayout(null);
		setLocationRelativeTo(null);
		//setModal(true);
		
		lbId = new JLabel(ConstantesGUI.T_ID);
		lbId.setBounds(30, 50, 100, 50);
		add(lbId);
		
		txId = new JTextField();
		txId.setBounds(100, 50, 100, 50);
		add(txId);
	}
	
	public static void main(String[] args) {
		DialogoCrearLibro d = new DialogoCrearLibro();
		d.setVisible(true);
	}
}