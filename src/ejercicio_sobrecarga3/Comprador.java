package ejercicio_sobrecarga3;

public class Comprador {
	
	private String nombre;
	private int edad;
	private double presupuesto;
	
	// Constructores
	public Comprador(String nombre, int edad, double presupuesto) {
		this.nombre = nombre;
		this.edad = edad;
		this.presupuesto = presupuesto;
	}
	
	// Métodos
	public boolean verificarCompra(Vehiculo vehiculo) {
		double precioFinal = vehiculo.precioFinal();
		if (precioFinal <= presupuesto) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean verificarCompra(Vehiculo vehiculo, int cuotasFinanciacion) {
		double precioFinal = vehiculo.precioFinal();
		double precioFinanciacion = precioFinal * (1 + (0.01 * cuotasFinanciacion));
		if (precioFinanciacion <= presupuesto) {
			return true;
		} else {
			return false;
		}
	}
	
	public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Presupuesto: " + presupuesto);
    }
	
	// Getters y Setters
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public double getPresupuesto() {
		return presupuesto;
	}
	
	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}
}