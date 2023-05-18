package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ControlDB;
import modelo.Libro;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VenAcceptLibro extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 * @param control 
	 */
	public VenAcceptLibro(Libro libro) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 542);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNuevoLibro_1 = new JLabel("Libro Insertado");
		lblNuevoLibro_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNuevoLibro_1.setForeground(new Color(102, 0, 0));
		lblNuevoLibro_1.setFont(new Font("Caladea", Font.BOLD | Font.ITALIC, 24));
		lblNuevoLibro_1.setBounds(29, 0, 202, 49);
		contentPane.add(lblNuevoLibro_1);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);

				
			}
		});
		btnAceptar.setBounds(147, 445, 142, 41);
		contentPane.add(btnAceptar);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(25, 42, 386, 377);
		System.out.println(libro);
		textArea.setText(libro.toString());
		contentPane.add(textArea);
	}
}
