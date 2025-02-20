package ejercicios_genericidad_5;

public class ViniloPequenio extends Vinilo {

	private String generoMusical;
	
	public ViniloPequenio(String titulo, String artista, boolean tienePortadaGenerica, boolean esImportacion, String generoMusical) {
		super(titulo, artista, tienePortadaGenerica, esImportacion);
		this.generoMusical = generoMusical;
	}

	@Override
	public String toString() {
		return super.toString() + 
				"Género: " + generoMusical + "\n";
	}
	
	public String getGeneroMusical() {
		return generoMusical;
	}

	public void setGeneroMusical(String generoMusical) {
		this.generoMusical = generoMusical;
	}
}