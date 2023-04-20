package wk_07;

import java.util.Objects;

public class Persona implements Comparable<Persona>{
	
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

	@Override
	public String toString() {
		//return "Persona [edad=" + edad + ", nombre=" + nombre + ", apellido=" + apellido + "]";
		return String.format(" %3d - %12s, %12s", edad,apellido,nombre);
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellido, edad, nombre);
	}

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
		
		if(this.getEdad() != p.getEdad()) //si la edad es diferente
			return this.getEdad() - p.getEdad(); //comparo por edad
		else if(this.getApellido().compareTo(p.getApellido())!=0) //si el apellido es diferente
			return this.getApellido().compareTo(p.getApellido()); //comparo por apellido
		else
			return this.getNombre().compareTo(p.getNombre()); //comparo por nombre

	}

	

}
