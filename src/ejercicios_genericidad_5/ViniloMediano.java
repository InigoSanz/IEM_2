package ejercicios_genericidad_5;

public class ViniloMediano extends Vinilo {

	private boolean esSencillo;
	
	public ViniloMediano(String titulo, String artista, boolean tienePortadaGenerica, boolean esImportacion, boolean esSencillo) {
		super(titulo, artista, tienePortadaGenerica, esImportacion);
		this.esSencillo = esSencillo;
	}
	
	@Override
	public String toString() {
		return super.toString() 
				+ "Sencillo: " + (esSencillo ? "Sí" : "No") + "\n";
	}

	public boolean isEsSencillo() {
		return esSencillo;
	}

	public void setEsSencillo(boolean esSencillo) {
		this.esSencillo = esSencillo;
	}
}