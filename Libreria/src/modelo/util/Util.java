package modelo.util;

import java.io.File;

import modelo.entidades.Cliente;


public class Util {
	public static String quitarEspaciosExtra(String frase){
		return frase.replaceAll(" ", "");
	}
	public static boolean validarValor(String numero){
		try{
			Double.parseDouble(numero);
		}catch(Exception e){
			return false;
		}
		return true;
	}
	public static String[] clienteAVector(Cliente cliente){
		return new String[]{Integer.toString(cliente.getId()),cliente.getNombre(),
				Double.toString(cliente.getDineroDisponible())};
	}
	public static  String getFileExtension(File file) {
		String name = file.getName();
		String extension = null;
		int i = name.lastIndexOf('.');
		if (i >= 0) {
			extension = name.substring(i+1);
		}
		return extension;
	}
}
