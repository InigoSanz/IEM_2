package ejercicios_metodos;

public class Main {

	public static void main(String[] args) {
		
		Estudiante estudiante1 = new Estudiante();
		Estudiante estudiante2 = new Estudiante();
		
		// Establecemos los valores con los setter
		estudiante1.setName("Juan");
		estudiante1.setAge(23);
		estudiante1.setCalification(7.3);
		
		estudiante2.setName("Jorge");
		estudiante2.setAge(21);
		estudiante2.setCalification(7.9);
		
		// Mostramos la información de los estudiantes
		estudiante1.mostrarInformacion();
		System.out.println();
		estudiante2.mostrarInformacion();
		System.out.println();
		
		// Actualizar algunos atributos
		estudiante1.setCalification(4.1);
		estudiante2.setName("Javier");
		
		// Mostramos la información luego de actualizarla
		estudiante1.mostrarInformacion();
		System.out.println();
		estudiante2.mostrarInformacion();
		System.out.println();
	}
}