package ejercicios_genericidad_4;

public class Motos {
	
	public static int contadorMotos = 0;
	
	private String matricula;
	private String marca;
	private int retrovisores;
	
	public Motos(String matricula, String marca, int retrovisores) {
		this.matricula = matricula;
		this.marca = marca;
		this.retrovisores = retrovisores;
		contadorMotos++;
	}
	
	@Override
	public String toString() {
		return "Matrícula: " + matricula + "\n" 
				+ "Marca: " + marca + "\n" 
				+ "Número de retovisores: " + retrovisores + "\n";
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

	public int getRetrovisores() {
		return retrovisores;
	}

	public void setRetrovisores(int retrovisores) {
		this.retrovisores = retrovisores;
	}
}