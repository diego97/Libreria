package modelo.dao;

import modelo.entidades.Cliente;

/**
 * 
 * @author Diego Vargas
 *
 */

public class DAOCliente {
	
	public Cliente crearCliente(String nombre, double dineroDisponible){
		return new Cliente(nombre, dineroDisponible);
	}

}
