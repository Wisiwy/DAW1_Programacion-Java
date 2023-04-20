package ejer_StringsArrays_Profe;

public class Ej_04 {
	
	
	public static void main(String[] args) {
		
		String str = "perro";
		
		System.out.println("Longitud: "+str.length());
		
		System.out.print(str.charAt(0));
		for(int i=1 ; i < str.length() ; i++ ) {
			System.out.print(" - "+str.charAt(i));
		}
		
		System.out.println();
		for(int i=0 ; i < str.length()-1 ; i++ ) {
			System.out.print(str.charAt(i)+" - ");
		}
		System.out.print(str.charAt(str.length()-1));
		
		
		System.out.println();
		
		for(int i=0 ; i < str.length() ; i++ ) {
			if(i < str.length()-1)
				System.out.print(str.charAt(i)+" - ");
			else
				System.out.print(str.charAt(i));
		}
		
	}

}
