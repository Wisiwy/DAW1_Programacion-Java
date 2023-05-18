package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import controlador.ManejaDB;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.SystemColor;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Vtodo extends JFrame {

	private JPanel contentPane;
	private JTextField txt_script;
	private JTextField txt_datos;
	private JTextField txt_id;
	private JTextField txt_nom;
	private JTextField txt_uNom;
	private JTextField txt_bNom;
	private JTable tbl_table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//Vtodo frame = new Vtodo();
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param maneja 
	 */
	public Vtodo(ManejaDB maneja) {
		
			
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 506, 541);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JComboBox box_tabla = new JComboBox();
		JComboBox box_bId = new JComboBox();
		JComboBox box_uId = new JComboBox();
		
		JButton btnNewButton = new JButton("Script");
		btnNewButton.setBounds(20, 11, 85, 21);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt_script.getText().length() == 0) {
					JFileChooser fileChooser = new JFileChooser();
					//FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.SQL", "sql");
					//FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.TXT", "txt");
					fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
					
					int seleccion = fileChooser.showOpenDialog(null);
					if (seleccion == JFileChooser.APPROVE_OPTION)
					{
					   File fichero = fileChooser.getSelectedFile();
					   txt_script.setText(fichero.getName());
					}
				}else {
					File f = new File(txt_script.getText());
					if(f.exists()) {
						maneja.crearBaseDatos(f);
						JComboBox box_tabla = maneja.cargaBoxTablas();
					}
				}
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		
		txt_script = new JTextField();
		txt_script.setBounds(115, 12, 187, 19);
		contentPane.add(txt_script);
		txt_script.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Datos");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt_datos.getText().length() == 0) {
					JFileChooser fileChooser = new JFileChooser();
					//FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.SQL", "sql");
					//FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.TXT", "txt");
					fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
					
					int seleccion = fileChooser.showOpenDialog(null);
					if (seleccion == JFileChooser.APPROVE_OPTION)
					{
					   File fichero = fileChooser.getSelectedFile();
					   txt_datos.setText(fichero.getName());
					}
				}else {
					File f = new File(txt_datos.getText());
					if(f.exists()) {
						maneja.rellenaBaseDatos(f);
					}else
						System.out.println("No existe el fichero");
				}
			}
		});
		btnNewButton_1.setBounds(20, 42, 85, 21);
		contentPane.add(btnNewButton_1);
		
		txt_datos = new JTextField();
		txt_datos.setBounds(115, 41, 187, 19);
		contentPane.add(txt_datos);
		txt_datos.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 73, 443, 136);
		contentPane.add(scrollPane);
		
		tbl_table = new JTable();
		scrollPane.setViewportView(tbl_table);
		
		JButton btn_punt = new JButton("Conectar");
		btn_punt.setBounds(359, 11, 104, 21);
		contentPane.add(btn_punt);
		
		
		
		txt_id = new JTextField();
		txt_id.setBounds(105, 234, 96, 19);
		contentPane.add(txt_id);
		txt_id.setColumns(10);
		
		JLabel lbl_nom = new JLabel("Nombre: ");
		lbl_nom.setBounds(211, 237, 45, 13);
		lbl_nom.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(lbl_nom);
		
		JButton btn_limpia = new JButton("Limpiar");
		btn_limpia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txt_nom.setText("");
				txt_id.setText("");
			}
		});
		btn_limpia.setBounds(283, 263, 85, 21);
		contentPane.add(btn_limpia);
		
		JLabel lbl_id = new JLabel("Id: ");
		lbl_id.setBounds(50, 237, 45, 13);
		lbl_id.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(lbl_id);
		
		txt_nom = new JTextField();
		txt_nom.setBounds(266, 234, 197, 19);
		contentPane.add(txt_nom);
		txt_nom.setColumns(10);
		
		JButton btn_insert = new JButton("Añadir");
		btn_insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!txt_id.getText().isBlank() && !txt_nom.getText().isBlank()) {
					maneja.altaCircuito(Integer.parseInt(txt_id.getText()), txt_nom.getText());
					
					box_bId.addItem(Integer.parseInt(txt_id.getText()));
					box_uId.addItem(Integer.parseInt(txt_id.getText()));
					
					txt_nom.setText("");
					txt_id.setText("");
					
					//actualizar tabla
					if(box_tabla.getSelectedItem().toString().compareToIgnoreCase("circuitos")==0) {
						ResultSet rs = null;
						try {
							rs = maneja.ejecuta("SELECT * FROM "+box_tabla.getSelectedItem());
							if( rs != null)
								tbl_table.setModel(maneja.buildTableModel(rs));
						} catch (SQLException e1) {
							e1.printStackTrace();
							
						}
					}
					
				}else {
					JOptionPane.showMessageDialog(null, "Rellena los campos id y nombre.");
				}
			}
		});
		btn_insert.setBounds(378, 263, 85, 21);
		contentPane.add(btn_insert);
		
		
		txt_uNom = new JTextField();
		txt_uNom.setBounds(266, 339, 197, 19);
		txt_uNom.setColumns(10);
		contentPane.add(txt_uNom);
		
		maneja.cargaId(box_uId);
		box_uId.setBounds(105, 338, 96, 21);
		
		box_uId.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = (String) box_uId.getSelectedItem();
				txt_uNom.setText(str );
			}
		});
		contentPane.add(box_uId);
		
		JLabel lbl_id_1 = new JLabel("Id: ");
		lbl_id_1.setBounds(50, 342, 45, 13);
		lbl_id_1.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(lbl_id_1);
		
		JLabel lbl_nom_1 = new JLabel("Nombre: ");
		lbl_nom_1.setBounds(211, 342, 45, 13);
		lbl_nom_1.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(lbl_nom_1);
		
		JLabel lbl_id_1_1 = new JLabel("Id: ");
		lbl_id_1_1.setBounds(50, 439, 45, 13);
		lbl_id_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(lbl_id_1_1);
		
		JLabel lbl_nom_1_1 = new JLabel("Nombre: ");
		lbl_nom_1_1.setBounds(211, 439, 45, 13);
		lbl_nom_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(lbl_nom_1_1);
		
		
		
		txt_bNom = new JTextField();
		txt_bNom.setBounds(266, 436, 197, 19);
		txt_bNom.setEditable(false);
		txt_bNom.setColumns(10);
		contentPane.add(txt_bNom);
		
		
		box_bId.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String item = (String) box_bId.getSelectedItem();
				//System.out.println(e.getModifiers() );
				if(e.getModifiers() > 0) {
					//System.out.println("Seleccion: "+box_bId.getSelectedItem());
					int id = Integer.parseInt((String) box_bId.getSelectedItem().toString());
					String dato = maneja.getItemId(id);
					txt_bNom.setText(dato);
				}
			}
		});
		maneja.cargaId(box_bId);
		//box_bId = maneja.cargaId();
		box_bId.setBounds(105, 435, 96, 21);
		contentPane.add(box_bId);
		
		JButton btn_updat = new JButton("Modificar");
		btn_updat.setBounds(378, 368, 85, 21);
		btn_updat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int index = box_uId.getSelectedIndex();
				int sel = (int) box_uId.getItemAt(index);
				maneja.modificaCircuito(sel, txt_uNom.getText());
				
				
				//actualizar box
				txt_uNom.setText("");
				
				//actualizar tabla
				if(box_tabla.getSelectedItem().toString().compareToIgnoreCase("circuitos")==0) {
					ResultSet rs = null;
					try {
						rs = maneja.ejecuta("SELECT * FROM "+box_tabla.getSelectedItem());
						if( rs != null)
							tbl_table.setModel(maneja.buildTableModel(rs));
					} catch (SQLException e1) {
						e1.printStackTrace();
						
					}
				}
			}
		});
		contentPane.add(btn_updat);
		
		JButton btn_borrar = new JButton("Borrar");
		btn_borrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txt_bNom.getText().isBlank()) {
					//JComboBox aux = (JComboBox) e.getSource();
					int index = box_bId.getSelectedIndex();
					int sel = (int) box_bId.getItemAt(index);
					//int id = Integer.parseInt((String) aux.getSelectedItem().toString());
					maneja.bajaCircuito(sel);
					
			
					//actualizar box
					txt_bNom.setText("");
					box_bId.removeItemAt(index);
					box_uId.removeItemAt(index);
					
					//actualizar tabla
					if(box_tabla.getSelectedItem().toString().compareToIgnoreCase("circuitos")==0) {
						ResultSet rs = null;
						try {
							rs = maneja.ejecuta("SELECT * FROM "+box_tabla.getSelectedItem());
							if( rs != null)
								tbl_table.setModel(maneja.buildTableModel(rs));
						} catch (SQLException e1) {
							e1.printStackTrace();
							
						}
					}
				}
			}
		});
		btn_borrar.setBounds(378, 465, 85, 21);
		contentPane.add(btn_borrar);
		
		//JComboBox box_tabla = new JComboBox();
		//JComboBox box_tabla = null;
		//box_tabla = maneja.cargaBoxTablas();
		maneja.cargaBoxTablas(box_tabla);
		box_tabla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					if(e.getActionCommand().compareTo("comboBoxChanged")==0) {
						JComboBox aux = (JComboBox) e.getSource();
						//System.out.println(aux.getSelectedItem());
						ResultSet rs = null;
						try {
							rs = maneja.ejecuta("SELECT * FROM "+aux.getSelectedItem());
							if( rs != null)
								tbl_table.setModel(maneja.buildTableModel(rs));
						} catch (SQLException e1) {
							e1.printStackTrace();
							
						}
					}
				}
			
		});
		
		box_tabla.setBounds(312, 42, 151, 21);
		contentPane.add(box_tabla);
		
		
	}
	
	
}
