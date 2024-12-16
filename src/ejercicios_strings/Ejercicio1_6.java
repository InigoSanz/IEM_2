package ejercicios_strings;

import java.util.Scanner;

/**
 * @author Inigo
 * @version 1.0
 * 
 * Palíndromos... y tal
 */
public class Ejercicio1_6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Introduce una frase: ");
		
		String s = scanner.nextLine();
		
		scanner.close();
		
		// Normalizamos
		String normalizar = s.replaceAll(" ", "").toLowerCase();
		
		String subcadenaLarga = "";
		
		if(esPalindromo(normalizar) == true) {
			System.out.printf("La frase es un palíndromo.\n");
		} else {
			System.out.printf("La frase no es un palíndromo.\n");
			
			subcadenaLarga = buscarPalindromoLargo(normalizar);
			
			System.out.printf("Pero la subcadena palíndromo más larga es: %s\n", subcadenaLarga);
		}
	}
	
	public static boolean esPalindromo(String cadena) {
		StringBuilder revertida = new StringBuilder(cadena);
		revertida.reverse();
		
		return cadena.equals(revertida.toString());	
	}
	
	public static String buscarPalindromoLargo(String cadena) {
		int longitud = 0;
		String cadenaMasLarga = "";
		String cadenaSeparar = "";
		
		for (int i = 0; i < cadena.length(); i++) {
			for (int j = i; j < cadena.length(); j++) {
				cadenaSeparar = cadena.substring(i, j);
				
				if (esPalindromo(cadenaSeparar) && cadenaSeparar.length() > longitud) {
					longitud = cadenaSeparar.length();
					cadenaMasLarga = cadenaSeparar;
				}
			}
		}
		
		return cadenaMasLarga;	
	}
}