package ejercicios_herencia_polimorfismo_2;

public class Camisa extends Prenda{
	
	private String marca;
	
	public Camisa(String color, String talla, String marca) {
		super(color, talla, "Camisa");
		this.marca = marca;
	}
	
	public void colocarBotones() {
		System.out.println("Se han colocado los botones de la camisa");
	}
	
	@Override
	public String mostrarInformacion() {
		return super.mostrarInformacion() + "Marca: " + marca; 
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
}