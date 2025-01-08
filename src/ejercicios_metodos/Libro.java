package ejercicios_metodos;

/**
 * Clase libro.
 */
public class Libro {
	
	private String id;
	private String titulo;
	private String autor;
	private int anioPublicacion;
	private boolean prestado = false;
	
	// Métodos
	public void prestar() {
		if (!prestado) {
			prestado = true;
			System.out.println("\nLibro prestado con éxito.");
		} else {
			System.out.println("\nEl libro ya está prestado.");
		}
	}
	
	public void devolver() {
		if (prestado) {
			prestado = false;
			System.out.println("\nLibro devuelto con éxito.");
		} else {
			System.out.println("\nEl libro no está prestado.");
		}
	}
	
	public void mostrarInformacion() {	
		String estado = prestado ? "No disponible" : "Disponible";	
		System.out.println("Título: "+ titulo + " Autor: " + autor + " Año de publicación: " + anioPublicacion + " Estado: " + estado);
	}
	
	// Getters y Setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
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
	
	public int getAnioPublicacion() {
		return anioPublicacion;
	}
	
	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}
	
	public boolean isPrestado() {
		return prestado;
	}
	
	public void setPrestado(boolean estado) {
		this.prestado = estado;
	}
}