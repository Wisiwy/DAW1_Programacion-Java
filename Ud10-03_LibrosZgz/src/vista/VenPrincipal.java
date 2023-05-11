package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ControlDB;

import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class VenPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 * @param control 
	 */
	public VenPrincipal(final ControlDB control) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 707, 537);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Checkbox.select"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnConectarABd = new JButton("Conectar a BD");
		btnConectarABd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File f = new File("librosZgz.db");
				// mensaje conexion establecida
				JLabel lblConn = new JLabel("");
				lblConn.setFont(new Font("DialogInput", Font.BOLD, 16));
				lblConn.setHorizontalAlignment(SwingConstants.CENTER);
				lblConn.setBounds(192, 239, 302, 45);
				contentPane.add(lblConn);
				lblConn.setText("Conexion Establecida");
				System.out.println("caca");
				// abrimos ventana
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				VenTabla frameTabla = new VenTabla(control);
				frameTabla.setVisible(true);

			}
		});
		btnConectarABd.setBounds(106, 334, 156, 40);
		contentPane.add(btnConectarABd);

		JLabel lblTitulo = new JLabel("Biblioteca Casa ZGZ ");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setForeground(new Color(102, 0, 0));
		lblTitulo.setFont(new Font("Caladea", Font.BOLD | Font.ITALIC, 53));
		lblTitulo.setBounds(82, 38, 539, 161);
		contentPane.add(lblTitulo);

		JButton btnSalirBD = new JButton("SalirBD");
		btnSalirBD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// mensaje asios
				JLabel lblConn = new JLabel("");
				lblConn.setFont(new Font("DialogInput", Font.BOLD, 16));
				lblConn.setHorizontalAlignment(SwingConstants.CENTER);
				lblConn.setBounds(192, 239, 302, 45);
				contentPane.add(lblConn);
				lblConn.setText("Hasta otra maquina!!");

				// abrimos ventana
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				setVisible(false);

			}
		});
		btnSalirBD.setBounds(419, 334, 150, 40);
		contentPane.add(btnSalirBD);

	}
}
