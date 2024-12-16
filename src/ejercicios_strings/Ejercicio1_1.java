package ejercicios_strings;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Inigo
 * @version 1.0
 * 
 * Desarrolla un programa en Java que solicite al usuario ingresar el nombre y apellido de un empleado.
 * El programa deberá generar un nombre de usuario único para dicho empleado utilizando las iniciales de su nombre y apellido,
 * convertidas a minúsculas, seguidas por un número aleatorio de cuatro dígitos.
 */
public class Ejercicio1_1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		System.out.printf("Introduce un nombre: ");
		
		String name = scanner.nextLine();
		
		System.out.printf("Introduce un apellido: ");
		
		String surname = scanner.nextLine();
		
		scanner.close();
		
		char c1 = name.charAt(0);
		char c2 = surname.charAt(0);
		String c1String = Character.toString(c1);
		String c2String = Character.toString(c2);
		
		int nRandom = random.nextInt(1000, 10000);
		
		System.out.println("Tu nombre de usuario va a ser " + c1String.toLowerCase() + c2String.toLowerCase() + nRandom); // Podemos guardarlo en una variable...
	}
}