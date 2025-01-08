package ejercicios_matrices;

import java.util.Random;
import java.util.Scanner;

/**
 * Ejercicio 3 que hace cosas
 */
public class Ejercicio3_3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Introduce el número de filas de la matriz: ");
		int filas = scanner.nextInt();
		
		System.out.printf("Introduce el número de columnas: ");
		int columnas = scanner.nextInt();
		
		scanner.close();
		
		int[][] matriz = new int[filas][columnas];
		
		Random random = new Random();
		
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				int nRandom = random.nextInt(1, 101);
				matriz[i][j] = nRandom;
			}
		}
		
		// Aquí podríamos imprimir la matriz para comprobar el futuro resultado
		int indice = matriz[0][0];
		int contadorFilas = 0;
		int contadorColumnas = 0;
		
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				if (indice < matriz[i][j]) {
					indice = matriz[i][j];
					contadorFilas = i;
					contadorColumnas = j;
				}
			}
		}
		
		System.out.printf("El número mas grande de la matriz es el %d\n"
				+ "Y esta en la fila %d, columna %d.", indice, contadorFilas + 1, contadorColumnas + 1);
	}
}