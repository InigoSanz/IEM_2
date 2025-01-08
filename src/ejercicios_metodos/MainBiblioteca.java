package ejercicios_metodos;

/**
 * Clase Main.
 */
public class MainBiblioteca {

	public static void main(String[] args) {
		
		Biblioteca biblioteca = new Biblioteca();
		
		Libro libro1 = new Libro();
		libro1.setTitulo("Cien años de soledad");
		libro1.setAutor("Gabriel Gracía Márquez");
		libro1.setAnioPublicacion(1967);
		libro1.setId("LIB001");
		
		Libro libro2 = new Libro();
		libro2.setTitulo("Don Quijote de la Mancha");
		libro2.setAutor("Miguel de Cervantes");
		libro2.setAnioPublicacion(1605);
		libro2.setId("LIB002");
		
		Libro libro3 = new Libro();
		libro3.setTitulo("1984");
		libro3.setAutor("George Orwell");
		libro3.setAnioPublicacion(1949);
		libro3.setId("LIB003");
		
		Libro libro4 = new Libro();
		libro4.setTitulo("El principito");
		libro4.setAutor("Antoine de Saint-Exupéry");
		libro4.setAnioPublicacion(1943);
		libro4.setId("LIB004");
		
		// Agregamos los libros al inventario
		biblioteca.agregarLibros(libro1);
		biblioteca.agregarLibros(libro2);
		biblioteca.agregarLibros(libro3);
		biblioteca.agregarLibros(libro4);
		
		// Mostramos el inventario de inicio
		biblioteca.mostrarInventario();
		
		// Realizamos prestamos
		biblioteca.realizarPrestamo("LIB001");
		biblioteca.realizarPrestamo("LIB002");
		
		// Mostrar el inventario después de los prestamos
		System.out.println("\nEl estado del inventario después de los prestamos es: ");
		biblioteca.mostrarInventario();
		
		// Devolver libros
		biblioteca.realizarDevolucion("LIB001");
		biblioteca.realizarDevolucion("LIB003"); // No esta prestado
		
		// Mostrar el inventario después de las devoluciones
		System.out.println("\nEl estado del inventario después de las devoluciones es: ");
		biblioteca.mostrarInventario();
	}
}