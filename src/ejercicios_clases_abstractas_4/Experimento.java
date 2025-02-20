package ejercicios_clases_abstractas_4;

public abstract class Experimento {
	
	private String nombre;
	private String descripcion;
	
	public Experimento(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	
	public abstract void realizarExperimento();
	
	public abstract void analizarResultados();
	
	public abstract void obtenerTipoExperimento();
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}