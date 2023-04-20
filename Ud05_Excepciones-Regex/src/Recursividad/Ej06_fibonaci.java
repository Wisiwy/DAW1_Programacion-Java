package Recursividad;

public class Ej06_fibonaci {

	public static void main(String[] args) {

		int num = 5 ;
		//1,1,2,3,5,8,13,21,33
		
		System.out.println(fibonacci(num));
		
	}

	static int r =0;
	private static int fibonacci(int n) {
		if (n==0){
			return 0;
		}else if(n==1) {
			return 1;
		}else
			System.out.println();
			r = fibonacci(n-1) + fibonacci(n-2);
		
		return r;
		
	}

}
