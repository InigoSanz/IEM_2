package ejercicios_clases_abstractas_3;

public class Main {

	public static void main(String[] args) {
		
		Automovil automovil = new Automovil("Audi", "A3", 2018, 5);
		Motocicleta motocicleta = new Motocicleta("Kawasaki", "Z900", 2020, "Naked");
		
		automovil.mostrarInformacion();
		motocicleta.mostrarInformacion();
	}
}