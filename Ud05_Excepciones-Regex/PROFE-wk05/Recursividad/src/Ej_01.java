
public class Ej_01 {
	
	
	
	public static void main(String[] args) {
		
		
		int num = 10;
		
		int acum = sumaRecursiva(num);
		
		System.out.println("suma: "+acum);
		
	}

	private static int sumaRecursiva(int num) {
		
		int acum = 0;
		
		if(num == 1)
			acum += num;
		else
			acum = num+sumaRecursiva(num-1);
			
		return acum;
	}

}
