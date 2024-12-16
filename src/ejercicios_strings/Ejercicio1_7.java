package ejercicios_strings;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */
public class Ejercicio1_7 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("BIENVENIDO A UN PROCESADOR DE TEXTO MULTIFUNCIÓN\n");
		System.out.println("Selecciona que quieres hacer introduciendo el número de la opción: ");
		System.out.printf(" -> Opción 1: Extraer palabras únicas, eliminando duplicados y mostrar en orden alfabético.\n"
							+ " -> Opción 2: Frecuencia de cada palabra, eliminando los duplicados y mostrando el ranking.\n"
							+ " -> Opción 3: Reemplazar subcadenas, se invertirán las letras de cada palabra que contiene la subcadena especificada.\n"
							+ " -> Opción 4: Generar resumen de un texto, mostrando la primera palabra de cada oración delimitada por . ! ?\n");
		System.out.printf("Introduce la opción: ");
		
		int opcion = scanner.nextInt();
		
		System.out.println(opcion);
		
		scanner.close();
		
		switch (opcion) {
			case 1:
				String result = opcionProcesar1();
				System.out.printf("Resultado de la opción 1: %s\n", result);
				break;
			case 2:
				opcionProcesar2();
				break;
			case 3:
				opcionProcesar3();
				break;
			case 4:
				opcionProcesar4();
				break;
			default: 
				System.out.printf("No has seleccionado ninguna de las opciones, reinicia el programa.");
				break;
		}
	}
	
	/**
	 * Debe permitir la extracción de palabras únicas de un texto ingresado, eliminando duplicados y mostrando el resultado en orden alfabético.
	 * 
	 * @return 
	 */
	public static String opcionProcesar1() {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> extraerUnicas = new ArrayList<>();
		StringBuilder palabras = new StringBuilder();
		String palabra = "";
		
		System.out.printf("Introduce una frase: ");
		
		String frase = scanner.nextLine();
		
		scanner.close();
		
		/*
		 * Vamos a recorrer caracter a caracter
		 * Para que vaya formando las palabras y asi cuando encuentre
		 * un caracter no alfanumerico las separe
		 */
		for (char c : frase.toCharArray()) {
			if (Character.isLetterOrDigit(c)) {
				palabras.append(c);
			} else if (palabras.length() > 0) {
				palabra = palabras.toString();
				
				if (extraerUnicas.contains(palabra) == false) {
					extraerUnicas.add(palabra);
				}
			}
		}
		
		// extraerUnicas.sort();
		
		return "Las palabras únicas son: " + extraerUnicas.toString();
	}
	
	/**
	 * Deberá analizar la frecuencia de cada palabra en un texto más extenso, presentando un informe ordenado de mayor a menor frecuencia, 
	 * igualmente debemos eliminar duplicados en este caso.
	 * 
	 * @return
	 */
	public static String opcionProcesar2() {
		
		Scanner scanner = new Scanner(System.in);
		
		scanner.close();
		
		return "";
	}
	
	/**
	 * Capacidad de realizar reemplazos de subcadenas en un texto,
	 * donde se invertirán las letras de cada palabra que contiene la subcadena especificada.
	 * 
	 * @return
	 */
	public static String opcionProcesar3() {
		
		Scanner scanner = new Scanner(System.in);
		
		scanner.close();
		
		return "";
	}
	
	/**
	 * El procesador deberá ser capaz de generar resúmenes de textos extensos
	 * mostrando las primeras palabras de cada oración delimitada por alguno de estos caracteres (. ? !)
	 * garantizando que el resumen sea de longitud limitada.
	 * 
	 * @return
	 */
	public static String opcionProcesar4() {
		
		Scanner scanner = new Scanner(System.in);
		
		scanner.close();
		
		return "";
	}
}