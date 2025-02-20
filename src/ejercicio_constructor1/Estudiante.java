package ejercicio_constructor1;

public class Estudiante {
	
	// Atributos
	private String nombre;
	private int edad;
	private String curso;
	
	// Constructores
	public Estudiante(String nombre, int edad, String curso) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.curso = curso;
	}
	
	public Estudiante() {
		super();
		this.nombre = "Nombre";
		this.edad = 18;
		this.curso = "Curso";
	}
	
	// Métodos
	public void mostrarInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Curso: " + curso);
		System.out.println();
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
	
	public String getCurso() {
		return curso;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
}