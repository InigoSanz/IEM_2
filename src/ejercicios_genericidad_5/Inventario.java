package ejercicios_genericidad_5;

import java.util.ArrayList;
import java.util.List;

public class Inventario<T extends Vinilo> {
	
	private List<T> cosas;
	
	public Inventario() {
		this.cosas = new ArrayList<>();
	}
	
	public void agregarCosa(T cosa) {
		cosas.add(cosa);
		System.out.println("Se ha agregado un " + cosa);
	}
	
	public void eliminarCosa(T cosa) {
		if (cosas.contains(cosa)) {
			cosas.remove(cosa);
			System.out.println("Se ha eliminado " + cosa);
		} else {
			System.out.println(cosa + " no se encuentra en la lista");
		}
	}
	
	
	public List<T> buscarPorAtributos(Object atributo) {
		List<T> aux = new ArrayList<>();
		
		for (T vinilo : cosas) {
			if (atributo instanceof String) {
				String valorString = (String) atributo;
				if (valorString.equals(vinilo.getTitulo()) || valorString.equals(vinilo.getArtista())) {
					aux.add(vinilo);
				}
			} else if (atributo instanceof Boolean) {
				boolean valorBoolean = (Boolean) atributo;
				if (valorBoolean == vinilo.isTienePortadaGenerica() || valorBoolean == vinilo.isEsImportacion()) {
					aux.add(vinilo);
				}
			} 
		}
		
		return aux;
	}
	
	public void mostrarInventario() {
		if (cosas.isEmpty()) {
			System.out.println("El inventario esta vacío.");
		} else {
			System.out.println("-> Inventario: ");
			for (T cosa : cosas) {
				System.out.println(cosa.toString());
			}
		}
	}

	public List<T> getCosas() {
		return cosas;
	}

	public void setCosas(List<T> cosas) {
		this.cosas = cosas;
	}
}