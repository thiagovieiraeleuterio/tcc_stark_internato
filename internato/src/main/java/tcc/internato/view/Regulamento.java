package tcc.internato.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Color;

public class Regulamento extends JFrame {

	private JPanel contentPane;
	private JTextField tf_apelido_reg;

	/**
	 * Launch the application.
	 */
	
			public void run() {
				try {
					Regulamento frame = new Regulamento();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	

	/**
	 * Create the frame.
	 */
	public Regulamento() {
		setTitle("Regulamento");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 536, 583);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblApelido = new JLabel("Apelido: ");
		lblApelido.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblApelido.setBounds(36, 81, 67, 19);
		contentPane.add(lblApelido);
		
		tf_apelido_reg = new JTextField();
		tf_apelido_reg.setToolTipText("Informe a cidade.");
		tf_apelido_reg.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_apelido_reg.setColumns(10);
		tf_apelido_reg.setBounds(94, 78, 362, 25);
		contentPane.add(tf_apelido_reg);
		
		JLabel lblTrechoRegulamento = new JLabel("Trecho Regulamento:");
		lblTrechoRegulamento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTrechoRegulamento.setBounds(42, 160, 152, 19);
		contentPane.add(lblTrechoRegulamento);
		
		JTextPane tp_regulamento = new JTextPane();
		tp_regulamento.setBounds(94, 202, 362, 93);
		contentPane.add(tp_regulamento);
		
		JLabel lblRegulamento = new JLabel("REGULAMENTO");
		lblRegulamento.setFont(new Font("Cambria Math", Font.BOLD, 19));
		lblRegulamento.setBounds(36, 24, 158, 23);
		contentPane.add(lblRegulamento);
		
		JButton button = new JButton("Cancelar");
		button.setForeground(Color.RED);
		button.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button.setBackground(Color.GRAY);
		button.setBounds(173, 496, 128, 25);
		contentPane.add(button);
		
		JButton button_1 = new JButton("SALVAR");
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_1.setBounds(354, 496, 128, 25);
		contentPane.add(button_1);
		
		JLabel lblDescrioDoAto = new JLabel("Descrição do Ato:");
		lblDescrioDoAto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDescrioDoAto.setBounds(36, 328, 152, 19);
		contentPane.add(lblDescrioDoAto);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(94, 370, 362, 93);
		contentPane.add(textPane);
	}

}
