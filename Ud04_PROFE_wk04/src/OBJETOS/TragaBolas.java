package OBJETOS;

public class TragaBolas {
	
	private String color;
	private Integer bolasComidas=0;
	private Integer maxBolas;
	
	public TragaBolas(String color, int maxBolas) {
		
		this.color = color;
		this.maxBolas = maxBolas;
	}

	public String getColor() {
		return color;
	}

	public Integer getBolasComidas() {
		return bolasComidas;
	}

	public Integer getMaxBolas() {
		return maxBolas;
	}
	
	public void visualizar() {
		System.out.printf("TragaBolas %s con %d/%d \n",color,this.bolasComidas,this.maxBolas);
	}
	
	public void comer() {
		if(this.bolasComidas< this.maxBolas) {
			bolasComidas++;
			System.out.println("He comido 1 bola.");
		}
			
	}
	public void trotar() {
		if(bolasComidas >= 1) {
			bolasComidas--;
			System.out.println("Estoy trotando!!");
		}
	}
	public void dormir() {
		if(this.bolasComidas == this.maxBolas) {
			bolasComidas = bolasComidas/2;
			System.out.println("Tripa llena. ZZZZZZZZ");
		}else {
			System.out.println("No quiero dormir!!");
		}
	}
	
	

	

}
