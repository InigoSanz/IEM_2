package ejercicio_sobrecarga1;

public class OperacionesAvanzadas {
	
	// Método que realiza la suma de dos números enteros
	public int sumar(int n1, int n2) {
		return n1 + n2;
	}
	
	// Método que realiza la suma de tres números enteros
	public int sumar(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}
	
	// Método que realiza la suma de una lista de números enteros
	public int sumar(int[] numeros) {
		int suma = 0;
		for (int i = 0; i < numeros.length; i++) {
			suma = suma + numeros[i];
		}
		return suma;
	}
	
	// Método que realiza la suma de dos números decimales
	public double sumar(double n1, double n2) {
		return n1 + n2;
	}
	
	// Método que realiza la suma de una lista de números decimales
	public double sumar(double[] numeros) {
		double suma = 0;
		for (int i = 0; i < numeros.length; i++) {
			suma = suma + numeros[i];
		}
		return suma;
	}
	
	// Método que admite tres números enteros y un tipo de operación para operar con ellos
	public int operacionPersonalizada(int n1, int n2, int n3, String operacion) {
		if("multiplicar".equals(operacion)) {
			return n1 * n2 * n3;
		} 
		if("restar".equals(operacion)) {
			return n1 - n2 - n3;
		}
		System.out.println("\nOperación no válida.");
		return 0;
	}
}