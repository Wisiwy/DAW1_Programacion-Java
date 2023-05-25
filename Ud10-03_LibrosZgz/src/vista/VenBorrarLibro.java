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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;

public class VenBorrarLibro extends JFrame {

	private JPanel contentPane;
	

	/**
	 * Create the frame.
	 * @param control 
	 */
	public VenBorrarLibro( ControlDB control,  Integer idLibro) {
		
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 542);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBorrarLib = new JLabel("¿Estas seguro que quieres borrar este libro?");
		lblBorrarLib.setHorizontalAlignment(SwingConstants.CENTER);
		lblBorrarLib.setForeground(new Color(102, 0, 0));
		lblBorrarLib.setFont(new Font("Caladea", Font.BOLD | Font.ITALIC, 18));
		lblBorrarLib.setBounds(42, 0, 386, 49);
		contentPane.add(lblBorrarLib);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					control.borrarLibro(idLibro);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				setVisible(false);
			}
		});
		btnAceptar.setBounds(147, 445, 142, 41);
		contentPane.add(btnAceptar);
		
		
		//MOSTRAR INFO EN UN EDITOR PANEL
		String infoLib = null;
		try {
			ResultSet rs = control.personalizeQueary("SELECT * FROM libros WHERE id = "+idLibro);
			infoLib = control.pintaRS(rs);
				
		
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		JEditorPane editorPanel = new JEditorPane();
		editorPanel.setContentType("text/html");
		editorPanel.setText(infoLib);
		editorPanel.setBounds(33, 41, 361, 378);
		contentPane.add(editorPanel);
	}
}
