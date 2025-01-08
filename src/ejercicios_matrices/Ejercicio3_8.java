package ejercicios_matrices;

import java.util.Scanner;

/**
 * Ejercicio 8.
 * 
 * Hundir la flota.
 * 
 * - Cada equipo tiene su propio océano representado por una matriz cuadrada de tamaño N x N.
 * - Cada celda del océano puede contener un barco ('B') o agua ('~').
 * - Los equipos se turnan para colocar sus barcos en sus respectivos océanos.
 * - Después de colocar los barcos, los equipos se turnan para realizar ataques en los océanos de los otros equipos.
 * ---> Un ataque exitoso hunde un barco enemigo, marcando la celda correspondiente con 'X'. Un ataque fallido se registra como agua ('~').
 * ---> El juego continúa hasta que todos los barcos de un equipo han sido hundidos.Se determina un equipo ganador al final del juego.
 */
public class Ejercicio3_8 {
	
	// Definición de las variables globales
	//private static final char BARCO = 'B'; La quito ya que si no no se de quien es cada barco
	private static final char AGUA = '~';
	private static final char HUNDIR = 'X';
	private static char[][] mares;
	private static int[] barcos;
	
	public static void main(String[] args) {
		
		System.out.println("Creamos el tablero: ");
		iniciarPartida();
		System.out.println("\nIniciamos la partida: ");
		// jugarPartida();
	}
	
	private static void iniciarPartida() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Introduce el número de jugadores: ");
		int nJugadores = scanner.nextInt();
		
		System.out.printf("Introduce el tamaño del tablero: ");
		int tamTablero = scanner.nextInt();
		
		System.out.printf("Introduce la cantidad de barcos por jugador: ");
		int cantidadBarcos = scanner.nextInt();
		
		mares = new char[tamTablero][tamTablero];
		barcos = new int[nJugadores];
		
		// Aquí deberíamos rellenar todo el tablero con agua
		for (int i = 0; i < tamTablero; i++) {
			for (int j = 0; j < tamTablero; j++) {
				mares[i][j] = AGUA;
			}
		}
		
		// Mostramos el tablero
		System.out.println();
		mostrarTablero();
		
		// Ahora ponemos en el tablero los barcos de cada jugador
		int fila = 0;
		int columna = 0;
		int contador = 0;
		
		/* Aquí es muy importante validar la posición donde queremos colocar los barcos, es decir, principalmente
		 * Que la posición este dentro del tablero y que no este ocupada.
		*/
		char indiceJugador = 0;
		for(int jugador : barcos) {
			barcos[jugador] = cantidadBarcos;
			indiceJugador = (char) ('1' + contador);
			System.out.printf("\nTurno del jugador %d de colocar sus barcos:\n ", contador + 1); // Sumo 1 para que no sea el jugador 0
			contador++;
			for (int i = 0; i < cantidadBarcos; i++) {
				System.out.printf("Barco %d -> Introduce posición: ", i + 1); // Lo mismo que con los jugadores
				fila = scanner.nextInt();
				columna = scanner.nextInt();
				while ((fila > tamTablero || fila < 0) || (columna > tamTablero || columna < 0) || mares[fila][columna] != AGUA) { // Lo metemos en una funcion?
					System.err.println("Posición inválida, prueba otra: ");
					fila = scanner.nextInt();
					columna = scanner.nextInt();
				}
				mares[fila][columna] = indiceJugador; // Colocamos en el tablero los barcos con el indice del jugador en cuestion para saber de quien es cada uno
			}
			System.out.println("Barcos colocados.");
		}
		
		scanner.close();
		
		// Mostramos el tablero
		System.out.println();
		mostrarTablero();
	}
	
	/*
	 * Función para poder jugar la partida.
	 */
	/*
	private static void jugarPartida() {
		boolean ganador = false;
		
		// Realizar ataque
					System.out.printf("Introduce fila y columna para atacar: ");
					int fila = scanner.nextInt();
					int columna = scanner.nextInt();
					while (!posicionDentroDelTablero(fila, columna, mares[jugadorObjetivo].length)) {
						System.out.println("Posición fuera del tablero. Intenta de nuevo.");
						fila = scanner.nextInt();
						columna = scanner.nextInt();
					}

					if (mares[jugadorObjetivo][fila][columna] != AGUA && mares[jugadorObjetivo][fila][columna] != HUNDIR) {
						System.out.println("\n✓ Barco hundido!");
						mares[jugadorObjetivo][fila][columna] = HUNDIR;
						barcosRestantes[jugadorObjetivo]--;
					} else {
						System.out.println("\n✘ Ataque fallido.");
					}

					// Verificar ganador
					hayGanador = verificarGanador();
					turno++;
	}
	*/
	/*
	 * Función para mostrar el tablero.
	 */
	private static void mostrarTablero() {
		for (int i = 0; i < mares.length; i++) {
			for (int j = 0; j < mares[0].length; j ++) {
				System.out.printf("%c ", mares[i][j]);
			}
			System.out.println(); // Aquí no habia puesto el salto de linea, por lo que mostraba el tablero como una linea
		}
	}
}