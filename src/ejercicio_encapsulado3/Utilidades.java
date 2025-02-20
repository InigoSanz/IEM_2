package ejercicio_encapsulado3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Utilidades {
	
	// Métodos
	public static int generarId() {
		Random random = new Random();
		int id = random.nextInt(1000);
		return id;
	}
	
	public static String transformarFecha(Date fecha) {
		SimpleDateFormat transformar = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		String transformada = transformar.format(fecha);
		return transformada;
	}
}