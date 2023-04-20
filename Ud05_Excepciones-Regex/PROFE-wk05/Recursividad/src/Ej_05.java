
public class Ej_05 {
	
	static int[][] m = {{21,22,23},{36,37,38},{74,75,76}};
	
	public static void main(String[] args) {
		
		matrizRecursiva(0,0);		
	}
	
	public static void matrizRecursiva(int f, int c) {
		
		if(f == m.length -1 && c == m[0].length-1) {
			//parada
			System.out.println(m[f][c]);
		}else {
			//recursividad
			if(c == m[0].length-1) {
				System.out.println(m[f][c]);
				matrizRecursiva(f+1,0);
			}else{
				System.out.print(m[f][c]+" ");
				matrizRecursiva(f,c+1);
			}
		}
	}

}
