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
	public Libro  BuscarLibro(int nit) throws Exception{
		for (Libro libro : listaLibros) {
			if (libro.getId() == nit) {
				return libro;
			}
		}
		throw new Exception("no se encuentra el libro");
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
	
	public void editarCliente(Cliente clienteViejo, Cliente clienteNuevo){
		listaClientes.set(listaClientes.indexOf(clienteViejo),clienteNuevo);
	}
	public void editarLibro(Libro libroViejo, Libro libroNuevo){
		listaLibros.set(listaLibros.indexOf(libroViejo),libroNuevo);
	}
}
