package ejem02_clasesDerivadas;

public class Mamifero extends Animal {
	
	private Integer huesos;
	private Integer extremidades;
	
	public Mamifero(Integer crias, Integer comida, Integer huesos, Integer extremidades) {
		super(crias, comida);
		this.huesos = huesos;
		this.extremidades = extremidades;
	}

	public Integer getHuesos() {
		return huesos;
	}

	public void setHuesos(Integer huesos) {
		this.huesos = huesos;
	}

	public Integer getExtremidades() {
		return extremidades;
	}

	public void setExtremidades(Integer extremidades) {
		this.extremidades = extremidades;
	}
	
	public void visualizarMamifero(){
		this.visualizarAnimal();
		System.out.printf("\t Huesos: %4d | Extremidades: %2d", huesos, extremidades);
	}
	
	

}
