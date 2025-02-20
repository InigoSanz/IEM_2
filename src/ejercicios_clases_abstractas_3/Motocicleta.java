package ejercicios_clases_abstractas_3;

public class Motocicleta extends Vehiculo {
	
	private String tipo;
	
	public Motocicleta(String marca, String modelo, int anio, String tipo) {
		super(marca, modelo, anio);
		this.tipo = tipo;
	}

	@Override
	public void obtenerTipo() {
		System.out.println("Tipo: " + getTipo() + "\n");
	}
	
	@Override
	public void mostrarInformacion() {
		System.out.println("Motos: ");
		super.mostrarInformacion();
		obtenerTipo();
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}