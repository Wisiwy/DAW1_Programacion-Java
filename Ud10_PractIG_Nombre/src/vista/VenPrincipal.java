package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ManejaDB;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VenPrincipal extends JFrame {

	private JPanel contentPane;
	static ManejaDB maneja;
	
//TEORIOA
	//Botones
		//Añadir evento - brndrch/Add event handler al boton
			//Cuando se pierde el foco al salir del cursor se valide que tenga
			//la REGEX adecuada
	//Ventantas
		//Nombrar ventantas
	//al accionar un boton que la ventanta que queramos se abra. 
	//cudidado entre jFrame(la ventana) y JPanel (mirar en jFrame el Hide on Close
	//absoluteLayour. Añadir a la ventana. 
		
	
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				
				
				try {
//					VenPrincipal frame = new VenPrincipal(maneja);
//					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VenPrincipal(ManejaDB maneja) {
		
		setForeground(new Color(0, 128, 192));
		setTitle("nombre BD");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 635, 432);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBienvenida = new JLabel("¡Bienvenido!");
		lblBienvenida.setFont(new Font("Magneto", Font.PLAIN, 60));
		lblBienvenida.setBounds(75, 39, 470, 152);
		contentPane.add(lblBienvenida);
		
		JLabel lblBaseDeDatos = new JLabel("Base de Datos \"\""
				+ "Conexion establecida");
		lblBaseDeDatos.setForeground(new Color(192, 192, 192));
		lblBaseDeDatos.setFont(new Font("Magneto", Font.PLAIN, 25));
		lblBaseDeDatos.setBounds(85, 141, 345, 96);
		contentPane.add(lblBaseDeDatos);
		
		JLabel lblquQuieresHacer = new JLabel("¿Qué quieres hacer?");
		lblquQuieresHacer.setFont(new Font("Monospaced", Font.PLAIN, 18));
		lblquQuieresHacer.setBounds(215, 229, 218, 56);
		contentPane.add(lblquQuieresHacer);
		
		JButton btnNewButton = new JButton("Intro registro");
		btnNewButton.setBounds(376, 298, 133, 56);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Ver tablas");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VenTablas frameTablas = new VenTablas(maneja);
				frameTablas.setVisible(true);
				
				
				
			}
		});
		btnNewButton_1.setBounds(140, 298, 133, 56);
		contentPane.add(btnNewButton_1);
		
		
		
	
	}
}
