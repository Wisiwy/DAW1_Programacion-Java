package ejem02_clasesDerivadas;

public class Animal {
	private Integer crias;
	private Integer comida = 0;
	
	
	
	
	public Animal(Integer crias, Integer comida) {
		this.crias = crias;
		this.comida = comida;
	}
	public Animal(Integer crias) {
		this.crias = crias;
	}

	public Integer getCrias() {
		return crias;
	}

	public void setCrias(Integer crias) {
		this.crias = crias;
	}
	public void alimentar () {
		this.comida++;
		System.out.println("Alimentando");
	}
	public void visualizarAnimal() {
		System.out.printf("Nº Crias: %2d || Comida: %2d \n",crias,comida);
	};

	
	

}
