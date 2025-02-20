package ejercicios_herencia_polimorfismo_3;

public class Main {

	public static void main(String[] args) {
		
		Computadora computadora = new Computadora("Alienware Aurora", 3499.95, "Intel i9 14900K");
		Impresora impresora = new Impresora("Brother MFC-L2710DW", 59.95, "Láser");
		
		computadora.mostrarInformacion();
		impresora.mostrarInformacion();
	}
}