package ejercicio_cartas;

import java.util.ArrayList;

/**
 * Clase para los jugadores.
 */
public class Jugador {
	
	private String nombre;
	private ArrayList<Carta> mano = new ArrayList<>();
	
	// Métodos
	public void recibir(Carta carta) {
		if (carta != null) {
			mano.add(carta);
		}
	}
	
	public void mostrarMano() {
		System.out.println("Mano del jugador " + nombre + ": ");
		for (Carta carta : mano) {
			System.out.println(carta);
		}
	}
	
	// Getters y Setters
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public ArrayList<Carta> getMano() {
		return mano;
	}
	
	public void setMano(ArrayList<Carta> mano) {
		this.mano = mano;
	}
}