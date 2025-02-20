package ejercicios_genericidad_5;

public class Main {

	public static void main(String[] args) {
		
		Inventario<Vinilo> inventario = new Inventario<>();
		
		ViniloGrande vGrande1 = new ViniloGrande("Born Sleeping", "Ni idea", false, true, 25.5);
		ViniloGrande vGrande2 = new ViniloGrande("In the End", "Linkin Park", true, true, 17.5);
		ViniloPequenio vPequenio1 = new ViniloPequenio("Numb", "Linkin Park", true, true, "NuMetal");
		ViniloPequenio vPequenio2 = new ViniloPequenio("Awake", "Skillet", true, false, "NuMetal");
		ViniloMediano vMediano1 = new ViniloMediano("So Low", "S.A.M.", false, true, true);
		ViniloMediano vMediano2 = new ViniloMediano("Ocean Bed", "Siamese", false, true, false);
		
		inventario.agregarCosa(vGrande1);
		inventario.agregarCosa(vGrande2);
		inventario.agregarCosa(vPequenio1);
		inventario.agregarCosa(vPequenio2);
		inventario.agregarCosa(vMediano1);
		inventario.agregarCosa(vMediano2);
		
		inventario.mostrarInventario();
		
		System.out.println(inventario.buscarPorAtributos("Linkin Park").toString()); 
		
		inventario.eliminarCosa(vMediano1);
		
		System.out.println("Inventario después de eliminar el vinilo mediano 2: ");
		inventario.mostrarInventario();
	}
}