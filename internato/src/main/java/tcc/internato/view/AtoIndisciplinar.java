package tcc.internato.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;

public class AtoIndisciplinar extends JFrame {

	private JPanel contentPane;
	private JTextField tf_nome_interno_ato;
	private JTextField tf_curso_ato;
	private JTextField tf_quarto_ato;
	private JTextField tf_turma_ato;
	private JTextField tf_nome_servidor_ato;

	/**
	 * Launch the application.
	 */
	
			public void run() {
				try {
					AtoIndisciplinar frame = new AtoIndisciplinar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
		
	}

	/**
	 * Create the frame.
	 */
	public AtoIndisciplinar() {
		setTitle("Ato de Indisciplina");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 642, 742);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tf_nome_interno_ato = new JTextField();
		tf_nome_interno_ato.setToolTipText("Informe o nome completo.");
		tf_nome_interno_ato.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_nome_interno_ato.setColumns(10);
		tf_nome_interno_ato.setBounds(129, 106, 466, 25);
		contentPane.add(tf_nome_interno_ato);
		
		JLabel lblNomeInterno = new JLabel("Nome Interno:");
		lblNomeInterno.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNomeInterno.setBounds(27, 109, 103, 19);
		contentPane.add(lblNomeInterno);
		
		JLabel lblCurso = new JLabel("Curso:");
		lblCurso.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCurso.setBounds(27, 158, 44, 19);
		contentPane.add(lblCurso);
		
		tf_curso_ato = new JTextField();
		tf_curso_ato.setToolTipText("Informe o nome completo.");
		tf_curso_ato.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_curso_ato.setColumns(10);
		tf_curso_ato.setBounds(81, 155, 136, 25);
		contentPane.add(tf_curso_ato);
		
		JLabel lblQuarto = new JLabel("Quarto:");
		lblQuarto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblQuarto.setBounds(366, 158, 60, 19);
		contentPane.add(lblQuarto);
		
		tf_quarto_ato = new JTextField();
		tf_quarto_ato.setToolTipText("Informe o nome completo.");
		tf_quarto_ato.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_quarto_ato.setColumns(10);
		tf_quarto_ato.setBounds(420, 155, 44, 25);
		contentPane.add(tf_quarto_ato);
		
		JLabel lblTurma = new JLabel("Turma:");
		lblTurma.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTurma.setBounds(239, 158, 52, 19);
		contentPane.add(lblTurma);
		
		tf_turma_ato = new JTextField();
		tf_turma_ato.setToolTipText("Informe o nome completo.");
		tf_turma_ato.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_turma_ato.setColumns(10);
		tf_turma_ato.setBounds(292, 155, 44, 25);
		contentPane.add(tf_turma_ato);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setForeground(Color.BLACK);
		horizontalStrut.setBounds(0, 191, 624, 10);
		contentPane.add(horizontalStrut);
		
		JLabel lblNomeServidor = new JLabel("Nome Servidor:");
		lblNomeServidor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNomeServidor.setBounds(68, 234, 103, 19);
		contentPane.add(lblNomeServidor);
		
		tf_nome_servidor_ato = new JTextField();
		tf_nome_servidor_ato.setToolTipText("Informe o nome completo.");
		tf_nome_servidor_ato.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_nome_servidor_ato.setColumns(10);
		tf_nome_servidor_ato.setBounds(181, 231, 140, 25);
		contentPane.add(tf_nome_servidor_ato);
		
		JLabel lblDescrioDoAto = new JLabel("Descrição do ato:");
		lblDescrioDoAto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDescrioDoAto.setBounds(50, 331, 121, 19);
		contentPane.add(lblDescrioDoAto);
		
		JComboBox cb_apelido_reg_ato = new JComboBox();
		cb_apelido_reg_ato.setBounds(181, 282, 114, 20);
		contentPane.add(cb_apelido_reg_ato);
		
		JLabel lblSugestes = new JLabel("Sugestões:");
		lblSugestes.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSugestes.setBounds(85, 281, 86, 19);
		contentPane.add(lblSugestes);
		
		JTextPane tp_descricao_ato = new JTextPane();
		tp_descricao_ato.setBounds(181, 331, 333, 112);
		contentPane.add(tp_descricao_ato);
		
		JLabel lblRefernciaDoRegulamento = new JLabel("Referência do Regulamento:");
		lblRefernciaDoRegulamento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRefernciaDoRegulamento.setBounds(69, 465, 201, 19);
		contentPane.add(lblRefernciaDoRegulamento);
		
		JTextPane tp_regulamento_ato = new JTextPane();
		tp_regulamento_ato.setText("Preenchido automaticamente.");
		tp_regulamento_ato.setBounds(182, 506, 333, 79);
		contentPane.add(tp_regulamento_ato);
		
		JLabel lblAtoDeIndisciplina = new JLabel("ATO DE INDISCIPLINA");
		lblAtoDeIndisciplina.setFont(new Font("Cambria Math", Font.BOLD, 19));
		lblAtoDeIndisciplina.setBounds(69, 31, 221, 23);
		contentPane.add(lblAtoDeIndisciplina);
		
		JButton button = new JButton("Cancelar");
		button.setForeground(Color.RED);
		button.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button.setBackground(Color.GRAY);
		button.setBounds(50, 646, 128, 25);
		contentPane.add(button);
		
		JButton btnSalvar = new JButton("SALVAR");
		btnSalvar.setIcon(new ImageIcon(AtoIndisciplinar.class.getResource("/javax/swing/plaf/metal/icons/ocean/floppy.gif")));
		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSalvar.setBounds(454, 646, 128, 25);
		contentPane.add(btnSalvar);
		
		JButton btnSalvarEImprimir = new JButton("SALVAR E IMPRIMIR");
		btnSalvarEImprimir.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSalvarEImprimir.setBounds(214, 646, 212, 25);
		contentPane.add(btnSalvarEImprimir);
		
		JRadioButton rd_Quartotodo = new JRadioButton("Quarto Todo");
		rd_Quartotodo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rd_Quartotodo.setBounds(483, 156, 112, 23);
		contentPane.add(rd_Quartotodo);
	}
}
