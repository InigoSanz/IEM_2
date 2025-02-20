package ejercicio_encapsulamiento4;

/**
 * @author Inigo
 * @version 1.0
 * 
 * Clase Main del programa.
 */
public class Main {
    public static void main(String[] args) {
        
        // Creamos el banco
        Banco banco = new Banco();
        
        // Creamos los clientes
        Cliente cliente1 = new Cliente("Iñigo", "73109122B", 27, "principal");
        Cliente cliente2 = new Cliente("Juan", "88665533Z", 28, "ahorro");
        
        // Agregamos los clientes al banco
        banco.agregarCliente(cliente1);
        banco.agregarCliente(cliente2);
        
        // Ingresamos dinero en las cuentas
        cliente1.getCuentas().get(0).depositar(1000); // Cuenta Principal de Iñigo
        cliente2.getCuentas().get(0).depositar(500);  // Cuenta de Ahorro de Juan
        
        // Obtener cuentas de los clientes
        CuentaBancaria cuentaIñigo = cliente1.getCuentas().get(0); // Cuenta principal de Iñigo
        CuentaBancaria cuentaJuan = cliente2.getCuentas().get(0);  // Cuenta de ahorros de Juan
        
        // Realizar una transferencia de 200€ desde la cuenta de Iñigo a la de Juan
        cuentaIñigo.transferir(200, cuentaJuan);
        
        // Mostrar el saldo actualizado de ambas cuentas
        System.out.println("Saldo de Iñigo después de la transferencia: " + cuentaIñigo.getSaldo() + "€");
        System.out.println("Saldo de Juan después de la transferencia: " + cuentaJuan.getSaldo() + "€");

        // Mostramos la información actualizada del banco
        System.out.println(banco);
    }
}