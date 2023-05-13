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
	private JButton btnBorrarLibro;
	private JPanel panelBtns;
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
		
		panelBtns = new JPanel();
		panelBtns.setBounds(43, 493, 539, 46);
		contentPane.add(panelBtns);
		panelBtns.setLayout(null);
		
		//BOTON VER TABLAS
		btnVerTablas = new JButton("Ver Libros");
		btnVerTablas.setBounds(0, 0, 150, 46);
		panelBtns.add(btnVerTablas);
		
		JButton btnNuevoLib = new JButton("Nuevo Libro");
		btnNuevoLib.setBounds(185, 0, 150, 46);
		panelBtns.add(btnNuevoLib);
		
		btnBorrarLibro = new JButton("Borrar Libro");
		btnBorrarLibro.setBounds(389, 0, 150, 46);
		panelBtns.add(btnBorrarLibro);
		btnBorrarLibro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer idLib = tableVisualizacion.getSelectedRow() + 1;
				System.out.println("Fila selecionada: " + tableVisualizacion.getSelectedRow());
				VenBorrarLibro borraLib = new VenBorrarLibro(control,idLib);
				borraLib.setVisible(true);
				
				
			}
		});
		btnNuevoLib.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VenInsertLibro frame = new VenInsertLibro(control);
				frame.setVisible(true);
			}
		});
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
		
		JScrollPane scrollVisualizacion = new JScrollPane();
		scrollVisualizacion.setBounds(22, 47, 1035, 433);
		contentPane.add(scrollVisualizacion);
		
		tableVisualizacion = new JTable();
		scrollVisualizacion.setViewportView(tableVisualizacion);
	}
}
