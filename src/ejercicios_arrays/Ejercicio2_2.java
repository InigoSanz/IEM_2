package ejercicios_arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Escribe un programa en Java que gestione un array de números enteros.
 * Define una constante LONGITUD_ARRAY que represente la longitud del array y otra constante TAMANO_MAXIMO que indique el tamaño máximo de los nuevos arrays 
 * donde se almacenarán los elementos que cumplen con ciertas condiciones.
 * Crea un array  llamado numeros, con valores predefinidos.
 * Utilizando un bucle for, operadores lógicos y relacionales, y condicionales anidados, identifica y almacena 
 * en dos nuevos arrays los números que son pares y mayores a 10
 * así como los números que son impares y menores a 5
 * Al final, muestra en pantalla los elementos de cada nuevo array. 
 */
public class Ejercicio2_2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<>();
		ArrayList<Integer> numerosPares = new ArrayList<>();
		ArrayList<Integer> numerosImpares = new ArrayList<>();
		
		numeros.addAll(Arrays.asList(10, 3, 8, 5, 7, 3, 12, 19));
		
		int longitudArray = numeros.size();
		int tamanoMaximo1 = 0;
		int tamanoMaximo2 = 0;
		
		for (int numero : numeros) {
			if (numero % 2 == 0 && numero > 10) {
				numerosPares.add(numero);
			}
			
			if ( numero % 2 != 0 && numero < 5) {
				numerosImpares.add(numero);
			}
		}
		
		tamanoMaximo1 = numerosPares.size();
		tamanoMaximo2 = numerosImpares.size();
		
		System.out.println("Los numeros pares y mayores que 10 son: " + numerosPares + " y tiene un tamaño de " + tamanoMaximo1);
		System.out.println("Los numeros impares y menores que 5 son: " + numerosImpares + " y tiene un tamaño de " + tamanoMaximo2);
	}
}