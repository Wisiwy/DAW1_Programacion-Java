package OBJETOS;

import Estaticos.Leer;
import Menu.Utilidad;

public class Ej_04 {
	
	public static void main(String[] args) {
		
		boolean menu = true;
		String[] s = {"Crear Cuenta","Ingresar","Retirar","Ver Cuenta","Mostrar todas"};
		
		CuentaCorriente[] cuentas = new CuentaCorriente[100];
		
		do {
			
			int o = Utilidad.menu(s);
			
			if(o == 1) {
				
				int cant = Leer.leerEntero("cantidad: ");
				String cli = Leer.leerCadena("cliente: ");
				
////				CuentaCorriente aux = new CuentaCorriente(cant,cli);
//				int pos = Integer.parseInt(aux.getNumCuenta());
//				cuentas[pos] = aux;
				
			}else if(o ==2) {
				int pos = Leer.leerEntero("num cliente: ");
				
				if(cuentas[pos] != null) {
					double cant = Leer.leerDouble("cantidad: "); 
					cuentas[pos].ingresaEfectivo(cant);
				}
					
				
			}else if(o == 3) {
				
				int pos = Leer.leerEntero("num cliente: ");
				
				if(cuentas[pos] != null) {
					double cant = Leer.leerDouble("cantidad: "); 
					if(cuentas[pos].retiraEfectivo(cant))
						System.out.println("Se ha retirado con exito");
					else
						System.out.println("Saldo insuficiente");
				}
			}else if(o ==4) {
				int pos = Leer.leerEntero("num cliente: ");
				
				if(cuentas[pos] != null) {
					System.out.println(cuentas[pos].visualiza());
				}
			}else if(o == 5) {
				
				for (int i = 0; i < cuentas.length; i++) {
					if(cuentas[i] != null)
						System.out.println(cuentas[i].visualiza());
				}
			}else if(o==0) {
				menu = false;
			}else {
				System.err.println("Error. dato no valido.");
			}
			
		}while(menu==true);
		
		System.out.println("Salgo del programa.");
		
	}
	
	

}
