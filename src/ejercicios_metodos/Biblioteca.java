package ejercicios_metodos;

/**
 * Clase biblioteca.
 */
public class Biblioteca {
	
	// Inventario de los libros de la biblioteca
	private Libro[] inventario = new Libro[5];
	private int contadorLibros = 0;
	
	// Métodos
	public void agregarLibros(Libro libro) {
		if (contadorLibros < inventario.length) {
			inventario[contadorLibros] = libro;
			contadorLibros++;
			System.out.println("El libro " + libro.getTitulo() + " ha sido añadido al inventario.");
		} else {
			System.out.println("No se pueden agregar más libros, inventario lleno.");
		}
	}
	
	public void realizarPrestamo(String id) {
		for (int i = 0; i < contadorLibros; i++) {
			if (inventario[i].getId().equals(id)) {
				inventario[i].prestar();
				return;
			}
		}
		System.out.println("El libro con el identificador: " + id + " no esta disponible.");
	}
	
	public void realizarDevolucion(String id) {
		for (int i = 0; i < contadorLibros; i++) {
			if (inventario[i].getId().equals(id)) {
				inventario[i].devolver();
				return;
			}
		}
		System.out.println("El libro con el identificador: " + id + " no esta disponible.");
	}
	
	public void mostrarInventario() {
		if (contadorLibros == 0) {
			System.out.println("\nEl inventario está vacío.");
			return;
		} else {
			System.out.println("\nInventario de la biblioteca: ");
			for (int i = 0; i < contadorLibros; i++) {
				inventario[i].mostrarInformacion();
			}
		}
	}
	
	// Getters y Setters
	public Libro[] getInventario() {
		return inventario;
	}
	
	public void setInventario(Libro[] inventario) {
		this.inventario = inventario;
	}
	
	public int getContadorLibros() {
		return contadorLibros;
	}
	
	public void setContadorLibros(int contadorLibros) {
		this.contadorLibros = contadorLibros;
	}
}