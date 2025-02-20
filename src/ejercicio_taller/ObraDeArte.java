package ejercicio_taller;

public class ObraDeArte {
	
	private String id;
    private String titulo;
    private String artista;
    private boolean estaVendida;
	
    // Constructores
    public ObraDeArte(String id, String titulo, String artista, boolean estaVendida) {
        this.id = id;
        this.titulo = titulo;
        this.artista = artista;
        this.estaVendida = false;
    }
    
    // Métodos
    public void mostrarInformacion() {
        System.out.println("ID: " + id);
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Estado: " + estaVendida);
        System.out.println();
    }
    
    // Getters y Setters
    public String getId() {
		return id;
	}
    
	public void setId(String id) {
		this.id = id;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getArtista() {
		return artista;
	}
	
	public void setArtista(String artista) {
		this.artista = artista;
	}
	
	public boolean isEstaVendida() {
		return estaVendida;
	}
	
	public void setEstaVendida(boolean estaVendida) {
		this.estaVendida = estaVendida;
	}
}