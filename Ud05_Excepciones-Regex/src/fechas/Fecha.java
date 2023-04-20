package fechas;

public class Fecha {

	int dia, mes, anyo;

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	/*
	 * FECHA CORRECTA <br>
	 * 
	 * @return boolean fecha correcta Comprueba fecha dia en mes correcto
	 * (1-28,30,31) <br>
	 *
	 */
	public boolean fechaCorrecta() {
		boolean correc = false;
		if ((this.dia < 0) || (this.dia > 32))
			return correc = false;
		if ((this.mes < 0) || (this.mes > 13))
			return correc = false;
		return correc;
	}

	public boolean esBisiesto() {
		boolean correc = false;
		if (this.anyo % 4 == 0)
			return correc = true;
		return correc;
	}

	public int tipoMes() {
		//Si el mes es 4 ,6,9 o 11 devuelve 30 dias si no 31, y si es febrero 2 return 28 si es 2 y bisiesto 29)
		
		if ((this.mes == 4) || (this.mes == 6) || (this.mes == 9) || (this.mes == 11) )
			return 30;
		if (this.mes ==2)
			return 28;
		if (this.mes == 2 && esBisiesto() )
			return 29;
		else
			return 31;
					
					
	}

	/*
	 * SUMA DIA <br> Suma un dia a la fecha
	 */

	public void diaSiguiente() {
		this.dia++;
	}

	@Override
	public String toString() {
		return String.format("%2d--&2d--%4d", dia, mes, anyo);
	}

}
