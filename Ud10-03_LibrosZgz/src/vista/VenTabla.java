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
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class VenTabla extends JFrame {

	private JPanel contentPane;
	private JButton btnVerTablas;
	private JLabel lblCabePath_1;
	private JTable tableVisualizacion;
	private JButton btnBorrarLibro;
	private JPanel panelBtns;
	private JTextField txtBuscaTitulo;
	private JTextField txtBuscaAutor;

	/**
	 * Create the frame.
	 * 
	 * @param conn
	 */
	public VenTabla(final ControlDB control) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1084, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		// CABECERA TITULO
		JLabel lblCabTit = new JLabel("Biblioteca Casa ZGZ V0.1");
		lblCabTit.setBounds(22, 0, 234, 55);
		lblCabTit.setHorizontalAlignment(SwingConstants.LEFT);
		lblCabTit.setForeground(new Color(102, 0, 0));
		lblCabTit.setFont(new Font("Caladea", Font.BOLD | Font.ITALIC, 24));
		contentPane.add(lblCabTit);

		JLabel lblCabePath = null;

		// CABECERA UBICACION ARCHIVO
		try {
			lblCabePath_1 = new JLabel("Bd:<br> " + control.DBname());
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
		panelBtns.setBounds(43, 493, 378, 158);
		contentPane.add(panelBtns);
		panelBtns.setLayout(null);

		// BOTON VER TABLAS
		btnVerTablas = new JButton("Ver Libros");
		btnVerTablas.setBounds(0, 0, 150, 46);
		panelBtns.add(btnVerTablas);

		JButton btnNuevoLib = new JButton("Nuevo Libro");
		btnNuevoLib.setBounds(185, 0, 150, 46);
		panelBtns.add(btnNuevoLib);

		btnBorrarLibro = new JButton("Borrar Libro");
		btnBorrarLibro.setBounds(0, 93, 150, 46);
		panelBtns.add(btnBorrarLibro);

		
		//ACTUALIZAR LIBRO
		JButton btnUpdateLibro = new JButton("Actualizar Libro");
		btnUpdateLibro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer idLib = tableVisualizacion.getSelectedRow() + 1;
				System.out.println("Fila selecionada: " + tableVisualizacion.getSelectedRow());
				VenUpdateLibro updateLib = new VenUpdateLibro(control, idLib);
				updateLib.setVisible(true);
				
				
			}
		});
		btnUpdateLibro.setBounds(185, 93, 150, 46);
		panelBtns.add(btnUpdateLibro);
		
		//BORRAR LIBRO
		btnBorrarLibro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer idLib = tableVisualizacion.getSelectedRow() + 1;
				System.out.println("Fila selecionada: " + tableVisualizacion.getSelectedRow());
				VenBorrarLibro borraLib = new VenBorrarLibro(control, idLib);
				borraLib.setVisible(true);

			}
		});
		
		//INSERTAR LIBRO
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

		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(466, 493, 1, 217);
		contentPane.add(separator);

		// BUSCADOR DE LIBROS
		JPanel panelBuscador = new JPanel();
		panelBuscador.setBounds(495, 493, 547, 201);
		contentPane.add(panelBuscador);
		panelBuscador.setLayout(null);

		JLabel lblPorTtulo = new JLabel("Por título");
		lblPorTtulo.setBounds(12, 12, 70, 15);
		panelBuscador.add(lblPorTtulo);

		txtBuscaTitulo = new JTextField();
		txtBuscaTitulo.setBounds(12, 37, 194, 31);
		panelBuscador.add(txtBuscaTitulo);
		txtBuscaTitulo.setColumns(10);

		txtBuscaAutor = new JTextField();
		txtBuscaAutor.setColumns(10);
		txtBuscaAutor.setBounds(262, 37, 194, 31);
		panelBuscador.add(txtBuscaAutor);

		JLabel lblBusAutori = new JLabel("Por autor");
		lblBusAutori.setBounds(262, 12, 70, 15);
		panelBuscador.add(lblBusAutori);

		final JLabel lblError = new JLabel("Introduzca titulo o autor a encontrar.");
		lblError.setVisible(false);
		lblError.setForeground(new Color(192, 28, 40));
		lblError.setBounds(178, 157, 278, 15);
		panelBuscador.add(lblError);

		JButton btnBuscarLib = new JButton("Buscar");
		btnBuscarLib.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (!txtBuscaTitulo.getText().isEmpty()) {
					try {
						ResultSet rsAux = control.personalizeQueary(
								"SELECT * FROM libros WHERE titulo LIKE ('" + txtBuscaTitulo.getText() + "');");
						System.out.println("Buscqueda por titulo: " + txtBuscaTitulo.getText());
						tableVisualizacion.setModel(control.buildTableModel(rsAux));
					} catch (SQLException e1) {
						System.out.println("Se mete en catch");
						e1.printStackTrace();
					}
				} else if (!txtBuscaAutor.getText().isEmpty()) {
					try {
						ResultSet rsAux2 = control.personalizeQueary(
								"SELECT * FROM libros WHERE autor LIKE ('" + txtBuscaAutor.getText() + "');");
						tableVisualizacion.setModel(control.buildTableModel(rsAux2));

					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} else {
					lblError.setVisible(true);

				}

			}
		});
		btnBuscarLib.setBounds(12, 148, 142, 41);
		panelBuscador.add(btnBuscarLib);

	}
}
