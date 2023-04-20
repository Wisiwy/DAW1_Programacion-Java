package EjemploDimensiones;

public class VerDosDimension extends VerUnaDimension{
	public double alto;

	public VerDosDimension(double largo, double alto) {
		super(largo);
		this.alto = alto;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}
	
	public void area() {
		double area = getLargo() * alto; 
		System.out.printf("Area: %3.2f ", area);	}
	
	
	
}
