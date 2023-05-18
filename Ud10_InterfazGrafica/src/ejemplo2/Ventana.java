package ejemplo2;

import javax.swing.JFrame;

public class Ventana extends JFrame {
    
    //En el constructor le damos título y tamaño.
    public Ventana() {
        this.setTitle("Ventana del Ejemplo 2");
        this.setSize(400, 400);
    }
    
    public Ventana(String titulo){
        super(titulo);
    }
   
}