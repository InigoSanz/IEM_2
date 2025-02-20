package ejercicios_instancias_3;

public class Empleado {
	
	public static final double SALARIO_BASE = 1200.0;
	public static int numeroTotalEmpleados = 0;
	
	private String nombre;
	private int edad;
	private double salario;
	
	public Empleado(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario = SALARIO_BASE;
		numeroTotalEmpleados++;
	}
	
	public void aumentarSalario(int porcentaje) {
		this.salario = this.salario * (1 + porcentaje / 100.0); 
	}
	
	public void mostrarInformacion() {
		System.out.println("=== Empleado: ");
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Edad: " + this.edad);
		System.out.println("Salario: " + this.salario);
	}
	
	public static int getNumeroTotalEmpleados() {
		return numeroTotalEmpleados;
	}

	public static void setNumeroTotalEmpleados(int numeroTotalEmpleados) {
		Empleado.numeroTotalEmpleados = numeroTotalEmpleados;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}