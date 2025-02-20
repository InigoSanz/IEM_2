package ejercicios_clases_abstractas_4;

public class ProyectoInvestigacion {
	
	private String nombreProyecto;
	private Experimento[] experimento;
	
	public ProyectoInvestigacion(String nombreProyecto, Experimento[] experimento) {
		this.nombreProyecto = nombreProyecto;
		this.experimento = experimento;
	}
	
	public void realizarProyecto() {
		for (Experimento experimentos : experimento) {
			experimentos.realizarExperimento();
			experimentos.analizarResultados();
			experimentos.obtenerTipoExperimento();
			System.out.println();
		}
	}
	
	public String getNombreProyecto() {
		return nombreProyecto;
	}

	public void setNombreProyecto(String nombreProyecto) {
		this.nombreProyecto = nombreProyecto;
	}

	public Experimento[] getExperimento() {
		return experimento;
	}

	public void setExperimento(Experimento[] experimento) {
		this.experimento = experimento;
	}
}
