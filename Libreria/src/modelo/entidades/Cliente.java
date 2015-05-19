package modelo.entidades;

import java.util.ArrayList;

/**
 * 
 * @author Diego Vargas
 *
 */

public class Cliente {
	
	private int id;
	private String nombre;
	private double dineroDisponible;
	private ArrayList<Libro> listaLibros;
	
	public Cliente(String nombre, double dineroDisponible, ArrayList<Libro>listaLibros) {
		id++;
		this.nombre = nombre;
		this.dineroDisponible = dineroDisponible;
		this.listaLibros = listaLibros;
		
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

	public ArrayList<Libro> getListaLibros() {
		return listaLibros;
	}

	public void setListaLibros(ArrayList<Libro> listaLibros) {
		this.listaLibros = listaLibros;
	}
	
}