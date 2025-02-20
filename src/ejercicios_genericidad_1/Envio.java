package ejercicios_genericidad_1;

/**
 * @author Inigo
 * 
 * Clase Genérica
 * 
 * @param <T>
 * @param <Y>
 */
public class Envio<T, Y> {
	
	private T carga;
	private Y destino;
	
	public Envio(T carga, Y destino) {
		this.carga = carga;
		this.destino = destino;
	}
	
	public void realizarEnvio() {
		System.out.println("Enviando carga a: " + destino.toString() + " : " + carga.toString());
	}
	
	
}