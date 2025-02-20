package ejercicios_clases_abstractas_1;

public class EmpleadoPorHoras extends Empleado {
	
	private int horasTrabajadas;
	private double tarifaPorHora;
	
	public EmpleadoPorHoras(String nombre, int horasTrabajas, double tarifaPorHora) {
		super(nombre, "Por Horas");
		this.horasTrabajadas = horasTrabajas;
		this.tarifaPorHora = tarifaPorHora;
	}
	
	@Override
	public double calcularSalario() {
		return horasTrabajadas * tarifaPorHora;
	}
}