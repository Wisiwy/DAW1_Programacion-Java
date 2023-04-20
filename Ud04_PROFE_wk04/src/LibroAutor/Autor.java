package LibroAutor;

public class Autor {
	
	private String nombre;
	private String email;
	private Character genero;
	
	public Autor(String nombre, String email, String genero) {
		this.nombre = nombre;
		this.email = email;
		this.genero = genero.toLowerCase().charAt(0);
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
		return "Autor [nombre=" + nombre + ", email=" + email + ", genero=" + genero + "]";
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
		
	}

	public void setGenero(String gen) {

		this.genero = gen.charAt(0);
		
	}
	

	
	
	

}
