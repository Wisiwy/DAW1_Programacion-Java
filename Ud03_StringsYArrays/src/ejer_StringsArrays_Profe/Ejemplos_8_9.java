package ejer_StringsArrays_Profe;

public class Ejemplos_8_9 {
	
	public static void main(String[] args) {
		
		
		String str = "Raul--Lirys--Luis--David";
		
		String[] vector = str.split("--");
		
		System.out.println("He encontrado "+vector.length+" nombres.");
		
		for(int i=0 ; i < vector.length ; i++) {
			System.out.println(vector[i]);
		}
		
		
		//************************
		
		
		int num = 2;
		
		String str2 = "Antonio";
		
		System.out.println(str2);
		
		for (int i = 0; i < str2.length(); i++) {
			
			char c = str2.charAt(i);
			int a = (int)c;
			int b = a+num;
			char c2 = (char)b;
			
			System.out.printf("Caracter: %c :: Ascii: %d :: Cod: %d :: Car: %c \n",c,a,b,c2);
			
			//System.out.print((char)(num +((int)(str2.charAt(i)) )) );
		}
		
		
		
	}

}
