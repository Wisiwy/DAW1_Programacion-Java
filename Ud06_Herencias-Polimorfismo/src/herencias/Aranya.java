package herencias;

public class Aranya extends Monstruo{

	private int ojos;
	private int patas;
	private boolean veneno;
	private double velocidad;
		
	public Aranya(String nombre, int vida, int ojos, int patas, boolean veneno, double velocidad) {
		super(nombre, vida);
		this.ojos = ojos;
		this.patas = patas;
		this.veneno = veneno;
		this.velocidad = velocidad;
	}
	public void pintar(){
		
		this.mostrar(); //super.mostrar();
		System.out.printf("% ojos, &d patas, %b veneno, velocidad: %f\n",ojos, patas, veneno, velocidad);
	}
	public int getOjos() {
		return ojos;
	}
	public void setOjos(int ojos) {
		this.ojos = ojos;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	public boolean isVeneno() {
		return veneno;
	}
	public void setVeneno(boolean veneno) {
		this.veneno = veneno;
	}
	public double getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	@Override
	public void ataque() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void defensa() {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
