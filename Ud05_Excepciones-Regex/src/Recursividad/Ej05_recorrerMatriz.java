package Recursividad;

public class Ej05_recorrerMatriz {

	static int[][] m2 = new int[3][3];
	static int[][] m = { { 22, 23, 24 }, { 44, 45, 46 }, { 91, 92, 93 } };

	public static void main(String[] args) {

		int fil = m.length;
		int col = m[0].length;
		recorrerMatriz(0, 0);

	}

	private static void recorrerMatriz(int f, int c) {
		if (f == m.length-1 && c == m[0].length-1 ) {
			System.out.print(m[f][c]);			
		}else {
			if(c==m.length-1) {
				System.out.println(m[f][c]);
				c=0;
				recorrerMatriz((f+1),c);
			}
			else {
			System.out.print(m[f][c] + " ");
			recorrerMatriz(f,(c+1));
			}	
			
		}
			
		
	}

}
