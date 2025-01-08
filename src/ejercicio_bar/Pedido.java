package ejercicio_bar;

import java.util.ArrayList;

public class Pedido {
	
	private Cliente cliente;
	private ArrayList<Bebida> bebidas;
	
	public Pedido (Cliente cliente) {
		this.cliente = cliente;
		this.bebidas = new ArrayList<>();
	}
	
	// Métodos
	public void agregarBebidas(Bebida bebida) {
		bebidas.add(bebida);
	}
	
	public double calcularCosto() {
		double total = 0;
		
		for (Bebida bebida : bebidas) {
			total = total + bebida.getPrecio();
		}
		
		return total;
	}
	
	public void mostrarInformacion() {
		System.out.println("Cliente: " + cliente);
		System.out.println("Bebidas: ");
		
		for (Bebida bebida : bebidas) {
			System.out.println(bebida);
		}
		
		double costoTotal = calcularCosto();
		
		System.out.println("Costo: " + costoTotal + " €\n");
	}
	
	// Getters y Setters
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public ArrayList<Bebida> getBebidas() {
		return bebidas;
	}
	
	public void setBebidas(ArrayList<Bebida> bebidas) {
		this.bebidas = bebidas;
	}
}