package Comparator;

import java.util.Objects;

public class Persona {

	private int edad;
	private String nombre;
	private String apellido;
	private double altura;

	public Persona( String nombre, String apellido, double altura,int edad) {
		super();
		this.edad = edad;
		this.nombre = nombre;
		this.apellido = apellido;
		this.altura = altura;
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

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return String.format("%-12s, %-8s de %d anys, mide %2.2f cm de altura.", nombre, apellido, edad, altura);
	}

	@Override
	public int hashCode() {
		return Objects.hash(altura, apellido, edad, nombre);
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
		return Double.doubleToLongBits(altura) == Double.doubleToLongBits(other.altura)
				&& Objects.equals(apellido, other.apellido) && edad == other.edad
				&& Objects.equals(nombre, other.nombre);
	}
	

}
