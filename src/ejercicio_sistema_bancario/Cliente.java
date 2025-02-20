package ejercicio_sistema_bancario;

import java.util.ArrayList;

/**
 * Clase de clientes.
 */
public class Cliente {

	private String nombre;
	private ArrayList<CuentaBancaria> cuentas = new ArrayList<>();
	
	// Métodos
	public void agregar(CuentaBancaria cuenta) {
		cuentas.add(cuenta);
	}
	
	// Aquí creo que con un void mostrarInformación hubiese sido más sencillo, pero queda mejor así
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Cliente: ").append(nombre).append("\n");
		sb.append("Cuentas: \n");
		
		for (CuentaBancaria cuenta : cuentas) {
			sb.append(cuenta.toString()).append("\n");
		}
		
		return sb.toString();
	}
	
	// Getters y Setters
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public ArrayList<CuentaBancaria> getCuentas() {
		return cuentas;
	}
	
	public void setCuentas(ArrayList<CuentaBancaria> cuentas) {
		this.cuentas = cuentas;
	}
}