package tcc.internato.view;

import java.awt.Color;
import java.awt.Font;
import java.text.ParseException;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class CadastroInterno extends JFrame {
	private JPanel panel_endereco;
	private JPanel panel_escolares;
	private JPanel panel_dados_pessoais;
	private MaskFormatter ftm_data;

	// este objeto permite formatar os números no text.

	private MaskFormatter ftm_cpf;
	private MaskFormatter ftm_cep;
	private ButtonGroup bg = new ButtonGroup();
	private JTextField tf_cidade;
	private JLabel lblEstado;
	private JLabel lblCep;
	private JLabel lblRua;
	private JTextField tf_rua;
	private JLabel lblAvenida;
	private JTextField tf_avenida;
	private JLabel lblNmero;
	private JTextField tf_numero;
	private JLabel lblApt;
	private JTextField tf_apt;
	private JLabel label;
	private JTextField textField;
	private JFormattedTextField formattedTextField;
	private JLabel lblDadosPessoais;
	private JLabel label_2;
	private JLabel label_3;
	private JFormattedTextField formattedTextField_1;
	private JLabel label_4;
	private JTextField tf_turma;
	private JLabel label_5;
	private JTextField tf_quarto;
	private JLabel label_6;
	private JLabel label_7;
	private JTextField textField_4;
	private JTextField tf_nome_pai;
	private JTextField tf_profissao_pai;
	private JTextField tf_nome_mae;
	private JTextField tf_profissao_mae;
	private JTextField tf_telefone_pai;
	private JTextField tf_telefone_mae;
	private JTextField tf_email_reponsavel;
	private JTextField textField_11;

	/**
	 * Create the panel.
	 * 
	 * @throws ParseException
	 */
	public CadastroInterno() throws ParseException {
		setTitle("Cadastro de Interno");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setBackground(Color.WHITE);

		panel_dados_pessoais = new JPanel();
		panel_escolares = new JPanel();

		JTabbedPane jtp = new JTabbedPane();
		jtp.setTabLayoutPolicy(JTabbedPane.WRAP_TAB_LAYOUT);
		jtp.addTab("Dados Pessoais", panel_dados_pessoais);
		jtp.addTab("Dados Escolares", panel_escolares);

		getContentPane().add(jtp);

		ftm_cpf = new MaskFormatter(" ###. ###. ###- ##");

		ftm_data = new MaskFormatter("    ##/ ##/ ####");

		ftm_cep = new MaskFormatter(" ##. ### - ###");// coloquei espaços para
														// ficar melhor
														// visualmente

		panel_dados_pessoais.setLayout(null);

		label = new JLabel("Nome completo");
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label.setBounds(20, 81, 103, 19);
		panel_dados_pessoais.add(label);

		textField = new JTextField();
		textField.setToolTipText("Informe o nome completo.");
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setColumns(10);
		textField.setBounds(133, 78, 513, 25);
		panel_dados_pessoais.add(textField);

		formattedTextField = new JFormattedTextField(ftm_cpf);
		formattedTextField.setToolTipText("Informe o CPF.");
		formattedTextField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		formattedTextField.setColumns(10);
		formattedTextField.setBounds(55, 142, 136, 25);
		panel_dados_pessoais.add(formattedTextField);

		lblDadosPessoais = new JLabel("DADOS PESSOAIS");
		lblDadosPessoais.setFont(new Font("Cambria Math", Font.BOLD, 19));
		lblDadosPessoais.setBounds(20, 21, 221, 23);
		panel_dados_pessoais.add(lblDadosPessoais);

		label_2 = new JLabel("CPF");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_2.setBounds(20, 145, 25, 19);
		panel_dados_pessoais.add(label_2);

		label_3 = new JLabel("Data de Nascimento");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_3.setBounds(224, 145, 133, 19);
		panel_dados_pessoais.add(label_3);

		formattedTextField_1 = new JFormattedTextField(ftm_data);
		formattedTextField_1.setToolTipText("Informe a data de nascimento.");
		formattedTextField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		formattedTextField_1.setColumns(10);
		formattedTextField_1.setBounds(367, 142, 136, 25);
		panel_dados_pessoais.add(formattedTextField_1);
		panel_escolares.setLayout(null);

		label_4 = new JLabel("Curso");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_4.setBounds(19, 88, 37, 19);
		panel_escolares.add(label_4);

		tf_turma = new JTextField();
		tf_turma.setToolTipText("Informe o curso.");
		tf_turma.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_turma.setColumns(10);
		tf_turma.setBounds(77, 135, 53, 25);
		panel_escolares.add(tf_turma);

		label_5 = new JLabel("Turma");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_5.setBounds(19, 138, 44, 19);
		panel_escolares.add(label_5);

		tf_quarto = new JTextField();
		tf_quarto.setToolTipText("Informe o quarto.");
		tf_quarto.setColumns(10);
		tf_quarto.setBounds(77, 188, 53, 20);
		panel_escolares.add(tf_quarto);

		label_6 = new JLabel("Quarto");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_6.setBounds(19, 187, 45, 19);
		panel_escolares.add(label_6);

		JLabel lblDadosEscolares = new JLabel("DADOS ESCOLARES");
		lblDadosEscolares.setFont(new Font("Cambria Math", Font.BOLD, 19));
		lblDadosEscolares.setBounds(28, 25, 221, 23);
		panel_escolares.add(lblDadosEscolares);

		JComboBox comboBox_curso = new JComboBox();
		comboBox_curso.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox_curso.setModel(
				new DefaultComboBoxModel(new String[] { "", "Agropecuária", "Agroindústria", "Informática" }));
		comboBox_curso.setBounds(77, 89, 160, 20);
		panel_escolares.add(comboBox_curso);

		label_7 = new JLabel("Idade");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_7.setBounds(533, 145, 38, 19);
		panel_dados_pessoais.add(label_7);

		textField_4 = new JTextField();
		textField_4.setToolTipText("Informe a idade.");
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_4.setColumns(10);
		textField_4.setBounds(581, 142, 60, 25);
		panel_dados_pessoais.add(textField_4);

		JLabel lblNomePai = new JLabel("Nome Pai");
		lblNomePai.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNomePai.setBounds(15, 255, 103, 19);
		panel_dados_pessoais.add(lblNomePai);

		tf_nome_pai = new JTextField();
		tf_nome_pai.setToolTipText("Informe o nome completo.");
		tf_nome_pai.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_nome_pai.setColumns(10);
		tf_nome_pai.setBounds(147, 252, 494, 25);
		panel_dados_pessoais.add(tf_nome_pai);

		JLabel lblProfissoDoPai = new JLabel("Profiss\u00E3o do pai");
		lblProfissoDoPai.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblProfissoDoPai.setBounds(15, 290, 103, 19);
		panel_dados_pessoais.add(lblProfissoDoPai);

		tf_profissao_pai = new JTextField();
		tf_profissao_pai.setToolTipText("Informe o nome completo.");
		tf_profissao_pai.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_profissao_pai.setColumns(10);
		tf_profissao_pai.setBounds(147, 287, 248, 25);
		panel_dados_pessoais.add(tf_profissao_pai);

		JLabel lblNomeMe = new JLabel("Nome M\u00E3e");
		lblNomeMe.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNomeMe.setBounds(20, 387, 103, 19);
		panel_dados_pessoais.add(lblNomeMe);

		tf_nome_mae = new JTextField();
		tf_nome_mae.setToolTipText("Informe o nome completo.");
		tf_nome_mae.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_nome_mae.setColumns(10);
		tf_nome_mae.setBounds(147, 384, 494, 25);
		panel_dados_pessoais.add(tf_nome_mae);

		JLabel lblProfissoDaMe = new JLabel("Profiss\u00E3o da m\u00E3e");
		lblProfissoDaMe.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblProfissoDaMe.setBounds(20, 423, 122, 19);
		panel_dados_pessoais.add(lblProfissoDaMe);

		tf_profissao_mae = new JTextField();
		tf_profissao_mae.setToolTipText("Informe o nome completo.");
		tf_profissao_mae.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_profissao_mae.setColumns(10);
		tf_profissao_mae.setBounds(147, 420, 248, 25);
		panel_dados_pessoais.add(tf_profissao_mae);

		JLabel lblTelefoneDoPai = new JLabel("Telefone do pai");
		lblTelefoneDoPai.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTelefoneDoPai.setBounds(15, 342, 108, 19);
		panel_dados_pessoais.add(lblTelefoneDoPai);

		tf_telefone_pai = new JTextField();
		tf_telefone_pai.setToolTipText("Informe o nome completo.");
		tf_telefone_pai.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_telefone_pai.setColumns(10);
		tf_telefone_pai.setBounds(147, 339, 248, 25);
		panel_dados_pessoais.add(tf_telefone_pai);

		JLabel lblTelefoneDaMe = new JLabel("Telefone da m\u00E3e");
		lblTelefoneDaMe.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTelefoneDaMe.setBounds(20, 470, 112, 19);
		panel_dados_pessoais.add(lblTelefoneDaMe);

		tf_telefone_mae = new JTextField();
		tf_telefone_mae.setToolTipText("Informe o nome completo.");
		tf_telefone_mae.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_telefone_mae.setColumns(10);
		tf_telefone_mae.setBounds(147, 467, 248, 25);
		panel_dados_pessoais.add(tf_telefone_mae);

		JLabel lblEmailResponsvel = new JLabel("Email Respons\u00E1vel");
		lblEmailResponsvel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEmailResponsvel.setBounds(21, 519, 149, 19);
		panel_dados_pessoais.add(lblEmailResponsvel);

		tf_email_reponsavel = new JTextField();
		tf_email_reponsavel.setToolTipText("Informe o nome completo.");
		tf_email_reponsavel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_email_reponsavel.setColumns(10);
		tf_email_reponsavel.setBounds(210, 516, 361, 25);
		panel_dados_pessoais.add(tf_email_reponsavel);

		JLabel lblEmailInterno = new JLabel("Email Interno:");
		lblEmailInterno.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmailInterno.setBounds(20, 194, 103, 19);
		panel_dados_pessoais.add(lblEmailInterno);

		textField_11 = new JTextField();
		textField_11.setToolTipText("Informe o nome completo.");
		textField_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_11.setColumns(10);
		textField_11.setBounds(133, 191, 308, 25);
		panel_dados_pessoais.add(textField_11);
		panel_endereco = new JPanel();
		jtp.addTab("Endereço", panel_endereco);
		panel_endereco.setLayout(null);

		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(33, 111, 43, 19);
		lblCidade.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_endereco.add(lblCidade);

		tf_cidade = new JTextField();
		tf_cidade.setBounds(81, 108, 136, 25);
		tf_cidade.setToolTipText("Informe a cidade.");
		tf_cidade.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_cidade.setColumns(10);
		panel_endereco.add(tf_cidade);

		lblEstado = new JLabel("Estado");
		lblEstado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEstado.setBounds(302, 111, 44, 19);
		panel_endereco.add(lblEstado);

		JLabel lblProcedencia = new JLabel("Proced\u00EAncia");
		lblProcedencia.setBounds(320, 255, 77, 19);
		panel_endereco.add(lblProcedencia);
		lblProcedencia.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JRadioButton radio_procedencia_rural = new JRadioButton("Rural");
		radio_procedencia_rural.setBounds(427, 253, 72, 23);
		panel_endereco.add(radio_procedencia_rural);
		bg.add(radio_procedencia_rural);

		JRadioButton radio_procedencia_urbana = new JRadioButton("Urbana");
		radio_procedencia_urbana.setBounds(525, 255, 85, 23);
		panel_endereco.add(radio_procedencia_urbana);
		bg.add(radio_procedencia_urbana);
		radio_procedencia_urbana.setSelected(true);

		lblCep = new JLabel("CEP");
		lblCep.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCep.setBounds(458, 111, 25, 19);
		panel_endereco.add(lblCep);

		JComboBox comboBox_estado = new JComboBox();
		comboBox_estado.setBounds(356, 112, 40, 20);
		comboBox_estado.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "", "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA",
						"PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RS", "SC", "SE", "SP", "TO" }));
		panel_endereco.add(comboBox_estado);

		lblRua = new JLabel("Rua");
		lblRua.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRua.setBounds(33, 181, 25, 19);
		panel_endereco.add(lblRua);

		tf_rua = new JTextField();
		tf_rua.setToolTipText("Informe seu nome completo.");
		tf_rua.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_rua.setColumns(10);
		tf_rua.setBounds(66, 178, 288, 25);
		panel_endereco.add(tf_rua);

		lblAvenida = new JLabel("Avenida");
		lblAvenida.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAvenida.setBounds(33, 253, 51, 19);
		panel_endereco.add(lblAvenida);

		tf_avenida = new JTextField();
		tf_avenida.setToolTipText("Informe seu nome completo.");
		tf_avenida.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_avenida.setColumns(10);
		tf_avenida.setBounds(89, 250, 136, 25);
		panel_endereco.add(tf_avenida);

		lblNmero = new JLabel("N\u00BA");
		lblNmero.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNmero.setBounds(386, 181, 27, 19);
		panel_endereco.add(lblNmero);

		tf_numero = new JTextField();
		tf_numero.setToolTipText("Informe seu nome completo.");
		tf_numero.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_numero.setColumns(10);
		tf_numero.setBounds(412, 178, 51, 25);
		panel_endereco.add(tf_numero);

		lblApt = new JLabel("Apt.");
		lblApt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblApt.setBounds(503, 184, 27, 19);
		panel_endereco.add(lblApt);

		tf_apt = new JTextField();
		tf_apt.setToolTipText("Informe seu nome completo.");
		tf_apt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_apt.setColumns(10);
		tf_apt.setBounds(534, 178, 105, 25);
		panel_endereco.add(tf_apt);
		JFormattedTextField tf_cep = new JFormattedTextField(ftm_cep);
		tf_cep.setToolTipText("Informe seu CEP.\r\n");
		tf_cep.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_cep.setColumns(10);
		tf_cep.setBounds(503, 108, 136, 25);
		panel_endereco.add(tf_cep);

		JLabel lblEndereco = new JLabel("ENDERE\u00C7O");
		lblEndereco.setFont(new Font("Cambria Math", Font.BOLD, 19));
		lblEndereco.setBounds(33, 26, 221, 23);
		panel_endereco.add(lblEndereco);

		JButton btncancelar = new JButton("Cancelar");
		btncancelar.setForeground(Color.RED);
		btncancelar.setBackground(Color.GRAY);
		btncancelar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btncancelar.setBounds(320, 449, 155, 44);
		panel_endereco.add(btncancelar);

		JButton btnSalvar = new JButton("SALVAR");
		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSalvar.setBounds(503, 449, 155, 44);
		panel_endereco.add(btnSalvar);

	}

	public void run() {
		// TODO Auto-generated method stub
		try {
			CadastroInterno cadastro_interno = new CadastroInterno();
			cadastro_interno.setVisible(true);
			cadastro_interno.setExtendedState(JFrame.NORMAL);
			cadastro_interno.setSize(717, 650);
			cadastro_interno.setLocationRelativeTo(null);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
