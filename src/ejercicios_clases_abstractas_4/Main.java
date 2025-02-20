package ejercicios_clases_abstractas_4;

public class Main {

	public static void main(String[] args) {
		
		ExperimentoBiologico biologico = new ExperimentoBiologico("Diabétes", "Tratamiento de una enfermedad crónica", "Células madre");
		ExperimentoFisico fisico = new ExperimentoFisico("Energía", "Medición de energia resultado de una explosión", "Explosión de hidrógeno");
		
		Experimento[] experimentos = {biologico, fisico};
		
		ProyectoInvestigacion proyecto = new ProyectoInvestigacion("Proyecto de fin de carrera", experimentos);
		
		proyecto.realizarProyecto();
	}
}