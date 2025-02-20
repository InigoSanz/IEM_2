package ejercicios_clases_abstractas_2;

public class Taquilla {
	
	private String nombreParque;
	private Atraccion[] atracciones;
	
	public Taquilla(String nombreParque, Atraccion[] atracciones) {
		this.nombreParque = nombreParque;
		this.atracciones = atracciones;
	}
	
	public double calcularPrecioTotalEntradas() {
		double precioTotal = 0;
		for (Atraccion atraccion : atracciones) {
			precioTotal = precioTotal + atraccion.calcularPrecioEntrada();
		}
		return precioTotal;
	}

	public String getNombreParque() {
		return nombreParque;
	}

	public void setNombreParque(String nombreParque) {
		this.nombreParque = nombreParque;
	}

	public Atraccion[] getAtracciones() {
		return atracciones;
	}

	public void setAtracciones(Atraccion[] atracciones) {
		this.atracciones = atracciones;
	}
}