package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import aUtilidad.Dibujo;
import controlador.ControlDB;
import modelo.Libro;

import javax.swing.JTextArea;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VenUpdateLibro extends JFrame {

	private JPanel contentPane;
	private JTextField titulo;
	private JTextField autor;
	private JTextField anyo;
	private JTextField editorial;
	private JTextField isbn;
	private JTextField paginas;
	private JTextField edad;
	private JTextField observaciones;
	private JTextField fechaAdquisicion;
	private JComboBox tematica;
	private JComboBox ubicacion;

	/**
	 * Create the frame.
	 * 
	 * @param control
	 * @param idLib
	 */
	// CONTROL Y AÑADIRLAS
	public VenUpdateLibro(final ControlDB control, final Integer idLib) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 722);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		// ACTUALIZAR LIBRO
		JButton btnUpdAcept = new JButton("Aceptar");
		btnUpdAcept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// recoger todos los textos
				try {
					System.out.println(titulo.getText());
					control.updateTabla(idLib, "libros", "titulo", titulo.getText());
					control.updateTabla(idLib, "libros", "autor", autor.getText());
					control.updateTabla(idLib, "libros", "anyo", anyo.getText());
					control.updateTabla(idLib, "libros", "tematica", (String) tematica.getSelectedItem());
					control.updateTabla(idLib, "libros", "ubicacion", (String) ubicacion.getSelectedItem());
					control.updateTabla(idLib, "libros", "editorial", editorial.getText());
					control.updateTabla(idLib, "libros", "isbn", isbn.getText());
					control.updateTabla(idLib, "libros", "paginas", paginas.getText());
					control.updateTabla(idLib, "libros", "edad", edad.getText());
					control.updateTabla(idLib, "libros", "observaciones", observaciones.getText());
					control.updateTabla(idLib, "libros", "fechaAdquisicion", fechaAdquisicion.getText());
					
					setVisible(false);
					

					
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}

				// controlar que si esta vacio setear espacio en un libro o 0 en numeros

				// ventana actualizar Libro
