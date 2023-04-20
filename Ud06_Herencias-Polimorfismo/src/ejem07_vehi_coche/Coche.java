package ejem07_vehi_coche;

public class Coche extends Vehiculo {

	private int numAsientos;

	public Coche(String matricula, int numAsientos) {
		super(4, matricula);
		this.setNumAsientos(numAsientos);
	}


	public int getNumAsientos() {
		return numAsientos;
	}

	public void setNumAsientos(int numAsientos) {
		this.numAsientos = numAsientos;
	}

	public void arrancar() {
		System.out.println("El Coche arranca");
	}


	public String mostrar() {
		return String.format("Coche con %2d asientos, %2d ruedas y matricula: %15s. ",numAsientos,this.getNumRuedas(),this.getMatricula());
	}


	
}
