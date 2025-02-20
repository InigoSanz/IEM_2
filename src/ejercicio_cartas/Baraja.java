package ejercicio_cartas;

import java.util.ArrayList;
import java.util.Random;

/**
 * Clase para la baraja.
 */
public class Baraja {
	
	private ArrayList<Carta> cartas = new ArrayList<>();

	// Métodos
	// Lo mismo que en el método barajar, aquí se utiliza un ArrayList
	public void crearBaraja() {
		String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		String[] palos = {"Corazones", "Diamantes", "Tréboles", "Picas"};
		
		for (String valor : valores) {
			for (String palo : palos) {
				Carta carta = new Carta();
				carta.crearCarta(valor, palo);
				cartas.add(carta);
			}
		}
	}
	
	// Este método en el anterior ejercicio de las cartas, se hizo con una array String[]
	// Por lo que esta vez si quería utilizar un ArrayList, había que cambiar la manera de asignar, obbtener e intercambiar las cartas
	public void barajar() {
		Random random = new Random();
		int tam = cartas.size();
		for (int i = 0; i < tam; i++) {
			int cartaAleatoria = random.nextInt(tam);
			Carta cartaParaCambiar = cartas.get(i);
			cartas.set(i, cartas.get(cartaAleatoria)); // Intercambio posiciones
			cartas.set(cartaAleatoria,  cartaParaCambiar); // cambio la carta aleatoria
		}
	}
	
	public Carta repartir() {
		if (!cartas.isEmpty()) {
			return cartas.remove(0);
		} else {
			return null;
		}
	}
	
	// Getters y Setters
	public ArrayList<Carta> getCartas() {
		return cartas;
	}

	public void setCartas(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}
}