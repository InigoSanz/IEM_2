package ejercicios_instancias;

public class Main {

	public static void main(String[] args) {
		
		Tienda tiendaA = new Tienda("ElectroShop");
		Tienda tiendaB = new Tienda("GadgetWorld");
		
		Producto productoA = new Producto("SmartWatch Samsung", 125.5, 2);
		Producto productoB = new Producto("Laptop HP", 899.90, 1);
		
		tiendaA.agregarProducto(productoA);
		tiendaB.agregarProducto(productoB);
		
		tiendaA.mostrarInformacion();
		tiendaB.mostrarInformacion();
		
		tiendaA.aplicarDescuento();
		tiendaB.aplicarDescuento();
		
		Tienda.mostrarDescuentoGlobal();
		
		System.out.println("El total de productos es: " + Tienda.obtenerContadorTotalProductos());

	}

}
