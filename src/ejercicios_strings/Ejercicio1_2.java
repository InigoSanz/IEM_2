package ejercicios_strings;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Inigo
 * @version 1.0
 * 
 * Desarrolla un programa en Java que simule la gestión de productos en un inventario.
 * Solicita al usuario ingresar el nombre de un producto y su precio unitario.
 * Automáticamente, el programa generará un código único para el producto:
 * - compuesto por las primeras tres letras del nombre en mayúsculas.
 * - seguidas por un guion bajo.
 * - y un número aleatorio de tres dígitos.
 * Posteriormente, el programa mostrará al usuario la información del producto, incluyendo el nombre, el precio unitario y el código generado.
 */
public class Ejercicio1_2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		System.out.printf("Introduce el nombre de un producto: ");
		
		String nameProduct = scanner.nextLine();
		
		System.out.printf("Introduce el precio unitario: ");
		
		double unitPrice = scanner.nextDouble();
		
		scanner.close();
		
		String subName = nameProduct.substring(0, 3);
		String subNameMayu = subName.toUpperCase();
		String charValue = "_";
		
		int nRandom = random.nextInt(100, 1000);
		String nRandomString = Integer.toString(nRandom);
		
		String id = subNameMayu + charValue + nRandomString;
		
		System.out.printf("El identificador va será: %s\n", id);
		System.out.printf("Tiene un precio por unidad de %.2f euros.\n", unitPrice);
	}
}