package Examen2;

public class Sorteo {
	
	private int num;
	private int pre;
	
	public Sorteo(int num, int pre) {
		super();
		this.num = num;
		this.pre = pre;
	}

	public int getNum() {
		return num;
	}

	public int getPre() {
		return pre;
	}

	@Override
	public String toString() {
		return String.format(" %04d - %5d ",num,pre);
	}
	
	
	
	

}
