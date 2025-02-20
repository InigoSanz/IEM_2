package ejercicios_genericidad_3;

public class Main {

	public static void main(String[] args) {
		
		LibroElectronico<Double> libroFantasia = new LibroElectronico<>("Narnia", "Ni idea", 15.95);
		LibroElectronico<Integer> libroAnime = new LibroElectronico<>("Psycho-Pass", "Ni idea 2.0", 18);
		
		libroFantasia.mostrarInformacion();
		libroAnime.mostrarInformacion();
	}
}