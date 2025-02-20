package ejercicios_genericidad_5;

public class ViniloGrande extends Vinilo {
	
	private double duracionTotal;
	
	public ViniloGrande(String titulo, String artista, boolean tienePortadaGenerica, boolean esImportacion, double duracionTotal) {
		super(titulo, artista, tienePortadaGenerica, esImportacion);
		this.duracionTotal = duracionTotal;
	}
	
	@Override
	public String toString() {
		return super.toString() + 
				"Duración: " + Utilidades.transformarDuracion(duracionTotal) + "\n";
	}
	
	public double getDuracionTotal() {
		return duracionTotal;
	}

	public void setDuracionTotal(double duracionTotal) {
		this.duracionTotal = duracionTotal;
	}
}