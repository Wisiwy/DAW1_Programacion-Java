package OBJETOS;

import Estaticos.Leer;
import Menu.Utilidad;

public class Ej_03 {
	
	public static void main(String[] args) {
		
		boolean menu = true;
		String[] s = {"Crear TragaBolas","Comer","Trotar","Dormir","Ver estado"};
		String[] p = {"rojo","azul","amarillo","verde"};
		
		TragaBolas tb = null;
		
		do {
			
			int o = Utilidad.menu(s);
			
			if(o == 1) {
				
				System.out.println();
				String color;
				do{
					color = Leer.leerCadena("Color: ");
					
					if(Utilidad.validaCadena(color, p)==false)
						System.err.println("color no permitido.");
					
				}while(Utilidad.validaCadena(color, p)==false);
				
				int max = Leer.leerEntero("maxBolas: ");
				tb = new TragaBolas(color,max);
				
			}else if(o == 2) {
				if(tb != null)
					tb.comer();
				else
					System.out.println("no existe");
			}else if(o == 3) {
				if(tb != null)
					tb.trotar();
			}else if(o == 4) {
				if(tb != null)
					tb.dormir();
			}else if(o == 5) {
				if(tb != null)
					tb.visualizar();
			}else if(o == 0) {
				menu = false;
			}else {
				System.err.println("Error. dato no valido.");
			}
			
		}while(menu==true);
		
		System.out.println("Salgo del programa.");
	}

	

}
