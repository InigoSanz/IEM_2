package ejercicio_taller;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		TallerDePintura taller = new TallerDePintura();
		int opcion;
		
		do {
			System.out.println("!BIENVENIDO AL TALLER¡");
			System.out.println("1 -> Registrar una obra");
			System.out.println("2 -> Registrar un cliente");
			System.out.println("3 -> Vender una obra");
			System.out.println("4 -> Mostrar el inventario de obras");
			System.out.println("5 -> Mostrar lista de clientes");
			System.out.println("0 -> Salir");
			System.out.printf("Selecciona una opción:");
			// Aquí me di cuenta de que si queria capturar la 's' de salir, no puedia utilizar el int y se me complicaba mucho
			// Se cambiar por pulsar el 0
			opcion = scanner.nextInt();
			System.out.println();
			/*
			 * Capturar los saltos de lineas cuando trabajamos con scanner.
			 */
			scanner.nextLine();
			
			switch (opcion) {
				case 1:
					System.out.printf("Identificador: ");
					String idObra = scanner.nextLine();
					System.out.printf("Título: ");
					String titulo = scanner.nextLine();
					System.out.printf("Artista: ");
					String artista = scanner.nextLine();
					boolean estaVendida = false;
					taller.registrarObra(new ObraDeArte(idObra, titulo, artista, estaVendida));
					break;
				case 2: 
					System.out.printf("Identificador: ");
                    String idCliente = scanner.nextLine();
                    System.out.printf("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.printf("Capacidad: ");
                    int capacidad = scanner.nextInt();
                    taller.registrarClientes(new Cliente(idCliente, nombre, capacidad));
                    break;
				case 3:
					System.out.print("ID de la obra: ");
                    String codigoObraVender = scanner.nextLine();
                    System.out.print("ID del cliente: ");
                    String idClienteVender = scanner.nextLine();
                    taller.venderObras(codigoObraVender, idClienteVender);
					break;
				case 4:
					taller.mostrarInventario();
					break;
				case 5:
					taller.mostrarClientes();
					break;
				case 0:
					System.out.println("Saliendo...");
			}
		} while (opcion != 0);
		
		scanner.close();
	}
}