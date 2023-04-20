package Tarde;

public class Ej_05 {
	
	static int[][] m = {{22,23,24},{44,45,46},{91,92,93}};
	
	public static void main(String[] args) {
		
		matrizRecursiva(0,0);
	}
	
	public static void matrizRecursiva(int f, int c) {
		
		
		if(f == m.length -1 && c == m[0].length-1) {
			System.out.println(m[f][c]);
		}else {
			
			if(c == m[0].length-1) {
				System.out.println(m[f][c]);
				matrizRecursiva(f+1,0);
			}else {
				System.out.print(m[f][c]+" ");
				matrizRecursiva(f,c+1);
			}
			
		}
	}

}
