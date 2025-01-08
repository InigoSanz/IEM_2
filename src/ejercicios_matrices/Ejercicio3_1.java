package ejercicios_matrices;

import java.util.Scanner;

/**
 * Escribe un programa en Java que solicite al usuario ingresar una matriz cuadrada (misma cantidad de filas y columnas)
 * luego determine si la matriz es simétrica o no.
 * Una matriz es simétrica si es igual a su matriz transpuesta (matriz[i][j] = matriz[j][i]).
 */
public class Ejercicio3_1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Introduce un número para crear una matriz cuadrada: ");
		
		int n = scanner.nextInt();
		
		int[][] matriz = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("Elemento %d %d: ", i, j);
				matriz[i][j] = scanner.nextInt();
			}
		}
		
		scanner.close();
		
		boolean isTrue = true;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (matriz[i][j] == matriz[j][i]) {
					isTrue = true;
				} else {
					isTrue = false;
					break;
				}
			}
		}
		
		if (isTrue == true) {
			System.out.println("La matriz es simétrica.");
		} else {
			System.out.println("La matriz no es simétrica.");
		}
	}
}