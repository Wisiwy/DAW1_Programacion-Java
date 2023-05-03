package Exam20_21;

public class DeportistaP2 extends ParticipanteP2{
	public String prueba;
	public String sexo;
	public String marca;
	
	public DeportistaP2() {
		super();

	};
	
	public DeportistaP2(String prueba, String sexo, String marca) {
		super();
		this.prueba = prueba;
		this.sexo = sexo;
		this.marca = marca;
	}
	
	

	@Override
	public String toString() {
		return "DeportistaP2 ["+ super.toString() + ", prueba=" + prueba + ", sexo=" + sexo + ", marca=" + marca + "]";
	}

	public String getPrueba() {
		return prueba;
	}

	public void setPrueba(String prueba) {
		this.prueba = prueba;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	 
	
	
}
