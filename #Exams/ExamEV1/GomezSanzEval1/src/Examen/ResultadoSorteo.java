package Examen;

public class ResultadoSorteo {

	private int num;
	private int premio;
	
	
	public ResultadoSorteo(int num, int premio) {
		this.num = num;
		this.premio = premio;
	}

//--------------GETTER SETTERA
	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public int getPremio() {
		return premio;
	}


	public void setPremio(int premio) {
		this.premio = premio;
	}
	
	
	
	
	
}
