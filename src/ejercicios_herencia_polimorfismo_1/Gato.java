package ejercicios_herencia_polimorfismo_1;

/**
 * @author Inigo
 * 
 * Clase Gato que extiende de Animal.
 */
public class Gato extends Animal {
	
	// Constructores
	public Gato(String nombre, int edad) {
		super(nombre, edad);
	}
	
	// Sobreescribimos el método de la superclase
	@Override
	public void hacerSonido() {
		System.out.println("Miau, miau!");
	}
	
}