package ejem07_vehi_coche;

public class Moto extends Vehiculo {

	private int cilindrada;

	public Moto(String matricula, int cilindrada) {
		super(2, matricula);

		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	public String mostrar() {
		
		return String.format("Moto con %3d cilindrada, %2d ruedas y matricula: %-15s. ",cilindrada,this.getNumRuedas(),this.getMatricula());
	}

	public void arrancar() {
		System.out.println("La moto arranca");
	}
}
