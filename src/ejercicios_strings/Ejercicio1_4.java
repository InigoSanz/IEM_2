package ejercicios_strings;

import java.util.Scanner;

/**
 * @author Inigo
 * @version 1.0
 * 
 * Desarrolla un programa en Java que le solicite al usuario un número de tarjeta de crédito.
 * Luego muestre por pantalla el número de tarjeta oculto por '*' exceptuando los 4 últimos dígitos. 
 */
public class Ejercicio1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		final int L = 16;
		String numberString;
		
		do {
			System.out.printf("Introduce el número de tu tarjeta de crédito: ");
			numberString = scanner.nextLine();
			int tam = numberString.length();
			
			if (tam != L) {
				System.out.printf("Tiene que tener 16 dígitos: ");
				numberString = scanner.nextLine();
			}
		} while (numberString.length() != L);
		
		scanner.close();
		
		String aster = "*";
		
		String outPut = numberString.replace(numberString.substring(0, 12), aster.repeat(12));
		
		System.out.printf(outPut);
	}
}