package ejercicios_genericidad_4;

public class Coches {
	
	public static int contadorCoches = 0;
	
	private String matricula;
	private String marca;
	private int puertas;
	
	public Coches(String matricula, String marca, int puertas) {
		this.matricula = matricula;
		this.marca = marca;
		this.puertas = puertas;
		contadorCoches++;
	}
	
	@Override
	public String toString() {
		return "Matrícula: " + matricula + "\n" 
				+ "Marca: " + marca + "\n" 
				+ "Número de puertas: " + puertas + "\n";
	}
	
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

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
}