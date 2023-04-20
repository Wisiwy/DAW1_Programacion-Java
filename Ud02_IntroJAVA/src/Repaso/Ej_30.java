package Repaso;

public class Ej_30 {
	public static void main(String[] args) {
		
		int cont = 4, num = 1, acum=0;
		
		while(cont > 0) {
		
			System.out.print(num+ " --> ");
			for(int i=1 ; i < num ; i++) {
				if(num%i == 0) {
					System.out.print(i+" ");
					acum = acum + i;
				}
			}
			System.out.print(" ## "+acum);
			
			if(num == acum) {
				System.out.println(" Perfecto");
				cont--;
			}
				
			acum=0;
			num++;
			System.out.println();
		}
	}
}
