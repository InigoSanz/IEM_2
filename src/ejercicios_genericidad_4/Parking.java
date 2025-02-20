package ejercicios_genericidad_4;

import java.util.ArrayList;
import java.util.List;

public class Parking<T> {
	
	private List<T> vehiculos;
	private int capacidadParking;
	
	public Parking(int capacidadParking) {
		this.capacidadParking = capacidadParking;
		this.vehiculos = new ArrayList<>();
	}
	
	private boolean comprobarCapacidad() {
		if (vehiculos.size() < capacidadParking) {
			return true;
		} else {
			System.err.println("El parking esta completo, no se pueden agregar más vehiculos.");
			return false;
		}
	}
	
	public void agregarVehiculo(T vehiculo) {
		if (comprobarCapacidad()) {
			vehiculos.add(vehiculo);
			System.out.println("Se ha agregado un vehiculo.");
		}
	}
	
	public void eliminarVehiculo(T vehiculo) {
		if (vehiculos.contains(vehiculo)) {
			vehiculos.remove(vehiculo);
			System.out.println("Se ha eliminado el vehiculo: \n" + vehiculo);
		} else {
			System.out.println("El vehiculo " + vehiculo + " no existe.");
		}
	}
	
	public void mostrarInformacion() {
		if (vehiculos.isEmpty()) {
			System.out.println("El parking está vacío.");
		} else {
			System.out.println("\nLos vehículos que hay en el parking son: ");
			for (T vehiculo : vehiculos) {
				System.out.println(vehiculo.toString());
			}
		}
	}

	public List<T> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(List<T> vehiculos) {
		this.vehiculos = vehiculos;
	}

	public int getCapacidadParking() {
		return capacidadParking;
	}

	public void setCapacidadParking(int capacidadParking) {
		this.capacidadParking = capacidadParking;
	}
}