//				try {
//					VenUpdateLibro venUpdateLib = new VenUpdateLibro(strList);
//					venUpdateLib.setVisible(true);
//
//				} catch (SQLException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}

			}
		});
		btnUpdAcept.setBounds(35, 620, 124, 49);
		contentPane.add(btnUpdAcept);

		JButton btnInsCancel = new JButton("Cancelar");
		btnInsCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				setVisible(false);
			}
		});
		btnInsCancel.setBounds(266, 620, 124, 49);
		contentPane.add(btnInsCancel);

		JLabel lblUpdateLibro = new JLabel("Actualizar libro");
		lblUpdateLibro.setHorizontalAlignment(SwingConstants.CENTER);
		lblUpdateLibro.setForeground(new Color(102, 0, 0));
		lblUpdateLibro.setFont(new Font("Caladea", Font.BOLD | Font.ITALIC, 24));
		lblUpdateLibro.setBounds(148, -13, 223, 49);
		contentPane.add(lblUpdateLibro);

		JPanel panelFormLibro = new JPanel();
		panelFormLibro.setBorder(new TitledBorder(null, "Libro", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelFormLibro.setBounds(12, 28, 501, 580);
		contentPane.add(panelFormLibro);
		panelFormLibro.setLayout(null);

		JPanel panelTituloo = new JPanel();
		panelTituloo.setBounds(5, 12, 353, 31);
		panelFormLibro.add(panelTituloo);
		panelTituloo.setLayout(null);

		JLabel lblTitulo = new JLabel("Titulo");
		lblTitulo.setBounds(12, 8, 70, 15);
		panelTituloo.add(lblTitulo);

		titulo = new JTextField();
		titulo.setToolTipText("Ej. Cien años de soledad");
		titulo.setBounds(99, 0, 227, 31);
		panelTituloo.add(titulo);
		titulo.setColumns(10);

		JPanel panelAutor = new JPanel();
		panelAutor.setBounds(5, 55, 353, 31);
		panelFormLibro.add(panelAutor);
		panelAutor.setLayout(null);

		JLabel lblAutor = new JLabel("Autor");
		lblAutor.setBounds(12, 8, 70, 15);
		panelAutor.add(lblAutor);

		autor = new JTextField();
		autor.setToolTipText("Ej. Gabriel García Marquez");
		autor.setColumns(10);
		autor.setBounds(99, 0, 227, 31);
		panelAutor.add(autor);

		JPanel panelAnyo = new JPanel();
		panelAnyo.setBounds(5, 98, 353, 31);
		panelFormLibro.add(panelAnyo);
		panelAnyo.setLayout(null);

		JLabel lblAnyo = new JLabel("Año");
		lblAnyo.setBounds(12, 8, 70, 15);
		panelAnyo.add(lblAnyo);

		anyo = new JTextField();
		anyo.setToolTipText("Ej.1975");
		anyo.setColumns(10);
		anyo.setBounds(99, 0, 227, 31);
		panelAnyo.add(anyo);

		// TEMATICA
		JPanel panelTematica = new JPanel();
		panelTematica.setBounds(5, 141, 492, 31);
		panelFormLibro.add(panelTematica);
		panelTematica.setLayout(null);

		JLabel lblTematica = new JLabel("Tematica");
		lblTematica.setBounds(12, 8, 70, 15);
		panelTematica.add(lblTematica);

		// combo Tematica
		tematica = new JComboBox();
		tematica.setEditable(true);
		tematica.setBounds(100, 2, 234, 28);
		panelTematica.add(tematica);

		try {
			ResultSet rs = control.selectColumnTable("tematica", "libros");
			while (rs.next()) {

				String item = rs.getString("tematica");
				tematica.addItem(item);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		JButton btnAgregarTema = new JButton("Agregar Tema");

		btnAgregarTema.setBounds(363, 3, 117, 25);
		panelTematica.add(btnAgregarTema);
		btnAgregarTema.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tematica.addItem(tematica.getEditor().getItem().toString());

			}
		});

		// EDITORIAL
		JPanel panelEditorial = new JPanel();
		panelEditorial.setBounds(5, 184, 353, 31);
		panelFormLibro.add(panelEditorial);
		panelEditorial.setLayout(null);

		JLabel lblEditorial = new JLabel("Editorial");
		lblEditorial.setBounds(12, 8, 70, 15);
		panelEditorial.add(lblEditorial);

		editorial = new JTextField();
		editorial.setToolTipText("Anaya");
		editorial.setColumns(10);
		editorial.setBounds(99, 0, 227, 31);
		panelEditorial.add(editorial);

		JPanel panelIsbn = new JPanel();
		panelIsbn.setBounds(5, 227, 353, 31);
		panelFormLibro.add(panelIsbn);
		panelIsbn.setLayout(null);

		JLabel lblIsbn = new JLabel("Isbn");
		lblIsbn.setBounds(12, 8, 70, 15);
		panelIsbn.add(lblIsbn);

		isbn = new JTextField();
		isbn.setToolTipText("8423344711");
		isbn.setColumns(10);
		isbn.setBounds(99, 0, 227, 31);
		panelIsbn.add(isbn);

		JPanel panelPag = new JPanel();
		panelPag.setBounds(5, 275, 353, 31);
		panelFormLibro.add(panelPag);
		panelPag.setLayout(null);

		JLabel lblPag = new JLabel("Páginas");
		lblPag.setBounds(12, 8, 70, 15);
		panelPag.add(lblPag);

		paginas = new JTextField();
		paginas.setToolTipText("214");
		paginas.setColumns(10);
		paginas.setBounds(99, 0, 227, 31);
		panelPag.add(paginas);

		JPanel panelEdad = new JPanel();
		panelEdad.setBounds(5, 313, 353, 31);
		panelFormLibro.add(panelEdad);
		panelEdad.setLayout(null);

		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(12, 8, 70, 15);
		panelEdad.add(lblEdad);

		edad = new JTextField();
		edad.setToolTipText("A partir de ...");
		edad.setColumns(10);
		edad.setBounds(99, 0, 227, 31);
		panelEdad.add(edad);

		// UBICACION
		JPanel panelUbicacion = new JPanel();
		panelUbicacion.setBounds(5, 356, 492, 31);
		panelFormLibro.add(panelUbicacion);
		panelUbicacion.setLayout(null);

		JLabel lblUbicacion = new JLabel("Ubicación");
		lblUbicacion.setBounds(12, 8, 70, 15);
		panelUbicacion.add(lblUbicacion);

		// ¿¿¿¿¿¿CUIDADO ES FINAL??????
		ubicacion = new JComboBox();
		ubicacion.setEditable(true);
		ubicacion.setBounds(100, 3, 237, 28);
		panelUbicacion.add(ubicacion);
		try {
			ResultSet rs = control.selectColumnTable("ubicacion", "libros");
			while (rs.next()) {
				String item = rs.getString("ubicacion");
				ubicacion.addItem(item);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		JButton btnAgregarUbi = new JButton("Agregar Ubi");
		btnAgregarUbi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ubicacion.addItem(ubicacion.getEditor().getItem().toString());

			}
		});
		btnAgregarUbi.setBounds(363, 3, 117, 25);
		panelUbicacion.add(btnAgregarUbi);

		// OBSERVACIONES
		JPanel panelObserva = new JPanel();
		panelObserva.setBounds(5, 442, 353, 121);
		panelFormLibro.add(panelObserva);
		panelObserva.setLayout(null);

		JLabel lblObserva = new JLabel("Observaciones");
		lblObserva.setBounds(12, 0, 105, 22);
		panelObserva.add(lblObserva);

		observaciones = new JTextField();
		observaciones.setToolTipText("Habitacion.");
		observaciones.setColumns(10);
		observaciones.setBounds(12, 26, 306, 83);
		panelObserva.add(observaciones);

		JPanel panelFechaAdq = new JPanel();
		panelFechaAdq.setLayout(null);
		panelFechaAdq.setBounds(5, 399, 353, 31);
		panelFormLibro.add(panelFechaAdq);

		JLabel lblFechaAdq = new JLabel("Fecha <br> Adquisicion");
		lblFechaAdq.setBounds(12, 8, 70, 15);
		panelFechaAdq.add(lblFechaAdq);

		fechaAdquisicion = new JTextField();
		fechaAdquisicion.setToolTipText("Habitacion.");
		fechaAdquisicion.setColumns(10);
		fechaAdquisicion.setBounds(99, 0, 227, 31);
		panelFechaAdq.add(fechaAdquisicion);

		// Recoger datos del libro a cambiar y mostralos en las cajas de txt
		try {
			ResultSet rsAntiguo;
			rsAntiguo = control.personalizeQueary("SELECT * FROM libros WHERE id = " + idLib);
			ResultSetMetaData rsmd = rsAntiguo.getMetaData();
			for (int i = 1; i <= rsmd.getColumnCount(); i++) {
				int key = i;
				switch (key) {
				case 1:
					break;
				case 2:
					titulo.setText(rsAntiguo.getString(i));

					break;
				case 3:
					autor.setText(rsAntiguo.getString(i));

					break;
				case 4:
					anyo.setText(rsAntiguo.getString(i));

					break;
				case 5:
					tematica.getEditor().setItem(rsAntiguo.getString(i));

					break;
				case 6:
					ubicacion.getEditor().setItem(rsAntiguo.getString(i));

					break;
				case 7:
					editorial.setText(rsAntiguo.getString(i));

					break;

				case 8:
					isbn.setText(rsAntiguo.getString(i));

					break;
				case 9:
					paginas.setText(rsAntiguo.getString(i));
					break;
				case 10:
					edad.setText(rsAntiguo.getString(i));

					break;
				case 11:
					observaciones.setText(rsAntiguo.getString(i));
					
					break;
				case 12:
					fechaAdquisicion.setText(rsAntiguo.getString(i));

					break;

				default:
					break;
				}

			}
		} catch (SQLException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}

	}
}
