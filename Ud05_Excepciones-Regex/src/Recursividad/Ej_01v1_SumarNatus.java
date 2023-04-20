package Recursividad;

public class Ej_01v1_SumarNatus {

	public static void main(String[] args) {
		int num = 10;
		
		int resultado = sumaRecursiva(num);
		
	}

	private static int sumaRecursiva(int num) {
		
		int r = 0;
//		num vale 10 al principio
		if (num==1)
			//entra cuando num sea 1
			r += num;
		
		else //entra en 10-2
			//se suma num 
			System.out.println(num);
			r = num + sumaRecursiva(num-1);
		
		return r;
	}
	
}
