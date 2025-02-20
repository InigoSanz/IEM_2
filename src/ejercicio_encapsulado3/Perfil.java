package ejercicio_encapsulado3;

/**
 * La clase Perfil debe representar un usuario de la red social con atributos como identificador, nombre de usuario, nombre real y fecha de creación.
 */
import java.util.Date;

public class Perfil {
	
	private int id;
	private String nombreUsuario;
	private String nombreReal;
	private Date fechaCreacion;
	
	// Constructores
	public Perfil(String nombreUsuario, String nombreReal) {
		this.id = Utilidades.generarId();
		this.nombreUsuario = nombreUsuario;
		this.nombreReal = nombreReal;
		this.fechaCreacion = new Date();
	}
	
	// Métodos
	@Override
	public String toString() {
		return "\nPerfil del usuario con ID: " + id + "\n"
				+ "Nombre de usuario: " + nombreUsuario + "\n"
				+ "Nombre real: " + nombreReal + "\n"
				+ "Fecha de creación: " + Utilidades.transformarFecha(fechaCreacion) + "\n";
	}
	
	// Getters y Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
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