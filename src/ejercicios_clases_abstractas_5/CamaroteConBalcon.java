package ejercicios_clases_abstractas_5;

public class CamaroteConBalcon extends Camarote {
	
	private String tamanoBalcon;
	private int capacidadMax;
	
	public CamaroteConBalcon(double precioBase, int capacidad, String tamanoBalcon) {
		super(precioBase, capacidad);
		this.tamanoBalcon = tamanoBalcon;
		this.capacidadMax = 3;
	}

	@Override
	public double calcularCoste(double precioBase, int capacidad) {
		double precio1 = 0;
		double precio2 = 0;
		String tamanoBalconTransform = tamanoBalcon.toLowerCase();
		
		if (capacidad <= capacidadMax) {
			for (int i = 0; i <= capacidad; i++) {
				precio2 = precio2 + (precioBase * 1.05);
			}	
		} else {
			System.err.println("Capacidad máxima superada, vuelva a empezar.");
		}
		
		if (tamanoBalconTransform.equals("pequeño")) {
			precio1 = precioBase * 1.05;
		} else if (tamanoBalconTransform.equals("mediano")) {
			precio1 = precioBase * 1.10;
		} else if (tamanoBalconTransform.equals("grande")) {
			precio1 = precioBase * 1.15;
		} 
		
		return precio1 + precio2;
	}
	
	@Override
	public String toString() {
		return "Este es el Camarote con Balcon\n"
				+ "+ Tiene una capacidad máxima de 3 personas\n"
				+ "+ Los precios del tamaño de los balcones son los siguientes: \n" 
				+ "- Paqueño +5%\n"
				+ "- Mediano +10%\n"
				+ "- Grande +15%\n";
	}

	public String getTamanoBalcon() {
		return tamanoBalcon;
	}

	public void setTamanoBalcon(String tamanoBalcon) {
		this.tamanoBalcon = tamanoBalcon;
	}

	public int getCapacidadMax() {
		return capacidadMax;
	}

	public void setCapacidadMax(int capacidadMax) {
		this.capacidadMax = capacidadMax;
	}
}