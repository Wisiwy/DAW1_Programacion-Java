package ejem01_herencia;

public class Empleado {

	private String nombre;
	private double sueldo;
		
	public Empleado(String nombre, double sueldo) {
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getSueldo() {
		return sueldo;
	}
	
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	public void imprimeTodo() {//imprime datos del empleado
		System.out.printf("Nombre: %-12s Sueldo: %.2f \n",nombre,sueldo);
	}
	
	
	
}
