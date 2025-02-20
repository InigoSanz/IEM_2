package ejercicio_encapsulamiento3;

/**
 * @author Inigo
 * @version 1.0
 * 
 * Clase Main del programa.
 */
public class Main {

	public static void main(String[] args) {
		
		// Creamos la red social
		RedSocial redSocial = new RedSocial();
		
		// Creamos usuarios
		Perfil perfil1 = new Perfil("ReyMisterio", "Iñigo Sanz");
		Perfil perfil2 = new Perfil("Anonymous", "Fran Jauca");
		
		// Agregamos los perfiles a la red social
		redSocial.agregarPerfil(perfil1);
		redSocial.agregarPerfil(perfil2);
		
		// Realizamos publicaciones
		redSocial.realizarPublicacion(perfil1.getId(), "Que sueño tengo macho...");
		redSocial.realizarPublicacion(perfil1.getId(), "Te las cascas, jajajajaja");
		redSocial.realizarPublicacion(perfil2.getId(), "Estoy mas jodido que el copon");
		
		// Mostramos las publicaciones de la red social
		redSocial.mostrarInformacion();
	}
}