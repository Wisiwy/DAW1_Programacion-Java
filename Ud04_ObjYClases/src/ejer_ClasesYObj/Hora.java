package ejer_ClasesYObj;

import aUtilidad.Vali;

public class Hora {

	private Integer hora = 0;
	private Integer min = 0;
	private Integer seg = 0;

	public Hora() {

	}

	public Hora(Integer hora, Integer min, Integer seg) {
		this.hora = hora;
		this.min = min;
		this.seg = seg;
	}

	public Integer getHora() {
		return hora;
	}

	public void setHora(Integer hora) {

		do {
			if (Vali.entreRangoNum(hora, 0, 23) == true) {
				this.hora = hora;
			} else
				System.err.println("No valido. (0-23)");

		} while (Vali.entreRangoNum(hora, 0, 23) == false);

	}

	public Integer getMin() {
		return min;
	}

	public void setMin(Integer min) {

		do {
			if (Vali.entreRangoNum(min, 0, 59) == true) {
				this.min = min;
			} else
				System.err.println("No valido. (0-59)");

		} while (Vali.entreRangoNum(min, 0, 59) == false);

	}

	public Integer getSeg() {
		return seg;
	}

	public void setSeg(Integer seg) {

		do {

			if (Vali.entreRangoNum(seg, 0, 59) == true) {
				this.seg = seg;
			} else
				System.err.println("No valido. (0-59)");
		} while (Vali.entreRangoNum(seg, 0, 59) == false);

	}

	@Override
	public String toString() {
//		Preguuntar como se puede print F el toString
		return "Hora [hora=" + hora + ", min=" + min + ", seg=" + seg + "]";
	}

	public void imprimirHora() {

		System.out.printf("%02d:%02d:%02d %n", hora, min, seg);

	}

	public int converSeg() {
		return (hora * 3600) + (min * 60) + seg;
	}

	public void sumarHora(int num) {

		if ((hora + num) > 23) {
			int aux = 0;
			aux = 24 - hora;
			num = num - aux;
			hora = num;
		} else
			hora += num;

	}

	public void restarHora(int num) {
		if ((hora - num) < 0) {
			int aux = 0;
			aux = 24 - hora;
			num = num - aux;
			hora = 24 - num;
		} else
			hora -= num;

	}

	public void sumarMin(int sum) {
		
		if ((min + sum) > 59) {
			int aux = 0;
			aux = 60 - min;
			sum = sum - aux;
			while (sum > 59) {
				sum -= 60;
				hora++;
			}
			min = sum;
			hora++;
		} else
			min += sum;

	}

	public void sumarSeg(int sum) {
		// TODO Auto-generated method stub

	}

}
