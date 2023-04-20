package ejer3_alumno;

public class Alumno {
	private String nombre;
	private String apellido1;
	private String apellido2;
	private int nota1;
	private int nota2;
	private int nota3;
	
	
	
	public Alumno(String nombre, String apellido1, String apellido2, int nota1, int nota2, int nota3) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public int getNota1() {
		return nota1;
	}
	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}
	public int getNota2() {
		return nota2;
	}
	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}
	public int getNota3() {
		return nota3;
	}
	public void setNota3(int nota3) {
		this.nota3 = nota3;
	}
	@Override
	public String toString() {
		/*return nombre + " " + apellido1 + " " + apellido2 + ", notas=" + nota1
				+ "|" + nota2 + "|" + nota3 + "]";*/
		return String.format(" %10s, %10s %10s - %3d %3d %3d", nombre,apellido1,apellido2,nota1,nota2,nota3);
	}
	
	
}
