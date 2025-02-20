package ejercicios_interfaces_1;

public class JuguetePeluche implements Juguete {
	
	private String descripcion;
	private double precioBase;
	private boolean lavable;
	
	public JuguetePeluche(String descripcion, double precioBase, boolean lavable) {
		this.descripcion = descripcion;
		this.precioBase = precioBase;
		this.lavable = lavable;
	}

	@Override
	public void mostrarInformacion() {
		System.out.println("Descripción: " + descripcion + ", Precio base: " + precioBase + ", Lavable: " .concat(lavable ? "Sí" : "No"));
	}

	@Override
	public double calcularPrecio() {
		double precioFinal = precioBase * (1 + IMPUESTO / 100);
		
		if (lavable == true) {
			precioFinal = precioFinal * 1.1;
		}
		
		return precioFinal;
	}

}