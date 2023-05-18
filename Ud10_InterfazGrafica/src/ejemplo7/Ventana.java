package ejemplo7;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame {

    JPanel contenedor;
    JButton boton;
    JLabel etiqueta;

    public Ventana() {
        this.setTitle("Ventana grid");
        this.setSize(500, 400);
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Utilizo todo el fondo del JFrame
        contenedor = (JPanel) this.getContentPane();
        //Inicializo un layout con 2 filas y 3 columnas
        contenedor.setLayout(new GridLayout(2,3));

        //Voy añadiendo botones uno detrás de otro
        contenedor.add(new JButton("Botón 1"));
        contenedor.add(new JButton("Botón 2"));
        contenedor.add(new JButton("Botón 3"));
        contenedor.add(new JButton("Botón 4"));
        contenedor.add(new JButton("Botón 5"));
        
    }
    
}
