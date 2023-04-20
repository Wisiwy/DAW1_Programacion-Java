package teoria_defecto;

public class Pista_2 {
	
	
	public static void main(String[] args) {
		
				
		Integer hora = 9;
		Integer min = 8;
		Integer seg = 17;
		
		//formato hh:mm:ss
		System.out.println(hora+":"+min+":"+seg);
		
		String str = String.format("%d:%d:%d \n", hora,min,seg);
		System.out.print(str);

		System.out.printf("%02d:%02d:%02d \n", hora,min,seg);
		
	}

}
