
public class Ej_02 {
	
	
public static void main(String[] args) {
		
		
		int num = 5;
		
		int acum = factorialRecursiva(num);
		
		System.out.println("factorial: "+acum);
		
	}

	private static int factorialRecursiva(int num) {
		
		int acum = 1;
		
		if(num == 1)
			acum *= num;
		else
			acum = num*factorialRecursiva(num-1);
			
		return acum;
	}

}
