package ejercicios_clases_abstractas_5;

public abstract class Camarote {
	
	private double precioBase;
	private int capacidad;
	
	public Camarote(double precioBase, int capacidad) {
		this.precioBase = precioBase;
		this.capacidad = capacidad;
	}
	
	// Métodos abstractos
	public abstract double calcularCoste(double precioBase, int capacidad);
	
	@Override
	public String toString() {
		return "El precio base de un camarote es: " + precioBase + "\n"
				+ "Y la capacidad es de: " + capacidad + " personas\n";
	}
	
	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
}