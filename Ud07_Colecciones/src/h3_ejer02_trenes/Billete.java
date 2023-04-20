package h3_ejer02_trenes;

public class Billete {

	private  Integer numBill = 1;
	private static Integer cont = 1;
	private String horaSal;
	private Integer numTrenBill;
	private Integer numVagonBill;
	private Integer asiento;

	public Billete() {
		this.numBill = cont;
		cont++;
	}

	public Billete(String horaSal, Integer numTrenBill, Integer numVagonBill, Integer asiento) {
		this.numBill = cont;
		cont++;
		this.horaSal = horaSal;
		this.numTrenBill = numTrenBill;
		this.numVagonBill = numVagonBill;
		this.asiento = asiento;
	}

	@Override
	public String toString() {
		System.out.println();
		return String.format(" _________________ \n| Num Billete: %2d |\n|-----------------|\n"
				+ "| HoraSal: %6s |\n| Tren: %9d |\n| Vagon: " + "%8d |\n| Asiento: %6d |\n|                 |\n ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯ ", numBill, horaSal,
				numTrenBill, numVagonBill, asiento);

	}

	public Integer getNumBill() {
		return numBill;
	}

	public String getHoraSal() {
		return horaSal;
	}

	public void setHoraSal(String horaSal) {
		this.horaSal = horaSal;
	}

	public Integer getNumTrenBill() {
		return numTrenBill;
	}

	public void setNumTrenBill(Integer numTrenBill) {
		this.numTrenBill = numTrenBill;
	}

	public Integer getNumVagonBill() {
		return numVagonBill;
	}

	public void setNumVagonBill(Integer numVagonBill) {
		this.numVagonBill = numVagonBill;
	}

	public Integer getAsiento() {
		return asiento;
	}

	public void setAsiento(Integer asiento) {
		this.asiento = asiento;
	}

}
