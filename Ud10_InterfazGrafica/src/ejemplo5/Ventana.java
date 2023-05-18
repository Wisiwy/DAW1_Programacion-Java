package ejemplo5;

import java.awt.*;

import javax.swing.*;

public class Ventana extends JFrame {

    //Declaro el panel (donde pondré los objetos)

    JPanel contenedor;
    //Declaro una etiqueta de etiquetas.  La declaro como atributo de la ventana
    //De esta manera la podremos utilizar en diferentes métodos
    //Nota:  Creamos un array de JLabel
    JLabel[] etiquetas;
    
    public Ventana() {
        //inicializo el array
        etiquetas = new JLabel[11];
        //Creo la ventana. Le pongo titulo y la configuro
        this.setTitle("Ventana nueva");
        this.setSize(400, 300);
        // es muy común utilizar este método para cargar todos los objetos
        //en la ventana.
        initComponents();
    }
    
    private void initComponents() {
        //Utilizo todo el fondo del JFrame
        contenedor = (JPanel) this.getContentPane();
        //Inicializo un layout
        contenedor.setLayout(new FlowLayout());
        
        //Inicializo el etiquetas de las etiquetas y las voy añadiendo al contenedor
       
        for (int i = 0; i < etiquetas.length; i++) {
            etiquetas[i] = new JLabel("Etiqueta " + i);
            contenedor.add(etiquetas[i]);
        }
    }//initComponents
}