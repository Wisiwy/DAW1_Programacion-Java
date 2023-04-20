package ejerExtra;

public class Aleatorio {
	private Integer num;

	public Aleatorio() {
		this.num = (int)(Math.random()*100);
	}

	@Override
	public String toString() {
		return String.format("%d",num);
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}
	
	

}
