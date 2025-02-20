package ejercicio_encapsulamiento1;

import java.util.Random;

public class SuscripcionGimnasio {
	
	private String nombre;
	private int edad;
	private boolean estaActivo;
	private String codigo;
	
	
	// Constructores
	public SuscripcionGimnasio(String nombre, int edad) {
		System.out.println();
		this.nombre = nombre;
		this.edad = edad;
		this.estaActivo = true; // Por defecto esta activo
		this.codigo = generarCodigo(); // Generamos el código para cada suscripcion
	}
	
	// Métodos
	private String generarCodigo() {
		Random random = new Random();
		
		int numAleatorio = random.nextInt(1000);
		
		return "MEM" + numAleatorio;
	}
	
	public void darDeBaja() {
		if (estaActivo == true) {
			estaActivo = false;
			System.out.println("Te has dado de baja...");
		} else {
			System.out.println("¡Ya estás dado de baja!");
		}
	}
	
	public void renovarSuscripcion() {
		if (estaActivo == true) {
			System.out.println("La suscripción esta activa, no es necesario renovarla.");
		} else {
			estaActivo = true;
			System.out.println("¡Suscripción renovada!");
		}
	}
	
	public void verificarAcceso() {
		if (estaActivo == true) {
			System.out.println("Puedes pasar, tu suscripción está activa.");
		} else {
			System.out.println("No puedes pasar, tu suscripción no esta activa.");
		}
	}
	
	public void mostrarInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Estado: ".concat(estaActivo ? "Activo" : "No Activo"));
		System.out.println("Código: " + codigo);
	}
	
	// Getters y Setters
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public boolean isEstaActivo() {
		return estaActivo;
	}


	public void setEstaActivo(boolean estaActivo) {
		this.estaActivo = estaActivo;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
}