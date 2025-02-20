package ejercicios_herencia_polimorfismo_2;

public class Prenda {
	
	private String color;
	private String talla;
	private String tipoPrenda;
	
	public Prenda(String color, String talla, String tipoPrenda) {
		this.color = color;
		this.talla = talla;
		this.tipoPrenda = tipoPrenda;
	}
	
	public void fabricar() {
		System.out.println("Se ha fabricado una prenda.");
	}
	
	public void empaquetar() {
		System.out.println("Se ha empaquetado una prenda.");
	}
	
	public String mostrarInformacion() {
		return "Información de " + tipoPrenda + ": \n" +
				"Talla: " + getTalla() + "\n" +
				"Color: " + getColor() + "\n";
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getTipoPrenda() {
		return tipoPrenda;
	}

	public void setTipoPrenda(String tipoPrenda) {
		this.tipoPrenda = tipoPrenda;
	}
}