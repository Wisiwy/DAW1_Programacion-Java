package EjemploEmpleado;

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
	
	
	public void imprimirNombre() {
		System.out.printf("  Nombre: %s \n",nombre);
	}
	
	public void imprimirSueldo() {
		System.out.printf("  Sueldo: %.2f \n",sueldo);
	}
	
	public void imprimirTodo() {
		this.imprimirNombre();
		this.imprimirSueldo();
	}
	
	
	
	

}
