package ejercicio_encapsulamiento3;

import java.util.Date;

/**
 * @author Inigo
 * @version 1.0
 * 
 * Clase que contiene información sobre una publicación.
 */
public class Publicacion {
	
	// Constantes
	private static int acopleIdPubli = 1;
	
	// Atributos
	private String id;
	private Perfil autor;
	private String contenido;
	private Date fechaCreacion;
	
	// Constructor
	public Publicacion(Perfil autor, String contenido) {
		this.id = "PU" + acopleIdPubli;
		this.autor = autor;
		this.contenido = contenido;
		this.fechaCreacion = new Date();
		acopleIdPubli++;
	}
	
	// Métodos
	@Override
	public String toString() {
		return "\nAutor: " + autor.getNombreUsuario() + 
				"\nContenido: " + contenido +
				"\nFecha: " + Utilidades.transformarFecha(fechaCreacion);
	}
	
	// Getters y Setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Perfil getAutor() {
		return autor;
	}

	public void setAutor(Perfil autor) {
		this.autor = autor;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
}