package ejercicios_arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Escribe un programa en Java para gestionar un conjunto de notas escolares representadas en un array.
 * Define una constante CANTIDAD‗NOTAS que indique la cantidad de notas en el conjunto.
 * Crea un array de tipo double llamado notas que almacene estas calificaciones.
 * Utilizando bucles for y operaciones matemáticas, calcula y muestra en pantalla el promedio de las notas
 * la nota más alta, la nota más baja, así como el número de notas por encima y por debajo del promedio.
 */
public class Ejercicio2_3 {

	public static void main(String[] args) {
		
		final int CANTIDAD_NOTAS = 8;
		
		ArrayList<Double> notas = new ArrayList<>(CANTIDAD_NOTAS);
		ArrayList<Double> notasAltas = new ArrayList<>();
		ArrayList<Double> notasBajas = new ArrayList<>();
		
		notas.addAll(Arrays.asList(3.6, 4.5, 6.1, 8.7, 9.0, 1.5, 2.5, 7.4));
		
		double suma = 0;
		double promedio = 0;
		double almacenNotaAlta = notas.get(0);
		double almacenNotaBaja = notas.get(0);
		//int contadorPromedio = 0;
		int contadorNotasAltas = 0;
		int contadorNotasBajas = 0;
		
		// Un bucle for normal sería mejor en este caso, ya que nota no lo utilizamos mas que para recorrer y he tenido que añadir un contador.
		/*for (double nota : notas) {
			suma = suma + notas.get(contadorPromedio);
			contadorPromedio++;
		}
		*/
		promedio = suma / CANTIDAD_NOTAS;
		
		System.out.println("La media de las notas es: " + promedio);
		
		for (double nota : notas) {
			if (almacenNotaAlta < nota) {
				almacenNotaAlta = notas.get(contadorNotasAltas);
			}
			contadorNotasAltas++;		
		}
		
		System.out.println("La nota más alta es: " + almacenNotaAlta);
		
		for (double nota : notas) {
			if (almacenNotaBaja > nota) {
				almacenNotaBaja = notas.get(contadorNotasBajas);
			}
			contadorNotasBajas++;		
		}
		
		System.out.println("La nota más baja es: " + almacenNotaBaja);
		
		for (double nota : notas) {
			if (nota > promedio) {
				notasAltas.add(nota);
			} else {
				notasBajas.add(nota);
			}
		}
		
		System.out.println("Las notas por encima del promedio son: " + notasAltas);
		System.out.println("Las notas por debajo del promedio son: " + notasBajas);
	}
}