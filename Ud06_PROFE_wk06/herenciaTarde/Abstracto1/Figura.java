package Abstracto1;

public abstract class Figura {
	
	private String color;
	
	public Figura(String c) {
		this.color = c;
	}
	
	
	public abstract double area();


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	

}
