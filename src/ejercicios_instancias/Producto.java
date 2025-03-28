package ejercicios_instancias;

public class Producto {
	
	private String descripcion;
	private double precio;
	private int cantidad;
	
	public Producto(String descripcion, double precio, int cantidad) {
		this.descripcion = descripcion;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	
	public String mostrarInformacion() {
		return "- Producto: " + descripcion + ", Precio: " + precio + ", Cantidad: " + cantidad + "\n";
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
}
