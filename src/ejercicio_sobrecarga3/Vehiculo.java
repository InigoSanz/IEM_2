package ejercicio_sobrecarga3;

public class Vehiculo {
	
	private String marca;
	private String modelo;
	private double precioBase;
	private int impuesto;
	
	// Contructores
	public Vehiculo(String marca, String modelo, double precioBase) {
		this.marca = marca;
		this.modelo = modelo;
		this.precioBase = precioBase;
		this.impuesto = 15;
	}
	
	// Métodos
	public double precioFinal() {
		return precioBase * 1.21;
	}
	
	public double precioFinal(int impuesto) {
		return precioBase * (1 + impuesto / 100.0);
	}
	
	public double precioFinal(double descuento, Integer impuesto) {
		if (null == impuesto) {
			return precioFinal() - descuento;
		}
		return precioFinal(impuesto) - descuento;
	}
	
	public void mostrarInformacion() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Precio sin impuestos: " + precioBase);
	}
	
	// Getters y Setters
	public String getMarca() {
		return marca;
	}

	public int getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(int impuesto) {
		this.impuesto = impuesto;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public double getPrecioBase() {
		return precioBase;
	}
	
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
}