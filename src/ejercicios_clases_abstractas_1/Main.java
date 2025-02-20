package ejercicios_clases_abstractas_1;

public class Main {

	public static void main(String[] args) {
		
		EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("Iñigo", 1500.0);
		EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("Juan", 40, 14.0);
		
		System.out.println(empleadoAsalariado.getNombre() + " es un empleado " + empleadoAsalariado.getTipo() + " con un salario mensual de " 
				+ empleadoAsalariado.calcularSalario() + "€");
		System.out.println(empleadoPorHoras.getNombre() + " es un empleado " + empleadoPorHoras.getTipo() + " con un salario por horas de " 
				+ empleadoPorHoras.calcularSalario() + "€");
	}
}