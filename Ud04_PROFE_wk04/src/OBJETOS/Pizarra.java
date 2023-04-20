package OBJETOS;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Pizarra {
	
	public static void main(String[] args) {
		
		
		
		String hora = "23:44:55";
		
		String[] v = hora.split(":");
		
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i]);
		}
		
		System.out.println("horas: "+ v[0]);
		
		
		String fecha = "24/11/2022";
		
		String dia = diaSemana(fecha);
		
		LocalDateTime locaDate = LocalDateTime.now();
		int h  = locaDate.getHour();
		int m = locaDate.getMinute();
		int s = locaDate.getSecond();
		
		System.out.println(locaDate.getDayOfWeek());
		
		LocalDate localDate2 = LocalDate.parse(fecha,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		String pon = localDate2.getDayOfWeek().name();
		System.out.println(pon);
		
		//LocalDateTime locaDate2 = LocalDateTime.parse(fecha,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		//System.out.println(locaDate2.getDayOfWeek());
	}

	private static String diaSemana(String fecha) {
		
		
		return null;
	}
	

}
