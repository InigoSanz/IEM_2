package ejercicios_metodos;

public class Estudiante {
	
	private String name;
	private int age;
	private double calification;
	
	// Métodos
	public void mostrarInformacion() {
		System.out.println("Nombre: " + name);
		System.out.println("edad: " + age);
		System.out.println("Calificación: " + calification);
	}
	
	// Getters y Setters
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public double getCalification() {
		return calification;
	}
	
	public void setCalification(double calification) {
		this.calification = calification;
	}	
}