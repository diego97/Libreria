package vista;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JFileChooser;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.ChangeListener;

import modelo.dao.DAOCliente;
import modelo.entidades.Cliente;
import modelo.entidades.Libro;
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
	private Cliente cliente;
	private JPanel p1;
	private JCheckBox[]  listaCheckboxsLibros;

	public DialogoCrearCliente(VentanaInicial ventanaPrincipal, Controlador controlador) {
		super(ventanaPrincipal);
		this.controlador = controlador;
		setLocationRelativeTo(ventanaPrincipal);
		setTitle(TITULO);
		setSize(600, 600);
		setLocationRelativeTo(null);
		setLayout(null);
		setBackground(Color.black);
		//prueba
		ArrayList<Libro> listaLibros = new ArrayList<Libro>();
		listaLibros.add(new Libro(0, "s213123sfd", "dsdfs", null, 2432, null, "wdff", 32));
		listaLibros.add(new Libro(0, "s33332332sfd", "dsdfs", null, 2432, null, "wdff", 32));
		listaLibros.add(new Libro(0, "s2323ewsfd", "dsdfs", null, 2432, null, "wdff", 32));
		listaLibros.add(new Libro(0, "swewsfd", "dsdfs", null, 2432, null, "wdff", 32));
		listaLibros.add(new Libro(0, "ssqqqqqqfd", "dsdfs", null, 2432, null, "wdff", 32));
		listaLibros.add(new Libro(0, "sswwwwwwfd", "dsdfs", null, 2432, null, "wdff", 32));
		listaLibros.add(new Libro(0, "wwwwssfd", "dsdfs", null, 2432, null, "wdff", 32));
		listaCheckboxsLibros = new JCheckBox[listaLibros.size()]; 
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

		p1 = new JPanel(); 
		p1.setLayout(new FlowLayout());
		p1.setBackground(Color.blue);
		p1.setBounds(200, 200, 200, 200);
		for( int i=0; i<listaLibros.size() ; i++){
			listaCheckboxsLibros[i] = new JCheckBox(listaLibros.get(i).getNombre());
			listaCheckboxsLibros[i].addChangeListener(controlador);
			p1.add( listaCheckboxsLibros[i] );
		}
		add(p1); 
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
	


	public JCheckBox[] getListaCheckboxsLibros() {
		return listaCheckboxsLibros;
	}
	public void setListaCheckboxsLibros(JCheckBox[] listaCheckboxsLibros) {
		this.listaCheckboxsLibros = listaCheckboxsLibros;
	}
	public static void main(String[] args) {
		DialogoCrearCliente cli = new DialogoCrearCliente(null, null);
		cli.setVisible(true);
	}
}
