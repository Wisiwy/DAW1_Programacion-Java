package ejer_ClasesYObj;

import aUtilidad.Leer;

public class Alumno {

	private String nombre;
	private String apellido;
	private int edad;

	public Alumno() {
	}

	public Alumno(String nom, String apellido, int edad) {

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

	@Override
	public String toString() {
		return nombre + " "+ apellido + "::" + edad;
	}

	public void aumentarEdad() {
		int aux = Leer.leerInt("Aumentar edad en: ");
		edad += aux;
	}

	public void verEdad() {
		System.out.println(edad);
	}

	public void verNombre() {
		System.out.printf("%s,%s %n", nombre, apellido);
	}

}
