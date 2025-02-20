package ejercicios_clases_abstractas_4;

public class ExperimentoFisico extends Experimento {
	
	private String fenomeno;
	
	public ExperimentoFisico(String nombre, String descripcion, String fenomeno) {
		super(nombre, descripcion);
		this.fenomeno = fenomeno;
	}

	@Override
	public void realizarExperimento() {
		System.out.println("Se ha realizado un experimento sobre " + getFenomeno());	
	}

	@Override
	public void analizarResultados() {
		System.out.println("Se estan analizando los datos del proyecto ->" + getFenomeno() + "<-");		
	}

	@Override
	public void obtenerTipoExperimento() {
		System.out.println("Tipo de experimento: Físico");	
	}

	public String getFenomeno() {
		return fenomeno;
	}

	public void setFenomeno(String fenomeno) {
		this.fenomeno = fenomeno;
	}
}