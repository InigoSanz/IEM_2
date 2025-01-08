package ejercicios_matrices;

import java.util.Scanner;

/**
 * @author Inigo y Clara
 * @version Ya no sabemos ni la versión de las veces que lo hemos cambiado
 * 
 * Ejercicio Batalla Naval.
 */
public class BatallaNavalEstructura {
	
	private static int tamanoOceano = 6;
	private static int numBarcos = 3;
	private static int totalBarcosEquipo1 = numBarcos;
	private static int totalBarcosEquipo2 = numBarcos;
	private static int totalBarcosEquipo3 = numBarcos;
    private static final char AGUA = '~';
    private static final char BARCO = 'B';
    private static final char HUNDIR = 'X';
    private static final char FALLO = 'O';
    private static char[][] oceanoEquipo1 = new char[tamanoOceano][tamanoOceano];
    private static char[][] oceanoEquipo2 = new char[tamanoOceano][tamanoOceano];
    private static char[][] oceanoEquipo3 = new char[tamanoOceano][tamanoOceano];

	
	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        
	        // Inicializar los océanos con agua ('~')
	        for (int i = 0; i < tamanoOceano; i++) {
	        	for (int j = 0; j < tamanoOceano; j++) {
	        		oceanoEquipo2[i][j] = AGUA;
	        	}
	        }
	        
	        // Colocar barcos en los océanos
	        System.out.println("Equipo 1, coloque sus barcos en el océano:");
	        System.out.println("Equipo 2, coloque sus barcos en el océano:");
	        System.out.println("Equipo 3, coloque sus barcos en el océano:");

	        oceanoEquipo2[2][4] = BARCO;
	        oceanoEquipo2[5][5] = BARCO;
	        oceanoEquipo2[1][5] = BARCO;
	        
	        // Mostrar los océanos iniciales
	        System.out.println("Océano del Equipo 1:");
	        System.out.println("Océano del Equipo 2:");
	        ocultarBarcos(oceanoEquipo2);
	        System.out.println("Océano del Equipo 3:");
			
	        // Comienza la batalla naval
	        // Variable que almacena el numero de barcos con vida de cada equipo
	           
	        while (totalBarcosEquipo1 > 0 || totalBarcosEquipo2 > 0 || totalBarcosEquipo3 > 0) {

	            // Turno del Equipo 2
	            System.out.println("Equipo 2, es tu turno:");
	            System.out.print("Ingrese la fila para el ataque: ");
	            int fila = scanner.nextInt();
	            System.out.print("Ingrese la columna para el ataque: ");
	            int columna = scanner.nextInt();
	            
	            while (!(fila < tamanoOceano && fila >= 0) || !(columna < tamanoOceano && columna >= 0)) {
	        		System.err.println("¡Posición inválida!");
	        		System.out.print("Vuelve a ingresar la fila para el ataque: ");
		            fila = scanner.nextInt();
		            System.out.print("Vuelve a ingresar la columna para el ataque: ");
		            columna = scanner.nextInt();
	        	}
	            
	            if (oceanoEquipo3[fila][columna] == BARCO) {
	            	System.out.println("¡Impacto! El Equipo 2 ha hundido un barco del Equipo 3.");
	            	oceanoEquipo3[fila][columna] = HUNDIR;
	            	totalBarcosEquipo3 = totalBarcosEquipo3 - 1;
	            	ocultarBarcos(oceanoEquipo3);
	            	System.out.printf("El total de barcos del equipo 3 es: %d\n", totalBarcosEquipo3);
	            } else {
	            	System.out.println("Agua. El Equipo 2 ha fallado el ataque.");
	            	oceanoEquipo3[fila][columna] = FALLO;
	            	ocultarBarcos(oceanoEquipo3);
	            }
	        	
	        	//hayGanador();
	        	// Determinar el equipo ganador
	            if (totalBarcosEquipo1 > 0) {
	                System.out.println("¡El Equipo 1 ha ganado la batalla naval!");
	            } else if (totalBarcosEquipo2 > 0) {
	                System.out.println("¡El Equipo 2 ha ganado la batalla naval!");
	            } else if (totalBarcosEquipo3 > 0) {
	                System.out.println("¡El Equipo 3 ha ganado la batalla naval!");
	            } else {
	                System.out.println("La batalla naval ha terminado en empate.");
	            }
	        }      
	        scanner.close();
	}
	
	public static void imprimirTablero(char[][] matriz) {
		for (int i = 0; i < tamanoOceano; i++) {
        	for (int j = 0; j < tamanoOceano; j++) {
        		System.out.print(matriz[i][j] + " ");
        	}
        	System.out.println();
        }
	}
	
	public static void ocultarBarcos(char[][] matriz) {
		for (int i = 0; i < tamanoOceano; i++) {
        	for (int j = 0; j < tamanoOceano; j++) {
        		if (matriz[i][j] == BARCO) {
        			System.out.print(AGUA + " ");	
        		} else {
        			System.out.print(matriz[i][j] + " ");
        		}
        	}
        	System.out.println();
        }
	}
	
	public static void hayGanador() {
		if (totalBarcosEquipo1 == 0 && totalBarcosEquipo2 == 0) {
			System.out.println("Gana el equipo 3");
			System.exit(0);
		} else if (totalBarcosEquipo2 == 0 && totalBarcosEquipo3 == 0) {
			System.out.println("Gana el equipo 1");
			System.exit(0);
		} else if (totalBarcosEquipo1 == 0 && totalBarcosEquipo3 == 0) {
			System.out.println("Gana el equipo 2");
			System.exit(0);
		}
	}
}