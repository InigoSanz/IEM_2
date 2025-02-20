package ejercicio_encapsulamiento4;

/**
 * @author Inigo
 * @version 1.0
 * 
 * Clase para las cuentas bancarias de tipo ahorro.
 */
public class CuentaDeAhorro extends CuentaBancaria {
	
	// Constante de interés para la cuenta de ahorro
	private static final double INTERES = 0.035;
	
	// Constructor
	public CuentaDeAhorro() {
		super();
	}
	
	@Override
	public void depositar(double cantidad) {
		if (cantidad > 0) {
			actualizarSaldo(cantidad);
			System.out.println("Se ha depositado la cantidad de " + cantidad + "€ en la cuenta de ahorro.");
		} else {
			System.err.println("No puedes depositar saldo negativo.");
		}
	}

	@Override
	public void retirar(double cantidad) {
		if (cantidad > 0 && cantidad <= getSaldo()) {
			actualizarSaldo(-cantidad);
			System.out.println("Se ha retirado la cantidad de " + cantidad + "€ de la cuenta de ahorro.");
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
	
	public void capitalizarInteres() {
		double ganancia = getSaldo() * INTERES;
		actualizarSaldo(ganancia);
		System.out.println("Se ha añadido a la cuenta la cantidad de " + ganancia + "€ proveniente de los intereses.");
	}
}