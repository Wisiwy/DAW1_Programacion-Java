
public class Pizarra {
	
	public static void main(String[] args) {
		
		int num = 3, num2 = 0;
		
		try {
			
			int num4 = num/num2;
			num4 = 16;
			System.out.println("número: "+num4);
			
		}catch(ArithmeticException a) {
			//System.out.println(a.getMessage());
			a.printStackTrace();
		}catch(Exception a) {
			//System.out.println(a.getMessage());
			a.printStackTrace();
		}
		
		System.out.println("Fin del programa!");
		
				
	}

}
