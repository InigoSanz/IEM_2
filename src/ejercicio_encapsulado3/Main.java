package ejercicio_encapsulado3;

/**
 * @author Inigo
 * @version 1.1
 * 
 * Clase Main para la ejecución.
 */
public class Main {

	public static void main(String[] args) {
		
		// Instanciamos la red social
		RedSocial redSocial = new RedSocial();
		
		// Creamos los perfiles de la red social
		Perfil perfil1 = new Perfil("Anonymous", "Iñigo");
		Perfil perfil2 = new Perfil("Espartano69", "Juan");
		
		// Agregamos los perfiles a la red social
		redSocial.agregarPerfil(perfil1);
		redSocial.agregarPerfil(perfil2);
		
		// Realizamos publicaciones, se hacen con el id del usuario y el contenido
		redSocial.hacerPublicacion(perfil1.getId(), "A quien madruga, cansado se encuentra el resto del día JAJAJAJAJA");
		redSocial.hacerPublicacion(perfil2.getId(), "¡Me encanta Java!");
		
		// Mostramos la información
		redSocial.mostrarInformacion();
	}
}