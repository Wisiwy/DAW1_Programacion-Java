package Tarde;

public class Ej_01_1 {
	
	public static void main(String[] args) {
		
		int num = 10;
		
		int resultado = sumaRecursiva(num);
		
		System.out.println("El resultado es: "+resultado);
	}

	private static int sumaRecursiva(int num) {

		int r = 0;
		System.out.println("Num: "+num+" r: "+r);
		if(num == 1)
			r = num;
		else {
			//System.out.println("Num: "+num+" r: "+r);
			r = num + sumaRecursiva(num-1);
			
		}
		System.out.println("-->Num: "+num+" r: "+r);
		return r;
	}

}
