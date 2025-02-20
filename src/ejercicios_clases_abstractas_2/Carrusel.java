package ejercicios_clases_abstractas_2;

public class Carrusel extends Atraccion{
	
	private int numAsientos;
	
	public Carrusel(String nombre, double costeBase, int numAsientos) {
		super(nombre, costeBase);
		this.numAsientos = numAsientos;
	}

	@Override
	public double calcularPrecioEntrada() {
		return getCosteBase() + numAsientos * 2;
	}
}