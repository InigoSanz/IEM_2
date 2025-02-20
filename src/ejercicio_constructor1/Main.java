package ejercicio_constructor1;

public class Main {

	public static void main(String[] args) {
		
		// Creamos una instancia de Estudiante utilizando el constructor por defecto
		Estudiante estudiantePorDefecto = new Estudiante();
		estudiantePorDefecto.mostrarInformacion();
		
		// Creamos una instancia de Estudiante utilizando el constructor con todos los parámetros
		Estudiante estudianteParametros = new Estudiante("Iñigo", 27, "Estadística");
		estudianteParametros.mostrarInformacion();
		
	}
}