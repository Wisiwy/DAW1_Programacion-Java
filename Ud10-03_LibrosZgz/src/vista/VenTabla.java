package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

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
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.Box;

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
	public VenTabla( ControlDB control) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1084, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		// CABECERA TITULO
		JLabel lblCabTit = new JLabel("Biblioteca Casa ZGZ v0.1");
		lblCabTit.setBounds(22, 0, 299, 55);
		lblCabTit.setHorizontalAlignment(SwingConstants.LEFT);
		lblCabTit.setForeground(new Color(102, 0, 0));
		lblCabTit.setFont(new Font("Caladea", Font.BOLD | Font.ITALIC, 24));
		contentPane.add(lblCabTit);

		// CABECERA UBICACION ARCHIVO
		JLabel lblCabePath_1 = new JLabel();
		try {
			lblCabePath_1.setText(control.DBname());
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		lblCabePath_1.setBounds(466, 0, 606, 55);
		lblCabePath_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCabePath_1.setForeground(new Color(102, 0, 0));
		lblCabePath_1.setFont(new Font("Caladea", Font.BOLD | Font.ITALIC, 10));
		contentPane.add(lblCabePath_1);

		// PANEL BOTONES
		panelBtns = new JPanel();
		panelBtns.setBounds(41, 511, 378, 158);
		contentPane.add(panelBtns);
		panelBtns.setLayout(null);

		// BOTON VER LIBROS
		btnVerTablas = new JButton("Ver Libros");
		btnVerTablas.setBounds(0, 0, 150, 46);
		panelBtns.add(btnVerTablas);

		btnVerTablas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultSet rs;
				try {
					rs = control.selectTableRS("libros");
					tableVisualizacion.setModel(control.buildTableModel(rs));
					System.out.println("BtnVerLibros: Entra en RS del queary");
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
		txtBuscaAutor.setBounds(12, 105, 194, 31);
		panelBuscador.add(txtBuscaAutor);

		JLabel lblBusAutori = new JLabel("Por autor");
		lblBusAutori.setBounds(12, 80, 70, 15);
		panelBuscador.add(lblBusAutori);

		final JLabel lblError = new JLabel();
		lblError.setVisible(false);
		lblError.setForeground(new Color(192, 28, 40));
		lblError.setBounds(172, 161, 278, 15);
		panelBuscador.add(lblError);

		JButton btnBuscarLib = new JButton("Buscar");
		btnBuscarLib.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblError.setVisible(false);
				if (!txtBuscaTitulo.getText().isEmpty()) {
					try {
						ResultSet rsAux = control.personalizeQueary("SELECT * FROM libros WHERE LOWER(titulo) LIKE ('%"
								+ txtBuscaTitulo.getText().toLowerCase() + "%');");
						System.out.println("Buscqueda por titulo: " + txtBuscaTitulo.getText());
						tableVisualizacion.setModel(control.buildTableModel(rsAux));
					} catch (SQLException e1) {
						System.out.println("Se mete en catch");
						e1.printStackTrace();
					}
				} else if (!txtBuscaAutor.getText().isEmpty()) {
					try {

						ResultSet rsAux2 = control.personalizeQueary("SELECT * FROM libros WHERE LOWER(autor) LIKE ('%"
								+ txtBuscaAutor.getText().toLowerCase() + "%');");
						tableVisualizacion.setModel(control.buildTableModel(rsAux2));
						System.out.println("Buscqueda por titulo: " + txtBuscaAutor.getText());

					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} else {
					lblError.setText("Introduzca titulo o autor a encontrar.");
					lblError.setVisible(true);

				}

			}
		});
		btnBuscarLib.setBounds(12, 148, 142, 41);
		panelBuscador.add(btnBuscarLib);

		// ACTUALIZAR LIBRO

		JButton btnUpdateLibro = new JButton("Actualizar Libro");
		btnUpdateLibro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblError.setVisible(false);

				if (tableVisualizacion.getSelectedRow() != -1) {
					// recoge la fila selecionada
					Integer row = tableVisualizacion.getSelectedRow();
					System.out.println(tableVisualizacion.getValueAt(row, 0));
					Integer idLib = Integer.parseInt(tableVisualizacion.getValueAt(row, 0).toString());
					System.out.println("Fila selecionada: " + tableVisualizacion.getSelectedRow());
					VenUpdateLibro updateLib = new VenUpdateLibro(control, idLib);
					updateLib.setVisible(true);
				} else {
					lblError.setText("Seleccion fila en la tabla. ");
					lblError.setVisible(true);

				}
			}
		});
		btnUpdateLibro.setBounds(185, 93, 150, 46);
		panelBtns.add(btnUpdateLibro);

		// BORRAR LIBRO

		btnBorrarLibro = new JButton("Borrar Libro");
		btnBorrarLibro.setBounds(0, 93, 150, 46);
		panelBtns.add(btnBorrarLibro);

		btnBorrarLibro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblError.setVisible(false);

				if (tableVisualizacion.getSelectedRow() != -1) {

					// recoge la fila selecionada
					Integer row = tableVisualizacion.getSelectedRow();
					System.out.println(tableVisualizacion.getValueAt(row, 0));
					Integer idLib = Integer.parseInt(tableVisualizacion.getValueAt(row, 0).toString());
					System.out.println("Fila selecionada: " + tableVisualizacion.getSelectedRow());
					VenBorrarLibro borraLib = new VenBorrarLibro(control, idLib);
					borraLib.setVisible(true);
				} else {
					lblError.setText("Seleccion fila en la tabla. ");
					lblError.setVisible(true);
				}
			}
		});

		// INSERTAR LIBRO
		JButton btnNuevoLib = new JButton("Nuevo Libro");
		btnNuevoLib.setBounds(185, 0, 150, 46);
		panelBtns.add(btnNuevoLib);

		btnNuevoLib.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VenInsertLibro frame = new VenInsertLibro(control);
				frame.setVisible(true);
			}
		});

		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(466, 493, 1, 217);
		contentPane.add(separator);

		final JButton btnSaveAsTxt = new JButton("Guardar Txt");
		btnSaveAsTxt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblError.setVisible(false);

				File f;
				try {
					// elegir el archivo
					JFileChooser fCho = new JFileChooser();
					int result = fCho.showSaveDialog(btnSaveAsTxt);
					if (result == JFileChooser.APPROVE_OPTION) {
						System.out.println("Archivo selecionado bien");
						f = fCho.getSelectedFile();
						// escribir el fichero con el table mode
						control.escribirTableModel(tableVisualizacion.getModel(), f);
						lblError.setText("Archivo guardado correctamente");
						lblError.setVisible(true);


					} else if (result == JFileChooser.CANCEL_OPTION)
						System.out.println("Guardado cancelado");

					// comprobar si existe desde la clase Ficheros

					// escribir el fichero con el table mode

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnSaveAsTxt.setBounds(358, 27, 142, 41);
		panelBuscador.add(btnSaveAsTxt);

		JButton btnSaveAsXml = new JButton("Guardar Xml");
		btnSaveAsXml.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblError.setVisible(false);

				File f;
				// elegir el archivo
				JFileChooser fCho = new JFileChooser();
				int result = fCho.showSaveDialog(btnSaveAsTxt);
				if (result == JFileChooser.APPROVE_OPTION) {
					System.out.println("Archivo selecionado bien");
					f = fCho.getSelectedFile();
					// escribir el fichero XML con el table mode
					try {
						control.escribirXMLTableModel(tableVisualizacion.getModel(), f);
					} catch (ParserConfigurationException | TransformerException e1) {
						e1.printStackTrace();
					}
					lblError.setText("Archivo guardado correctamente");
					lblError.setVisible(true);


				} else if (result == JFileChooser.CANCEL_OPTION)
					System.out.println("Guardado cancelado");
				

			}
		});
		btnSaveAsXml.setBounds(358, 95, 142, 41);
		panelBuscador.add(btnSaveAsXml);

	}
}
