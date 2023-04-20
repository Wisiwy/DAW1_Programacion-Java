package EjemploDimensiones;

public class VerTresDimension extends VerDosDimension {
	private double ancho;

	public VerTresDimension(double largo, double alto, double ancho) {
		super(largo, alto);
		this.ancho = ancho;
	}

	public VerTresDimension(VerDosDimension d2, int i) {
		super(d2.getLargo(), d2.getAlto());
		this.ancho = ancho;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	
	public void volumen() {
		double volumen = this.getLargo() * this.alto * ancho;
		System.out.printf("Volumen: %3.2f ", volumen);
	}
	
	

}
