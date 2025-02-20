package ejercicio_constructor3;

public class Producto {
	
	private String id;
	private String nombre;
	private double precio;
	
	// Constructores
	public Producto(String id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }
	
	// Métodos
	public void mostrarInformacion() {
		System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio + " €");
        System.out.println();
	}
	
	// Getters y Setters
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
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