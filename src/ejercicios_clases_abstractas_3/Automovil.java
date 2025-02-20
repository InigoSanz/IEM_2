package ejercicios_clases_abstractas_3;

public class Automovil extends Vehiculo {
	
	private int numPuertas;
	
	public Automovil(String marca, String modelo, int anio, int numPuertas) {
		super(marca, modelo, anio);
		this.numPuertas = numPuertas;
	}

	@Override
	public void obtenerTipo() {	
		System.out.println("Tipo: " + getNumPuertas() + " puertas\n");
	}
	
	@Override
	public void mostrarInformacion() {
		System.out.println("Automoviles: ");
		super.mostrarInformacion();
		obtenerTipo();
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}
}
