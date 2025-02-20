package ejercicio_constructor3;

public class Cliente {
	
	private String id;
	private String nombre;
	private String direccion;
	
	// Constructores
	public Cliente(String id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
    }
	
	// Métodos
	public void mostrarInformacion() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);
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
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}
