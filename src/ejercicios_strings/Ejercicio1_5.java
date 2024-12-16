package ejercicios_strings;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Inigo
 * @version 1.0
 * 
 * Se solicita implementar un programa en Java que determine si dos cadenas dadas son anagramas entre sí.
 * Un anagrama es una palabra o frase que se forma reorganizando las letras de otra palabra o frase.
 * utilizando todas las letras originales exactamente una vez.
 * El programa debe ignorar espacios y considerar las letras mayúsculas y minúsculas como equivalentes. 
 */
public class Ejercicio1_5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Introduce una frase: ");
		
		String frase1 = scanner.nextLine();
		
		System.out.printf("Introduce otra frase: ");
		
		String frase2 = scanner.nextLine();
		
		scanner.close();
		
		// Ahora normalizamos las frases
		String normalizar1 = frase1.replaceAll(" ", "").toLowerCase();
		String normalizar2 = frase2.replaceAll(" ", "").toLowerCase();
		
		char[] arrayLetras1 = normalizar1.toCharArray();
		char[] arrayLetras2 = normalizar2.toCharArray();
		
		// Si comparamos los arrays sin ordenar, no vamos a saber si son anagramas
		// Necesitamos ordenarlos para que asi compare las letras exactas, sin importar su posición
		// Con el bucle no me ha funcionado...
		Arrays.sort(arrayLetras1);
		Arrays.sort(arrayLetras2);
		
		// Aquí podriamos utilizar un bucle y recorrer los arrays para comparar las letras, pero al ordenarlos,
		// podemos utilizar equals, en caso de no contener lo mismo no sería anagrama.
		// Aqui he cometido un pecado comparando los arrays de chars con simplemente equals.
		if (Arrays.equals(arrayLetras1, arrayLetras2)) {
			System.out.println("Las frases introducidas son anagramas.");
		} else {
			System.out.println("Las frases introducidas no son anagramas.");
		}	
	}
}