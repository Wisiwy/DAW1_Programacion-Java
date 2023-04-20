package zProfe;

public class NuevoRepaso {
	
	public static void main(String[] args) {
		
		//definir variables
		//tipo nombre
		int num1;
		double num2;
		char car = 'd';
		
		
		car = 'g';
		num1 = 3;
		
		
		//estructuras b�sicas
		//condicional
		// si se cumple la condicion
		
		if(num1 > 5) {
			System.out.println("num1 es mayor que 5");
		}else {
			System.out.println("num1 es menor o igual que 5");
			if (car == 'g') {
				System.out.println("car es g.");
			}
			boolean condicion=false;
			if(!condicion) {
				System.out.println("condicion: "+condicion);
			}
		}
		
		//bucle
		//para
		//se define inicio, condicion e iteracion
		
		for(int i=0 ; i < 5 ; i++) {
			System.out.println("Vuelta: "+(i+1));
			//i=4;
			//break;
		}
		
		//mientras
		//se define una condicion de repeticion
		
		int cont = 5;
		while(cont < 5) {
			
			System.out.println("Vuelta --> "+cont);
			cont++;
		}
		
		//haz mientras
		
		cont=5;
		do {
			System.out.println("Vuelta do--> "+cont);
			cont++;
		}while(cont<5);
		
		
		//switch
		num1 = 2;		
		
		switch (num1) {
		case 1: {
			
			System.out.println("Lunes");
		}
		break;
		case 2: {
			
			System.out.println("Martes");
		}
		break;
		case 3: {
			
			System.out.println("Miercoles");
		}
		break;
		default:
			System.out.println("no valido");
		}
		
		
		
	}//fin del main

}//fin de la clase
