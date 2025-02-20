package ejercicios_instancias_3;

public class Main {

	public static void main(String[] args) {
		
		Empleado empleado1 = new Empleado("Iñigo", 27);
		Empleado empleado2 = new Empleado("Juan", 27);
		
		empleado1.mostrarInformacion();
		empleado2.mostrarInformacion();
		
		empleado1.aumentarSalario(10);
		empleado2.aumentarSalario(15);
		
		System.out.println("\nInformación de los empleados después del aumento salarial");
		empleado1.mostrarInformacion();
		empleado2.mostrarInformacion();
		
		System.out.println("\nEl número total de empleados es " + Empleado.numeroTotalEmpleados);
	}
}