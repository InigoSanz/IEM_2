package ejercicios_instancias;

public class Tienda {
	
	private static int contadorTotalProductos = 0;
	public static final double DESCUENTO_GLOBAL = 0.1;
	
	private String nombreTienda;
	private Producto[] productos;
	private int cantidadProductos;
	
	public Tienda(String nombreTienda) {
		this.nombreTienda = nombreTienda;
		this.productos = new Producto[10];
		this.cantidadProductos = 0;
	}
	
	public static int obtenerContadorTotalProductos() {
		return contadorTotalProductos;
	}
	
	public void agregarProducto(Producto producto) {
		if (cantidadProductos < productos.length) {
			productos[cantidadProductos] = producto;
			contadorTotalProductos = contadorTotalProductos + producto.getCantidad();
			cantidadProductos++;
			System.out.println("Producto " + producto.getDescripcion() + " agregado correctamente a la tienda " + nombreTienda);
		}
	}
	
	public void aplicarDescuento() {
		double costeSinDescuento = 0;
		for (int i = 0; i < cantidadProductos; i++) {
			costeSinDescuento = costeSinDescuento + productos[i].getPrecio();
		}
		double descuento = costeSinDescuento * DESCUENTO_GLOBAL;
		System.out.println("\nSe aplica un descuento global a todos los productos de la tienda de un " + (DESCUENTO_GLOBAL * 100) + "%");
		System.out.println("Descuento aplicado: " + descuento);
	}
	
	public void mostrarInformacion() {
		System.out.println("\nTienda: " + nombreTienda);
		for (int i = 0; i < cantidadProductos; i++) {
			System.out.println(productos[i].mostrarInformacion());
		}
		System.out.println("Cantidad total de productos en la tienda: " + cantidadProductos);
	}
	
	public static void mostrarDescuentoGlobal() {
		System.out.println("\nDescuento global actual: " + (DESCUENTO_GLOBAL * 100) + "%");
	}
}
