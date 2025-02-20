package ejercicio_sistema_bancario;

/**
 * Clase Main.
 */
public class Main {

	public static void main(String[] args) {
		
		// Creamos los clientes
		Cliente cliente1 = new Cliente();
		cliente1.setNombre("Iñigo");
		Cliente cliente2 = new Cliente();
		cliente2.setNombre("Juan");
		
		// Creamos las cuentas bancarias
		CuentaBancaria cuenta1 = new CuentaBancaria();
		cuenta1.setId("CB001");
		cuenta1.setTitular("Iñigo");
		cuenta1.setSaldo(0);
		CuentaBancaria cuenta2 = new CuentaBancaria();
		cuenta2.setId("CB002");
		cuenta2.setTitular("Juan");
		cuenta2.setSaldo(0);
		CuentaBancaria cuenta3 = new CuentaBancaria();
		cuenta3.setId("CB003");
		cuenta3.setTitular("Juan");
		cuenta3.setSaldo(0);
		
		// Asociamos las cuentas con el titular
		cliente1.agregar(cuenta1);
		cliente2.agregar(cuenta2);
		cliente2.agregar(cuenta3);
		
		// Mostramos el estado inicial de las cuentas
		System.out.println(cliente1.toString());
		System.out.println(cliente2.toString());
		
		// Realizamos operaciones
		cuenta1.depositar(1000);
		cuenta2.depositar(500);
		cuenta3.depositar(1500);
		
		cuenta1.transferir(cuenta3, 200);
		
		// Vemos el estado de las cuentas después de las operaciones
		System.out.println(cliente1.toString());
		System.out.println(cliente2.toString());
	}
}