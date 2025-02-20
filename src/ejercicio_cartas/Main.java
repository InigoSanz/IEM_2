package ejercicio_cartas;

/**
 * Clase Main.
 */
public class Main {

	public static void main(String[] args) {
		
		// Iniciamos el juego con la baraja
		Baraja baraja = new Baraja();
		baraja.crearBaraja();
		baraja.barajar();
		
		// Creamos los jugadores
		Jugador jugador1 = new Jugador();
		jugador1.setNombre("Iñigo");
		Jugador jugador2 = new Jugador();
		jugador2.setNombre("Juan");
		
		// Supongamos que en cada mano vamos a tener 7 cartas
		// Repartimos estas cartas
		for (int i = 0; i < 7; i++) {
			jugador1.recibir(baraja.repartir());
			jugador2.recibir(baraja.repartir());
		}
		
		// Mostramos las cartas de cada jugador
		jugador1.mostrarMano();
		jugador2.mostrarMano();
	}
}