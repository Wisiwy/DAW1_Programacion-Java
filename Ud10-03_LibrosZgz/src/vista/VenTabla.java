package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import controlador.ControlDB;

import javax.swing.JLabel;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.sound.sampled.Control;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VenTabla extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JButton btnVerTablas;
	/**
	 * Create the frame.
	 * @param conn 
	 */
	public VenTabla(final ControlDB control) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1084, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCabTit = new JLabel("Biblioteca Casa ZGZ V0.1");
		lblCabTit.setHorizontalAlignment(SwingConstants.LEFT);
		lblCabTit.setForeground(new Color(102, 0, 0));
		lblCabTit.setFont(new Font("Caladea", Font.BOLD | Font.ITALIC, 24));
		lblCabTit.setBounds(22, 0, 234, 55);
		contentPane.add(lblCabTit);
		
		table = new JTable();
		contentPane.add(new JScrollPane(table), BorderLayout.CENTER);

		contentPane.add(table);
		table.setBounds(0, 0, -3, 0);
		
		JLabel lblCabePath = null;
		lblCabePath = new JLabel("Bd:<br> " +control.toString());
		lblCabePath.setHorizontalAlignment(SwingConstants.LEFT);
		lblCabePath.setForeground(new Color(102, 0, 0));
		lblCabePath.setFont(new Font("Caladea", Font.BOLD | Font.ITALIC, 10));
		lblCabePath.setBounds(700, 0, 234, 55);
		contentPane.add(lblCabePath);
		
		btnVerTablas = new JButton("Ver Libros");
		btnVerTablas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultSet rs;
				try {
					rs = control.selectTableRS("libros");
					
					table.setModel(control.buildTableModel(rs));
					System.out.println("entra rs despues de seteo");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}
		});
		btnVerTablas.setBounds(43, 493, 150, 46);
		contentPane.add(btnVerTablas);
	}
}
