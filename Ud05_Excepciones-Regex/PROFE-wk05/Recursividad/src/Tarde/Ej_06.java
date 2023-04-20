package Tarde;

import java.util.Iterator;

public class Ej_06 {
	
	public static void main(String[] args) {
		
		//1 1 2 3 5 8 13 21 34 55 89 144
		
		int num = 20;
		
		
		System.out.println(fibonacciRecursivo(num));
		
		for (int i = 1; i <= num; i++) {
			System.out.print(fibonacciRecursivo(i)+" ");
		}
		
	}
	
	public static int fibonacciRecursivo(int n) {
		
		if(n == 0) {
			return 0;
		}else if(n == 1) {
			return 1;
		}else {
			int r = fibonacciRecursivo(n-1)+fibonacciRecursivo(n-2);
			//System.out.println(r);
			return r;
		}
		
	}

}
