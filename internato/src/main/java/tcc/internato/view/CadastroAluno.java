package tcc.internato.view;

import java.awt.Font;
import java.text.ParseException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class CadastroAluno extends JFrame {
	private JTextField tf_nome_interno;
	private JFormattedTextField tf_cpf_interno;
	private JLabel _TITLE;
	private JLabel lblDataDeNascimento_interno;
	private JFormattedTextField tf_data_nasc_interno;
	private MaskFormatter ftm_data; // este objeto permite formatar os números
									// no text.
	private MaskFormatter ftm_cpf;
	private JLabel lblCurso_interno;
	private JTextField tf_curso_interno;
	private JTextField tf_turma;
	private JLabel lblTurma_interno;
	private JTextField tf_quarto;
	private JLabel lblQuarto;
	private JTextField tf_idade;
	private JTextField tf_cidade;
	private JTextField tf_cep;
	private JComboBox comboBox;
	private JLabel lblEstado;
	private JLabel lblProcedncia;

	/**
	 * Create the panel.
	 * 
	 * @throws ParseException
	 */
	public CadastroAluno() throws ParseException {
		getContentPane().setLayout(null);

		JLabel lbl_nome_interno = new JLabel("Nome completo");
		lbl_nome_interno.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl_nome_interno.setBounds(10, 54, 133, 19);
		getContentPane().add(lbl_nome_interno);

		tf_nome_interno = new JTextField();
		tf_nome_interno.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_nome_interno.setToolTipText("Informe seu nome completo.");
		tf_nome_interno.setBounds(10, 76, 447, 20);
		getContentPane().add(tf_nome_interno);
		tf_nome_interno.setColumns(10);

		ftm_cpf = new MaskFormatter(" ###. ###. ###- ##");// coloquei espaços
															// para ficar melhor
															// visualmente
		tf_cpf_interno = new JFormattedTextField(ftm_cpf);
		tf_cpf_interno.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_cpf_interno.setToolTipText("Informe seu CPF.");
		tf_cpf_interno.setColumns(10);
		tf_cpf_interno.setBounds(10, 139, 133, 20);
		getContentPane().add(tf_cpf_interno);
		JLabel lblCpf_interno = new JLabel("CPF");
		lblCpf_interno.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCpf_interno.setBounds(10, 117, 66, 19);
		getContentPane().add(lblCpf_interno);

		_TITLE = new JLabel("CADASTRO DE INTERNO");
		_TITLE.setFont(new Font("Cambria Math", Font.BOLD, 19));
		_TITLE.setBounds(10, 11, 260, 32);
		getContentPane().add(_TITLE);

		lblDataDeNascimento_interno = new JLabel("Data de Nascimento");
		lblDataDeNascimento_interno.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDataDeNascimento_interno.setBounds(324, 117, 133, 19);
		getContentPane().add(lblDataDeNascimento_interno);

		ftm_data = new MaskFormatter("    ##/ ##/ ####");// aqui também coloquei
															// espaços
		tf_data_nasc_interno = new JFormattedTextField(ftm_data);
		tf_data_nasc_interno.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_data_nasc_interno.setToolTipText("Informe sua data de nascimento.");
		tf_data_nasc_interno.setColumns(10);
		tf_data_nasc_interno.setBounds(324, 139, 133, 20);
		getContentPane().add(tf_data_nasc_interno);

		lblCurso_interno = new JLabel("Curso");
		lblCurso_interno.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCurso_interno.setBounds(10, 185, 133, 19);
		getContentPane().add(lblCurso_interno);

		tf_curso_interno = new JTextField();
		tf_curso_interno.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_curso_interno.setToolTipText("Informe seu nome completo.");
		tf_curso_interno.setColumns(10);
		tf_curso_interno.setBounds(10, 207, 168, 20);
		getContentPane().add(tf_curso_interno);

		tf_turma = new JTextField();
		tf_turma.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_turma.setToolTipText("Informe seu nome completo.");
		tf_turma.setColumns(10);
		tf_turma.setBounds(324, 207, 95, 20);
		getContentPane().add(tf_turma);

		lblTurma_interno = new JLabel("Turma");
		lblTurma_interno.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTurma_interno.setBounds(324, 185, 52, 19);
		getContentPane().add(lblTurma_interno);

		tf_quarto = new JTextField();
		tf_quarto.setToolTipText("Informe seu nome completo.");
		tf_quarto.setColumns(10);
		tf_quarto.setBounds(10, 281, 86, 20);
		getContentPane().add(tf_quarto);

		lblQuarto = new JLabel("Quarto");
		lblQuarto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblQuarto.setBounds(10, 259, 133, 19);
		getContentPane().add(lblQuarto);

		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblIdade.setBounds(259, 259, 133, 19);
		getContentPane().add(lblIdade);

		tf_idade = new JTextField();
		tf_idade.setToolTipText("Informe seu nome completo.");
		tf_idade.setColumns(10);
		tf_idade.setBounds(259, 281, 86, 20);
		getContentPane().add(tf_idade);

		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCidade.setBounds(10, 322, 133, 19);
		getContentPane().add(lblCidade);

		tf_cidade = new JTextField();
		tf_cidade.setToolTipText("Informe seu nome completo.");
		tf_cidade.setColumns(10);
		tf_cidade.setBounds(10, 344, 202, 20);
		getContentPane().add(tf_cidade);

		JLabel lblCep = new JLabel("CEP");
		lblCep.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCep.setBounds(10, 391, 133, 19);
		getContentPane().add(lblCep);

		tf_cep = new JTextField();
		tf_cep.setToolTipText("Informe seu nome completo.");
		tf_cep.setColumns(10);
		tf_cep.setBounds(10, 413, 86, 20);
		getContentPane().add(tf_cep);

		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "ES", "RJ", "SP", "MG", "AC ", " AL ", " AP ", " AM ",
				" BA ", " CE ", " DF ", " GO", " MA ", " MT ", " MS ", " PA ", " PB ", " PR ", " PE ", " PI ", " RN ",
				" RS ", " RO ", " RR ", " SC ", " SE ", " TO" }));
		comboBox.setBounds(317, 342, 59, 20);
		getContentPane().add(comboBox);

		lblEstado = new JLabel("Estado");
		lblEstado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEstado.setBounds(262, 343, 52, 19);
		getContentPane().add(lblEstado);

		lblProcedncia = new JLabel("Proced\u00EAncia");
		lblProcedncia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblProcedncia.setBounds(184, 412, 86, 21);
		getContentPane().add(lblProcedncia);

		JRadioButton rdRural = new JRadioButton("Rural\r\n");
		rdRural.setBounds(281, 412, 52, 23);
		getContentPane().add(rdRural);

		JRadioButton rdUrbana = new JRadioButton("Urbana");
		rdUrbana.setBounds(335, 412, 121, 23);
		getContentPane().add(rdUrbana);

	}

	public void run() {
		// TODO Auto-generated method stub
		try {
			CadastroAluno cadastro_aluno = new CadastroAluno();
			cadastro_aluno.setVisible(true);
			cadastro_aluno.setExtendedState(JFrame.MAXIMIZED_BOTH);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
