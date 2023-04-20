package h2_tarde;

public class Principal_pila {
	
	public static void main(String[] args) throws InterruptedException {
		
		Pila p = new Pila();
		
		System.out.println("Elementos: "+p.numElem());
		
		p.apilar(3);System.out.println("Apilo: "+p.cima());Thread.sleep(1000);
		p.apilar(6);System.out.println("Apilo: "+p.cima());Thread.sleep(1000);
		p.apilar(9);System.out.println("Apilo: "+p.cima());Thread.sleep(1000);
		p.apilar(12);System.out.println("Apilo: "+p.cima());Thread.sleep(1000);
		
		p.visualiza();
		Thread.sleep(3000);
		System.out.println("---Desapilo: "+p.desapilar());Thread.sleep(1000);
		p.visualiza();
		Thread.sleep(3000);
		System.out.println("---Desapilo: "+p.desapilar());Thread.sleep(1000);
		System.out.println("---Desapilo: "+p.desapilar());Thread.sleep(1000);
		p.visualiza();
		Thread.sleep(3000);
		p.apilar(4);System.out.println("Apilo: "+p.cima());Thread.sleep(1000);
		p.apilar(8);System.out.println("Apilo: "+p.cima());Thread.sleep(1000);
		p.visualiza();
	}

}
