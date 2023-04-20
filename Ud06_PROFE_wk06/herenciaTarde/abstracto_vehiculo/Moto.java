package abstracto_vehiculo;

public class Moto extends Vehiculo {

	private int cilindrada;
	
	public Moto(String matricula, int numruedas, int cilindrada) {
		super(matricula, numruedas);
		this.cilindrada = cilindrada;
	}

	
	public void ponerEnMarcha() {
		System.out.printf("La moto con matricula %s se pone en marcha \n", getMatricula());
		
	}

}