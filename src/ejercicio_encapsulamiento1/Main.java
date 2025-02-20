package ejercicio_encapsulamiento1;

public class Main {

	public static void main(String[] args) {
		
		// Instanciamos las suscripciones
		SuscripcionGimnasio suscripcion = new SuscripcionGimnasio("Iñigo Sanz", 27);
		
		// Mostramos información inicial
		suscripcion.mostrarInformacion();
		
		// Cancelamos la suscripción
		suscripcion.darDeBaja();
		
		// Verificamos el acceso
		suscripcion.verificarAcceso();
	}
}