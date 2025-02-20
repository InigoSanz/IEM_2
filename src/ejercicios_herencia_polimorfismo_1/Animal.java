package ejercicios_herencia_polimorfismo_1;

/**
 * @author Inigo
 * 
 * Superclase, implementa métodos y atributos comunes que heredarán las subclases.
 */
public class Animal {
	
	private String nombre;
	private int edad;
	
	// Constructores
	public Animal(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	// Métodos
	public void hacerSonido() {
		System.out.println("El animal está haciendo un sonido.");
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