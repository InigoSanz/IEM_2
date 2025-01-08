package ejercicio_bar;

public class MainBar {

	public static void main(String[] args) {
		
		// Clientes
		Cliente cliente1 = new Cliente();
		cliente1.setNombre("Iñigo");
		cliente1.setEdad(27);
	
		Cliente cliente2 = new Cliente();
		cliente2.setNombre("Raúl");
		cliente2.setEdad(28);
		
		// Pedidos
		Pedido pedido1 = new Pedido(cliente1);
		Pedido pedido2 = new Pedido(cliente2);
		
		// Bebidas
		Bebida bebida1 = new Bebida();
		bebida1.setNombre("Coca-Cola");
		bebida1.setPrecio(2.0);
		
		Bebida bebida2 = new Bebida();
		bebida2.setNombre("Estrella Galicia");
		bebida2.setPrecio(2.5);
		
		Bebida bebida3 = new Bebida();
		bebida3.setNombre("Café");
		bebida3.setPrecio(1.3);
		
		// Agregamos las bebidas de cada pedido
		pedido1.agregarBebidas(bebida1);
		pedido1.agregarBebidas(bebida2);
		pedido1.agregarBebidas(bebida3);
		
		pedido2.agregarBebidas(bebida3);
		pedido2.agregarBebidas(bebida3);
		pedido2.agregarBebidas(bebida1);
		
		// Mostramos los pedidos
		pedido1.mostrarInformacion();
		pedido2.mostrarInformacion();
	}
}