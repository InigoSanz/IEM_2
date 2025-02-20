package ejercicio_parking;

public class Main {

	public static void main(String[] args) {
		
		// Creamos instancias de Vehiculo
		Vehiculo vehiculo1 = new Vehiculo("ABC1234", "BMW", "Serie 3", 4, 2009);
		Vehiculo vehiculo2 = new Vehiculo("XYZ1234", "Mercedes", "Clase A", 5, 2019);
		Vehiculo vehiculo3 = new Vehiculo("XRP1234", "Audi", "A3", 5, 2018);
		Vehiculo vehiculo4 = new Vehiculo("XLM1234", "Mazda", "3", 5, 2023);
		
		// Creamos la instancia del Parking
		Parking parking = new Parking(3);
		
		// Registramos los vehiculos
		parking.registarVehiculo(vehiculo1);
		parking.registarVehiculo(vehiculo2);
		parking.registarVehiculo(vehiculo3);
		parking.registarVehiculo(vehiculo4);
		
		// Mostramos la informacion del parking
		parking.mostrarInformacion();
		
		// Mostramos la tarifa total del parking
		double tarifaTotalParking = parking.calcularTarifaTotal();
		System.out.println("La tarifa total del parking es: " + tarifaTotalParking);		
	}
}