package Clases_avanzadas;

public class Mascota {
	
	private String tipo;
	private String nombre;
	private int edad;
	private Persona propietario=null;
	
	public Mascota(String tipo, String nombre, int edad) {
		this.tipo = tipo;
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Persona getPropietario() {
		return propietario;
	}

	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}

	@Override
	public String toString() {
		if(propietario != null)
			return String.format(" Soy un %s, me llamo %s y tengo %d años. Propietario: %s ", tipo,nombre,edad,propietario);
		else
			return String.format(" Soy un %s, me llamo %s y tengo %d años. Sin propietario.", tipo,nombre,edad);
	}
	
	
	
	


	
	
	
	
	

}
