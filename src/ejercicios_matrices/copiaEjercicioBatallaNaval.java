package ejercicios_matrices;

import java.util.Scanner;

/**
 * @author Inigo y Clara
 * @version 1.7
 * 
 * Ejercicio Batalla Naval.
 */
public class copiaEjercicioBatallaNaval {
	
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
	        		oceanoEquipo1[i][j] = AGUA;
	        		oceanoEquipo2[i][j] = AGUA;
	        		oceanoEquipo3[i][j] = AGUA;
	        	}
	        }
	        
	        // Colocar barcos en los océanos
	        System.out.println("Equipo 1, coloque sus barcos en el océano:");
	        System.out.println("Equipo 2, coloque sus barcos en el océano:");
	        System.out.println("Equipo 3, coloque sus barcos en el océano:");
	        
	        oceanoEquipo1[2][4] = BARCO;
	        oceanoEquipo1[5][5] = BARCO;
	        oceanoEquipo1[1][5] = BARCO;

	        oceanoEquipo2[2][4] = BARCO;
	        oceanoEquipo2[5][5] = BARCO;
	        oceanoEquipo2[1][5] = BARCO;

	        oceanoEquipo3[2][4] = BARCO;
	        oceanoEquipo3[5][5] = BARCO;
	        oceanoEquipo3[1][5] = BARCO;
	        
	        
	        // Mostrar los océanos iniciales
	        System.out.println("Océano del Equipo 1:");
	        ocultarBarcos(oceanoEquipo1);
	        System.out.println("Océano del Equipo 2:");
	        ocultarBarcos(oceanoEquipo2);
	        System.out.println("Océano del Equipo 3:");
	        ocultarBarcos(oceanoEquipo3);
			
	        // Comienza la batalla naval
	        // Variable que almacena el numero de barcos con vida de cada equipo
	        
	        
	        while (totalBarcosEquipo1 > 0 || totalBarcosEquipo2 > 0 || totalBarcosEquipo3 > 0) {
	        	if (totalBarcosEquipo1 > 0) {
	        	// Turno del Equipo 1
	        	System.out.println("Equipo 1, es tu turno:");
	        	System.out.print("Ingrese la fila para el ataque: ");
	            int fila = scanner.nextInt();
	            System.out.print("Ingrese la columna para el ataque: ");
	            int columna = scanner.nextInt();
	           
	            /*
	             * Primero pedimos al usuario que introduzca la fila y columna donde queremos realizar el ataque.
	             * Luego validamos que esa posición esta dentro del tablero
	             * Mientras no este dentro del tablero seguimos pidiendo la fila y columna
	             */
	        	while (!(fila < tamanoOceano && fila >= 0) || !(columna < tamanoOceano && columna >= 0)) {
	        		System.err.println("¡Posición inválida!");
	        		System.out.print("Vuelve a ingresar la fila para el ataque: ");
		            fila = scanner.nextInt();
		            System.out.print("Vuelve a ingresar la columna para el ataque: ");
		            columna = scanner.nextInt();
	        	}
	            
	            if (oceanoEquipo2[fila][columna] == BARCO) {
	            	System.out.println("¡Impacto! El Equipo 1 ha hundido un barco del Equipo 2.");
	            	oceanoEquipo2[fila][columna] = HUNDIR;
	            	totalBarcosEquipo2 = totalBarcosEquipo2 - 1;
	            	ocultarBarcos(oceanoEquipo2);
	            	System.out.printf("El total de barcos del equipo 2 es: %d\n", totalBarcosEquipo2);
	            } else {
	            	System.out.println("Agua. El Equipo 1 ha fallado el ataque.");
	            	oceanoEquipo2[fila][columna] = FALLO;
	            	ocultarBarcos(oceanoEquipo2);
	            } 
	        	}
	            

	        	if (totalBarcosEquipo2 > 0) {
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
	        	}

	        	if (totalBarcosEquipo3 > 0) {
	         // Turno del Equipo 3
	            System.out.println("Equipo 3, es tu turno:");
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
	            
	            if (oceanoEquipo1[fila][columna] == BARCO) {
	            	System.out.println("¡Impacto! El Equipo 3 ha hundido un barco del Equipo 1.");
	            	oceanoEquipo1[fila][columna] = HUNDIR;
	            	totalBarcosEquipo1 = totalBarcosEquipo1 - 1;
	            	ocultarBarcos(oceanoEquipo1);
	            	System.out.printf("El total de barcos del equipo 1 es: %d\n", totalBarcosEquipo1);
	            } else {
	            	System.out.println("Agua. El Equipo 3 ha fallado el ataque.");
	            	oceanoEquipo1[fila][columna] = FALLO;
	            	ocultarBarcos(oceanoEquipo1);
	            }
	        	}
	        	hayGanador();
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