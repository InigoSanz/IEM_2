package ejercicio_encapsulamiento4;

/**
 * @author Inigo
 * @version 1.0
 * 
 * Almacena la información de cada préstamo.
 */
public class Prestamo {
	
	// Atributos
	private Banco banco;
	private Cliente cliente;
	private CuentaBancaria cuenta;
	private double cantidadDevolver;
	
	// Constructor
	public Prestamo(Cliente cliente, CuentaBancaria cuenta, double cantidadDevolver) {
		this.cliente = cliente;
		this.cuenta = cuenta;
		this.cantidadDevolver = cantidadDevolver;
	}
	
	// Métodos
	@Override
	public String toString() {
		return "\nCliente: " + cliente.getDni() +
				"\nNúmero de cuenta: " + cuenta.getNumeroCuenta() + 
				"\nCantidad a devolver: " + cantidadDevolver + "€";
	}
	
	// Getters y Setters
	public Banco getBanco() {
		return banco;
	}
	
	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public CuentaBancaria getCuenta() {
		return cuenta;
	}
	public void setCuenta(CuentaBancaria cuenta) {
		this.cuenta = cuenta;
	}
	public double getCantidadDevolver() {
		return cantidadDevolver;
	}
	public void setCantidadDevolver(double cantidadDevolver) {
		this.cantidadDevolver = cantidadDevolver;
	}
}