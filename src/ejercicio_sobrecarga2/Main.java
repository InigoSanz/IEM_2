package ejercicio_sobrecarga2;

public class Main {

	public static void main(String[] args) {
		
		Libro libro1 = new Libro("La Comunidad del Anillo", "R.R. Tolkien", 25.0, 1980);
		
		double precioFinal1 = libro1.calcularPrecioFinal();
		
		double precioFinal2 = libro1.calcularPrecioFinal(18);
		
		double precioFinal3 = libro1.calcularPrecioFinal(5, null);
		
		System.out.println("Precio final 1: " + precioFinal1);
		System.out.println("Precio final 2: " + precioFinal2);
		System.out.println("Precio final 3: " + precioFinal3);
	}
}