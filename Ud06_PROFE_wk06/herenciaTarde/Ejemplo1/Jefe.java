package Ejemplo1;

public class Jefe extends Empleado{
	
	private String dpto;
	private String tituloUniv;
	
	public Jefe(String nombre, double sueldo, String dpto, String tituloUniv) {
		super(nombre, sueldo);
		this.dpto = dpto;
		this.tituloUniv = tituloUniv;
	}

	public String getDpto() {
		return dpto;
	}

	public void setDpto(String dpto) {
		this.dpto = dpto;
	}

	public String getTituloUniv() {
		return tituloUniv;
	}

	public void setTituloUniv(String tituloUniv) {
		this.tituloUniv = tituloUniv;
	}
		
	public void imprimeJefe() {
		this.imprimeTodo();
		System.out.printf("  dpto: %-10s titulo: %-20s \n", dpto, tituloUniv);
	}

	
	public void imprimeTodo() {
		// TODO Auto-generated method stub
		System.out.printf("Jefe: %10s  dpto: %-10s titulo: %-20s \n",getNombre(), dpto, tituloUniv);
	}
	
	
	
	

}
