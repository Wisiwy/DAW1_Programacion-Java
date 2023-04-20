package ejer_StringsArrays_Profe;

import aUTILIDAD.Leer;

public class Ej_14 {

	public static void main(String[] args) {
		
		
		String[] semana = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
		
		int dia=0;
		do {
			dia = Leer.leerInt("Dia: ");
			
			if(dia >=1 && dia <=7)
				System.out.println(semana[dia-1]);
			else
				System.out.println("Salgo del programa.");
			
			//String day = dia+"";			
			//dia = Integer.parseInt(day);
			
		}while(dia < 1 || dia > 7);
	}
}
