package ejercicios_clases_abstractas_4;

public class ExperimentoBiologico extends Experimento {
	
	private String organismo;
	
	public ExperimentoBiologico(String nombre, String descripcion, String organismo) {
		super(nombre, descripcion);
		this.organismo = organismo;
	}

	@Override
	public void realizarExperimento() {	
		System.out.println("Se ha realizado un experimento sobre " + getOrganismo());
	}

	@Override
	public void analizarResultados() {
		System.out.println("Se estan analizando los datos del proyecto ->" + getOrganismo() + "<-");
	}

	@Override
	public void obtenerTipoExperimento() {
		System.out.println("Tipo de experimento: Biológico");		
	}

	public String getOrganismo() {
		return organismo;
	}

	public void setOrganismo(String organismo) {
		this.organismo = organismo;
	}
}