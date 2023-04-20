package Examen2;

public class Datos {
	
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String usuario;
	
	public Datos(String nombre, String apellido1, String apellido2) {

		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		
		this.usuario = nombre.substring(0,3)+"."+apellido1.substring(0,3);
	}

	@Override
	public String toString() {
		return String.format("%s\n%s %s %s\n", usuario,nombre,apellido1,apellido2);
	}

	public String getUsuario() {
		return usuario;
	}

	
	
	

}
