package ejercicios_interfaces_1;

public class Main {

	public static void main(String[] args) {
		
		Juguete j1 = new JugueteElectronico("Robot transformable", 10, false);
		Juguete j2 = new JuguetePeluche("Pou", 5, true);
		
		j1.mostrarInformacion();
		j2.mostrarInformacion();
		
		System.out.println("Precio del juguete electrónico: " + j1.calcularPrecio());
		System.out.println("Precio del juguete de peluche: " + j2.calcularPrecio());
	}
}