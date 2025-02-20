package ejercicios_genericidad_2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Inigo
 * 
 * Clase Genérica
 * 
 * @param <T>
 */
public class Contenedor<T> {
	
	private List<T> elementos;
	
	public Contenedor() {
		elementos = new ArrayList<>();
	}
	
	public void agregarElementos(T elemento) {
		elementos.add(elemento);
	}
	
	public List<T> obtenerElementos() {
		return elementos;
	}
	
	public boolean existeElemento(T elemento) {
		return elementos.contains(elemento);
	}
	
	public void eliminarElemento(T elemento) {
		elementos.remove(elemento);
	}
	
	public void actualizarElemento(T elementoAnterior, T elementoNuevo) {
		int indice = this.elementos.indexOf(elementoAnterior);
		if (indice != -1) {
			this.elementos.set(indice, elementoNuevo);
		}
	}
}