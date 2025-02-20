package ejercicios_herencia_polimorfismo_1;

/**
 * @author Inigo
 * 
 * Clase Main del programa.
 */
public class Main {

	public static void main(String[] args) {
		
		// Creamos una lista de Animales
		Animal[] animales = new Animal[3];
		
		animales[0] = new Perro("Firulais", 5);
		animales[1] = new Gato("Simba", 7);
		animales[2] = new Animal("Sin nombre", 4);
		
		// Iteramos sobre la lista de animales y llamamos al método hacerSonido()
		for (int i = 0; i < animales.length; i++){
			animales[i].hacerSonido();
		}
	}
}