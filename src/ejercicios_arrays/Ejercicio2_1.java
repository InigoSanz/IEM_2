package ejercicios_arrays;

import java.util.ArrayList;
import java.util.Random;

/**
 * Crea un programa en Java que gestione un array de números decimales.
 * Define una constante ‘CANTIDAD_ELEMENTOS’ que represente la longitud del array. 
 * Utilizando un bucle ‘for’, calcula el promedio de los números en el array para mostrar en pantalla los elementos que superan el promedio calculado.
 */
public class Ejercicio2_1 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		ArrayList<Double> numbers = new ArrayList<>();
		ArrayList<Double> extraccion = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			double number = random.nextDouble(1, 100);
			numbers.add(number);
		}
		
		int cantidadElementos = numbers.size();
		
		double suma = 0;
		
		for (int i = 0; i < cantidadElementos; i++) {
			suma = suma + numbers.get(i);
		}
		
		double promedio = suma / cantidadElementos;
		
		System.out.println("El promedio es: " + promedio);
		
		for (double numero : numbers) {
			if (numero > promedio) {
				extraccion.add(numero);
			}
		}
		
		System.out.println("Los número del array que superan el promedio son: ");
		System.out.println(extraccion);	
	}
}