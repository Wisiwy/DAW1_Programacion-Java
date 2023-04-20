package EjemploAbstracto;

public abstract class Figura {
	
	private String color;
	
	public Figura(String c) {
		this.color=c;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public abstract double area();
	
	
	
	

}
