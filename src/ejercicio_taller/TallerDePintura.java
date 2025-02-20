package ejercicio_taller;

import java.util.ArrayList;

public class TallerDePintura {
	
	private ArrayList<ObraDeArte> inventario;
	private ArrayList<Cliente> clientes;
	
	// Constructores
	// Como puede haber o no clientes y lo mismo con el inventario, usaremos el constructor por defecto
	public TallerDePintura() {
        this.inventario = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

	// Métodos
	public void registrarClientes(Cliente cliente) {
		clientes.add(cliente);
		System.out.println("Cliente registrado.");
	}
	
	public void registrarObra(ObraDeArte obra) {
        inventario.add(obra);
        System.out.println("Obra registrada.");
    }
	
	public void venderObras(String idObra, String idCliente) {
		ObraDeArte obra = buscarObra(idObra);
		Cliente cliente = buscarCliente(idCliente);
		
		// Validamos la venta
		if (obra != null && cliente != null && !obra.isEstaVendida()) {
			obra.isEstaVendida();
			System.out.println("Venta realizada.");
		} else {
			System.out.println("No se ha podido efectuar la venta.");
		}
	}
	
	public Cliente buscarCliente(String id) {
		for (Cliente cliente : clientes) {
			if (cliente.getId().equals(id)) {
				return cliente;
			}
		}
		return null;
	}
	
	public ObraDeArte buscarObra(String id) {
		for (ObraDeArte obra : inventario) {
			if (obra.getId().equals(id)) {
				return obra;
			}
		}
		return null;
	}
	
	public void mostrarInventario() {
		System.out.println("Inventario: ");
		for (ObraDeArte obra : inventario) {
			obra.mostrarInformacion();
			System.out.println();
		}
	}
	
	public void mostrarClientes() {
		System.out.println("Clientes: ");
		for (Cliente cliente : clientes) {
			cliente.mostrarInformacion();
			System.out.println();
		}
	}
	
	// Getters y Setters
	public ArrayList<ObraDeArte> getInventario() {
		return inventario;
	}

	public void setInventario(ArrayList<ObraDeArte> inventario) {
		this.inventario = inventario;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
}