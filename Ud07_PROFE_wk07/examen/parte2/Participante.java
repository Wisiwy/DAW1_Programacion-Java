package parte2;

public class Participante {
	
	private String nombre;
	private String pais;
	private String prueba;
	private double tiempo;
	
	
	
	public Participante(String nombre, String pais, String prueba, double tiempo) {
		super();
		this.nombre = nombre;
		this.pais = pais;
		this.prueba = prueba;
		this.tiempo = tiempo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getPrueba() {
		return prueba;
	}
	public void setPrueba(String prueba) {
		this.prueba = prueba;
	}
	public double getTiempo() {
		return tiempo;
	}
	public void setTiempo(double tiempo) {
		this.tiempo = tiempo;
	}
	@Override
	public String toString() {
		return String.format("\t %-25s %-14s %.2f", nombre,pais,tiempo);
	}
	
	

}
