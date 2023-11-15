package Exam20_21;

public class EntrenadorP2 extends ParticipanteP2 {
	
	public String prueba;
	public String nacionalidad;
	
	public EntrenadorP2() {
		super();
	}

	public EntrenadorP2(String prueba, String nacionalidad) {
		super();
		this.prueba = prueba;
		this.nacionalidad = nacionalidad;
	}
	

	@Override
	public String toString() {

		return "EntrenadorP2 ["+ super.toString() +", prueba=" + prueba + ", nacionalidad=" + nacionalidad + "]";
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getPrueba() {
		return prueba;
	}

	public void setPrueba(String prueba) {
		this.prueba = prueba;
	}
	
	 

	
	
}
