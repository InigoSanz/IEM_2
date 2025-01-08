package ejercicio_trafico;

public class Carretera {
	
	private String nombre;
	private int limiteVelocidad;
	private double distancia;
	
	// Métodos
	public boolean verificarLimiteDeVelocidad(double velocidad) {
		if (velocidad <= limiteVelocidad || velocidad == limiteVelocidad) {
			return true;
		} else {
			return false;
		}
	}
	
	public double calcularTiempo(double velocidad) {
		if (velocidad > 0) {
			double tiempo = distancia / velocidad;
			return tiempo;
		} else {
			System.out.println("El vehiculo esta parado, no se puede calcular el tiempo.");
			return 0;
		}
	}
	
	public void mostrarInformacion() {
		System.out.println("Nombre carretera: " + nombre);
		System.out.println("Límite de la vía: " + limiteVelocidad + " km/h");
		System.out.println("Recorrido: " + distancia + " km");
	}
	
	// Getters y Setters
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getLimiteVelocidad() {
		return limiteVelocidad;
	}
	
	public void setLimiteVelocidad(int limiteVelocidad) {
		this.limiteVelocidad = limiteVelocidad;
	}
	
	public double getDistancia() {
		return distancia;
	}
	
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
}