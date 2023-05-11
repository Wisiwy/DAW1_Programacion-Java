package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTable;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

import controlador.ControlDB;

import javax.swing.JToolBar;
import javax.swing.AbstractListModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainWin extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					MainWin frame = new MainWin();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 * @param control 
	 */
	public MainWin(ControlDB control) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 773, 567);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"pilotos", "ele2 ", "ele3", "ele4", "ele5", "ele6", "ele7", "ele8"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		contentPane.add(list, BorderLayout.WEST);
		
		table = new JTable();
		
		contentPane.add(new JScrollPane(table), BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.EAST);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnVerPilotos = new JButton("Pilotos");
		btnVerPilotos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ResultSet rs;
				try {
					rs = control.selectTableRS("pilotos");
					table.setModel(control.buildTableModel(rs));	
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}
		});
		btnVerPilotos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		panel.add(btnVerPilotos);
		
		JButton btnVerCircuitos = new JButton("Circuitos");
		btnVerCircuitos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ResultSet rs;
				try {
					rs = control.selectTableRS("circuitos");
					table.setModel(control.buildTableModel(rs));	
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		panel.add(btnVerCircuitos);
		
		JButton btnVerPuntuaciones = new JButton("Puntuaciones");
		btnVerPuntuaciones.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ResultSet rs;
				try {
					rs = control.selectTableRS("puntua");
					table.setModel(control.buildTableModel(rs));	
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		panel.add(btnVerPuntuaciones);
		
		JLabel lblTitulo = new JLabel("ActFinal2-Pilotos");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Dyuthi", Font.BOLD, 30));
		contentPane.add(lblTitulo, BorderLayout.NORTH);
		
		JLabel lblIconoSur = new JLabel("Aqui iria una imagen icono segun el manual. ");
		contentPane.add(lblIconoSur, BorderLayout.SOUTH);
	}

}
