package OBJETOS;

import Estaticos.Leer;
import Menu.Utilidad;

public class Ej_05 {
	
	public static void main(String[] args) {
		
		boolean menu = true;
		String[] s = {"Crear Cuenta","Borrar Cuenta","Ingresar","Retirar","Ver Cuentas","Mostrar todas"};
		
		CuentaCorriente[] cuentas = new CuentaCorriente[100];
		Cliente[] clientes = new Cliente[100];
		
		do {
			
			int o = Utilidad.menu(s);
			
			if(o == 1) {
				
			}else if(o ==2) {
					
				
			}else if(o == 3) {
				
			}else if(o ==4) {
			}else if(o == 5) {
			}else if(o == 6) {
			}else if(o==0) {
				menu = false;
			}else {
				System.err.println("Error. dato no valido.");
			}
			
		}while(menu==true);
		
		System.out.println("Salgo del programa.");
		
	}
	
	

}
