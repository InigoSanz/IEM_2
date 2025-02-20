package ejercicio_encapsulado3;

import java.util.Date;

/**
 * La clase Publicacion deberá contener un identificador, autor (objeto Perfil), contenido y fecha de publicación.
 */
public class Publicacion {
	
	private int id;
	private Perfil autor;
	private String contenido;
	private Date fechaPublicacion;
	
	// Constructores
	public Publicacion(Perfil autor, String contenido) {
		this.id = Utilidades.generarId();		
		this.autor = autor;
		this.contenido = contenido;
		this.fechaPublicacion = new Date();
	}

	// Métodos
	@Override
	public String toString() {
		return "Publición con ID: " + id + "\n"
				+ "Autor: " + autor.getNombreUsuario() + "\n"
				+ "Contenido: " + contenido + "\n"
				+ "Fecha de publicación: " + Utilidades.transformarFecha(fechaPublicacion) + "\n";
	}
	
	// Getters y Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public Date getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}
}