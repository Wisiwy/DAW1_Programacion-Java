package Estaticos;

public class Ej_02 {
	
	public static void main(String[] args) {
		int p = 14;
		int q = 12;
		
		if(p > 0 && q > 0)
			if(Utilidad.numDiv(p) > Utilidad.numDiv(q))
				System.out.printf(" %d tiene mas divisores que %d \n",p,q);
			else if(Utilidad.numDiv(q) > Utilidad.numDiv(p))
				System.out.printf(" %d tiene mas divisores que %d \n",q,p);
			else
				System.out.printf(" %d tiene tantos divisores como %d \n",p,q);
		else
			System.err.println("los números deben ser positivos");
	}
	

}
