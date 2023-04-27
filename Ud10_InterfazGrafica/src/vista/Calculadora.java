package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField txt_num1;
	private JTextField txt_num2;
	private JTextField txt_res;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 391, 472);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculadora");
		lblNewLabel.setFont(new Font("Source Serif Pro ExtraLight", Font.PLAIN, 18));
		lblNewLabel.setBounds(118, 40, 124, 78);
		contentPane.add(lblNewLabel);
		
		txt_num1 = new JTextField();
		txt_num1.setBounds(118, 129, 124, 44);
		contentPane.add(txt_num1);
		txt_num1.setColumns(10);
		Integer num1 = Integer.parseInt(txt_num1.getText());
		
		txt_num2 = new JTextField();
		txt_num2.setColumns(10);
		txt_num2.setBounds(118, 184, 124, 44);
		contentPane.add(txt_num2);
		Integer num2 = Integer.parseInt(txt_num1.getText());
		
		txt_res = new JTextField();
		txt_res.setColumns(10);
		txt_res.setBounds(118, 351, 124, 44);
		contentPane.add(txt_res);
		
		JButton btn_rest = new JButton("-");
		btn_rest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_res.setText(String.valueOf(num1+num2));
			}
		});
		btn_rest.setBounds(179, 269, 89, 23);
		contentPane.add(btn_rest);
		
		JButton btn_sum = new JButton("+");
		btn_sum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_res.setText(String.valueOf(num1+num2));
			}
		});
		btn_sum.setBounds(80, 269, 89, 23);
		contentPane.add(btn_sum);
		
		JButton btn_mult = new JButton("*");
		btn_mult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_res.setText(String.valueOf(num1*num2));

			}
		});
		btn_mult.setBounds(80, 315, 89, 23);
		contentPane.add(btn_mult);
		
		JButton btn_div = new JButton("/");
		btn_div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_res.setText(String.valueOf(num1/num2));

			}
		});
		btn_div.setBounds(189, 315, 89, 23);
		contentPane.add(btn_div);
		
		txt_res = new JTextField();
		txt_res.setColumns(10);
		txt_res.setBounds(118, 351, 124, 44);
		contentPane.add(txt_res);
	}

}
