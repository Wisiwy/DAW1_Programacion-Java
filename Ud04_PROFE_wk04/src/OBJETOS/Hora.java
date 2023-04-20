package OBJETOS;

public class Hora {
	
	private Integer hora=0;
	private Integer minutos=0;
	private Integer segundos=0;
	
	public Hora() {
	}

	public Hora(Integer hora, Integer minutos, Integer segundos) {
		this.hora = hora;
		this.minutos = minutos;
		this.segundos = segundos;
	}

	public Integer getHora() {
		return hora;
	}

	public void setHora(Integer hora) {
		this.hora = hora;
	}

	public Integer getMinutos() {
		return minutos;
	}

	public void setMinutos(Integer minutos) {
		this.minutos = minutos;
	}

	public Integer getSegundos() {
		return segundos;
	}

	public void setSegundos(Integer segundos) {
		this.segundos = segundos;
	}
	
	
	
	public void sumar(Hora h) {
		segundos += h.getSegundos();
		while(segundos > 59) {
			segundos -= 60;
			minutos += 1;
		}
		minutos += h.getMinutos();
		while(minutos > 59) {
			minutos -= 60;
			hora++;
		}
		hora += h.getHora();
		while(hora > 23)
			hora -= 24;
	}
	
	public void restar(Hora h) {
		Integer seg = Math.abs(this.toSeg()-h.toSeg());
			
		this.segundos = seg%60;
		Integer aux = seg/60;
		this.minutos = aux%60;
		this.hora = aux/60;
			
	}
	
	public void mostrar() {
		System.out.printf("\n %02d:%02d:%02d \n",hora,minutos,segundos);
	}
	
	public Integer toSeg() {
		
		return segundos+minutos*60+hora*3600;
	}
	
	public void sumaSeg(Integer seg) {
		
		Hora aux = new Hora(0,0,seg);
		sumar(aux);
	}
	
	

}
