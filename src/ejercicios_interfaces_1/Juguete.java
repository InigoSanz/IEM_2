package ejercicios_interfaces_1;

public interface Juguete {
	
	public static final double IMPUESTO = 21;
	
	/**
	 * Método para mostrar información de un Juguete
	 */
	public void mostrarInformacion();
	
	/**
	 * Método para calcular el precio de un Juguete
	 * 
	 * @return 
	 */
	public double calcularPrecio();
}