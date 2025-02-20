package ejercicios_genericidad_5;

public class Utilidades {
	
	public static String transformarDuracion(double duracionTotal) {
		int min = (int) duracionTotal;
		int sec = (int) ((duracionTotal - min) * 60);
		return min + " minutos y " + sec + " segundos";
	}
}