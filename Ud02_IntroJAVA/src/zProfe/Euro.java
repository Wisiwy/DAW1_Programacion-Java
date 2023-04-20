package zProfe;

public class Euro {
	
	 public static void main(String[] args) {
		
		 
		 for(int i=1; i<=50 ; i++) {
			 System.out.print(" "+i);
		 }
		 
		 System.out.println();
		 
		 for(int fila=1 ; fila<=9 ; fila ++) {
			 //System.out.printf(" %2d ",fila);
			 int col =0;
			 int dato=fila+col*9;
			 while(dato <= 50) {
				 System.out.printf(" %2d ",dato);
				 col++;
				 dato=fila+col*9;
			 }
			 
			 System.out.println();
		 }
		 
		 System.out.println();
		 
		 for(int fila=1 ; fila<=9 ; fila++) {
			 //System.out.printf(" %2d ",fila);
			 for(int dato=fila; dato<=50 ; dato+=9) { //dato = dato+9
				 System.out.printf(" %2d ",dato);
			 }
			 
			 System.out.println();
		 }
	}

}
