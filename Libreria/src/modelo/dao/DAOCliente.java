package modelo.dao;

import modelo.entidades.Cliente;
import modelo.entidades.Libro;

/**
 * 
 * @author Diego Vargas
 *
 */

public class DAOCliente {
	
	private Cliente cliente;
	
	public Cliente crearCliente(String nombre, double dineroDisponible){
		return new Cliente(nombre, dineroDisponible);
	}
	
	public Libro comprarLibro(double dineroCliente){
		if (cliente.getDineroDisponible() >= dineroCliente) {
			
		}
		return null;
	}
}