package ejercicios_clases_abstractas_1;

public class EmpleadoAsalariado extends Empleado {
	
	private double salarioMensual;
	
	public EmpleadoAsalariado(String nombre, double salarioMensual) {
		super(nombre, "Asalariado");
		this.salarioMensual = salarioMensual;
	}

	@Override
	public double calcularSalario() {
		return salarioMensual;
	}
}