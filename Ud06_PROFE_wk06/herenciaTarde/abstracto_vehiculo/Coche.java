package abstracto_vehiculo;

public class Coche extends Vehiculo{

	private int numAsientos;

	public Coche(String matricula, int numruedas, int numAsientos) {
		super(matricula, numruedas);
		this.numAsientos = numAsientos;
	}

	
	public void ponerEnMarcha() {
		System.out.printf("El coche con matricula %s se pone en marcha \n", getMatricula());
		
	}
}