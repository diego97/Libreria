package modelo.entidades;

import java.util.Date;

public class Libro {
	private int id;
	private String nombre;
	private String editorial;
	private Autor autor;
	private Double valor;
	private EnumGeneroLibro genero;
	private String imagenPortada;
	private int copiasVendidas;
	private static int consecutivo;

	public Libro(int id, String nombre, String editorial, Autor autor, double valor, EnumGeneroLibro genero,
			String imagenPortada, int copiasVendidas) {
		super();
		this.id = id;
		this.id = consecutivo++;
		this.nombre = nombre;
		this.editorial = editorial;
		this.autor = autor;
		this.valor = valor;
		this.genero = genero;
		this.imagenPortada = imagenPortada;
		this.copiasVendidas = copiasVendidas;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public EnumGeneroLibro getGenero() {
		return genero;
	}
	public void setGenero(EnumGeneroLibro genero) {
		this.genero = genero;
	}
	public String getImagenPortada() {
		return imagenPortada;
	}
	public void setImagenPortada(String imagenPortada) {
		this.imagenPortada = imagenPortada;
	}
	public int getCopiasVendidas() {
		return copiasVendidas;
	}
	public void setCopiasVendidas(int copiasVendidas) {
		this.copiasVendidas = copiasVendidas;
	}
}