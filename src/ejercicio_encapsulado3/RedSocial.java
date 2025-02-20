package ejercicio_encapsulado3;

import java.util.ArrayList;

/**
 * La clase RedSocial debe gestionar una lista de perfiles y publicaciones, 
 * con métodos para agregar perfiles, realizar publicaciones e imprimir la información completa de la red social, 
 * incluyendo detalles de perfiles y publicaciones.
 * Tendremos un método privado que nos obtiene las fechas de creación y publicación del sistema en formato String.
 */
public class RedSocial {
	
	private ArrayList<Perfil> perfiles;
	private ArrayList<Publicacion> publicaciones;
	
	// Constructores
	public RedSocial() {
		this.perfiles = new ArrayList<>();
		this.publicaciones = new ArrayList<>();
	}

	// Métodos
	/*
	 * Método para agregar perfiles
	 * Para ello vamos a validar la existencia de estos
	 */
	public void agregarPerfil(Perfil perfil) {
		if (perfiles.contains(perfil)) {
			System.out.println("El perfil que intentas crear ya existe.");
		} else {
			perfiles.add(perfil);
			System.out.println("El perfil -> " + perfil.getNombreUsuario() + " <- se ha agregado correctamente.");
		}
	}
	
	/* 
	 * Método para buscar perfiles por ID
	 */
	private Perfil buscarPerfilPorId(int id) {
		for (Perfil perfil : perfiles) {
			if (perfil.getId() == id) {
				return perfil;
			}
		}
		return null;
	}
	
	/*
	 * Método para buscar publicaciones por ID
	 */
	/*private Publicacion buscarPublicacionesPorId(int id) {
		for (Publicacion publicacion : publicaciones) {
			if (publicacion.getId() != id) {
				System.err.println("¡La publicación que buscas no existe!");
			} else {
				return publicacion;
			}
		}
		return null;
	}*/
	
	/*
	 * Método para realizar una publicación
	 */
	public void hacerPublicacion(int idPerfil, String contenido) {
		Perfil autor = buscarPerfilPorId(idPerfil);
		if (autor != null) {
			Publicacion publicacion = new Publicacion(autor, contenido);
			publicaciones.add(publicacion);
			System.out.println("\nSe ha añadido la publicación de " + autor.getNombreUsuario());		
		} else {
			System.err.println("¡Perfil no encontrado, no puedes publicar nada!");
		}
	}
	
	/*
	 * Método tpara mostrar la información
	 */
	public void mostrarInformacion() {
		for (Perfil perfil : perfiles) {
			System.out.println(perfil.toString());
			for (Publicacion publicacion : publicaciones) {
				if (publicacion.getAutor().equals(perfil)) { // Aquí hice la comparación al reves, entonces siempre me imprimia un error
															 // Lo he cambiado y tampoco funciona 
					System.out.println(publicacion.toString());
				} else {
					//System.err.println("¡Error!");
					// Lo mismo que arriba, habria que usar try and catch?
				}
			}
		}
	}
	
	// Getters y Setters
	public ArrayList<Perfil> getPerfiles() {
		return perfiles;
	}

	public void setPerfiles(ArrayList<Perfil> perfiles) {
		this.perfiles = perfiles;
	}

	public ArrayList<Publicacion> getPublicaciones() {
		return publicaciones;
	}

	public void setPublicaciones(ArrayList<Publicacion> publicaciones) {
		this.publicaciones = publicaciones;
	}
}