package vista;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana1 extends JFrame {

	private JPanel contentPane;
	private JTextField txt_nom;
	private JTextField txt_ape;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana1 frame = new Ventana1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana1() {
		setTitle("Formulario");
		setForeground(new Color(0, 64, 128));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 268, 221);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 0));
		contentPane.setToolTipText("ToolTip Ventanera Rauilan");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt_nom = new JTextField();
		txt_nom.setToolTipText("Intro tu ape");
		txt_nom.setBounds(132, 32, 100, 36);
		contentPane.add(txt_nom);
		txt_nom.setColumns(10);
		
		txt_ape = new JTextField();
		txt_ape.setBounds(132, 79, 100, 36);
		contentPane.add(txt_ape);
		txt_ape.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt_nom.getText().isEmpty() || txt_ape.getText().isEmpty() )
					JOptionPane.showInternalMessageDialog(null, "Campo incompleto. Rellena");
				else	
					JOptionPane.showInternalMessageDialog(null, "hola " + txt_nom.getText() + " " + txt_ape.getText());
				
			}
		});
		btnNewButton.setBounds(82, 128, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lbl_nom = new JLabel("Nombre");
		lbl_nom.setForeground(new Color(0, 128, 128));
		lbl_nom.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lbl_nom.setBounds(22, 32, 100, 33);
		contentPane.add(lbl_nom);
		
		JLabel lbl_nom_1 = new JLabel("Apellido");
		lbl_nom_1.setForeground(new Color(0, 128, 128));
		lbl_nom_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lbl_nom_1.setBounds(22, 75, 100, 33);
		contentPane.add(lbl_nom_1);
	}
}
