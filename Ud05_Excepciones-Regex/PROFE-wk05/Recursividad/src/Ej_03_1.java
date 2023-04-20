
public class Ej_03_1 {
	
	static int[] vector = {2,3,4,5,6,7};
	
	
	public static void main(String[] args) {
		
		recorreVector(vector.length-1);
	}

	private static void recorreVector(int i) {

		
		if(i == 0)
			System.out.println(vector[i]);
		else {
			System.out.println(vector[i]);
			recorreVector(i-1);
			//System.out.println(vector[i]);
		}
			
	}

}
