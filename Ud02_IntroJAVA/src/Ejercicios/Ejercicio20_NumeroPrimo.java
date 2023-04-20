package Ejercicios;

public class Ejercicio20_NumeroPrimo {

	public static void main(String[] args) {
		int num = 7;
		// Introducimos el 8 a esPrimo y devuelve boolean.Paso por valor
		if (esPrimo(num) == true) {//==true es redundante por defecto  if (esPrimo(num)) lo comprueba como true
			System.out.println("Es primo");
		}else {
			System.out.println("No es primo");
		}			
	}
	//metodos publicos: pueden ser leidos por otras clases
	// boolean = lo que va a devolver 
	//int num = la variable que metemos
	//le pasamos un int y devuelve un boolean
	public static boolean esPrimo(int num) {
		
		for (int n=2 ; n<num ; n++) { //comprobar si es divisible entre 1 y si mism, empezar desde 0
			if(num%n==0) {
				return false;//break point romper bucle cuando encuentre uno divisible salga bucle devolviendo false
			}			
		}
		return true; //si ha pasado por tod
	//tener clase chuleta con los metodos 
	}
	
}
