package ejer_ClasesYObj;

import aUtilidad.Dibujo;
import aUtilidad.Leer;
import aUtilidad.Vali;

public class Ej02_Horas {

	public static void main(String[] args) {
		
		
		Dibujo.titulo("HORAS");
		
//		INICIAR OBJ HORA
		
		Hora h = new Hora();
		
//		MENU
		int opt;
		do {
			String[] menu = {"Intro hora", "Sumar horas", "Restar hora", "Ver hora", "Convertir a seg"};
			opt = Dibujo.menu(menu);
			
			//----------------SET HORA----------
			if (opt==1) {
				
//				Lectura en formato hh:mm:ss con string.split
				String valor = Leer.leerString("hora (hhh");
				String[] vec = valor.split(":");
				
				
				int aux;
				do {
					aux = Leer.leerInt("Intro horas: ");
					if (Vali.entreRangoNum(aux, 0, 23) == true) {
						h.setHora(aux);
					} else
						System.err.println("No valido. (0-23)");
				} while (Vali.entreRangoNum(aux, 0, 23) == false);
				
				
				do {
					aux = Leer.leerInt("Intro min: ");
					
					if (Vali.entreRangoNum(aux, 0, 59) == true) {
						h.setMin(aux);
					} else
						System.err.println("No valido. (0-59)");
					
				} while (Vali.entreRangoNum(aux, 0, 59) == false);
				
				do {
					aux = Leer.leerInt("Intro seg: ");
					
					if (Vali.entreRangoNum(aux, 0, 59) == true) {
						h.setSeg(aux);
					} else
						System.err.println("No valido. (0-59)");
					
				} while (Vali.entreRangoNum(aux, 0, 59) == false);
				
				
				
				System.out.println("Tu nueva hora es: ");
				h.imprimirHora();
				System.out.println();
				
				//------------------SUMAR RESTAR HORA-----------------
			} else if (opt==2) {
				h.sumarHora(Leer.leerInt("Cuantas horas quieres sumar:"));
				h.sumarMin(Leer.leerInt("Cuantos min quieres sumar:"));
//				h.sumarSeg(Leer.leerInt("Cuantos seg quieres sumar:"));
				System.out.println("------------------------");
			} else if (opt==3) {
				h.restarHora(Leer.leerInt("Cuantas horas quieres restar:"));
				System.out.println("------------------------");
			//---------------------IMPRIMIR HORA-----------------
			} else if (opt==4) {
				System.out.println("------------------------");
				h.imprimirHora();
				System.out.println("------------------------");
			
			//----------------------CONVERTIR HORA
			} else if (opt==5) {
				System.out.println("------------------------");
				System.out.println(h.converSeg()+" seg."); 
				System.out.println("------------------------");
			} 
		} while (opt!=0);

}

}
