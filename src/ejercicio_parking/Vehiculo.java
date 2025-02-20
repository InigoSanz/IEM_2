package ejercicio_parking;

public class Vehiculo {
	
	private String matricula;
	private String marca;
	private String modelo;
	private int numeroPuertas;
	private int anioMatriculacion;
	
	// Constructores
	public Vehiculo(String matricula, String marca, String modelo, int numeroPuertas, int anioMatriculacion) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.numeroPuertas = numeroPuertas;
		this.anioMatriculacion = anioMatriculacion;
	}
	
	// Métodos
	public double calcularTarifa() {
		double tarifa = 10;
		
		if (numeroPuertas > 4) {
			tarifa += tarifa * 0.1;
		}
		
		if (anioMatriculacion < 2010) {
			tarifa += tarifa * 0.2;
		}
		
		return tarifa;
	}
	
	public void mostrarInformacion() {
		System.out.println("Matricula: " + matricula);
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Número de puertas: " + numeroPuertas);
		System.out.println("Año de matriculación: " + anioMatriculacion);
		System.out.println();
	}

	// Getters y Setters
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getNumeroPuertas() {
		return numeroPuertas;
	}
	
	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}
	
	public int getAnioMatriculacion() {
		return anioMatriculacion;
	}
	
	public void setAnioMatriculacion(int anioMatriculacion) {
		this.anioMatriculacion = anioMatriculacion;
	}
}
