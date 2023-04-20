
public class Ej_06 {
	
	public static void main(String[] args) {
		
		//1 1 2 3 5 8 13 21 34 55 
		int num = 6;
		
		System.out.println(fiboRecur(num));
		
		for (int i = 1; i <= num; i++) {
			System.out.print(fiboRecur(i)+" ");
		}
	}

	private static int fiboRecur(int n) {
		
		if(n == 0) {
			return 0;
		}else if(n == 1) {
			return 1;
		}else {
			return fiboRecur(n-1)+fiboRecur(n-2);
		}
		
		
	}
	
	

}
