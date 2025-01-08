package ejercicios_matrices;

import java.util.Scanner;

/**
 * Desarrolla un programa en Java para gestionar los libros de una biblioteca.
 * La aplicación debe simular un sistema simple que permita a los usuarios realizar operaciones como ver la lista de libros disponibles,
 * prestar un libro y devolver un libro.
 * El inventario de la biblioteca se representa mediante una matriz,
 * donde cada fila contiene información sobre un libro, como el título, el autor y su estado (disponible o prestado).
 * La aplicación debe presentar un menú interactivo que permita a los usuarios seleccionar entre las operaciones mencionadas.
 * Al mostrar la lista de libros disponibles, cada libro debe identificarse con un número que se corresponderá con el índice del array.
 * Al prestar o devolver un libro, el usuario debe ingresar el número de identificación del libro deseado.
 * El programa continuará ejecutándose hasta que el usuario decida salir del sistema.
 */
public class Ejercicio3_2 {
	
	static String[][] libros = {
			{"Libro Fantasía", "Anónimo", "Disponible"},
			{"Libro Drama", "Anónimo al cuadrado", "Prestado"},
			{"Libro Ficción", "Anónimo al cubo", "Disponible"}
			};
	
	static int longitud = libros.length;
	
	public static void main(String[] args) {	
		
		Scanner scanner = new Scanner(System.in);
		
		int opcion = 0;
		
		do {
			System.out.println();
			System.out.println("\t\tBIBLIOTECA\n");
			System.out.println("1. Ver los libros disponibles");
			System.out.println("2. Prestar libro");
			System.out.println("3. Devolver libro");
			System.out.println("4. Cerrar programa");
			System.out.printf("Introduce una opción: ");

			
			opcion = scanner.nextInt();	
			
			// Normalmente cuando tenemos un menú, es interesante separar lo que hace cada opcion en funciones independientes y asi llamarlas en cada caso
			if (opcion == 1) {
				verLibros();
			}
			
			if (opcion == 2) {
				prestarUnLibro();
			}
			
			if (opcion == 3) {
				devolverUnLibro();
			}
			
			if (opcion == 4) {
				System.out.println("¡Ciao!");
			}
			
		} while (opcion != 4);
		
		scanner.close();	
	}
	
	public static void verLibros() {
		System.out.println("\nLos libros que tenemos:");
		for (int i = 1; i <= longitud; i++) {
			System.out.printf("Libro %d: %s escrito por %s y esta %s\n", i, libros[i - 1][0], libros[i - 1][1], libros[i - 1][2]);
		}
	}
	
	public static void prestarUnLibro() {
		
	}
	
	public static void devolverUnLibro() {
		
	}
}