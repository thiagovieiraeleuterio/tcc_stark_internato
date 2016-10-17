package tcc.internato.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class Ocorrencia extends JFrame {

	private JPanel contentPane;
	private JTextField tf_nome_interno_oco;
	private JTextField tf_curso_oco;
	private JTextField tf_turma_oco;
	private JTextField tf_quarto_oco;
	private JRadioButton rb_quarto_todo_oco;
	private JLabel label_4;
	private JTextField tf_servidor_oco;
	private JLabel lblDescrioDaOcorrncia;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JLabel lblOcorrncia;

	/**
	 * Launch the application.
	 */
	
			public void run() {
				try {
					Ocorrencia frame = new Ocorrencia();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
		
	}

	/**
	 * Create the frame.
	 */
	public Ocorrencia() {
		setTitle("Ocorrência");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 679, 553);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Nome Interno:");
		label.setBounds(39, 98, 103, 19);
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(label);
		
		tf_nome_interno_oco = new JTextField();
		tf_nome_interno_oco.setBounds(138, 95, 428, 25);
		tf_nome_interno_oco.setToolTipText("Informe o nome completo.");
		tf_nome_interno_oco.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_nome_interno_oco.setColumns(10);
		contentPane.add(tf_nome_interno_oco);
		
		JLabel label_1 = new JLabel("Curso:");
		label_1.setBounds(39, 146, 44, 19);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(label_1);
		
		tf_curso_oco = new JTextField();
		tf_curso_oco.setBounds(82, 143, 136, 25);
		tf_curso_oco.setToolTipText("Informe o nome completo.");
		tf_curso_oco.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_curso_oco.setColumns(10);
		contentPane.add(tf_curso_oco);
		
		JLabel label_2 = new JLabel("Turma:");
		label_2.setBounds(239, 146, 52, 19);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(label_2);
		
		tf_turma_oco = new JTextField();
		tf_turma_oco.setBounds(287, 143, 44, 25);
		tf_turma_oco.setToolTipText("Informe o nome completo.");
		tf_turma_oco.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_turma_oco.setColumns(10);
		contentPane.add(tf_turma_oco);
		
		JLabel label_3 = new JLabel("Quarto:");
		label_3.setBounds(368, 146, 52, 19);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(label_3);
		
		tf_quarto_oco = new JTextField();
		tf_quarto_oco.setBounds(419, 143, 44, 25);
		tf_quarto_oco.setToolTipText("Informe o nome completo.");
		tf_quarto_oco.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_quarto_oco.setColumns(10);
		contentPane.add(tf_quarto_oco);
		
		rb_quarto_todo_oco = new JRadioButton("Quarto Todo");
		rb_quarto_todo_oco.setBounds(480, 146, 86, 23);
		contentPane.add(rb_quarto_todo_oco);
		
		label_4 = new JLabel("Nome Servidor:");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_4.setBounds(40, 195, 103, 19);
		contentPane.add(label_4);
		
		tf_servidor_oco = new JTextField();
		tf_servidor_oco.setToolTipText("Informe o nome completo.");
		tf_servidor_oco.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_servidor_oco.setColumns(10);
		tf_servidor_oco.setBounds(151, 192, 140, 25);
		contentPane.add(tf_servidor_oco);
		
		lblDescrioDaOcorrncia = new JLabel("Descrição da Ocorrência:");
		lblDescrioDaOcorrncia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDescrioDaOcorrncia.setBounds(39, 238, 171, 19);
		contentPane.add(lblDescrioDaOcorrncia);
		
		button = new JButton("Cancelar");
		button.setForeground(Color.RED);
		button.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button.setBackground(Color.GRAY);
		button.setBounds(39, 467, 128, 25);
		contentPane.add(button);
		
		button_1 = new JButton("SALVAR E IMPRIMIR");
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_1.setBounds(203, 467, 212, 25);
		contentPane.add(button_1);
		
		button_2 = new JButton("SALVAR");
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_2.setBounds(443, 467, 128, 25);
		contentPane.add(button_2);
		
		lblOcorrncia = new JLabel("OCORRÊNCIA");
		lblOcorrncia.setFont(new Font("Cambria Math", Font.BOLD, 19));
		lblOcorrncia.setBounds(39, 31, 221, 23);
		contentPane.add(lblOcorrncia);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(39, 268, 527, 153);
		contentPane.add(textArea);
	}
}
