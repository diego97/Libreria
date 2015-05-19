package modelo.dao;


import modelo.entidades.Autor;
import modelo.entidades.EnumGeneroLibro;
import modelo.entidades.Libro;

public class DAOLibro {
	public static Libro crearLibro(String nombre, String editorial, Autor autor, double valor, EnumGeneroLibro genero,
			String imagenPortada,int copiasVendidas){
		return new Libro(0, nombre, editorial, autor, valor, genero, imagenPortada, copiasVendidas);
	}
}
