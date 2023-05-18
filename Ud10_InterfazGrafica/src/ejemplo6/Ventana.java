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
        //Inicializo el botón y la etiqueta:
        boton=new JButton("Botón");
        etiqueta=new JLabel("Etiqueta");
        //Añado el botón y la etiqueta
        //contenedor.add(boton, BorderLayout.CENTER);
        //contenedor.add(boton, BorderLayout.EAST); 
        contenedor.add(boton, BorderLayout.WEST); 
        //contenedor.add(boton,  BorderLayout.NORTH); 
        contenedor.add(etiqueta, BorderLayout.SOUTH);
    }//initComponents
}
