package ejercicios_genericidad_1;

public class Main {

	public static void main(String[] args) {
		
		Envio<String, String> envioPaquetes = new Envio<>("Caja de paquetes", "Ciudad A");
		envioPaquetes.realizarEnvio();
		
		Envio<Double, String> envioMercancia = new Envio<>(1500.75, "Ciudad B");
		envioMercancia.realizarEnvio();
		
		Envio<String, Integer> envioCP = new Envio<>("Explosivos", 46025);
		envioCP.realizarEnvio();
	}
}