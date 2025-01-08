package ejercicio_bar;

public class Cliente {
	
	private String nombre;
	private int edad;
	
	// Métodos
	public String toString() {
		return nombre;
	}
	
	// Getters y Setters
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
}