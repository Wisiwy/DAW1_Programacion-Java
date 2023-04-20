package Ejer9;

public class Profe extends Persona{
	private String asig;

	public Profe(int edad, String nombre, String dni, String asig) {
		super(edad, nombre, dni);
		this.asig = asig;
	}

	public String getAsig() {
		return asig;
	}

	public void setAsig(String asig) {
		this.asig = asig;
	}
	
	@Override
	public void imprimeDatos()
	{
		System.out.printf("Profe: %s DNI: %s Asig: %s Edad: %d\n",this.getNombre(),this.getDni(),asig,getEdad());
	}
}
