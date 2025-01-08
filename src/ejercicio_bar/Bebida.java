package ejercicio_bar;

public class Bebida {
	
	private String nombre;
	private double precio;
	
	// Métodos
	public String toString() {
		return nombre + " - " + precio + " €";
	}
	
	// Getters y Setters
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}	
}