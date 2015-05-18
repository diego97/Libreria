package modelo.entidades;

import java.util.ArrayList;

public class Libreria {
	private ArrayList<Libro> listaLibros;
	private ArrayList<Cliente> listaClientes;

	public Libreria() {

		listaLibros = new ArrayList<Libro>();
		listaClientes = new ArrayList<Cliente>();
	}

	public Cliente  BuscarCliente(int id) throws Exception{
		for (Cliente cliente : listaClientes) {
			if (cliente.getId() == id) {
				return cliente;
			}
		}
		throw new Exception("no se encuentra el cliente");
	}
	public ArrayList<Libro> generarTopLibros(ArrayList<Libro> listaLibros){
		return listaLibros;
	}
	public void agregarCliente(Cliente cliente){
		listaClientes.add(cliente);
	}
	public void eliminarCliente(Cliente cliente){
		listaClientes.remove(cliente);
	}
	public void agregarLibro(Libro libro){
		listaLibros.add(libro);
	}
	public void eliminarLibro(Libro libro){
		listaLibros.remove(libro);
	}
	public  Cliente crearCliente(String nombre, double dineroDisponible){
		return new Cliente(nombre, dineroDisponible);
	}
	public Libro crearLibro(){
		return new Libro();
	}
	public void editarCliente(Cliente clienteViejo, Cliente clienteNuevo){
		listaClientes.set(listaClientes.indexOf(clienteViejo),clienteNuevo);
	}
	public void editarLibro(Libro libroViejo, Libro libroNuevo){
		listaLibros.set(listaLibros.indexOf(libroViejo),libroNuevo);
	}
}
