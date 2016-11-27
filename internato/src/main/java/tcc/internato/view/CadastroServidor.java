package tcc.internato.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFormattedTextField.AbstractFormatter;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;

public class CadastroServidor extends JFrame {

	private JPanel contentPane;
	private JTextField tf_nome_servidor;
	private JTextField textField;
	private JPasswordField password_servidor;
	private JPasswordField password_servidor_2;
	private JTextField tf_login_servidor;

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
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label = new JLabel("Nome completo");
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label.setBounds(52, 100, 103, 19);
		contentPane.add(label);

		tf_nome_servidor = new JTextField();
		tf_nome_servidor.setToolTipText("Informe o nome completo.");
		tf_nome_servidor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_nome_servidor.setColumns(10);
		tf_nome_servidor.setBounds(175, 97, 530, 25);
		contentPane.add(tf_nome_servidor);

		JLabel label_1 = new JLabel("CPF");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_1.setBounds(130, 159, 25, 19);
		contentPane.add(label_1);

		JFormattedTextField tf_cpf_servidor = new JFormattedTextField((AbstractFormatter) null);
		tf_cpf_servidor.setToolTipText("Informe o CPF.");
		tf_cpf_servidor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_cpf_servidor.setColumns(10);
		tf_cpf_servidor.setBounds(175, 156, 136, 25);
		contentPane.add(tf_cpf_servidor);

		JLabel label_2 = new JLabel("Data de Nascimento");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_2.setBounds(22, 218, 133, 19);
		contentPane.add(label_2);

		JFormattedTextField tf_data_nasc_servidor = new JFormattedTextField((AbstractFormatter) null);
		tf_data_nasc_servidor.setToolTipText("Informe a data de nascimento.");
		tf_data_nasc_servidor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_data_nasc_servidor.setColumns(10);
		tf_data_nasc_servidor.setBounds(175, 215, 136, 25);
		contentPane.add(tf_data_nasc_servidor);

		JLabel lblMatrcula = new JLabel("Matrícula");
		lblMatrcula.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMatrcula.setBounds(94, 275, 61, 19);
		contentPane.add(lblMatrcula);

		textField = new JTextField();
		textField.setToolTipText("Informe o nome completo.");
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setColumns(10);
		textField.setBounds(175, 272, 142, 25);
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

		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setForeground(Color.RED);
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setToolTipText("Cadastro de Login e Senha");
		panel.setBounds(64, 334, 346, 157);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblConfirmarSenha = new JLabel(" Confirmar senha");
		lblConfirmarSenha.setBounds(46, 125, 118, 19);
		lblConfirmarSenha.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(lblConfirmarSenha);

		password_servidor_2 = new JPasswordField();
		password_servidor_2.setBounds(189, 126, 136, 20);
		panel.add(password_servidor_2);

		password_servidor = new JPasswordField();
		password_servidor.setBounds(189, 90, 136, 20);
		panel.add(password_servidor);

		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(115, 89, 40, 19);
		panel.add(lblSenha);
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLogin.setBounds(119, 48, 40, 19);
		panel.add(lblLogin);

		JLabel lblCadastroDeLogin = new JLabel("Cadastro de Login e Senha");
		lblCadastroDeLogin.setForeground(Color.BLUE);
		lblCadastroDeLogin.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCadastroDeLogin.setBounds(10, 11, 192, 19);
		panel.add(lblCadastroDeLogin);

		tf_login_servidor = new JTextField();
		tf_login_servidor.setToolTipText("Informe o nome completo.");
		tf_login_servidor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_login_servidor.setColumns(10);
		tf_login_servidor.setBounds(189, 49, 136, 25);
		panel.add(tf_login_servidor);
	}
}
