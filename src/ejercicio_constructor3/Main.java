package ejercicio_constructor3;

public class Main {

	public static void main(String[] args) {
		Producto prod1 = new Producto("PROD1", "Sneakers", 85.0);
        Producto prod2 = new Producto("PROD2", "Camiseta", 15.0);
        Producto prod3 = new Producto("PROD3", "Pantalón", 50.0);

        // Crear cliente
        Cliente cliente1 = new Cliente("1", "Iñigo", "Calle Mayor 123");

        // Crear pedido
        Pedido pedido1 = new Pedido("PED01", cliente1);

        // Agregar productos al pedido
        pedido1.agregarProductos(prod1);
        pedido1.mostrarInformacion();

        pedido1.agregarProductos(prod2);
        pedido1.mostrarInformacion();

        pedido1.agregarProductos(prod3);
        pedido1.mostrarInformacion();

	}
}