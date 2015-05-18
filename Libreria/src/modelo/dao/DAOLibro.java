package modelo.dao;

import java.util.Date;

import modelo.entidades.Autor;
import modelo.entidades.EnumGeneroLibro;
import modelo.entidades.Libro;

public class DAOLibro {
	public Libro crearLibro(String nombre, String editorial, Autor autor, Date fecha, double valor, EnumGeneroLibro genero,
			String imagenPortada,int copiasVendidas){
		return new Libro(0, nombre, editorial, autor, fecha, valor, genero, imagenPortada, copiasVendidas);
	}
}
