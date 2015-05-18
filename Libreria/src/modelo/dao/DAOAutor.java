package modelo.dao;

import modelo.entidades.Autor;
/**
 * 
 * @author Diego Vargas
 *
 */

public class DAOAutor {
	
	public Autor crearAutor(String nombre){
		return new Autor(nombre);
	}

}
