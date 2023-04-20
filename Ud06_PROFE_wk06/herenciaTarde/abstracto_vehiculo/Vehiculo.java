package abstracto_vehiculo;

public abstract class Vehiculo {

	private String matricula;
	private int numruedas;
	
	public Vehiculo(String matricula, int numruedas) {
		super();
		this.matricula = matricula;
		this.numruedas = numruedas;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getNumruedas() {
		return numruedas;
	}

	public void setNumruedas(int numruedas) {
		this.numruedas = numruedas;
	}
	
	public abstract void ponerEnMarcha();
}