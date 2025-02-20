package ejercicio_taller;

import java.util.ArrayList;

public class Cliente {
	
	private String id;
	private String nombre;
	private ArrayList<ObraDeArte> obras;
	private int capacidad;
	
	// Constructores
	// Como puede o no haber comprado obras, el contructor no llevará como argumento el arraylist
	public Cliente(String id, String nombre, int capacidad) {
        this.id = id;
        this.nombre = nombre;
        this.obras = new ArrayList<>();
        this.capacidad = capacidad;
    }
	
	// Métodos
	// En primera instancia se utiliza un método void para agregar las obras, pero en teoria cada obra es unica por lo que no se pueden repetir
	// En ese caso, para que retorne algo para saber si esta duplicada, usariamos un boolean
	// En este caso lo vamos a dejar como void
	public void agregarObras(ObraDeArte obra) {
		obras.add(obra);
		System.out.println("Obra añadida.");
	}
	
	public void mostrarInformacion() {
		System.out.println("Cliente: " + id);
		System.out.println("Nombre: " + nombre);
		System.out.println("Obras: ");
		for (ObraDeArte obra : obras) {
			obra.mostrarInformacion();
			System.out.println();
		}
	}
	
	// Getters y Setters
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public ArrayList<ObraDeArte> getObras() {
		return obras;
	}
	
	public void setObras(ArrayList<ObraDeArte> obras) {
		this.obras = obras;
	}
	
	public int getCapacidad() {
		return capacidad;
	}
	
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
}