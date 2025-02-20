package ejercicio_encapsulamiento3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Inigo
 * @version 1.0
 * 
 * Clase que gestiona una lista de perfiles y publicaciones.
 * Con métodos que contienen la lógica de negocio.
 */
public class RedSocial {
	
	// Atributos
	private List<Perfil> perfiles;
	private List<Publicacion> publicaciones;
	
	public RedSocial() {
		this.perfiles = new ArrayList<>();
		this.publicaciones = new ArrayList<>();
	}
	
	// Métodos
	public void agregarPerfil(Perfil perfil) {
		if (perfiles.contains(perfil)) {
			System.err.println("El perfil que intentas crear ya existe.");
		} else {
			perfiles.add(perfil);
			System.out.println("El perfil " + perfil.getId() + " se ha creado.");
		}
	}
	
	private Perfil buscarPorId(String id) {
		for (Perfil perfil : perfiles) {
			if (perfil.getId().equals(id)) {
				return perfil;
			}
		}
		return null;
	}
	
	public void realizarPublicacion(String idPerfil, String contenido) {
		Perfil perfilActual = buscarPorId(idPerfil);
		
		if (null != perfilActual) {
			Publicacion publi = new Publicacion(perfilActual, contenido);
			publicaciones.add(publi);
			System.out.println("Se ha añadido una publicación.");
		} else {
			System.err.println("No hemos encontrado el perfil del usuario, no podemos realizar la publicación.");
		}
	}
	
	public void mostrarInformacion() {
		if (null == publicaciones) {
			System.err.println("No hay publicaciones.");
		} else {
			for (Publicacion publicacion : publicaciones) {
				System.out.println(publicacion.toString()); 
			}
		}	
	}
	
	// Getters y Setters
	public List<Perfil> getPerfiles() {
		return perfiles;
	}
	public void setPerfiles(List<Perfil> perfiles) {
		this.perfiles = perfiles;
	}
	public List<Publicacion> getPublicaciones() {
		return publicaciones;
	}
	public void setPublicaciones(List<Publicacion> publicaciones) {
		this.publicaciones = publicaciones;
	}
}