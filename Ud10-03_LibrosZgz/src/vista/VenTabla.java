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
import javax.swing.JScrollBar;

public class VenTabla extends JFrame {

	private JPanel contentPane;
	private JButton btnVerTablas;
	private JLabel lblCabePath_1;
	private JTable tableVisualizacion;
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
		
		//CABECERA TITULO
		JLabel lblCabTit = new JLabel("Biblioteca Casa ZGZ V0.1");
		lblCabTit.setBounds(22, 0, 234, 55);
		lblCabTit.setHorizontalAlignment(SwingConstants.LEFT);
		lblCabTit.setForeground(new Color(102, 0, 0));
		lblCabTit.setFont(new Font("Caladea", Font.BOLD | Font.ITALIC, 24));
		contentPane.add(lblCabTit);
		
		JLabel lblCabePath = null;
		
		
		//CABECERA UBICACION ARCHIVO
		try {
			lblCabePath_1 = new JLabel("Bd:<br> " +control.DBname());
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		lblCabePath_1.setBounds(700, 0, 372, 55);
		lblCabePath_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCabePath_1.setForeground(new Color(102, 0, 0));
		lblCabePath_1.setFont(new Font("Caladea", Font.BOLD | Font.ITALIC, 10));
		contentPane.add(lblCabePath_1);
		
		//BOTON VER TABLAS
		btnVerTablas = new JButton("Ver Libros");
		btnVerTablas.setBounds(43, 493, 150, 46);
		btnVerTablas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultSet rs;
				try {
					rs = control.selectTableRS("libros");
					
					tableVisualizacion.setModel(control.buildTableModel(rs));
					System.out.println("entra rs despues de seteo");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}
		});
		contentPane.add(btnVerTablas);
		
		JButton btnNuevoLib = new JButton("Nuevo Libro");
		btnNuevoLib.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VenInsertLibro frame = new VenInsertLibro(control);
				frame.setVisible(true);
			}
		});
		btnNuevoLib.setBounds(244, 492, 150, 46);
		contentPane.add(btnNuevoLib);
		
		JScrollPane scrollVisualizacion = new JScrollPane();
		scrollVisualizacion.setBounds(22, 47, 1035, 433);
		contentPane.add(scrollVisualizacion);
		
		tableVisualizacion = new JTable();
		scrollVisualizacion.setViewportView(tableVisualizacion);
	}
}
