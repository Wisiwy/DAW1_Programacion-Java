package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.sql.ResultSet;
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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class VenInsertLibro extends JFrame {

	private JPanel contentPane;
	private JTextField txtTitulo;
	private JTextField txtAutor;
	private JTextField txtAnyo;
	private JTextField txtEditorial;
	private JTextField txtIsbn;
	private JTextField txtPag;
	private JTextField txtEdad;
	private JTextField txtObserva;
	private JTextField txtFechaAdq;
	private JComboBox cboxTematica;
	private JComboBox cboxUbi;

	/**
	 * Create the frame.
	 * 
	 * @param control
	 */
	//¿?¿?¿?¿? SI DA PROBLEMAS EL FINAL CREAR UNA VARIABLE EN ESTA MISMA CLASE CONTROL Y AÑADIRLAS
	public VenInsertLibro(final ControlDB control) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 722);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnInsAcept = new JButton("Aceptar");
		btnInsAcept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insertar libro. 
				List<String> strList = new ArrayList<String>();
				//recoger todos los textos
				
				try {
					strList.add(0, (control.selectNextId("libros")+1));
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				strList.add(1, txtTitulo.getText());
				strList.add(2, txtAutor.getText());
				strList.add(3, txtAnyo.getText());
				strList.add(4, (String) cboxTematica.getSelectedItem());
				strList.add(5, (String) cboxUbi.getSelectedItem());
				strList.add(6, txtEditorial.getText());
				strList.add(7, txtIsbn.getText());
				strList.add(8, txtPag.getText());
				strList.add(9, txtEdad.getText());
				strList.add(10, txtObserva.getText());
				strList.add(11, txtFechaAdq.getText());
				
				Dibujo.pintarLista(strList);
				//controlar que si esta vacio setear espacio en un libro o 0 en numeros
				
				
				//crear Libro
				try {
					Libro libAux = new Libro(strList);
					control.insertLibro(libAux);
					VenAcceptLibro venAceptaLib = new VenAcceptLibro(libAux);
					venAceptaLib.setVisible(true);
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnInsAcept.setBounds(35, 620, 124, 49);
		contentPane.add(btnInsAcept);

		JButton btnInsCancel = new JButton("Cancelar");
		btnInsCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				setVisible(false);
			}
		});
		btnInsCancel.setBounds(266, 620, 124, 49);
		contentPane.add(btnInsCancel);

		JLabel lblNuevoLibro_1 = new JLabel("Nuevo libro");
		lblNuevoLibro_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNuevoLibro_1.setForeground(new Color(102, 0, 0));
		lblNuevoLibro_1.setFont(new Font("Caladea", Font.BOLD | Font.ITALIC, 24));
		lblNuevoLibro_1.setBounds(148, -13, 149, 49);
		contentPane.add(lblNuevoLibro_1);

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

		txtTitulo = new JTextField();
		txtTitulo.setToolTipText("Ej. Cien años de soledad");
		txtTitulo.setBounds(99, 0, 227, 31);
		panelTituloo.add(txtTitulo);
		txtTitulo.setColumns(10);

		JPanel panelAutor = new JPanel();
		panelAutor.setBounds(5, 55, 353, 31);
		panelFormLibro.add(panelAutor);
		panelAutor.setLayout(null);

		JLabel lblAutor = new JLabel("Autor");
		lblAutor.setBounds(12, 8, 70, 15);
		panelAutor.add(lblAutor);

		txtAutor = new JTextField();
		txtAutor.setToolTipText("Ej. Gabriel García Marquez");
		txtAutor.setColumns(10);
		txtAutor.setBounds(99, 0, 227, 31);
		panelAutor.add(txtAutor);

		JPanel panelAnyo = new JPanel();
		panelAnyo.setBounds(5, 98, 353, 31);
		panelFormLibro.add(panelAnyo);
		panelAnyo.setLayout(null);

		JLabel lblAnyo = new JLabel("Año");
		lblAnyo.setBounds(12, 8, 70, 15);
		panelAnyo.add(lblAnyo);

		txtAnyo = new JTextField();
		txtAnyo.setToolTipText("Ej.1975");
		txtAnyo.setColumns(10);
		txtAnyo.setBounds(99, 0, 227, 31);
		panelAnyo.add(txtAnyo);

		// TEMATICA
		JPanel panelTematica = new JPanel();
		panelTematica.setBounds(5, 141, 492, 31);
		panelFormLibro.add(panelTematica);
		panelTematica.setLayout(null);

		JLabel lblTematica = new JLabel("Tematica");
		lblTematica.setBounds(12, 8, 70, 15);
		panelTematica.add(lblTematica);

		// combo Tematica
		cboxTematica = new JComboBox();
		
		cboxTematica.setEditable(true);
		cboxTematica.setBounds(100, 2, 234, 28);
		panelTematica.add(cboxTematica);

		try {
			ResultSet rs = control.selectColumnTable("tematica", "libros");
			while (rs.next()) {
				
				String item = rs.getString("tematica");
				cboxTematica.addItem(item);
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
				cboxTematica.addItem(cboxTematica.getEditor().getItem().toString());

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

		txtEditorial = new JTextField();
		txtEditorial.setToolTipText("Anaya");
		txtEditorial.setColumns(10);
		txtEditorial.setBounds(99, 0, 227, 31);
		panelEditorial.add(txtEditorial);

		JPanel panelIsbn = new JPanel();
		panelIsbn.setBounds(5, 227, 353, 31);
		panelFormLibro.add(panelIsbn);
		panelIsbn.setLayout(null);

		JLabel lblIsbn = new JLabel("Isbn");
		lblIsbn.setBounds(12, 8, 70, 15);
		panelIsbn.add(lblIsbn);

		txtIsbn = new JTextField();
		txtIsbn.setToolTipText("8423344711");
		txtIsbn.setColumns(10);
		txtIsbn.setBounds(99, 0, 227, 31);
		panelIsbn.add(txtIsbn);

		JPanel panelPag = new JPanel();
		panelPag.setBounds(5, 275, 353, 31);
		panelFormLibro.add(panelPag);
		panelPag.setLayout(null);

		JLabel lblPag = new JLabel("Páginas");
		lblPag.setBounds(12, 8, 70, 15);
		panelPag.add(lblPag);

		txtPag = new JTextField();
		txtPag.setToolTipText("214");
		txtPag.setColumns(10);
		txtPag.setBounds(99, 0, 227, 31);
		panelPag.add(txtPag);

		JPanel panelEdad = new JPanel();
		panelEdad.setBounds(5, 313, 353, 31);
		panelFormLibro.add(panelEdad);
		panelEdad.setLayout(null);

		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(12, 8, 70, 15);
		panelEdad.add(lblEdad);

		txtEdad = new JTextField();
		txtEdad.setToolTipText("A partir de ...");
		txtEdad.setColumns(10);
		txtEdad.setBounds(99, 0, 227, 31);
		panelEdad.add(txtEdad);

		// UBICACION
		JPanel panelUbicacion = new JPanel();
		panelUbicacion.setBounds(5, 356, 492, 31);
		panelFormLibro.add(panelUbicacion);
		panelUbicacion.setLayout(null);

		JLabel lblUbicacion = new JLabel("Ubicación");
		lblUbicacion.setBounds(12, 8, 70, 15);
		panelUbicacion.add(lblUbicacion);

		// ¿¿¿¿¿¿CUIDADO ES FINAL??????
		 cboxUbi = new JComboBox();
		 cboxUbi.addKeyListener(new KeyAdapter() {
		 	@Override
		 	public void keyTyped(KeyEvent e) {
		 		System.out.println(e);
		 	}
		 });
		cboxUbi.setEditable(true);
		cboxUbi.setBounds(100, 3, 237, 28);
		panelUbicacion.add(cboxUbi);
		try {
			ResultSet rs = control.selectColumnTable("ubicacion", "libros");
			while (rs.next()) {
				String item = rs.getString("ubicacion");
				cboxUbi.addItem(item);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		JButton btnAgregarUbi = new JButton("Agregar Ubi");
		btnAgregarUbi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				cboxUbi.addItem(cboxUbi.getEditor().getItem().toString());

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

		txtObserva = new JTextField();
		txtObserva.setToolTipText("Habitacion.");
		txtObserva.setColumns(10);
		txtObserva.setBounds(12, 26, 306, 83);
		panelObserva.add(txtObserva);

		JPanel panelFechaAdq = new JPanel();
		panelFechaAdq.setLayout(null);
		panelFechaAdq.setBounds(5, 399, 353, 31);
		panelFormLibro.add(panelFechaAdq);

		JLabel lblFechaAdq = new JLabel("Fecha <br> Adquisicion");
		lblFechaAdq.setBounds(12, 8, 70, 15);
		panelFechaAdq.add(lblFechaAdq);

		txtFechaAdq = new JTextField();
		txtFechaAdq.setToolTipText("Habitacion.");
		txtFechaAdq.setColumns(10);
		txtFechaAdq.setBounds(99, 0, 227, 31);
		panelFechaAdq.add(txtFechaAdq);
	}
}
