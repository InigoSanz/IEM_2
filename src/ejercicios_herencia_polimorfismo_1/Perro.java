package ejercicios_herencia_polimorfismo_1;

/**
 * @author Inigo
 * 
 * Clase Perro que extiende de Animal.
 */
public class Perro extends Animal {
	
	public Perro(String nombre, int edad) {
		super(nombre, edad);
	}
	
	// Sobreescribimos el método de la superclase
	@Override
	public void hacerSonido() {
		System.out.println("Guau, guau!");
	}
}