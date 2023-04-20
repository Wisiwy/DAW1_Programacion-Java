package EjemploAbstracto;

public class Cuadrado extends Figura{
	
	private double base;

	public Cuadrado(String c, double base) {
		super(c);
		this.base = base;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	@Override
	public double area() {
		
		return base*base;
	}
	
	
	
	

}
