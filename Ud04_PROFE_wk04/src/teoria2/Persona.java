package teoria2;

public class Persona {
	
	private String nombre;
	private String apellido;
	private int edad;
	
	public Persona() {
	}

	public Persona(String nomb, String apellido, int edad) {
		
		this.nombre = nomb;
		this.apellido = apellido;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	@Override
	public String toString() {
		return apellido+", "+nombre+"  :: "+edad;
	}

	
	
	
	
	

}
