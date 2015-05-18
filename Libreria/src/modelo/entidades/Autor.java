package modelo.entidades;

/**
 * 
 * @author Diego Vargas
 *
 */

public class Autor {
	
	private int id;
	private String nombre;
	
	public Autor(String nombre) {
		id++;
		this.nombre = nombre;
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
}