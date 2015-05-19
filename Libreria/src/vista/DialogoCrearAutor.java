package vista;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class DialogoCrearAutor extends JDialog{
	
	private static final long serialVersionUID = 1L;
	private JLabel lbNombre;
	private JTextField txNombre;
	private JButton btnCrearLibro;
	private JButton btnCancelar;
	
	public DialogoCrearAutor() {
		setTitle(ConstantesGUI.T_CREAR_AUTOR);
		setSize(ConstantesGUI.ANCHO_DIALOGO, ConstantesGUI.ALTO_DIALOGO);
		setLayout(null);
		setLocationRelativeTo(null);
		setModal(true);
		
		lbNombre = new JLabel(ConstantesGUI.T_NOMBRE);
		lbNombre.setBounds(30, 100, 100, 50);
		add(lbNombre);
		
		txNombre = new JTextField();
		txNombre.setBounds(100, 110, 100, 25);
		add(txNombre);
		
		btnCrearLibro = new JButton(ConstantesGUI.T_CREAR_AUTOR);
		btnCrearLibro.setBounds(350, 500, 100, 30);
		add(btnCrearLibro);
		
		btnCancelar = new JButton(ConstantesGUI.T_CANCELAR);
		btnCancelar.setBounds(50, 500, 100, 30);
		add(btnCancelar);
	}
	
	public static void main(String[] args) {
		DialogoCrearAutor di = new DialogoCrearAutor();
		di.setVisible(true);
	}
}