package ejercicio_encapsulamiento3;

import java.util.Date;

/**
 * @author Inigo
 * @version 1.0
 * 
 * Clase que representa un usuario de la red social.
 */
public class Perfil {
	
	// Constantes
	private static int acopleId = 1;;
	
	// Atributos
	private String id;
	private String nombreUsuario;
	private String nombreReal;
	private Date fechaCreacion;
	
	// Constructor
	public Perfil(String nombreUsuario, String nombreReal) {
		this.id = "ID" + acopleId;
		this.nombreUsuario = nombreUsuario;
		this.nombreReal = nombreReal;
		this.fechaCreacion = new Date();
		acopleId++;
	}
	
	// Métodos
	@Override
	public String toString() {
		return "\nID: " + id +
				"\nNombre usuario: " + nombreUsuario +
				"\nNombre real: " + nombreReal + 
				"\nFecha creación: " + Utilidades.transformarFecha(fechaCreacion);
	}
	
	// Getters y Setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getNombreReal() {
		return nombreReal;
	}

	public void setNombreReal(String nombreReal) {
		this.nombreReal = nombreReal;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
}