package Examen2;

public class Persona {
	
	private Datos d1;
	private Direccion d2;
	
	public Persona(Datos d1, Direccion d2) {
		super();
		this.d1 = d1;
		this.d2 = d2;
	}

	@Override
	public String toString() {
		return d1.toString()+d2.toString();
	}

	public Datos getD1() {
		return d1;
	}
	
	
	
	

}
