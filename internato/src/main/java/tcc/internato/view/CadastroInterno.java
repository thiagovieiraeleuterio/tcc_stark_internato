package tcc.internato.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.text.MaskFormatter;

import tcc.internato.controller.ControllerInterno;

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
	private JTextField tf_nome_interno;
	private JFormattedTextField tf_cpf_interno;
	private JLabel lblDadosPessoais;
	private JLabel label_2;
	private JLabel label_3;
	private JFormattedTextField tf_dt_interno;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JTextField tf_idade;
	private JTextField tf_nome_pai;
	private JTextField tf_profissao_pai;
	private JTextField tf_nome_mae;
	private JTextField tf_profissao_mae;
	private JTextField tf_telefone_pai;
	private JTextField tf_telefone_mae;
	private JTextField tf_email_reponsavel;
	private JTextField tf_email;
	private JLabel lblSrie;
	private JComboBox comboBox_serie;
	private JComboBox comboBox_quarto;
	private JComboBox comboBox_turma;
	private JTextField tf_conta;
	private JTextField tf_agencia;
	private JTextField tf_banco;

	/**
	 * Create the panel.
	 * 
	 * @throws ParseException
	 */
	public CadastroInterno() throws ParseException {
		setTitle("Cadastro de Interno");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setBackground(Color.WHITE);
		panel_escolares = new JPanel();

		JTabbedPane jtp = new JTabbedPane();
		jtp.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);

		panel_dados_pessoais = new JPanel();
		jtp.addTab("Dados Pessoais", panel_dados_pessoais);
		// ficar melhor
		// visualmente

		panel_dados_pessoais.setLayout(null);

		label = new JLabel("Nome completo");
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label.setBounds(20, 81, 103, 19);
		panel_dados_pessoais.add(label);

		tf_nome_interno = new JTextField();
		tf_nome_interno.setToolTipText("Informe o nome completo.");
		tf_nome_interno.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_nome_interno.setColumns(10);
		tf_nome_interno.setBounds(133, 78, 513, 25);
		panel_dados_pessoais.add(tf_nome_interno);

		tf_cpf_interno = new JFormattedTextField(ftm_cpf);
		tf_cpf_interno.setToolTipText("Informe o CPF.");
		tf_cpf_interno.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_cpf_interno.setColumns(10);
		tf_cpf_interno.setBounds(55, 142, 136, 25);
		panel_dados_pessoais.add(tf_cpf_interno);

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

		tf_dt_interno = new JFormattedTextField(ftm_data);
		tf_dt_interno.setToolTipText("Informe a data de nascimento.");
		tf_dt_interno.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_dt_interno.setColumns(10);
		tf_dt_interno.setBounds(367, 142, 136, 25);
		panel_dados_pessoais.add(tf_dt_interno);

		label_7 = new JLabel("Idade");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_7.setBounds(533, 145, 38, 19);
		panel_dados_pessoais.add(label_7);

		tf_idade = new JTextField();
		tf_idade.setToolTipText("Informe a idade.");
		tf_idade.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_idade.setColumns(10);
		tf_idade.setBounds(581, 142, 60, 25);
		panel_dados_pessoais.add(tf_idade);

		JLabel lblNomePai = new JLabel("Nome Pai");
		lblNomePai.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNomePai.setBounds(20, 352, 103, 19);
		panel_dados_pessoais.add(lblNomePai);

		tf_nome_pai = new JTextField();
		tf_nome_pai.setToolTipText("Informe o nome completo.");
		tf_nome_pai.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_nome_pai.setColumns(10);
		tf_nome_pai.setBounds(152, 349, 494, 25);
		panel_dados_pessoais.add(tf_nome_pai);

		JLabel lblProfissoDoPai = new JLabel("Profiss\u00E3o do pai");
		lblProfissoDoPai.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblProfissoDoPai.setBounds(20, 388, 103, 19);
		panel_dados_pessoais.add(lblProfissoDoPai);

		tf_profissao_pai = new JTextField();
		tf_profissao_pai.setToolTipText("Informe o nome completo.");
		tf_profissao_pai.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_profissao_pai.setColumns(10);
		tf_profissao_pai.setBounds(152, 385, 248, 25);
		panel_dados_pessoais.add(tf_profissao_pai);

		JLabel lblNomeMe = new JLabel("Nome M\u00E3e");
		lblNomeMe.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNomeMe.setBounds(25, 484, 103, 19);
		panel_dados_pessoais.add(lblNomeMe);

		tf_nome_mae = new JTextField();
		tf_nome_mae.setToolTipText("Informe o nome completo.");
		tf_nome_mae.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_nome_mae.setColumns(10);
		tf_nome_mae.setBounds(152, 481, 494, 25);
		panel_dados_pessoais.add(tf_nome_mae);

		JLabel lblProfissoDaMe = new JLabel("Profiss\u00E3o da m\u00E3e");
		lblProfissoDaMe.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblProfissoDaMe.setBounds(25, 520, 122, 19);
		panel_dados_pessoais.add(lblProfissoDaMe);

		tf_profissao_mae = new JTextField();
		tf_profissao_mae.setToolTipText("Informe o nome completo.");
		tf_profissao_mae.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_profissao_mae.setColumns(10);
		tf_profissao_mae.setBounds(152, 517, 248, 25);
		panel_dados_pessoais.add(tf_profissao_mae);

		JLabel lblTelefoneDoPai = new JLabel("Telefone do pai");
		lblTelefoneDoPai.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTelefoneDoPai.setBounds(20, 439, 108, 19);
		panel_dados_pessoais.add(lblTelefoneDoPai);

		tf_telefone_pai = new JTextField();
		tf_telefone_pai.setToolTipText("Informe o nome completo.");
		tf_telefone_pai.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_telefone_pai.setColumns(10);
		tf_telefone_pai.setBounds(152, 436, 248, 25);
		panel_dados_pessoais.add(tf_telefone_pai);

		JLabel lblTelefoneDaMe = new JLabel("Telefone da m\u00E3e");
		lblTelefoneDaMe.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTelefoneDaMe.setBounds(25, 567, 112, 19);
		panel_dados_pessoais.add(lblTelefoneDaMe);

		tf_telefone_mae = new JTextField();
		tf_telefone_mae.setToolTipText("Informe o nome completo.");
		tf_telefone_mae.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_telefone_mae.setColumns(10);
		tf_telefone_mae.setBounds(152, 564, 248, 25);
		panel_dados_pessoais.add(tf_telefone_mae);

		JLabel lblEmailResponsvel = new JLabel("Email Respons\u00E1vel");
		lblEmailResponsvel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEmailResponsvel.setBounds(26, 616, 149, 19);
		panel_dados_pessoais.add(lblEmailResponsvel);

		tf_email_reponsavel = new JTextField();
		tf_email_reponsavel.setToolTipText("Informe o nome completo.");
		tf_email_reponsavel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_email_reponsavel.setColumns(10);
		tf_email_reponsavel.setBounds(215, 613, 361, 25);
		panel_dados_pessoais.add(tf_email_reponsavel);

		JLabel lblEmailInterno = new JLabel("Email Interno:");
		lblEmailInterno.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmailInterno.setBounds(20, 194, 103, 19);
		panel_dados_pessoais.add(lblEmailInterno);

		tf_email = new JTextField();
		tf_email.setToolTipText("Informe o nome completo.");
		tf_email.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_email.setColumns(10);
		tf_email.setBounds(133, 191, 308, 25);
		panel_dados_pessoais.add(tf_email);

		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		layeredPane.setBounds(23, 238, 640, 76);
		panel_dados_pessoais.add(layeredPane);
		layeredPane.setLayout(null);

		JLabel lblConta = new JLabel("Conta");
		lblConta.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblConta.setBounds(438, 43, 47, 19);
		layeredPane.add(lblConta);

		tf_conta = new JTextField();
		tf_conta.setToolTipText("Informe o nome completo.");
		tf_conta.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_conta.setColumns(10);
		tf_conta.setBounds(495, 37, 135, 25);
		layeredPane.add(tf_conta);

		JLabel lblAgncia = new JLabel("Agência");
		lblAgncia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAgncia.setBounds(232, 43, 50, 19);
		layeredPane.add(lblAgncia);

		tf_agencia = new JTextField();
		tf_agencia.setToolTipText("Informe o nome completo.");
		tf_agencia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_agencia.setColumns(10);
		tf_agencia.setBounds(292, 40, 109, 25);
		layeredPane.add(tf_agencia);

		JLabel lblBanco = new JLabel("Banco");
		lblBanco.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBanco.setBounds(30, 43, 47, 19);
		layeredPane.add(lblBanco);

		tf_banco = new JTextField();
		tf_banco.setToolTipText("Informe o nome completo.");
		tf_banco.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_banco.setColumns(10);
		tf_banco.setBounds(87, 40, 135, 25);
		layeredPane.add(tf_banco);

		JLabel lblDadosBancrios = new JLabel("Dados Bancários:");
		lblDadosBancrios.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblDadosBancrios.setBounds(10, 10, 135, 19);
		layeredPane.add(lblDadosBancrios);
		jtp.addTab("Dados Escolares", panel_escolares);

		getContentPane().add(jtp, BorderLayout.CENTER);

		ftm_cpf = new MaskFormatter(" ###. ###. ###- ##");

		ftm_data = new MaskFormatter("    ##/ ##/ ####");

		ftm_cep = new MaskFormatter(" ##. ### - ###");// coloquei espaços para
		panel_escolares.setLayout(null);

		label_4 = new JLabel("Curso");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_4.setBounds(19, 88, 37, 19);
		panel_escolares.add(label_4);

		label_5 = new JLabel("Turma");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_5.setBounds(19, 187, 44, 19);
		panel_escolares.add(label_5);

		label_6 = new JLabel("Quarto");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_6.setBounds(19, 236, 45, 19);
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

		lblSrie = new JLabel("Série");
		lblSrie.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSrie.setBounds(19, 139, 44, 19);
		panel_escolares.add(lblSrie);

		comboBox_serie = new JComboBox();
		comboBox_serie.setModel(new DefaultComboBoxModel(new String[] { "", "1º", "2º", "3º" }));
		comboBox_serie.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox_serie.setBounds(77, 140, 62, 20);
		panel_escolares.add(comboBox_serie);

		comboBox_quarto = new JComboBox();
		comboBox_quarto.setModel(new DefaultComboBoxModel(
				new String[] { "", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
		comboBox_quarto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox_quarto.setBounds(77, 237, 68, 20);
		panel_escolares.add(comboBox_quarto);

		comboBox_turma = new JComboBox();
		comboBox_turma.setModel(new DefaultComboBoxModel(new String[] { "", "A", "B", "C", "D", "E", "I" }));
		comboBox_turma.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox_turma.setBounds(73, 188, 68, 20);
		panel_escolares.add(comboBox_turma);
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
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ControllerInterno c = new ControllerInterno();
				// c.salvar(tf_nome_interno.getText(), tf_cpf_interno.getText(),
				// tf_dt_interno.getText(),
				// tf_idade.getText(), tf_email.getText(), tf_banco.getText(),
				// tf_agencia.getText(),
				// tf_conta.getText(), tf_nome_pai.getText(),
				// tf_profissao_pai.getText(),
				// tf_telefone_pai.getText(), tf_nome_mae.getText(),
				// tf_profissao_mae.getText(),
				// tf_telefone_mae.getText(), tf_email_reponsavel.getText(),
				// comboBox_curso.getText(),
				// comboBox_serie.getSelectedItem(),
				// comboBox_turma.getSelectedItem(),
				// comboBox_quarto.getSelectedItem(), tf_cidade.getText(),
				// comboBox_estado.getSelectedItem(),
				// tf_cep.getText(), tf_rua.getText(), tf_numero.getText(),
				// tf_apt.getText(), tf_avenida.getText(),
				// radio_procedencia_rural.isSelected(),
				// radio_procedencia_urbana.isSelected());

				Integer idade = tf_idade.getText();
				String cpf = tf_cpf_interno.getText();
				String agencia = tf_agencia.getText();
				String banco = tf_banco.getText();
				String email = tf_email.getText();
				String curso = comboBox_curso.se();
				String matricula = "adfaduhidaf";
				Integer diaLimpeza = 2;
				Boolean ativo = true;
				String dtNasc = tf_dt_interno.getText();
				String contaBanco = tf_conta.getText();
				String complemento = "andafoan";
				String motivo = "andafoan";
				String cep = "andafoan";
				String problemaSaude = "andafoan";
				String bairro = "andafoan";
				String nome = tf_nome_interno.getText();
				String telefone = "andafoan";
				String cidade = "andafoan";
				int numero = 5;
				String emailReponsavel = "andafoan";
				String resideCom = "andafoan";
				String logradouro = "andafoan";
				String uf = "ES";
				String profissaoMae = tf_profissao_mae.getText();
				String profissaoPai = tf_profissao_pai.getText();
				String nomeMae = tf_nome_mae.getText();
				String nomePai = tf_nome_pai.getText();
				String telefonePai = tf_telefone_pai.getText();
				String telefoneMae = tf_telefone_mae.getText();
				c.salvar(agencia, ativo, banco, contaBanco, cpf, curso, diaLimpeza, dtNasc, email, idade, matricula,
						motivo, nome, problemaSaude, telefone, bairro, cep, cidade, complemento, numero, logradouro,
						resideCom, uf, emailReponsavel, nomeMae, nomePai, profissaoMae, profissaoPai, telefoneMae,
						telefonePai);
			}
		});
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
