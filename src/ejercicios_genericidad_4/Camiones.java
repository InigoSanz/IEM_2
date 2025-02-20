package ejercicios_genericidad_4;

public class Camiones {
	
	public static int contadorCamiones = 0;
	
	private String matricula;
	private String marca;
	private boolean remolque;
	
	public Camiones(String matricula, String marca, boolean remolque) {
		this.matricula = matricula;
		this.marca = marca;
		this.remolque = remolque;
		contadorCamiones++;
	}
	
	@Override
	public String toString() {
		return "Matrícula: " + matricula + "\n" 
				+ "Marca: " + marca + "\n" 
				+ "Remolque: " + (remolque ? "Sí" : "No") + "\n";
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

	public boolean isRemolque() {
		return remolque;
	}

	public void setRemolque(boolean remolque) {
		this.remolque = remolque;
	}
}