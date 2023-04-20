
public class Ej_04 {

	static int[] vector = {2,3,4,5,6,7};
	
	public static void main(String[] args) {
		
		int buscar = 5;
		
		int pos = posVector(buscar, 0); 
		if(pos == -1)
			System.out.printf("El número: %d no se encuentra disponible.",buscar);
		else
			System.out.printf("El número: %d está en la pos: %d",buscar,pos);
	
	}
	
	
	public static int posVector(int patron, int pos) {
		
		if( pos == vector.length || patron == vector[pos]) {
			
			if(pos == vector.length)
				return -1;
			else
				return pos;
		}else {
			
			return posVector(patron,pos+1);
		}
	}
}
