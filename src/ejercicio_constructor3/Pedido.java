package ejercicio_constructor3;

import java.util.ArrayList;

public class Pedido {
	
	private String id;
	private Cliente cliente;
	private ArrayList<Producto> productos;
	
	// Constructores
	// Si el pedido puede contener o no productos, cambiaria el constructor a utilizar
	public Pedido(String id, Cliente cliente) {
		this.id = id;
        this.cliente = cliente;
        this.productos = new ArrayList<>();
	}
	
	// Métodos
	public void agregarProductos(Producto producto) {
		productos.add(producto);
		System.out.println("Se ha agregado el producto " + producto.getNombre() + " al pedido.");
	}
	
	public double calcularTotalPedido() {
		double total = 0;
		
		for (Producto p : productos) {
			//p.mostrarInformacion();
			total = total + p.getPrecio();
			//System.out.println();
		}
		
		return total;
	}
	
	public void mostrarInformacion() {
		System.out.println("ID: " + id);
		cliente.mostrarInformacion();
		System.out.println("Los productos del pedido son: ");
		for (Producto p : productos) {
			p.mostrarInformacion();
			System.out.println();
		}
		
		System.out.println("El total del pedido es: " + calcularTotalPedido() + " €");
	}
	
	// Getters y Setters
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public ArrayList<Producto> getProductos() {
		return productos;
	}
	
	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
}
