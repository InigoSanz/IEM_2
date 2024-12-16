package ejercicios_arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 * Ejercicio 5, empiezan los problemas
 */
public class Ejercicio2_5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		System.out.printf("Introduce un número (tamaño array): ");
		
		int tamanoArray = scanner.nextInt();
		
		scanner.close();
		
		ArrayList<Integer> numeros = new ArrayList<>(tamanoArray);
		
		for (int i = 0; i < tamanoArray; i++) {
			int numeroRandom = random.nextInt(1, 101);
			numeros.add(numeroRandom);
		}
		
		System.out.println("El array con el que vamos a trabajar es: " + numeros);
		
		ArrayList<Integer> ordenados = new ArrayList<>(numeros);
		Collections.sort(ordenados);
		
		System.out.println("El array ordenado en orden ascendente es: " + ordenados);
		
		int contador = 0;
		
		for (int numero : numeros) {
			if (numero == 7) {
				contador++;
			}
		}
		
		System.out.println("El número 7 aparece " + contador + " veces.");
		
		int primer7 = numeros.indexOf(7);
		int ultimo7 = numeros.lastIndexOf(7);
		
		if (primer7 == ultimo7 && primer7 != 0) {
			System.out.println("El número 7 tiene el mismo primer y último índice.");
		} else {
			System.out.println("El 7 aparece por primera vez en el índice " + primer7);
			System.out.println("El 7 aparece por última vez en el índice " + ultimo7);
		}
		
		ArrayList<Integer> arrayReserva = new ArrayList<>(ordenados);
		
		for (int numero : arrayReserva) {
			if (numero == 7) {
				ordenados.remove(Integer.valueOf(numero));  // Aquí a no me borraba los números, buscando, 
															// vi que utilizaba un objeto, entonces Java se lia sin saber 
															// si le indica el numero en cuestion como indice o que borre el número como tal.
			}
		}
		
		System.out.println("El array ahora es: " + ordenados);
		
		boolean ordenadoAscendente = true;
		
		for (int i = 0; i < ordenados.size() - 1; i++) { // Aquí no puedo utilizar el tamanoArray, ya que si quito algún 7, se sale del índice
			if (ordenados.get(i) > ordenados.get(i + 1)) {
				ordenadoAscendente = false;
				break;
			}
		}
		
		if (ordenadoAscendente == true) {
			System.out.printf("El array esta ordenado de manera ascendente, es decir %b\n", ordenadoAscendente);
		} else {
			System.out.printf("El array no esta ordenado de manera ascendente, es decir %b\n", ordenadoAscendente);
		}
	}
}