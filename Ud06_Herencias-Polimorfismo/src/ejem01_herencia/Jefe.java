package ejem01_herencia;

public class Jefe extends Empleado{

	//Definimos los nuevos atributos de la clase jefe
	
	private String dpto; //Departamento de lo que es jefe
	private String tituloUniv;
	
//	Crea el constructor tomando los atributos de "Empleado"
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

	public void imprimirJefe() {
		//Cuidado con los nombres de los métodos si coincide coge el más cercano
		this.imprimeTodo();
		System.out.printf("\t Dpto: %-10s || Titulo: %-20s \n", dpto, tituloUniv);
	}
	

}
