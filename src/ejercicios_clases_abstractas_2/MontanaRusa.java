package ejercicios_clases_abstractas_2;

public class MontanaRusa extends Atraccion {
	
	private int duracionMinutos;
	
	public MontanaRusa(String nombre, double costeBase, int duracionMinutos) {
		super(nombre, costeBase);
		this.duracionMinutos = duracionMinutos;
	}

	@Override
	public double calcularPrecioEntrada() {
		return getCosteBase() + duracionMinutos * 0.1;
	}
}