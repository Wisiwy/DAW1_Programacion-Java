package colleciones;

import java.util.Objects;

public class Persona implements Comparable<Persona> {
//Comparable y definimos que tipo de datos
	private int edad;
	private String nombre;
	private String apellido;

	public Persona(int edad, String nombre, String apellido) {
		this.edad = edad;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
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

	public String toString() {
		return String.format("%3d -%12s, %12s",this.edad,this.nombre ,this.apellido );
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellido, edad, nombre);
	}
	
//	Le decimos que el método hash se genere como le decimos nosotros.
	
//	Hashcode es un id del objeto. Se identifica por tener los mismos valores en las variables. 
//	Un unico obj si tienen el mismo nombre, edad, apellido el hash se genera por el contenido del obj no por posición.
//	Al crearse con el mismo constructor ocupan el mismo espacio en memoria. Con este metodo "hashCode" el ojeto si 
//	tiene los mismos valores matiene el hashcode
	
//	La interfaz set no permite duplicidad.
//	Los set no añaden elementos con el mismo hascode de uno que se encuentre ya en la lista. 
//	Las list si lo hacen le da igual que esten repetidos

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(apellido, other.apellido) && edad == other.edad && Objects.equals(nombre, other.nombre);
	}

@Override
public int compareTo(Persona p) {
	if (this.getEdad() != p.getEdad())
		return this.getEdad() - p.getEdad();
	else if(this.getApellido().compareTo(p.getApellido())!=0)
		return this.getApellido().compareTo(p.getApellido());
	else
		return this.getNombre().compareTo(p.getNombre());
}
	
	
}
