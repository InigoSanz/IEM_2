package ejercicio_encapsulamiento2;

public class Kart {
	
	private String nombre;
	private int numeroKart;
	private int puntuacion;
	private double totalTiempo;
	private int vueltaActual;
	
	// Constructores
	public Kart(String nombre, int numeroKart) {
		this.nombre = nombre;
		this.numeroKart = numeroKart;
		this.puntuacion = 0;
		this.totalTiempo = 0;
		this.vueltaActual = 0;
	}
	
	// Métodos
	public void mostrarInformacion() {
		System.out.println();
		System.out.println("Nombre: " + nombre);
		System.out.println("Número de Kart: " + numeroKart);
		System.out.println("Vuelta actual: " + vueltaActual);
		System.out.println("Puntuación: " + puntuacion);
		System.out.println("Tiempo total: " + totalTiempo);
	}
	
	public void empezarCarrera() {
		vueltaActual = 1;
		puntuacion = 0;
		System.out.println("La carrera ha comenzado para el piloto " + nombre + " con el Kart número " + numeroKart);
	}
	
	private int calcularPuntuacion(double tiempoVuelta) {
		if (tiempoVuelta < 30) {
			return 10;
		} 
		if (tiempoVuelta < 40) {
			return 8;
		}
		if (tiempoVuelta < 50) {
			return 5;
		}
		
		return 2;
	}
	
	public void avanzarCarrera(double tiempoVuelta) {
		if (vueltaActual > 0) {
			totalTiempo = totalTiempo + tiempoVuelta;
			puntuacion = puntuacion + calcularPuntuacion(tiempoVuelta);
			System.out.println(nombre + " con el Kart " + numeroKart + " ha completado la vuelta " + vueltaActual + " con una puntuación de " + puntuacion);
			vueltaActual++;
		} else {
			System.out.println("La carrera no ha empezado.");
		}
	}
	
	public void finalizarCarrera() {
		System.out.println("Carrera finalizada para el piloto " + nombre + " con el Kart número " + numeroKart);
		System.out.println("Puntuación final: " + puntuacion);
	}
	
	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroKart() {
		return numeroKart;
	}

	public void setNumeroKart(int numeroKart) {
		this.numeroKart = numeroKart;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	public double getTotalTiempo() {
		return totalTiempo;
	}

	public void setTotalTiempo(double totalTiempo) {
		this.totalTiempo = totalTiempo;
	}
	
	public int getVueltaActual() {
		return vueltaActual;
	}

	public void setVueltaActual(int vueltaActual) {
		this.vueltaActual = vueltaActual;
	}
}