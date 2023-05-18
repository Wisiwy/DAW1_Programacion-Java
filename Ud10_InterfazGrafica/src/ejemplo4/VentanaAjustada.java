package ejemplo4;

import java.awt.Container;

import javax.swing.*;

public class VentanaAjustada {

	public static void main(String[] args) {
		JFrame ventana=new JFrame("Prueba");
		 ventana.setLocation(100,100);
		 Container c=ventana.getContentPane();
		 c.add(new JLabel("Hola"));
		 ventana.pack();
		 ventana.setVisible(true); 
	}//main

}
