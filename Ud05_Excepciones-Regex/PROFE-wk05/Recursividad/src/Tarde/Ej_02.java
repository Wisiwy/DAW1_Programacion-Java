package Tarde;

public class Ej_02 {
	
	public static void main(String[] args) {
		
		int num = 6;
		
		int r = factorialRecursivo(num);
		System.out.printf("El factorial de %d es %d",num,r);
	}
	
	public static int factorialRecursivo(int n) {
		
		int r = 0;
		if(n == 1) {
			//parada
			r = n;
		}else {
			//recursivo
			r = n * factorialRecursivo(n-1);
		}
		
		System.out.println("-->Num: "+n+" r: "+r);
		return r;
	}

}
