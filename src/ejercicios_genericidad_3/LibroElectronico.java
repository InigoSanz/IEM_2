package ejercicios_genericidad_3;

public class LibroElectronico<T> {
	
	private String titulo;
	private String autor;
	private T precio;
	
	public LibroElectronico(String titulo, String autor, T precio) {
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	}
	
	public void mostrarInformacion() {
		System.out.println("Título: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("Precio: " + precio + "€");
		System.out.println();
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

	public T getPrecio() {
		return precio;
	}

	public void setPrecio(T precio) {
		this.precio = precio;
	}
}