package ejercicios_herencia_polimorfismo_2;

public class Main {

	public static void main(String[] args) {
		
		// Creamos una instancia de la fábrica
		FabricaRopa fabrica = new FabricaRopa();
		
		// Creamos pantalones
		Pantalon pantalon = new Pantalon("Azul", "M", true);
		Camisa camisa = new Camisa("Roja", "S", "Levis");
		Prenda prenda = new Prenda("Verde", "XL", "Sombrero");
		
		// Agregamos las prendas al inventario de la fábrica
		fabrica.agregarPrenda(pantalon);
		fabrica.agregarPrenda(camisa);
		fabrica.agregarPrenda(prenda);
		
		// Fabricar las prendas
		fabrica.fabricar();
		
		// Empaquetar prendas
		fabrica.empaquetar();
		
		// Mostramos el inventario
		fabrica.mostrarInformacionInventario();
	}
}