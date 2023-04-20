
public class Ej_03_2 {
	
	static int[] vector = {2,3,4,5,6,7};
	
	public static void main(String[] args) {
		
		recorrerVector(0);
	}
	
	public static void recorrerVector(int i){
		
		if(i == vector.length-1) {
			System.out.println(vector[i]);
		} else {
			System.out.print(vector[i] + ", ");
			recorrerVector(i+1);
			//System.out.print(vector[i] + ", ");
		}
		
	}

}
