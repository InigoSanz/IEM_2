package ejercicios_interfaces_1;

public class JugueteElectronico implements Juguete {
	
	private String descripcion;
	private double precioBase;
	private boolean pilasIncluidas;
	
	public JugueteElectronico(String descripcion, double precioBase, boolean pilasIncluidas) {
		this.descripcion = descripcion;
		this.precioBase = precioBase;
		this.pilasIncluidas = pilasIncluidas;
	}

	@Override
	public void mostrarInformacion() {
		System.out.println("Descripción: " + descripcion + ", Precio base: " + precioBase + ", Pilas incluidas: " .concat(pilasIncluidas ? "Sí" : "No"));		
	}

	@Override
	public double calcularPrecio() {
		double precioFinal = precioBase * (1 + IMPUESTO / 100);
		
		if (pilasIncluidas == true) {
			precioFinal = precioFinal * 1.05;
		}
		
		return precioFinal;
	}

}