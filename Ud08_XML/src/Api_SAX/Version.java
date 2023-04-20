package Api_SAX;

public class Version {
	private double numero;
	private String nombre;
	private Integer api;
	
	public Version() {
	}
	
	public double getNumero() {
		return numero;
	}
	public void setNumero(double numero) {
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getApi() {
		return api;
	}
	public void setApi(int i) {
		this.api = i;
	}

	@Override
	public String toString() {
		return "Version [numero=" + numero + ", nombre=" + nombre + ", api=" + api + "]";
	}

	
	
	
	
	
}
