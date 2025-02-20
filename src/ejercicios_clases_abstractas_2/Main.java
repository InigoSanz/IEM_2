package ejercicios_clases_abstractas_2;

public class Main {

	public static void main(String[] args) {
		
		MontanaRusa montanaRusa = new MontanaRusa("Abismo", 30.0, 3);
		Carrusel carrusel = new Carrusel("El caballito loco", 30.0, 10);
		
		Atraccion[] atracciones = {montanaRusa, carrusel};
		
		Taquilla taquilla = new Taquilla("Port Aventura", atracciones);
		
		System.out.println("Bienvenido al parque " + taquilla.getNombreParque() + ", el precio total de la entrada es " + 
		taquilla.calcularPrecioTotalEntradas() + "€");

	}
}