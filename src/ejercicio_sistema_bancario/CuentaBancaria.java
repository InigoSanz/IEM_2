package ejercicio_sistema_bancario;

/**
 * Clase de la cuenta bancaria.
 */
public class CuentaBancaria {
	
	private String id;
	private String titular;
	private double saldo;
	
	// Métodos
	public void depositar(double cantidad) {
		if (cantidad > 0) {
			saldo = saldo + cantidad;
			System.out.println("Se ha depositado la cantidad de " + cantidad + " € en la cuenta de " + titular + "\n");
		} else {
			System.err.println("No se puede ingresar esa cantidad. \n");
		}
	}
	
	public void retirar(double cantidad) {
		if (saldo >= cantidad && cantidad > 0) {
			saldo = saldo - cantidad;
			System.out.println("Se ha retirado la cantidad de " + cantidad + " € de la ceunta de " + titular + "\n");
		} else {
			System.err.println("No tienes fondos suficientes o la cantidad es inválida. \n");
		}
	}
	
	public void transferir(CuentaBancaria destino, double cantidad) {
		if (saldo >= cantidad && cantidad > 0) {
			saldo = saldo - cantidad;
			destino.saldo = destino.saldo + cantidad;
			System.out.println("Se ha realizado una transferencia de " + cantidad + " € de la cuenta de " + titular + " a la cuenta de " + destino.titular + "\n");
		} else {
			System.err.println("No tienes fondos suficientes o la cantidad es inválida. \n");
		}
	}
	
	public String toString() {
		return "\nID: " + this.id + "\n" +
				"Titular: " + this.titular + "\n" +
				"Saldo: " + saldo;
	}
	
	// Getters y Setters
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}