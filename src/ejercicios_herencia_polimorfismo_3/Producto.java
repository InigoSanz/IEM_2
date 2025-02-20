package ejercicios_herencia_polimorfismo_3;

public class Producto {
	
	private String nombre;
	private double precio;
	
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public void mostrarInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Precio: " +  precio + " euros");
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
}