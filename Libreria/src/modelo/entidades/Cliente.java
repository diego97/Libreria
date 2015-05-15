package modelo.entidades;

/**
 * 
 * @author Diego Vargas
 *
 */

public class Cliente {
	
	private int id;
	private String nombre;
	private double dineroDisponible;
	
	public Cliente(String nombre, double dineroDisponible) {
		id++;
		this.nombre = nombre;
		this.dineroDisponible = dineroDisponible;
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

	public double getDineroDisponible() {
		return dineroDisponible;
	}

	public void setDineroDisponible(double dineroDisponible) {
		this.dineroDisponible = dineroDisponible;
	}
}