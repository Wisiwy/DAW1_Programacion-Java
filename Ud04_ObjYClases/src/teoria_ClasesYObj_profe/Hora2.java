package teoria_ClasesYObj_profe;

import ejer_ClasesYObj.Hora;

public class Hora2 {

	private Integer hora = 0;
	private Integer min = 0;
	private Integer seg = 0;

	public Hora2() {

	}

	public Integer getHora() {
		return hora;
	}

	public void setHora(Integer hora) {
		this.hora = hora;
	}

	public Integer getMin() {
		return min;
	}

	public void setMin(Integer min) {
		this.min = min;
	}

	public Integer getSeg() {
		return seg;
	}

	public void setSeg(Integer seg) {
		this.seg = seg;
	}

	public Hora2(Integer hora, Integer min, Integer seg) {
		this.hora = hora;
		this.min = min;
		this.seg = seg;
	}

	public void sumarHora(Hora2 h) {
		this.seg += h.getSeg();
		
			
		while (seg > 59) {
			seg -= 60;
			min++;
		}
		this.min += h.getMin();
		while (min>59) {
			seg -= 60;
			min++;
		}
		
		this.hora += h.getHora();
		
		while(hora>23) {
			hora-=24;
		}
		
		
	}
	public void restarHora(Hora2 h) {
		Integer seg = Math.abs(this.toSeg() - h.toSeg());
		this.seg = seg/60;
		Integer aux = seg/60;
		this.min = seg%60;
		this.hora = aux/60;
		
	}
	public void imprimirHora() {
		System.out.printf("%02d:%02d:%02d %n", hora, min, seg);

	}
	public void sumarSeg(Integer seg) {
		Hora2 aux = new Hora2 (0,0,seg);
		sumarHora(aux);
	}
	public Integer toSeg() {
		return (hora * 3600) + (min * 60) + seg;
	}
}
