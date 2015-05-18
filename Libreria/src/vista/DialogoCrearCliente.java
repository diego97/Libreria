package vista;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import modelo.entidades.Cliente;
import modelo.util.Util;
import controlador.Controlador;

public class DialogoCrearCliente extends JDialog {

	private static final long serialVersionUID = 1L;
	public static final String TITULO = "Crear Sitio Turistico";
	private JLabel lbNombre;
	private JLabel lbValor;
	private JTextField txNombre;
	private JTextArea txValor;
	private JLabel lbInformacion;
	private JTextArea txInformacion;
	private JButton btnCrearSitio;
	private JLabel lbImageNombre;
	private JLabel lbImageValor;
	private JLabel lbImageInformacion;
	private JLabel lbImagePath;
	private JLabel lbImagePathIco;
	private JLabel lbImagePathRuta;
	private Controlador controlador;
	private Cliente cliente;
	private JButton btnCargar;
	private File fichero; 
	private String path = "";
	private ImageIcon image;
	private JFileChooser fileChooser;
	private File imageFolderFile;
	private ImageIcon imageScalada;

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

		lbValor = new JLabel(ConstantesGUI.T_VALOR);
		lbValor.setBounds(100, 100, 100, 50);

		add(lbValor);

		txValor = new JTextArea();
		txValor.setBounds(200, 110, 100, 20);

		add(txValor);

		lbInformacion = new JLabel(ConstantesGUI.T_INFORMACION);
		lbInformacion.setBounds(100, 150, 100, 50);

		add(lbInformacion);


		txInformacion = new JTextArea();
		txInformacion.setLineWrap(true);
		txInformacion.setBounds(200, 170, 300, 200);

		add(txInformacion);

		lbImagePath = new JLabel(ConstantesGUI.T_IMAGEN);
		lbImagePath.setBounds(100, 400, 100, 50);

		add(lbImagePath);

		btnCrearSitio = new JButton(ConstantesGUI.T_ITEM_NUEVO);
		btnCrearSitio.setBounds(250, 500, 150, 40);
		btnCrearSitio.setActionCommand(Controlador.A_CREAR_NUEVO_SITIO);
		btnCrearSitio.setActionCommand(Controlador.A_CREAR_NUEVO_SITIO);
		btnCrearSitio.addActionListener(controlador);
		btnCrearSitio.setIcon(ConstantesGUI.CHECK_IMAGE);
		btnCrearSitio.setDisabledIcon(ConstantesGUI.CHECK_IMAGE);
		btnCrearSitio.setOpaque(false);
		btnCrearSitio.setContentAreaFilled(false);
		add(btnCrearSitio);

		lbImageNombre = new JLabel();
		lbImageNombre.setBounds(30, 50, 100, 50);
		lbImageNombre.setIcon(ConstantesGUI.NAME_IMAGE);
		lbImageNombre.setDisabledIcon(ConstantesGUI.CHECK_IMAGE);
		add(lbImageNombre);

		lbImageValor = new JLabel();
		lbImageValor.setBounds(30, 100, 100, 50);
		lbImageValor.setIcon(ConstantesGUI.PRICE_IMAGE);
		lbImageValor.setDisabledIcon(ConstantesGUI.CHECK_IMAGE);
		add(lbImageValor);

		lbImageInformacion = new JLabel();
		lbImageInformacion.setBounds(30, 150, 100, 50);
		lbImageInformacion.setIcon(ConstantesGUI.INFORMATION_IMAGE);
		lbImageInformacion.setDisabledIcon(ConstantesGUI.CHECK_IMAGE);
		add(lbImageInformacion);

		lbImagePathIco = new JLabel();
		lbImagePathIco.setBounds(30, 400, 100, 50);
		lbImagePathIco.setIcon(ConstantesGUI.SITE_IMAGE);
		lbImagePathIco.setDisabledIcon(ConstantesGUI.SITE_IMAGE);
		add(lbImagePathIco);

		lbImagePath = new JLabel("Path");
		lbImagePath.setBounds(350, 400, 200, 50);

		lbImagePath.setBackground(Color.decode("#D8DBE2"));
		lbImagePath.setForeground(Color.decode("#CFCFCF"));
		lbImagePath.setOpaque(true);
		add(lbImagePath);

		btnCargar = new JButton("Buscar Imagen");
		btnCargar.setBounds(200, 400, 100, 50);
		btnCargar.setBackground(Color.darkGray);
		btnCargar.setForeground(Color.WHITE);
		add(btnCargar);
		btnCargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnAgregarImagenActionPerformed(evt);
			}
		});	
	}

	public Cliente getSitioTuristico() {
		return cliente;
	}
	public void setSitioTuristico(Cliente sitioTuristico) {
		this.cliente = sitioTuristico;
	}

	public void btnAgregarImagenActionPerformed(ActionEvent evt) {
		fileChooser = new JFileChooser();
		FileNameExtensionFilter filtro = new FileNameExtensionFilter(".jpg & .gif", "jpg", "gif");
		fileChooser.setFileFilter(filtro);
		fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		int result = fileChooser.showOpenDialog(fileChooser);
		if (result == JFileChooser.APPROVE_OPTION){
			imageFolderFile= fileChooser.getSelectedFile();
			ImageIcon image = new ImageIcon(fileChooser.getSelectedFile().getPath());
			lbImagePath.setText(fileChooser.getSelectedFile().getPath());
			lbImagePath.setForeground(Color.BLACK);
		}
	}
	public Cliente CrearSitio(){
		dispose();
		String extensionFile = Util.getFileExtension(fileChooser.getSelectedFile());
		fileCopy(fileChooser.getSelectedFile().getPath(), "src/pics/sitios/"+txNombre.getText()+"."+extensionFile);
		return new Cliente("nombre", serialVersionUID);
	}
	public void fileCopy(String sourceFile, String destinationFile) {
		System.out.println("Desde: " + sourceFile);
		System.out.println("Hacia: " + destinationFile);

		try {
			File inFile = new File(sourceFile);
			File outFile = new File(destinationFile);

			FileInputStream in = new FileInputStream(inFile);
			FileOutputStream out = new FileOutputStream(outFile);

			int c;
			while( (c = in.read() ) != -1)
				out.write(c);

			in.close();
			out.close();
		} catch(IOException e) {
			System.err.println("Hubo un error de entrada/salida!!!");
		}
	}

	public JTextField getTxNombre() {
		return txNombre;
	}

	public void setTxNombre(JTextField txNombre) {
		this.txNombre = txNombre;
	}

	public JTextArea getTxValor() {
		return txValor;
	}

	public void setTxValor(JTextArea txValor) {
		this.txValor = txValor;
	}

	public JTextArea getTxInformacion() {
		return txInformacion;
	}

	public void setTxInformacion(JTextArea txInformacion) {
		this.txInformacion = txInformacion;
	}

	public JLabel getLbImagePathRuta() {
		return lbImagePathRuta;
	}

	public void setLbImagePathRuta(JLabel lbImagePathRuta) {
		this.lbImagePathRuta = lbImagePathRuta;
	}



}
