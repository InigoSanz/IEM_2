package ejercicios_clases_abstractas_1;

public abstract class Empleado {
	
	private String nombre;
	private String tipo;
	
	public Empleado(String nombre, String tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
	}
	
	public abstract double calcularSalario();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}