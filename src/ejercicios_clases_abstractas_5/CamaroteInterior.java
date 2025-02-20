package ejercicios_clases_abstractas_5;

public class CamaroteInterior extends Camarote {
	
	private boolean tieneVentana;
	private int capacidadMax;
	
	public CamaroteInterior(double precioBase, int capacidad, boolean tieneVentana) {
		super(precioBase, capacidad);
		this.tieneVentana = tieneVentana;
		this.capacidadMax = 4;
	}

	@Override
	public double calcularCoste(double precioBase, int capacidad) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String toString() {
		return "";
	}

	public boolean isTieneVentana() {
		return tieneVentana;
	}

	public void setTieneVentana(boolean tieneVentana) {
		this.tieneVentana = tieneVentana;
	}

	public int getCapacidadMax() {
		return capacidadMax;
	}

	public void setCapacidadMax(int capacidadMax) {
		this.capacidadMax = capacidadMax;
	}
}