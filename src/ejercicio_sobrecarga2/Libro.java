package ejercicio_sobrecarga2;

public class Libro {
	
	private String titulo;
	private String autor;
	private double precioBase;
	private int anioPublicacion;
	
	// Constructores
	public Libro(String titulo, String autor, double precioBase, int anioPublicacion) {
		this(titulo, autor);
		this.precioBase = precioBase;
		this.anioPublicacion = anioPublicacion;
	}
	
	public Libro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}
	
	// Métodos
	public double calcularPrecioFinal() {
		return precioBase * 1.21;
	}
	
	public double calcularPrecioFinal(int impuesto) {
		return precioBase * (1 + impuesto / 100.0);
	}
	
	public double calcularPrecioFinal(double descuento, Integer impuesto) {
		if (null == impuesto) {
			return calcularPrecioFinal() - descuento;
		}
		return calcularPrecioFinal(impuesto) - descuento;
	}
	
	// Getters y Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}	
}