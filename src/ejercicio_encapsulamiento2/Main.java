package ejercicio_encapsulamiento2;

public class Main {

	public static void main(String[] args) {
		
		// Creamos algunos jugadores y karts
		Kart kart1 = new Kart("Iñigo", 1);
		Kart kart2 = new Kart("Iñigo", 2);
		Kart kart3 = new Kart("Iñigo", 3);
		
		// Inicializamos la carrera
		kart1.empezarCarrera();
		kart2.empezarCarrera();
		kart3.empezarCarrera();
		
		// Avanzamos vueltas
		// Vuelta 1
		kart1.avanzarCarrera(20.9);
		kart2.avanzarCarrera(30.9);
		kart3.avanzarCarrera(14.2);
		
		// Vuelta 2
		kart1.avanzarCarrera(21.8);
		kart2.avanzarCarrera(28.3);
		kart3.avanzarCarrera(16.2);
		
		// Mostramos la información
		kart1.mostrarInformacion();
		kart2.mostrarInformacion();
		kart3.mostrarInformacion();
		
		// Finalizamos la carrera
		kart1.finalizarCarrera();
		kart2.finalizarCarrera();
		kart3.finalizarCarrera();
	}
}