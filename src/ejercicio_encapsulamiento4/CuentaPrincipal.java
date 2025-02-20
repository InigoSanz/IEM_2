package ejercicio_encapsulamiento4;

/**
 * @author Inigo
 * @version 1.0
 * 
 * Clase para las cuentas bancarias de tipo principal.
 */
public class CuentaPrincipal extends CuentaBancaria {
	
	// Constructor
	public CuentaPrincipal() {
		super();
	}
	
	@Override
	public void depositar(double cantidad) {
		if (cantidad > 0) {
			actualizarSaldo(cantidad);
			System.out.println("Se ha depositado la cantidad de " + cantidad + "€ en la cuenta principal.");
		} else {
			System.err.println("No puedes depositar saldo negativo.");
		}
	}

	@Override
	public void retirar(double cantidad) {
		if (cantidad > 0 && cantidad <= getSaldo()) {
			actualizarSaldo(-cantidad);
			System.out.println("Se ha retirado la cantidad de " + cantidad + "€ de la cuenta principal.");
		} else {
			System.err.println("Fondos insufientes o cantidad erronea.");
		}
	}

	@Override
	public void transferir(double cantidad, CuentaBancaria destino) {
		if (cantidad > 0 && cantidad <= getSaldo())	{
			actualizarSaldo(-cantidad);
			destino.depositar(cantidad);
			System.out.println("Se ha realizado una tranferencia de " + cantidad + "€ a la cuenta " + destino.getNumeroCuenta());
		} else {
			System.err.println("Fondos insufientes o cantidad erronea.");
		}
	}
}