package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ManejaDB;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class VenTablas extends JFrame {

	private JPanel contentPane;
	private JTextField txtVer;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					VenTablas frame = new VenTablas();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 * @param maneja 
	 */
	public VenTablas(ManejaDB maneja) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 686, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.setBounds(36, 343, 171, 79);
		contentPane.add(btnNewButton);
		
		JButton btnVerTabla = new JButton("Ver tabla");
		btnVerTabla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
				txtVer.setText(maneja.verSelect("SELECT * FROM agenda"));
				
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnVerTabla.setBounds(409, 343, 171, 79);
		contentPane.add(btnVerTabla);
		
		txtVer = new JTextField();
		txtVer.setBounds(0, 11, 660, 323);
		contentPane.add(txtVer);
		txtVer.setColumns(10);
	}
}
