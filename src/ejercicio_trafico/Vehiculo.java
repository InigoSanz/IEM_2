package ejercicio_trafico;

public class Vehiculo {
	
	private String marca;
	private String modelo;
	private String color;
	private double velocidad;
	// Haciendo el metodo de acelerar me he dado cuenta de que si no ponemos la velocidad maxima del vechiculo
	// Este podría acelerar hasta el infinito
	private double velocidadMaxima;
	
	// Métodos
	public void acelerar(double aceleracion) {
		velocidad = velocidad + aceleracion;
		if (velocidad <= velocidadMaxima) {
			System.out.println("El vehiculo ha acelerado hasta los " + velocidad + " km/h");
		} else {
			velocidad = velocidadMaxima;
			System.out.println("El vechiculo ya ha alcanzado su velocidad máxima de " + velocidad + " km/h");
		}	
	}
	
	public void frenar(double deceleracion) {
		velocidad = velocidad - deceleracion;
		if (velocidad >= 0) {
			System.out.println("El vehiculo ha reducido su velocidad hasta los " + velocidad + " km/h");
		} else {
			velocidad = 0;
			System.out.println("El vehiculo se ha parado.");
		}
	}
	
	public void mostrarInformacion() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Color: " + color);
		System.out.println("Velocidad máxima: " + velocidadMaxima);
	}
	
	// Getters y Setters
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public double getVelocidad() {
		return velocidad;
	}
	
	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public double getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(double velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	
	
}