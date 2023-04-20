package Tarde;

public class Ej_01_2 {
	
	public static void main(String[] args) {
		
		int num = 1;
		
		int resultado = sumaRecursiva(num);
		
		System.out.println("El resultado es: "+resultado);
	}

	private static int sumaRecursiva(int num) {

		int r = 0;
		if(num == 10)
			r = num;
		else {
			System.out.println("Num: "+num+" r: "+r);
			r = num + sumaRecursiva(num+1);
			System.out.println("-->Num: "+num+" r: "+r);
		}
		
		return r;
	}

}
