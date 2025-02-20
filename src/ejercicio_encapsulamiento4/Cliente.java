package ejercicio_encapsulamiento4;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que contiene la información de cada cliente.
 * Almacena las cuentas bancarias de cada uno y las deudas.
 * @author Inigo Sanz
 * @version 1.0
 */
public class Cliente {
	
	// Atributos
	private String nombre;
	private String dni;
	private int edad;
	private List<CuentaBancaria> cuentas;
	private List<Prestamo> prestamos;
	
	// Constructor
	public Cliente(String nombre, String dni, int edad, String tipoCuenta) {
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		this.cuentas = new ArrayList<>();
		
		if (tipoCuenta.equalsIgnoreCase("principal")) {
			cuentas.add(new CuentaPrincipal());
		} else if (tipoCuenta.equals("ahorro")){
			cuentas.add(new CuentaDeAhorro());
		} else {
			throw new IllegalArgumentException("Tipo de cuenta no válido, introduzca -principal- o -ahorro-");
		}
		
		this.prestamos = new ArrayList<>();
	}
	
	// Métodos
	@Override
	public String toString() {
		return "\nNombre: " + nombre +
				"\nDNI: " + dni +
				"\nEdad: " + edad +
				mostrarInfoCuentas() + 
				mostrarInfoPrestamos();
	}
	
	public void agregarPrestamo(Prestamo prestamo) {
		prestamos.add(prestamo);
	}
	
	private String mostrarInfoCuentas() {
		StringBuilder info = new StringBuilder();
	    for (CuentaBancaria cuenta : cuentas) {
	        info.append(cuenta.toString());
	    }
	    return info.toString();
	}
	
	private String mostrarInfoPrestamos() {
		StringBuilder info = new StringBuilder();
	    for (Prestamo prestamo : prestamos) {
	        info.append(prestamo.toString());
	    }
	    return info.toString();
	}
	
	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public List<CuentaBancaria> getCuentas() {
		return cuentas;
	}

	public void setCuentas(List<CuentaBancaria> cuentas) {
		this.cuentas = cuentas;
	}

	public List<Prestamo> getPrestamos() {
		return prestamos;
	}

	public void setPrestamos(List<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}
}