package ejemplo3;


import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class VentanaJPanel extends JFrame {
	//Declaro el panel (donde pondré los objetos: botones, etiquetas....)
	JPanel contenedor;
	//Declaro una etiqueta de texto.  La declaro como atributo de la ventana
	//De esta manera la podremos utilizar en diferentes métodos
	JLabel texto;
	
	public VentanaJPanel() {
		//Creo la ventana. Le pongo titulo y la configuro
		this.setTitle("Ventana nueva");
		this.setSize(300, 400);

		//es muy común utilizar este método para cargar todos los objetos 
		//en la ventana.
		initComponents();   
	}

	private void initComponents() {
		//Utilizo todo el fondo del JFrame
		contenedor=(JPanel) this.getContentPane();
		//Inicializo el texto que tendrá la etiqueta
		texto=new JLabel();
		texto.setText("\t\t Hola mundo");
		//lo coloreo
		contenedor.setBackground(Color.green);
		//añado al contenedor el texto
		contenedor.add(texto);
	}
}


