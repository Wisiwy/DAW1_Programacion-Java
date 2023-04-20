package ejer_ClasesYObj;

public class Autor {
	
	private String nombre;
	private String email;
	private Character genero;
	
	
	public Autor () {
		
	}
	public Autor(String nombre, String email, String genero) {
		this.nombre = nombre;
		this.email = email;
		this.genero = genero.charAt(0);
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getNombre() {
		return nombre;
	}



	public Character getGenero() {
		return genero;
	}



	@Override
	public String toString() {
		return String.format("Autor: %s || Mail: %s. || Genero: %c.",nombre, email, genero);
	}
	public void setNombre(String leerString) {
		this.nombre = leerString;
	}
	public void setGenero(String leerString) {
		this.genero = leerString.charAt(0);
		
	}
	
	
	
	
	

}
