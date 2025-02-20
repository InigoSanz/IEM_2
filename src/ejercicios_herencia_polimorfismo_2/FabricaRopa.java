package ejercicios_herencia_polimorfismo_2;

public class FabricaRopa {
	
	private Prenda[] prendasProducidas;
	
	public FabricaRopa() {
		this.prendasProducidas = new Prenda[5];
	}
	
	public void agregarPrenda(Prenda prenda) {
		for (int i = 0; i < prendasProducidas.length; i++) {
			if (prendasProducidas[i] == null) {
				prendasProducidas[i] = prenda;
				break;
			}
		}
	}
	
	public void fabricar() {
		for ( int i = 0; i < prendasProducidas.length; i++) {
			Prenda prenda = prendasProducidas[i];
			if (prenda != null) {
				if (prenda instanceof Pantalon) {
					Pantalon pantalon = (Pantalon) prenda;
					pantalon.coserBolsillos();
				} else {
					if (prenda instanceof Camisa) {
						((Camisa) prenda).colocarBotones();
					}
				}
			}
		}
	}
	
	public void empaquetar() {
		for ( int i = 0; i < prendasProducidas.length; i++) {
			if (prendasProducidas[i] != null) {
				prendasProducidas[i].empaquetar();
			}
		}
	}
	
	public void mostrarInformacionInventario() {
		System.out.println("\n-- Inventario de la fábrica --");
		for ( int i = 0; i < prendasProducidas.length; i++) {
			if (prendasProducidas[i] != null) {
				System.out.println(prendasProducidas[i].mostrarInformacion());
			}
		}
	}
}