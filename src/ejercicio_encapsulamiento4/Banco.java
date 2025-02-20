package ejercicio_encapsulamiento4;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que contiene la lógica de negocio del Banco.
 * @author Inigo Sanz
 * @version 1.0
 */
public class Banco {
	
	// Constantes
	private static final double INTERES_PRINCIPAL = 0.05;
	private static final double INTERES_AHORRO = 0.03;
	
	// Atributos
	private List<Cliente> clientes;
	
	/**
	 * Constructor de la clase que instancia la lista de clientes.
	 */
	public Banco() {
		this.clientes = new ArrayList<>();
	}

	// Métodos
	/**
	 * Agrega un cliente a la lista de clientes del banco.
	 * @param cliente cliente a agregar
	 */
	public void agregarCliente(Cliente cliente) {
		clientes.add(cliente);
		System.out.println("Se ha agregado el cliente con dni " + cliente.getDni() + " al banco.");
	}
	
	/**
	 * Realiza el prestamo a un cliente dependiendo del tipo de cuenta que este posea.
	 * @param cliente cliente que quiere el prestamo
	 * @param cantidad cantidad que compone el prestamo
	 */
	public void realizarPrestamo(Cliente cliente, double cantidad) {
	    for (CuentaBancaria cuenta : cliente.getCuentas()) {
	        double cantidadInteres = 0.0;

	        if (cuenta instanceof CuentaPrincipal) {
	        	cantidadInteres = cantidad + (cantidad * INTERES_PRINCIPAL); // Más claro
	        } else if (cuenta instanceof CuentaDeAhorro) {
	            cantidadInteres = cantidad + (cantidad * INTERES_AHORRO); // Más claro
	        } else {
	            continue;
	        }

	        if (cuenta.getSaldo() >= cantidad) {
	            // Registrar el préstamo en la lista de préstamos del cliente
	            Prestamo prestamo = new Prestamo(cliente, cuenta, cantidadInteres);
	            cliente.agregarPrestamo(prestamo);

	            System.out.println("Préstamo de " + cantidad + "€ concedido para " + cliente.getNombre() +
	                    ". Devolverá una cantidad de " + cantidadInteres);
	            return; // Salimos del método después de conceder el préstamo
	        }
	    }
	    System.err.println("El saldo del cliente no permite que le realicemos el préstamo solicitado.");
	}
	
	@Override
	public String toString() {
		StringBuilder clientesBanco = new StringBuilder();

		for (Cliente cliente : clientes) {
			clientesBanco.append(cliente.toString());
		}
		
		return clientesBanco + 
				"\nSaldo total: " + calcularSaldoTotal() + "€";
	}
	
	/**
	 * Calcula el saldo total de las cuentas de un cliente.
	 * @return saldoTotal saldo total del cliente
	 */
	public double calcularSaldoTotal() {
		double saldoTotal = 0.0;
		for (Cliente cliente : clientes) {
			for (CuentaBancaria cuenta : cliente.getCuentas()) {
				saldoTotal = saldoTotal + cuenta.getSaldo();
			}
		}
		return saldoTotal;
	}
	
	// Getters y Setters
	/**
	 * Devuelve la lista de clientes.
	 * @return clientes lista de clientes
	 */
	public List<Cliente> getClientes() {
		return clientes;
	}
}