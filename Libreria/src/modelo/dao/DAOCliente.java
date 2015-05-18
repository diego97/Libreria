package modelo.dao;

import modelo.entidades.Cliente;
import modelo.entidades.Libro;

/**
 * 
 * @author Diego Vargas
 *
 */

public class DAOCliente {
	
	public Cliente crearCliente(String nombre, double dineroDisponible){
		return new Cliente(nombre, dineroDisponible);
	}
	
	public Libro comprarLibro(double dineroCliente){
		return null;
	}
}