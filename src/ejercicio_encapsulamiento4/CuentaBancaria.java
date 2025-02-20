package ejercicio_encapsulamiento4;

import java.math.BigInteger;
import java.util.Random;

/**
 * @author Inigo
 * @version 1.0
 * 
 * Clase abstracta para las cuentas bancarias.
 */
public abstract class CuentaBancaria {
	
	// Atributos
	private String numeroCuenta;
	private double saldo;
	
	// Constructor
	public CuentaBancaria() {
		this.numeroCuenta = generarNumeroCuenta();
		this.saldo = 0.0;
	}
	
	// Métodos
	public abstract void depositar(double cantidad);
	
	public abstract void retirar(double cantidad);
	
	public abstract void transferir(double cantidad, CuentaBancaria destino);
	
	private String generarNumeroCuenta() {
		Random random = new Random();
		BigInteger min = new BigInteger("10000000000000000000");
		BigInteger max = new BigInteger("99999999999999999999");
		
		BigInteger numero = new BigInteger(64, random);
		
		if (numero.compareTo(min) < 0 || numero.compareTo(max) > 0) {
			numero = new BigInteger(64, random);
		}
		
		String numeroString = numero.toString();
		
		return numeroString;
	}
	
	@Override
	public String toString() {
		return "\nNúmero de cuenta: " + numeroCuenta +
				"\nSaldo: " + saldo + "€";
	}
	
	/*
	 * Como queremos actualizar el saldo de la cuenta desde las clases que heredan CuentaBancaria
	 * Necesitamos un metodo protected para llamarlo desde estas
	 */
	protected void actualizarSaldo(double cantidad) {
		saldo = saldo + cantidad;
	}
	
	// Getters, no tenemos Setters ya que no permitimos accesos directos a esas funciones
	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}
}