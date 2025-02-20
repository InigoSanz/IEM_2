package ejercicios_genericidad_5;

import java.util.Random;

public class Vinilo {
	
	private int id;
	private String titulo;
	private String artista;
	private boolean tienePortadaGenerica;
	private boolean esImportacion;
	
	public Vinilo(String titulo, String artista, boolean tienePortadaGenerica, boolean esImportacion) {
		this.id = generarId();
		this.titulo = titulo;
		this.artista = artista;
		this.tienePortadaGenerica = tienePortadaGenerica;
		this.esImportacion = esImportacion;
	}
	
	private int generarId() {
		Random random = new Random();
		int randomId = random.nextInt(100);
		return randomId;
	}
	
	public String toString() {
		return "Vinilo ->\n"
				+ "ID: " + id + "\n"
				+ "Título: " + titulo + "\n"
				+ "Artista: " + artista + "\n"
				+ "Portada Genérica: " + (tienePortadaGenerica ? "Sí" : "No") + "\n"
				+ "¿Importado? " + (esImportacion ? "Sí" : "No") + "\n";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public boolean isTienePortadaGenerica() {
		return tienePortadaGenerica;
	}

	public void setTienePortadaGenerica(boolean tienePortadaGenerica) {
		this.tienePortadaGenerica = tienePortadaGenerica;
	}

	public boolean isEsImportacion() {
		return esImportacion;
	}

	public void setEsImportacion(boolean esImportacion) {
		this.esImportacion = esImportacion;
	}
}