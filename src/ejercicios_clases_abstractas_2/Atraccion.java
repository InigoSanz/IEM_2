package ejercicios_clases_abstractas_2;

public abstract class Atraccion {
	
	private String nombre;
	private double costeBase;
	
	public Atraccion(String nombre, double costeBase) {
		this.nombre = nombre;
		this.costeBase = costeBase;
	}
	
	public abstract double calcularPrecioEntrada();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getCosteBase() {
		return costeBase;
	}

	public void setCosteBase(double costeBase) {
		this.costeBase = costeBase;
	}
}