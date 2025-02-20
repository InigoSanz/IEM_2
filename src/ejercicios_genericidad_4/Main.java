package ejercicios_genericidad_4;

public class Main {

	public static void main(String[] args) {
		
		Parking<Object> parkingMixto = new Parking<>(10);
		
		Coches coche1 = new Coches("9994MCB", "Audi", 4);
		Coches coche2 = new Coches("4764JVJ", "BMW", 2);
		
		Motos moto1 = new Motos("5632LLM", "Kawasaki", 1);
		Motos moto2 = new Motos("5467MML", "Ducati", 2);
		
		Camiones camion1 = new Camiones("8373DDC", "Scania", true);
		Camiones camion2 = new Camiones("8996HHF", "Mercedes", false);
		
		parkingMixto.agregarVehiculo(coche1);
		parkingMixto.agregarVehiculo(coche2);
		parkingMixto.agregarVehiculo(moto1);
		parkingMixto.agregarVehiculo(moto2);
		parkingMixto.agregarVehiculo(camion1);
		parkingMixto.agregarVehiculo(camion2);
		
		parkingMixto.mostrarInformacion();
		
		parkingMixto.eliminarVehiculo(coche2);
		
		System.out.println("Después de eliminar el coche 2...");
		
		parkingMixto.mostrarInformacion();
		
		System.out.println("La cantidad de coches en el parking es: " + Coches.contadorCoches);
		System.err.println("Esto esta mal.");
		System.out.println("La cantidad de motos en el parking es: " + Motos.contadorMotos);
		System.err.println("Esto esta mal.");
		System.out.println("La cantidad de camiones en el parking es: " + Motos.contadorMotos);
		System.err.println("Esto esta mal.");
	}
}