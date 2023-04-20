package teoria_defecto;

public class Persona {
	
	private String nombre = "Julian";
	private String apellido;
	private int edad;
	
	private int id;
	private static int sig = 1;
	
	public Persona() {
		this.id = sig;
		sig++;
	}
	
	public Persona(String nom, String apellido, int edad) {
		this.id = sig;
		sig++;
		
		this.nombre = nom;
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


	public void imprimir() {
		System.out.printf("%s, %s :: %d - id:%d \n",apellido,nombre,edad,id);
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}
	
	
	
	

}
