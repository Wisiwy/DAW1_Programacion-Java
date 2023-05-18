package ejemplo2;

public class Principal2 {

	public static void main(String[] args) {
		//Obtendremos dos ventanas
		
		Ventana v = new Ventana(); //Obtenemos la ventana por defecto, ventana de Irene
        v.setVisible(true);
        
        Ventana v1 = new Ventana("Otra ventanita"); //hacemos uso del constructor sobrecargado
        v1.setSize(200, 100);
        v1.setLocation(500, 300);
        v1.setVisible(true);
        //v1.setBounds(500,300,400,100);
	}//main

}
