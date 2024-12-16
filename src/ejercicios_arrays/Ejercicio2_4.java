package ejercicios_arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Desarrolla un programa en Java para gestionar el inventario de productos en un almacén.
 * Define constantes que representen la cantidad total de productos y umbrales críticos (5) y mínimos de stock (10).
 * Utiliza un array para almacenar las cantidades actuales de cada producto en stock.
 * Mediante un bucle for, evalúa y clasifica la situación de cada producto según su cantidad en stock, empleando condicionales anidados de tipo if y switch.
 * Categoriza los productos como "Stock suficiente", "Stock bajo" o con "Stock crítico", 
 * proporcionando mensajes específicos para productos que requieran atención inmediata.
 * - En caso de “Stock crítico” mostrar mensajes en caso de que haya stock = 0 (rotura de stock),
 * - stock = 1 (priorizar reabastecimiento),
 * - stock = 2, 3, 4 (Reabastecer pronto).
 * En cualquier otro caso evaluar la situación.
 */
public class Ejercicio2_4 {

	public static void main(String[] args) {
		
		final int CANTIDAD_TOTAL = 15;
		final int UMBRAL_CRITICO = 5;
		final int STOCK_MINIMO = 10;
		
		ArrayList<Integer> stock = new ArrayList<>(CANTIDAD_TOTAL);
		stock.addAll(Arrays.asList(11, 17, 45, 0, 50, 48, 20, 36, 46, 1, 2, 9, 7, 15, 43));
		
		System.out.println("Stock de cada producto: " + stock);
		
		int contador = 0;
		
		for (int stockProducto : stock) {
			if (stockProducto <= STOCK_MINIMO && stockProducto > UMBRAL_CRITICO) {
				System.out.println("El producto " + contador + " tiene un stock bajo (" + stockProducto + ") estate atento.");
			}
			
			if (stockProducto <= UMBRAL_CRITICO && stockProducto > 0) {
				if (stockProducto == 2 || stockProducto == 3 || stockProducto == 4) {
					System.out.println("El producto " + contador + " tiene un stock critico (" + stockProducto + ") prioriza reabastecerlo.");
				} else {
					System.out.println("El producto " + contador + " tiene un stock critico (" + stockProducto + ") ¡Echale un ojo!");
				}
				
			}
			
			if (stockProducto == 0) {
				System.out.println("El producto " + contador + " tiene una rotura de stock (" + stockProducto + ") ¡No hay nada!");
			}
			
			System.out.println("El producto " + contador + " tiene un stock correcto.");
			
			contador++;
		}
	}
}