package teoria2;

import Estaticos.Leer;

public class Principal_borrar {
	
	
	public static void main(String[] args) {
		
		
		int num = Leer.leerEntero("Introduce un num(1-5): ");
		
		
		switch (num) {
		
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		default:
			System.out.println("ni idea");
		}
		
		
	}

}
