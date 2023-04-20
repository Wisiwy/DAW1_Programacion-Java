package h2_ejer01;

public class ejer01_Main {
public static void main(String[] args) {
	
	
	Pila p = new Pila();
	System.out.println("Elementos: " +p.numElementos());
	
	p.apilarCima(12);
	p.apilarCima(23);
	p.apilarCima(51);
	p.apilarCima(12);
	

	p.visualiza();
	p.desapilarCima();
	p.visualiza();

	
	p.desapilarCima();
	
	p.apilarCima(4);
	p.visualiza();
}
}
