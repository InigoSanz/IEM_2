package ejercicio_sobrecarga1;

public class Main {

	public static void main(String[] args) {
	
		OperacionesAvanzadas operacionesAvanzadas = new OperacionesAvanzadas();
		
		System.out.println("Suma de dos enteros: " + operacionesAvanzadas.sumar(5, 7));
		System.out.println("\nSuma de tres enteros: " + operacionesAvanzadas.sumar(5, 7, 2));
		
		int[] arrayEnteros = {1, 4, 6, 9};
		System.out.println("\nSuma de una lista de enteros: " + operacionesAvanzadas.sumar(arrayEnteros));
		
		System.out.println("\nSuma de dos números decimales: " + operacionesAvanzadas.sumar(2.5, 5.7));
		
		double[] arrayDecimales = {1.2, 1.7, 4.3, 10.8, 5.4};
		System.out.println("\nSuma de una lista de números decimales: " + operacionesAvanzadas.sumar(arrayDecimales));
		
		System.out.println("\nOperacion personalizada: " + operacionesAvanzadas.operacionPersonalizada(1, 3, 5, "restar"));
	}
}