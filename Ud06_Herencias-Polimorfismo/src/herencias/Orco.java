package herencias;

public class Orco extends Monstruo{

	
	private int brazos;
	private int piernas;
	private int ojos;
	private double altura;
	
	public  Orco(String nombre, int vida,int brazos, int piernas, int ojos, double altura) {
		super(nombre,vida);
		this.brazos = brazos;
		this.piernas = piernas;
		this.ojos = ojos;
		this.altura = altura;
	}
	public void pintar(){
		
		this.mostrar(); //super.mostrar();
		System.out.printf("% brazos, &d piernas, %d ojos, altrua: %f\n",brazos, piernas, ojos, altura);
	}	
	@Override
	public void ataque() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void defensa() {
		// TODO Auto-generated method stub
		
	}
	public int getBrazos() {
		return brazos;
	}
	public void setBrazos(int brazos) {
		this.brazos = brazos;
	}
	public int getPiernas() {
		return piernas;
	}
	public void setPiernas(int piernas) {
		this.piernas = piernas;
	}
	public int getOjos() {
		return ojos;
	}
	public void setOjos(int ojos) {
		this.ojos = ojos;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}




}

