package ejercicio_cartas;

/**
 * Clase para las cartas.
 */
public class Carta {
	
	private String valor;
	private String palo;
	
	// Métodos
	public void crearCarta(String valor, String palo) {
		this.valor = valor;
		this.palo = palo;		
	}
	
	@Override
	public String toString() {
		return valor + " de " + palo + "\n";
	}
	
	// Getters y Setters
	public String getValor() {
		return valor;
	}
	
	public void setValor(String valor) {
		this.valor = valor;
	}
	
	public String getPalo() {
		return palo;
	}
	
	public void setPalo(String palo) {
		this.palo = palo;
	}
}