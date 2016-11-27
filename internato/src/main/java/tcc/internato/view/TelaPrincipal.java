package tcc.internato.view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void run() {
		try {
			TelaPrincipal frame = new TelaPrincipal();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the frame.
	 */
	public TelaPrincipal() {
		setTitle("STARK - Sistema Internato");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 687, 251);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		setJMenuBar(menuBar);

		JMenu mnInterno = new JMenu("Interno   ");
		mnInterno.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		menuBar.add(mnInterno);

		JMenuItem mntmCadastrarInterno = new JMenuItem("Cadastrar Interno");
		mnInterno.add(mntmCadastrarInterno);
		mntmCadastrarInterno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					CadastroInterno cadastro_interno = new CadastroInterno();
					cadastro_interno.run();
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

		JMenuItem mntmVisualizarInterno = new JMenuItem("Visualizar Interno");
		mnInterno.add(mntmVisualizarInterno);

		JMenu mnQuarto = new JMenu("Quarto   ");
		mnQuarto.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		menuBar.add(mnQuarto);

		JMenuItem mntmVerQuartos = new JMenuItem("Ver Quartos");
		mnQuarto.add(mntmVerQuartos);

		JMenuItem mntmIncluirInterno = new JMenuItem("Alocar Interno");
		mnQuarto.add(mntmIncluirInterno);

		JMenuItem mntmTrocarInterno = new JMenuItem("Trocar Interno");
		mnQuarto.add(mntmTrocarInterno);

		JMenuItem mntmTrocarDiaLimpeza = new JMenuItem("Trocar dia Limpeza");
		mnQuarto.add(mntmTrocarDiaLimpeza);

		JMenu mnChamada = new JMenu("Chamada   ");
		mnChamada.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		menuBar.add(mnChamada);

		JMenuItem mntmNovaChamadahoje = new JMenuItem("Nova Chamada (Hoje)");
		mnChamada.add(mntmNovaChamadahoje);

		JMenuItem mntmVerChaadas = new JMenuItem("Ver Chamadas");
		mnChamada.add(mntmVerChaadas);

		JMenu mnVistoria = new JMenu("Vistoria   ");
		mnVistoria.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		menuBar.add(mnVistoria);

		JMenuItem mntmNovaVistoria = new JMenuItem("Nova Vistoria");
		mnVistoria.add(mntmNovaVistoria);

		JMenu mnVisualizar = new JMenu("Buscar");
		mnVistoria.add(mnVisualizar);

		JMenuItem mntmTodas = new JMenuItem("Todas");
		mnVisualizar.add(mntmTodas);

		JMenuItem mntmBuscarPorDia = new JMenuItem("Filtrar por Dia");
		mnVisualizar.add(mntmBuscarPorDia);

		JMenu mnAtoDeIndisciplina = new JMenu("Ato de Indisciplina   ");
		mnAtoDeIndisciplina.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		menuBar.add(mnAtoDeIndisciplina);

		JMenuItem mntmNovoAto = new JMenuItem("Novo Ato");
		mntmNovoAto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AtoIndisciplinar ato_indisciplinar = new AtoIndisciplinar();
				ato_indisciplinar.run();

			}
		});
		mnAtoDeIndisciplina.add(mntmNovoAto);

		JMenuItem mntmBuscarAto = new JMenuItem("Buscar Ato");
		mnAtoDeIndisciplina.add(mntmBuscarAto);

		JMenu mnRegulamento = new JMenu("Regulamento");
		mnAtoDeIndisciplina.add(mnRegulamento);

		JMenuItem mntmNovo = new JMenuItem("Novo");
		mntmNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Regulamento regulamento = new Regulamento();
				regulamento.run();
			}
		});
		mnRegulamento.add(mntmNovo);

		JMenuItem mntmBuscar = new JMenuItem("Buscar");
		mnRegulamento.add(mntmBuscar);

		JMenu mnRelatrios = new JMenu("Relatórios   ");
		mnRelatrios.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		menuBar.add(mnRelatrios);

		JMenuItem mntmLimpeza = new JMenuItem("Limpeza");
		mnRelatrios.add(mntmLimpeza);

		JMenuItem mntmFrequncia = new JMenuItem("Frequência");
		mnRelatrios.add(mntmFrequncia);

		JMenuItem mntmDisciplina = new JMenuItem("Disciplina");
		mnRelatrios.add(mntmDisciplina);

		JMenu mnServidor = new JMenu("Servidor");
		mnServidor.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		menuBar.add(mnServidor);

		JMenuItem mntmNovoServidor = new JMenuItem("Novo Servidor");
		mntmNovoServidor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroServidor cadastro_servidor = new CadastroServidor();
				cadastro_servidor.run();
			}
		});
		mnServidor.add(mntmNovoServidor);

		JMenuItem mntmBuscarServidor = new JMenuItem("Buscar Servidor");
		mnServidor.add(mntmBuscarServidor);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING).addGap(0, 661, Short.MAX_VALUE));
		gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING).addGap(0, 202, Short.MAX_VALUE));
		contentPane.setLayout(gl_contentPane);
	}
}
