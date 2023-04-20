package zProfe;

public class Repaso03 {
	
	public static void main(String[] args) {
		
		
		for(int i=1 ; i < 7 ; i++) {
			System.out.print(" "+i);
		}
		System.out.println();
		
		
		for(int i=0 ; i < 7 ; i++) {
			System.out.print(" "+i);
		}
		System.out.println();
		
		for(int i=1 ; i <= 7 ; i++) {
			System.out.print(" "+i);
		}
		
		System.out.println();
		for(int i=7 ; i >= 1 ; i--) {
			System.out.print(" "+i);
		}
		
		
		System.out.println();
		for(int i=7 ; i > 0 ; i--) {
			System.out.print(" "+i);
		}
		
		System.out.println();
		/*for(int i = 1; i < 8 ; i--) {
			System.out.print(" "+i);
		}*/
		
		
		/**************************/
		
		int j=1;
		
		while( j <= 7 ) {
			System.out.print(" "+j);
			j++;
		}
		
		
		System.out.println();
		
		j=7;
		while( j >= 1 ) {
			System.out.print(" "+j);
			j--;
		}
		
		System.out.println();
		/************************/
		
		for(int i=4 ; i <= 20 ; i+=5) {
			System.out.print(" "+i);
		}
		
		
	}
}
