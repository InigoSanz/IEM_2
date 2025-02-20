package ejercicio_sobrecarga3;

public class Main {

	public static void main(String[] args) {
		
		// Vehiculos
		Vehiculo vehiculo1 = new Vehiculo("Audi", "A3", 31400);
		//Vehiculo vehiculo2 = new Vehiculo("BMW", "Serie 3", 43000);
		
		// Compradores
		Comprador comprador1 = new Comprador("Iñigo", 27, 39000);
	    //Comprador comprador2 = new Comprador("Juan", 27, 50000);
	    
	    // Mostramos la informacion de los vehiculos y los coches?
	    
	    System.out.println("Puede Iñigo comprar el Audi? " + comprador1.verificarCompra(vehiculo1));
	    System.out.println("Y financiado a 2 años? " + comprador1.verificarCompra(vehiculo1, 24));
	    
	    double precioAudi = vehiculo1.precioFinal(1000, 24);
	    System.out.println("El precio del Audi con 24% de impuestos y un descuento de 1000€ se quedaria en: " + precioAudi);
	}
}