package ejemplo1;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo1_b {

	public static void main(String[] args) {
		
		JFrame ventana=new JFrame("Prueba");
		ventana.setLocation(100,100);
		Container c=ventana.getContentPane();
		c.add(new JLabel("Hola"));
		ventana.pack();
		ventana.setVisible(true);
	}

}
