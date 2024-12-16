package ejercicios_strings;

import java.util.Scanner;

/**
 * @author Inigo
 * @version 1.0
 * 
 * El objetivo de este ejercicio es crear un programa en Java que genere un acrónimo a partir de una frase ingresada por el usuario,
 * apoyándose de la clase StringBuilder.
 * Un acrónimo es una palabra formada por las letras iniciales de otras palabras en una frase.
 */
public class Ejercicio1_3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		StringBuilder acronim = new StringBuilder();
		
		System.out.printf("Introduce una frase: ");
		
		String s = scanner.nextLine();
		
		scanner.close();
		
		boolean newWord = true;
		String white = " ";
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if (white.equals(String.valueOf(c))) {
				newWord = true;
			} else if (newWord){
				acronim.append(c);
				newWord = false;
			}
		}
		
		String outPut = acronim.toString().toUpperCase();
		
		System.out.printf("El acrónimo de la frase sería: %s\n", outPut);
	}
}