package ejercicios_herencia_polimorfismo_2;

public class Pantalon extends Prenda {
	
	private boolean esVaquero;
	
	public Pantalon(String color, String talla, boolean esVaquero) {
		super(color, talla, "Pantalón");
		this.esVaquero = esVaquero;
	}
	
	public void coserBolsillos() {
		System.out.println("Se han cosido los bolsillos del pantalón.");
	}
	
	@Override
	public String mostrarInformacion() {
		return super.mostrarInformacion() + "Es vaquero?: " .concat(esVaquero ? "Si" : "No");
	}

	public boolean isEsVaquero() {
		return esVaquero;
	}

	public void setEsVaquero(boolean esVaquero) {
		this.esVaquero = esVaquero;
	}
}