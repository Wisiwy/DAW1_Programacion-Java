package ejem07_vehi_coche;

public abstract class Vehiculo {

	private int numRuedas;
	private String matricula;

	public Vehiculo(int numRuedas, String matricula) {
		this.numRuedas = numRuedas;
		this.matricula = matricula;
	}

	public int getNumRuedas() {
		return numRuedas;
	}

	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}

	public String getMatricula() {
		return matricula;
	}

	public abstract String mostrar();


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public abstract void arrancar();

}
