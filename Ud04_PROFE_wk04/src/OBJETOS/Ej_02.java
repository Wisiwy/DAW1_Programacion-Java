package OBJETOS;

import Estaticos.Leer;
import Menu.Utilidad;

public class Ej_02 {
	
	public static void main(String[] args) {
		
		boolean menu = true;
		String[] opciones = {"Crear Hora","Sumar Hora","Restar Hora","Mostrar","A Segundos","Sumar Segundos"};
		
		
		Hora miHora = null;
		
		do {
			
			int o = Utilidad.menu(opciones);
			
			if(o == 1) {
				Integer h = entrada("Hora: ",0,23);
				Integer m = entrada("Minutos: ",0,59);
				Integer s = entrada("Segundos: ",0,59);
				miHora = new Hora(h,m,s);
			}else if(o == 2) {
				if(miHora != null) {
					Integer h = entrada("Hora: ",0,23);
					Integer m = entrada("Minutos: ",0,59);
					Integer s = entrada("Segundos: ",0,59);
					Hora aux = new Hora(h,m,s);
					miHora.sumar(aux);
				}else
					System.err.println("No hay una hora creada.");
			}else if(o == 3) {
				if(miHora != null) {
					Integer h = entrada("Hora: ",0,23);
					Integer m = entrada("Minutos: ",0,59);
					Integer s = entrada("Segundos: ",0,59);
					Hora aux = new Hora(h,m,s);
					miHora.restar(aux);
				}else
					System.err.println("No hay una hora creada.");
			}else if(o == 4) {
				if(miHora != null)
					miHora.mostrar();
				else
					System.err.println("No hay una hora creada.");
			}else if(o == 5) {
				if(miHora != null) {
					miHora.mostrar();
					System.out.printf("Son %d segundos.\n",miHora.toSeg());
				}else
					System.err.println("No hay una hora creada.");
			}else if(o == 6) {
				if(miHora != null) {
					Integer s = entrada("Segundos: ",0,500000);
					miHora.sumaSeg(s);
				}else
					System.err.println("No hay una hora creada.");
				
			}else if(o == 0) {
				menu = false;
			}else {
				System.err.println("Error. dato no valido.");
			}
			
		}while(menu==true);
		
		System.out.println("Salgo del programa.");
	}

	private static Integer entrada(String cad,int i, int j) {
		
		Integer num;
		
		do {
			num = Leer.leerEntero(cad);
			
			if(num < i || num > j)
				System.err.println("N�mero no v�lido ("+i+"-"+j+").");
			
		}while(num < i || num > j);
		
		return num;
	}

}
