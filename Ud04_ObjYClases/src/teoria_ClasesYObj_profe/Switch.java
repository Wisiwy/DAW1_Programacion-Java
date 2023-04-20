package teoria_ClasesYObj_profe;

import aUtilidad.Leer;

public class Switch {

	public static void main(String[] args) {
		
		int num = Leer.leerInt("Intro num [1-5]:");
		
		
		//Evalua clabve y 
		
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
// break: para que salga del 
		default: // si introduce algo que no vale responde algo
			System.out.println("Ni idea!!");
			break;
		}
		
		
		
		
	}

}
