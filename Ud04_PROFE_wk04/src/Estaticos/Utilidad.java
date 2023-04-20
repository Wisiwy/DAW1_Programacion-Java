package Estaticos;

public class Utilidad {
	
		
	public static boolean esNum(String str) {
		
		for (int i = 0; i < str.length(); i++) 
			if(!Character.isDigit(str.charAt(i)))
				return false;
		
		return true;
	}
	
	
	public static boolean esPrimo(int num) {
		
		for(int i=2 ; i<(num/2)+1 ; i++ ) { 
			if(num%i==0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static int numDiv(int num) {
		
		int cont = 2;
		
		for (int i = 2; i < num; i++) 
			if(num%i==0)
				cont++;
		
		return cont;
	}

	public static long factorial(int num) {
		
				
		long fact=1;
		for(int i=num ; i > 1 ; i--) {
			fact*=i; //fact = fact * i;
			//System.out.print(i+ " ");
		}
		
		return fact;
	}


	public static int mcd(int a, int b) {
		
		if(b > a) {
			int aux = b;
			b = a;
			a = aux;
		}
		int aux;
		do {
			
			aux = b;
            b = a % b;
            a = aux;
	 
		}while(b != 0);
		
		return aux;
	}
	
	public static int mcm(int a, int b) {
		
		int numa = Math.max(a, b);
		int numb = Math.min(a, b);
		
		return (numa / mcd(a, b)) * numb;
	}
	
	
	

}
