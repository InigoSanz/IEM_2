package ejercicio_parking;

public class Parking {
	
	private Vehiculo[] vehiculos;
	private int numeroVehiculos;
	
	// Constructores
	public Parking(int capacidadParking) {
		super();
		this.vehiculos = new Vehiculo[capacidadParking];
		this.numeroVehiculos = 0;
	}
	
	// Métodos
	public void registarVehiculo(Vehiculo vehiculo) {
		if (numeroVehiculos < vehiculos.length) {
			vehiculos[numeroVehiculos] = vehiculo;
			numeroVehiculos++;
			System.out.println("Vehiculo registrado correctamente.");
		} else {
			System.out.println("No se ha podido registrar el vehiculo, parking completo.");
		}
	}
	
	public double calcularTarifaTotal() {
		double tarifaTotal = 0;
		
		for (int i = 0; i < numeroVehiculos; i++) {
			tarifaTotal = tarifaTotal + vehiculos[i].calcularTarifa();
		}
		
		return tarifaTotal;
	}
	
	public void mostrarInformacion() {
		for (int i = 0; i < numeroVehiculos; i++) {
			vehiculos[i].mostrarInformacion();
			System.out.println();
		}
	}
	
	// Getters y Setters
	public Vehiculo[] getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(Vehiculo[] vehiculos) {
		this.vehiculos = vehiculos;
	}

	public int getNumeroVehiculos() {
		return numeroVehiculos;
	}

	public void setNumeroVehiculos(int numeroVehiculos) {
		this.numeroVehiculos = numeroVehiculos;
	}
}
