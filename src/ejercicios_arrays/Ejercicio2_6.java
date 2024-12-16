package ejercicios_arrays;

import java.util.Random;
import java.util.Scanner;

/**
 * Ejercicio 6
 * 
 * Esto ya es un problemón...
 */
public class Ejercicio2_6 {

	public static void main(String[] args) {
		
		System.out.println("¡BIENVENIDOS A UN MARAVILLOSO JUEGO DE CARTAS!");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Introduce el número de jugadores: ");
		
		int nJugadores = scanner.nextInt();
		
		scanner.close();
		
		String[] cartas = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		String[] palos = {"Corazones", "Diamantes", "Tréboles", "Picas"};
		
		int longitudCartas = cartas.length;
		int longitudPalos = palos.length;
		
		// Lo suyo sería teniendo los palos y y las cartas, obtener la baraja completa
		String[] todas = new String[longitudCartas * longitudPalos];
		int indice = 0;
		for (String carta : cartas) {
			for (String palo : palos) {
				todas[indice] = carta + " " + palo;
				// System.out.println(todas[indice]);
				indice++;
			}
		}
		
		// Desordenar la baraja
		// De momento no se me ocurre
		// Podemos seguir sin desordenarla
		// ---------------------------------------------------------------------------
		// Despues de hablar con Jose Luis	
		int longitudTodas = todas.length;
				
		Random random = new Random();
		for (int i = 0; i < longitudTodas; i++) {
			int cartaAleatoria = random.nextInt(1, 53);
			String cartaParaCambiar = todas[i];
			todas[i] = todas[cartaAleatoria]; // Intercambio posiciones
			todas[cartaAleatoria] = cartaParaCambiar; // cambio la carta aleatoria
		}
		
		// Calculamos las cartas que le pueden llegar a cada jugador
		int cartasJugador = longitudTodas / nJugadores;
		// de todas formas, es raro que justo se repartan las mismas cartas para todo el mundo
		// Como calculamos y repartimos esas cartas que sobran y que algunos tendran mas que otros?
		
		
		// Luego tocaria repartir las cartas a cada jugador, pero habría que restar las cartas que se reparten
		// así hasta que no quede ninguna carta en el array
		// Despues de hablar con Jose Luis
		int contador = 0;
		for (int i = 1; i <= nJugadores; i++) { // recorro los jugadores
			System.out.printf("\nLas cartas para el jugador %d son: \n" , i);
			for (int j = 1; j <= cartasJugador; j++) { // y las cartas de cada uno
				System.out.printf("Carta %d: %s\n", j, todas[contador]);
				contador++;
			}
		}
		
		// Ahora toca sumar las cartas que le han tocado a cada uno.
		// En principio, habría que guardar las cartas de cada uno en un array, pero claro, no sabemos cuantos jugadores van a jugar, por lo que la cantidad
		// de arrays deberían crearse en funcion de los jugadores que juegan
		// lo logico es en el doble bucle anterior, guardar cada reparto de cartas, pero no podemos sobreescribirlo.
		// podríamos guardarlo, calcular la suma y luego sobreescribirlo, pero creo que no sería óptimo.
	}
}