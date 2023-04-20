package Examen2;

public class Ej_01 {
	
	public static void main(String[] args) {
		
		
		boolean[] b1 = new boolean[8];
		boolean[] b2 = new boolean[8];
		boolean[] r = new boolean[8];
		
		genera(b1);
		imprime(b1);
		genera(b2);
		imprime(b2);
		
		r = compara(b1,b2);
		imprime(r);
		
	}

	private static boolean[] compara(boolean[] b1, boolean[] b2) {
		
		boolean[] r = new boolean[8];
		
		for (int i = 0; i < r.length; i++) {
			if(b1[i] == true || b2[i] == true)
				r[i] = true;
			else
				r[i] = false;
		}
		
		return r;
	}

	private static void imprime(boolean[] b) {
		
		for (int i = 0; i < b.length; i++) {
			System.out.print(" ");
			if(b[i]==true)
				System.out.print(1);
			else
				System.out.print(0);
		}
		System.out.println();
	}

	public static void genera(boolean[] b) {
		
		for (int i = 0; i < b.length; i++) {
			
			int aux = (int) (Math.random()*2);
			
			if(aux == 1)
				b[i]=true;
			else
				b[i]=false;
		}
	}

}
