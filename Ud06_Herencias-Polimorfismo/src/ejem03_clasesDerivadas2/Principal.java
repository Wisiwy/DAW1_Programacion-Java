package ejem03_clasesDerivadas2;

public class Principal {
//Usamos esta clase para visuallizar como se crean los constructores de las clases.
	public static void main(String[] args) {
		//Por jerarquia siempre se construye al padre y lueog al hijo.
		Base b = new Base();
		System.out.println();
		Deriva1 d1 = new Deriva1();
		System.out.println();
		Deriva2 d2 = new Deriva2();
		System.out.println();
		Deriva3 d3 = new Deriva3();
	}

}
