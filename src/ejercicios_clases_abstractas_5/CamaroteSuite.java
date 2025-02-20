package ejercicios_clases_abstractas_5;

public class CamaroteSuite extends Camarote {
	
	private boolean servicioMayordomo = false;
	private boolean accesoSpa = false;
	private int capacidadMax;
	
	public CamaroteSuite(double precioBase, int capacidad, boolean servicioMayordomo, boolean accesoSpa, int capacidadMax) {
		super(precioBase, capacidad);
		this.servicioMayordomo = servicioMayordomo;
		this.accesoSpa = accesoSpa;
		this.capacidadMax = 6;
	}

	@Override
	public double calcularCoste(double precioBase, int capacidad) {
		double precio1 = 0;
		double precio2 = 0;
		
		if (capacidad <= capacidadMax) {
			for (int i = 0; i <= capacidad; i++) {
				precio2 = precio2 + (precioBase * 1.05);
			}	
		} else {
			System.err.println("Capacidad máxima superada, vuelva a empezar.");
		}
		
		if (servicioMayordomo == true && accesoSpa == false) {
			precio1 = precioBase * 1.15;
		} else if (servicioMayordomo == false && accesoSpa == true) {
			precio1 = precioBase * 1.15;
		} else if (servicioMayordomo == true && accesoSpa == true) {
			precio1 = (precioBase * 1.15) + (precioBase * 1.15); // Esto esta mal
		} else {
			precio1 = precioBase;
		}
		
		return precio1 + precio2;
	}
	
	@Override
	public String toString() {
		return "Este es el Camarote Suite\n"
				+ "+ Tiene una capacidad máxima de 6 personas\n"
				+ "+ Los servicios que incluye con un sobrecoste del 15% sobre el precio base son: \n" 
				+ "- Servicio de Mayordomo\n"
				+ "- Acceso Spa\n";
	}

	public boolean isServicioMayordomo() {
		return servicioMayordomo;
	}

	public void setServicioMayordomo(boolean servicioMayordomo) {
		this.servicioMayordomo = servicioMayordomo;
	}

	public boolean isAccesoSpa() {
		return accesoSpa;
	}

	public void setAccesoSpa(boolean accesoSpa) {
		this.accesoSpa = accesoSpa;
	}

	public int getCapacidadMax() {
		return capacidadMax;
	}

	public void setCapacidadMax(int capacidadMax) {
		this.capacidadMax = capacidadMax;
	}
}