package ejemplo8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MiVentana extends JFrame implements ActionListener{
	JButton boton1;
	JPanel contenedor;
	//Constructor
	public MiVentana() {
		setSize(300,200);
		boton1=new JButton("Prueba");
		contenedor=new JPanel();
		contenedor=(JPanel) this.getContentPane();
		contenedor.add(boton1);
		//this.pack();
		boton1.addActionListener(this);//El botón lanza
		//eventos que son capturados por la ventana
		// para que la ventana se ponga a escuchar las acciones del botón
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("has pulsado el botón");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		boton1.removeActionListener(this);
	}

}
