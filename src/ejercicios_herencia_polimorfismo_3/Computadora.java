package ejercicios_herencia_polimorfismo_3;

public class Computadora extends Producto {
	
	private String procesador;
	
	public Computadora(String nombre, double precio, String procesador) {
		super(nombre, precio);
		this.procesador = procesador;
	}
	
	@Override
	public void mostrarInformacion() {
		super.mostrarInformacion();
		System.out.println("Procesador: " + procesador + "\n");
	}
	
	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}
}