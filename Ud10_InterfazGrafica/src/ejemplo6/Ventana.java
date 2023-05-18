package ejemplo6;

import javax.swing.*;
import java.awt.*;
    
public class Ventana extends JFrame {
    JPanel contenedor;
    JButton boton;
    JLabel etiqueta;
    
    public Ventana() {
        this.setTitle("Ventanuca");
        this.setSize(400, 400);
        initComponents();   
    }
    
    private void initComponents() {
        //Utilizo todo el fondo del JFrame
        contenedor=(JPanel) this.getContentPane();
        //Inicializo un layout
        contenedor.setLayout(new BorderLayout(5, 10));
        //Inicializo el bot�n y la etiqueta:
        boton=new JButton("Bot�n");
        etiqueta=new JLabel("Etiqueta");
        //A�ado el bot�n y la etiqueta
        //contenedor.add(boton, BorderLayout.CENTER);
        //contenedor.add(boton, BorderLayout.EAST); 
        contenedor.add(boton, BorderLayout.WEST); 
        //contenedor.add(boton,  BorderLayout.NORTH); 
        contenedor.add(etiqueta, BorderLayout.SOUTH);
    }//initComponents
}
