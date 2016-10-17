package tcc.internato.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFormattedTextField.AbstractFormatter;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class CadastroServidor extends JFrame {

	private JPanel contentPane;
	private JTextField tf_nome_servidor;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	
			public void run() {
				try {
					CadastroServidor frame = new CadastroServidor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	

	/**
	 * Create the frame.
	 */
	public CadastroServidor() {
		setTitle("Cadastro de Servidores");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 743, 646);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label = new JLabel("Nome completo");
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label.setBounds(22, 85, 103, 19);
		contentPane.add(label);

		tf_nome_servidor = new JTextField();
		tf_nome_servidor.setToolTipText("Informe o nome completo.");
		tf_nome_servidor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_nome_servidor.setColumns(10);
		tf_nome_servidor.setBounds(135, 82, 530, 25);
		contentPane.add(tf_nome_servidor);

		JLabel label_1 = new JLabel("CPF");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_1.setBounds(22, 149, 25, 19);
		contentPane.add(label_1);

		JFormattedTextField tf_cpf_servidor = new JFormattedTextField((AbstractFormatter) null);
		tf_cpf_servidor.setToolTipText("Informe o CPF.");
		tf_cpf_servidor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_cpf_servidor.setColumns(10);
		tf_cpf_servidor.setBounds(57, 146, 136, 25);
		contentPane.add(tf_cpf_servidor);

		JLabel label_2 = new JLabel("Data de Nascimento");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_2.setBounds(251, 149, 133, 19);
		contentPane.add(label_2);

		JFormattedTextField tf_data_nasc_servidor = new JFormattedTextField((AbstractFormatter) null);
		tf_data_nasc_servidor.setToolTipText("Informe a data de nascimento.");
		tf_data_nasc_servidor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_data_nasc_servidor.setColumns(10);
		tf_data_nasc_servidor.setBounds(394, 146, 136, 25);
		contentPane.add(tf_data_nasc_servidor);

		JLabel lblMatrcula = new JLabel("Matrícula");
		lblMatrcula.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMatrcula.setBounds(22, 212, 72, 19);
		contentPane.add(lblMatrcula);

		textField = new JTextField();
		textField.setToolTipText("Informe o nome completo.");
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setColumns(10);
		textField.setBounds(105, 209, 142, 25);
		contentPane.add(textField);

		JLabel lblDadosServidor = new JLabel("DADOS SERVIDOR");
		lblDadosServidor.setFont(new Font("Cambria Math", Font.BOLD, 19));
		lblDadosServidor.setBounds(22, 24, 221, 23);
		contentPane.add(lblDadosServidor);

		JButton button = new JButton("Cancelar");
		button.setForeground(Color.RED);
		button.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button.setBackground(Color.GRAY);
		button.setBounds(327, 513, 155, 44);
		contentPane.add(button);

		JButton button_1 = new JButton("SALVAR");
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_1.setBounds(510, 513, 155, 44);
		contentPane.add(button_1);
	}
}
