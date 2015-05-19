package modelo.dao;

import java.util.ArrayList;

import modelo.entidades.Cliente;
import modelo.entidades.Libro;

/**
 * 
 * @author Diego Vargas
 *
 */

public class DAOCliente {
	
	private Cliente cliente;
	
	public Cliente crearCliente(String nombre, double dineroDisponible, ArrayList<Libro> listaLibrosCliente){
		return new Cliente(nombre, dineroDisponible, listaLibrosCliente);
	}
	
	public Libro comprarLibro(){
		return null;
	}
}