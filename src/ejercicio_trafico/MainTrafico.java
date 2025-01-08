package ejercicio_trafico;

public class MainTrafico {

	public static void main(String[] args) {
		
		// Creamos varios vehiculos
		Vehiculo vehiculo1 = new Vehiculo();
		vehiculo1.setMarca("BMW");
		vehiculo1.setModelo("Serie 3");
		vehiculo1.setColor("Gris");
		vehiculo1.setVelocidad(0.0);
		vehiculo1.setVelocidadMaxima(233.4);
		
		Vehiculo vehiculo2 = new Vehiculo();
		vehiculo2.setMarca("Audi");
		vehiculo2.setModelo("A3");
		vehiculo2.setColor("Blanco");
		vehiculo2.setVelocidad(0.0);
		vehiculo2.setVelocidadMaxima(221.1);
		
		// Creamos las carreteras
		Carretera carretera1 = new Carretera();
		carretera1.setNombre("M30");
		carretera1.setLimiteVelocidad(100);
		carretera1.setDistancia(12.3);
		
		Carretera carretera2 = new Carretera();
		carretera2.setNombre("A2");
		carretera2.setLimiteVelocidad(120);
		carretera2.setDistancia(56.7);
		
		// Mostramos la información de los vehiculos
		vehiculo1.mostrarInformacion();
		System.out.println();
		vehiculo2.mostrarInformacion();
		System.out.println();
		
		// Mostramos la informacion de las carreteras
		carretera1.mostrarInformacion();
		System.out.println();
		carretera2.mostrarInformacion();
		System.out.println();
		
		// Control de tráfico
		// Aceleramos
		vehiculo1.acelerar(60.0);
		vehiculo2.acelerar(130.3);
		
		boolean isTrue1 = carretera1.verificarLimiteDeVelocidad(vehiculo1.getVelocidad());
		boolean isTrue2 = carretera1.verificarLimiteDeVelocidad(vehiculo2.getVelocidad());
		
		System.out.println("\n¿El vehiculo 1 cumple con el límite de la vía? " + isTrue1);
		System.out.println("\n¿El vehiculo 2 cumple con el límite de la vía? " + isTrue2);
		System.out.println();
		
		vehiculo1.acelerar(80.7);
		
		isTrue1 = carretera1.verificarLimiteDeVelocidad(vehiculo1.getVelocidad());
		
		System.out.println("\n¿Ahora cumple con el límite de la vía? " + isTrue1 + "\n");
		
		vehiculo1.frenar(50.8);
		vehiculo2.frenar(130.3);
		
		double tiempoRecorrido1 = carretera1.calcularTiempo(vehiculo1.getVelocidad());
		double tiempoRecorrido2 = carretera1.calcularTiempo(vehiculo2.getVelocidad());
		
		if (tiempoRecorrido1 > 0) {
			System.out.printf("\nEl tiempo en el que recorre la carretera el vechiculo 1 es de %.2f", tiempoRecorrido1);
		}
		
		if (tiempoRecorrido2 > 0) {
			System.out.printf("\nEl tiempo en el que recorre la carretera el vechiculo 2 es de %.2f", tiempoRecorrido2);
		}
	}
}