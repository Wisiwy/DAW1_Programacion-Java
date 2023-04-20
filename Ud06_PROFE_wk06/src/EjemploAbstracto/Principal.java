package EjemploAbstracto;

public class Principal {
	
	public static void main(String[] args) {
		
		//1.	Instancia un vector para 6 Figuras (2 objetos de cada tipo)
		
		Figura[] f = new Figura[6];
		
		f[0] = new Cuadrado("Rojo",2.2);
		f[1] = new Cuadrado("Azul",2.3);
		f[2] = new Triangulo("Amarillo",4.1,5.2);
		f[3] = new Triangulo("Negro",5.2,8.3);
		f[4] = new Circulo("Blanco",3.3);
		f[5] = new Circulo("Marron",5.5);
	
		
		
		
		
		//2.	Recorre el vector imprimiendo el area de cada uno.
		
		
		for (int i = 0; i < f.length; i++) {
			System.out.printf("%.2f\n",f[i].area());
		}
		
		
		//3.	Recorre el vector reconociendo la instancia de cada tipo. (instanceof)
		
		for (int i = 0; i < f.length; i++) {
			if(f[i] instanceof Cuadrado) {
				System.out.printf("Cuadrado: %.2f\n",f[i].area());
			} else if(f[i] instanceof Triangulo) {
				System.out.printf("Triangulo: %.2f\n",f[i].area());
			}else if(f[i] instanceof Circulo) {
				System.out.printf("Circulo: %.2f\n",f[i].area());
			}
			
			
			
			
		}
		
		

	}

}
