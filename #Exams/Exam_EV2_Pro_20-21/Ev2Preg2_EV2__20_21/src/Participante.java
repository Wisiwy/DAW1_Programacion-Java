
public class Participante {

	private Atleta atle;
	private String prueba;
	private Double marca;
	
	
	public Participante(Atleta atle, String prueba, Double marca) {
		this.atle = atle;
		this.prueba = prueba;
		this.marca = marca;
	}


	@Override
	public String toString() {
		return String.format("\t %-20s \t// %-15s \t // %5.2f \n",atle.getNombre(),atle.getPais(), marca);
	}


	public Atleta getAtle() {
		return atle;
	}


	public void setAtle(Atleta atle) {
		this.atle = atle;
	}


	public String getPrueba() {
		return prueba;
	}


	public void setPrueba(String prueba) {
		this.prueba = prueba;
	}


	public Double getMarca() {
		return marca;
	}


	public void setMarca(Double marca) {
		this.marca = marca;
	}


	


	
	
	
	
	
	
}
