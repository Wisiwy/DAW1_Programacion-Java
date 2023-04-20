package EjemploAbstracto;

public class Circulo extends Figura {
	
	private double radio;

	public Circulo(String c, double radio) {
		super(c);
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public double area() {
		return Math.PI*radio*radio;
	}
	
	

}
