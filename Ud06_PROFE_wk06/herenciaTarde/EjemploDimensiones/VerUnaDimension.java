package EjemploDimensiones;

public class VerUnaDimension {
	private double largo;

	public VerUnaDimension(double largo) {
		this.largo = largo;
	}

	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}
	
	public void linea() {
		System.out.printf("Linea: %3.2f ", largo);
	}
	

}
