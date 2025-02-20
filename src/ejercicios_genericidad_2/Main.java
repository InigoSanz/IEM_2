package ejercicios_genericidad_2;

public class Main {

	public static void main(String[] args) {
		
		Contenedor<Integer> contenedorEnteros = new Contenedor<>();
		contenedorEnteros.agregarElementos(10);
		contenedorEnteros.agregarElementos(20);
		contenedorEnteros.agregarElementos(30);
		
		System.out.println("Elementos del contenedor de enteros: " + contenedorEnteros.obtenerElementos());
		
		int elementoBuscar = 20;
		if (contenedorEnteros.existeElemento(elementoBuscar)) {
			System.out.println("\nEl elemento " + elementoBuscar + " está presente en el contenedor.");
		} else {
			System.out.println("\nEl elemento " + elementoBuscar + " no esta presente en el contenedor.");
		}
		
		contenedorEnteros.eliminarElemento(elementoBuscar);
		
		contenedorEnteros.actualizarElemento(30, 40);
		System.out.println("Después de actualizar el elemento de 30 a 40: " + contenedorEnteros.obtenerElementos());
	}
}