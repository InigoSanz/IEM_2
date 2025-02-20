package ejercicio_encapsulamiento3;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Inigo
 * @version 1.0
 * 
 * Clase con funciones que proporcionan utilidades al programa.
 */
public class Utilidades {
	
	public static String transformarFecha(Date fecha) {
		SimpleDateFormat transformar = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		String transformada = transformar.format(fecha);
		return transformada;
	}
}