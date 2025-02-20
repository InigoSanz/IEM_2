package ejercicios_herencia_polimorfismo_3;

public class Impresora extends Producto{
	
	private String impresion;
	
	public Impresora(String nombre, double precio, String impresion) {
		super(nombre, precio);
		this.impresion = impresion;
	}
	
	@Override
	public void mostrarInformacion() {
		super.mostrarInformacion();
		System.out.println("Impresión: " + impresion + "\n");
	}
	
	public String getImpresion() {
		return impresion;
	}

	public void setImpresion(String impresion) {
		this.impresion = impresion;
	}
}