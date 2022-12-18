import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import redesocial.dados.Post;
import redesocial.dados.Usuario;
import redesocial.negocio.Sistema;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;

import java.awt.image.*;
import java.io.File;

import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class TelaPrincipal extends JFrame {

	private JPanel AngelaRedeSocial;
	private JTextField txtCadastroLogin;
	private JTextField txtPreenchaInfos;
	private JTextField txtNomeCadastro;
	private JTextField txtSobrenomeCadastro;
	private JTextField txtUsernameCadastro;
	private JTextField txtUsernameLogin;
	
	private Sistema sistema = new Sistema();
	private UsuarioTableModel tableModel = new UsuarioTableModel();
	private Usuario usuario;
	private Post post;
	private JPasswordField pwdSenhaCadastro;
	private JPasswordField pwdSenhaLogin;
	private UsuarioComboBoxModel usuarioComboBoxModel;
	private JTable tableUsers;
	private JTable tableFeed;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		
		usuarioComboBoxModel = new UsuarioComboBoxModel();		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		AngelaRedeSocial = new JPanel();
		AngelaRedeSocial.setBackground(new Color(255, 255, 255));
		AngelaRedeSocial.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(AngelaRedeSocial);
		AngelaRedeSocial.setLayout(new CardLayout(0, 0));
		
		JPanel CadastroLogin = new JPanel();
		CadastroLogin.setBackground(new Color(246, 242, 233));
		AngelaRedeSocial.add(CadastroLogin, "name_236394825753410");
		CadastroLogin.setLayout(null);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setBackground(new Color(223, 149, 74));
		btnLogin.setFont(new Font("Chandas", Font.BOLD, 12));
		btnLogin.setBounds(217, 124, 117, 25);
		CadastroLogin.add(btnLogin);
		
		JPanel TelaCadastro = new JPanel();
		TelaCadastro.setBackground(new Color(246, 242, 233));
		AngelaRedeSocial.add(TelaCadastro, "name_237548429760670");
		TelaCadastro.setLayout(null);
		
		txtPreenchaInfos = new JTextField();
		txtPreenchaInfos.setForeground(new Color(246, 242, 233));
		txtPreenchaInfos.setBackground(new Color(223, 150, 74));
		txtPreenchaInfos.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtPreenchaInfos.setBounds(100, 12, 237, 19);
		txtPreenchaInfos.setText("Preencha suas informações abaixo.");
		TelaCadastro.add(txtPreenchaInfos);
		txtPreenchaInfos.setColumns(10);
		
		txtNomeCadastro = new JTextField();
		txtNomeCadastro.setText("Digite seu nome");
		txtNomeCadastro.setBounds(162, 41, 114, 19);
		TelaCadastro.add(txtNomeCadastro);
		txtNomeCadastro.setColumns(10);
		
		JLabel lblNomeCadastro = new JLabel("Nome:");
		lblNomeCadastro.setForeground(new Color(223, 150, 74));
		lblNomeCadastro.setBounds(110, 43, 70, 15);
		TelaCadastro.add(lblNomeCadastro);
		
		JLabel lblSobrenomeCadastro = new JLabel("Sobrenome:");
		lblSobrenomeCadastro.setForeground(new Color(223, 150, 74));
		lblSobrenomeCadastro.setBounds(110, 69, 92, 15);
		TelaCadastro.add(lblSobrenomeCadastro);
		
		txtSobrenomeCadastro = new JTextField();
		txtSobrenomeCadastro.setText("Digite seu sobrenome");
		txtSobrenomeCadastro.setColumns(10);
		txtSobrenomeCadastro.setBounds(205, 67, 160, 19);
		TelaCadastro.add(txtSobrenomeCadastro);
		
		JLabel lblUsernameCadastro = new JLabel("Username:");
		lblUsernameCadastro.setForeground(new Color(223, 150, 74));
		lblUsernameCadastro.setBounds(110, 95, 92, 15);
		TelaCadastro.add(lblUsernameCadastro);
		
		txtUsernameCadastro = new JTextField();
		txtUsernameCadastro.setText("Digite seu username");
		txtUsernameCadastro.setColumns(10);
		txtUsernameCadastro.setBounds(205, 93, 160, 19);
		TelaCadastro.add(txtUsernameCadastro);
		
		JLabel lblSenhaCadastro = new JLabel("Senha:");
		lblSenhaCadastro.setForeground(new Color(223, 150, 74));
		lblSenhaCadastro.setBounds(110, 124, 92, 15);
		TelaCadastro.add(lblSenhaCadastro);
		
		JButton btnCadastrarCadastro = new JButton("CADASTRAR");
		
		btnCadastrarCadastro.setBackground(new Color(223, 150, 74));
		btnCadastrarCadastro.setBounds(162, 184, 117, 25);
		TelaCadastro.add(btnCadastrarCadastro);
		
		pwdSenhaCadastro = new JPasswordField();
		pwdSenhaCadastro.setText("Digite sua senha");
		pwdSenhaCadastro.setBounds(205, 124, 129, 19);
		TelaCadastro.add(pwdSenhaCadastro);
		
		JLabel lblVoltarParaOLogin = new JLabel("Voltar para o Login");
		
		lblVoltarParaOLogin.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblVoltarParaOLogin.setBounds(166, 210, 136, 15);
		TelaCadastro.add(lblVoltarParaOLogin);
		
		JButton btnCadastro = new JButton("CADASTRO");
		btnCadastro.setBackground(new Color(223, 149, 74));
		btnCadastro.setFont(new Font("Chandas", Font.BOLD, 12));
		btnCadastro.setBounds(75, 124, 117, 25);
		CadastroLogin.add(btnCadastro);
		
		txtCadastroLogin = new JTextField();
		txtCadastroLogin.setBackground(new Color(246, 242, 233));
		txtCadastroLogin.setForeground(new Color(223, 150, 74));
		txtCadastroLogin.setText("Cadastre-se ou faça seu login.");
		txtCadastroLogin.setBounds(117, 76, 199, 19);
		CadastroLogin.add(txtCadastroLogin);
		txtCadastroLogin.setColumns(10);
		
		JPanel TelaLogin = new JPanel();
		TelaLogin.setBackground(new Color(246, 242, 233));
		AngelaRedeSocial.add(TelaLogin, "name_21515765104272");
		TelaLogin.setLayout(null);
		
		JLabel lblTxtLogin = new JLabel("Faça seu login.");
		lblTxtLogin.setForeground(new Color(223, 150, 74));
		lblTxtLogin.setBackground(new Color(223, 150, 74));
		lblTxtLogin.setBounds(164, 12, 107, 15);
		TelaLogin.add(lblTxtLogin);
		
		JLabel lblUsernameLogin = new JLabel("Username:");
		lblUsernameLogin.setForeground(new Color(223, 150, 74));
		lblUsernameLogin.setBounds(77, 57, 88, 15);
		TelaLogin.add(lblUsernameLogin);
		
		txtUsernameLogin = new JTextField();
		txtUsernameLogin.setForeground(new Color(246, 242, 233));
		txtUsernameLogin.setBackground(new Color(223, 150, 74));
		txtUsernameLogin.setText("Digite seu nome de usuário");
		txtUsernameLogin.setBounds(164, 54, 179, 19);
		TelaLogin.add(txtUsernameLogin);
		txtUsernameLogin.setColumns(10);
		
		JLabel lblSenhaLogin = new JLabel("Senha:");
		lblSenhaLogin.setForeground(new Color(223, 150, 74));
		lblSenhaLogin.setBounds(76, 88, 88, 15);
		TelaLogin.add(lblSenhaLogin);
		
		JButton btnLoginLogin = new JButton("LOGIN");
		
		btnLoginLogin.setForeground(new Color(51, 51, 51));
		btnLoginLogin.setBackground(new Color(223, 149, 74));
		btnLoginLogin.setBounds(170, 133, 117, 25);
		TelaLogin.add(btnLoginLogin);
		
		pwdSenhaLogin = new JPasswordField();
		pwdSenhaLogin.setText("Digite sua senha");
		pwdSenhaLogin.setBounds(164, 84, 125, 19);
		TelaLogin.add(pwdSenhaLogin);
		
		JLabel lblVoltarParaCadastro = new JLabel("Voltar para o Cadastro");
		
		lblVoltarParaCadastro.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblVoltarParaCadastro.setBounds(165, 163, 151, 15);
		TelaLogin.add(lblVoltarParaCadastro);
		
		JPanel perfilUsuario = new JPanel();
		AngelaRedeSocial.add(perfilUsuario, "name_25199243360317");
		perfilUsuario.setLayout(null);
		
		JPanel asidePerfil = new JPanel();
		asidePerfil.setBackground(new Color(223, 149, 74));
		asidePerfil.setBounds(0, 0, 148, 253);
		perfilUsuario.add(asidePerfil);
		asidePerfil.setLayout(null);
		
		JPanel asideMeuPerfil = new JPanel();
		
		asideMeuPerfil.setBounds(0, 137, 148, 30);
		asidePerfil.add(asideMeuPerfil);
		asideMeuPerfil.setBackground(new Color(255, 163, 72));
		asideMeuPerfil.setLayout(null);
		
		JLabel lblMeuPerfil = new JLabel("Meu Perfil");
		lblMeuPerfil.setBounds(35, 6, 71, 15);
		asideMeuPerfil.add(lblMeuPerfil);
		
		JPanel asideBuscarUsuarios = new JPanel();
		asideBuscarUsuarios.setBackground(new Color(255, 163, 72));
		asideBuscarUsuarios.setBounds(0, 179, 148, 30);
		asidePerfil.add(asideBuscarUsuarios);
		asideBuscarUsuarios.setLayout(null);
		
		JComboBox comboBoxBuscarPerfis = new JComboBox();
		
		comboBoxBuscarPerfis.setModel(new DefaultComboBoxModel(new String[] {"Buscar Users"}));
		comboBoxBuscarPerfis.setBackground(new Color(223, 149, 74));
		comboBoxBuscarPerfis.setMaximumRowCount(10);
		comboBoxBuscarPerfis.setBounds(8, 3, 138, 24);
		asideBuscarUsuarios.add(comboBoxBuscarPerfis);
		
		JLabel lblAsideUsername = new JLabel("@username");
		lblAsideUsername.setFont(new Font("Dialog", Font.BOLD, 10));
		lblAsideUsername.setBounds(39, 84, 70, 15);
		asidePerfil.add(lblAsideUsername);
		
		JLabel lblAsideBio = new JLabel("Adicione uma biografia");
		
		lblAsideBio.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblAsideBio.setForeground(new Color(119, 118, 123));
		lblAsideBio.setBounds(20, 89, 124, 30);
		asidePerfil.add(lblAsideBio);
		
		JPanel asideSair = new JPanel();
		asideSair.setLayout(null);
		asideSair.setBackground(new Color(255, 163, 72));
		asideSair.setBounds(0, 221, 148, 30);
		asidePerfil.add(asideSair);
		
		JLabel lblAsideSair = new JLabel("Sair");
		
		lblAsideSair.setBounds(50, 6, 71, 15);
		asideSair.add(lblAsideSair);
		
		JLabel lblFotoPerfilFeed = new JLabel("Adicione uma foto");
		
		lblFotoPerfilFeed.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblFotoPerfilFeed.setBounds(25, 13, 97, 62);
		asidePerfil.add(lblFotoPerfilFeed);
		
		JButton btnAdicionarFotoPerfil = new JButton("Adicionar foto");
		
		btnAdicionarFotoPerfil.setBounds(2, 0, 144, 15);
		asidePerfil.add(btnAdicionarFotoPerfil);
		
		JPanel feedUsuario = new JPanel();
		feedUsuario.setBackground(new Color(252, 220, 181));
		feedUsuario.setBounds(152, -12, 288, 265);
		perfilUsuario.add(feedUsuario);
		feedUsuario.setLayout(null);
		
		JLabel lblFeedUsuarioWelmcome = new JLabel("Feed");
		lblFeedUsuarioWelmcome.setBounds(110, 12, 61, 22);
		feedUsuario.add(lblFeedUsuarioWelmcome);
		
		JScrollPane scrollPaneFeed = new JScrollPane();
		scrollPaneFeed.setBounds(0, 46, 276, 219);
		feedUsuario.add(scrollPaneFeed);
		
		tableFeed = new JTable();
		tableFeed.setBackground(new Color(252, 220, 181));
		tableFeed.setBounds(0, 46, 276, 219);
		feedUsuario.add(tableFeed);
		
		JButton btnPostarFotoFeed = new JButton("Postar Foto");
		
		btnPostarFotoFeed.setFont(new Font("Dialog", Font.PLAIN, 10));
		btnPostarFotoFeed.setBounds(170, 17, 100, 20);
		feedUsuario.add(btnPostarFotoFeed);
		
		JLabel fotoPerfilUsuario = new JLabel("");
		fotoPerfilUsuario.setBackground(new Color(255, 190, 111));
		fotoPerfilUsuario.setBounds(148, 0, 292, 267);
		perfilUsuario.add(fotoPerfilUsuario);
		
		JPanel MeuPerfil = new JPanel();
		MeuPerfil.setBackground(new Color(246, 242, 233));
		AngelaRedeSocial.add(MeuPerfil, "name_65213767112578");
		MeuPerfil.setLayout(null);
		
		JPanel faixaMeuPerfil = new JPanel();
		faixaMeuPerfil.setBackground(new Color(223, 150, 74));
		faixaMeuPerfil.setBounds(0, -19, 440, 86);
		MeuPerfil.add(faixaMeuPerfil);
		faixaMeuPerfil.setLayout(null);
		
		JLabel lblusuarioMeuPerfil = new JLabel("@usuario");
		lblusuarioMeuPerfil.setBounds(132, 24, 70, 15);
		faixaMeuPerfil.add(lblusuarioMeuPerfil);
		
		JLabel lblBioMeuPerfil = new JLabel("Digite sua biografia");
		lblBioMeuPerfil.setForeground(new Color(119, 118, 123));
		lblBioMeuPerfil.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblBioMeuPerfil.setBounds(133, 41, 148, 15);
		faixaMeuPerfil.add(lblBioMeuPerfil);
		
		JButton btnSeguirMeuPerfil = new JButton("Seguir");
		btnSeguirMeuPerfil.setFont(new Font("Dialog", Font.PLAIN, 10));
		
		btnSeguirMeuPerfil.setBounds(370, 22, 70, 20);
		faixaMeuPerfil.add(btnSeguirMeuPerfil);
		
		JButton btnVoltarAoFeed = new JButton("<");
		
		btnVoltarAoFeed.setBackground(new Color(252, 220, 181));
		btnVoltarAoFeed.setFont(new Font("Dialog", Font.BOLD, 12));
		btnVoltarAoFeed.setBounds(0, 19, 45, 20);
		faixaMeuPerfil.add(btnVoltarAoFeed);
		
		JButton btnSeguidores = new JButton("Seguidores");
		
		btnSeguidores.setFont(new Font("Dialog", Font.PLAIN, 10));
		btnSeguidores.setBounds(263, 22, 95, 20);
		faixaMeuPerfil.add(btnSeguidores);
		
		JComboBox comboBoxSeguindo = new JComboBox();
		comboBoxSeguindo.setBounds(299, 50, 132, 24);
		faixaMeuPerfil.add(comboBoxSeguindo);
		
		JPanel tabelaSeguiodores = new JPanel();
		tabelaSeguiodores.setBackground(new Color(252, 220, 181));
		tabelaSeguiodores.setBounds(281, 66, 159, 187);
		MeuPerfil.add(tabelaSeguiodores);
		tabelaSeguiodores.setLayout(null);
		tabelaSeguiodores.setVisible(false);	
		
		tableUsers = new JTable();
		tableUsers.setBounds(12, 12, 137, 150);
		tabelaSeguiodores.add(tableUsers);
		
		
		//Ir para a tela do cadastro
		btnCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AngelaRedeSocial.removeAll();
				AngelaRedeSocial.repaint();
				AngelaRedeSocial.revalidate();
				AngelaRedeSocial.add(TelaCadastro);
				AngelaRedeSocial.repaint();
				AngelaRedeSocial.revalidate();
			}
		});
		
		
		//Voltar para o login
		lblVoltarParaOLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AngelaRedeSocial.removeAll();
				AngelaRedeSocial.repaint();
				AngelaRedeSocial.revalidate();
				AngelaRedeSocial.add(TelaLogin);
				AngelaRedeSocial.repaint();
				AngelaRedeSocial.revalidate();
			}
		});
		
		//Cadastrar e adicionar os cadastrados ao combobox de buscar perfis
		btnCadastrarCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//aqui fazer o cadastro da pessoa
				Usuario user = new Usuario();
				user.setNome(txtNomeCadastro.getText());
				user.setSobrenome(txtSobrenomeCadastro.getText());
				user.setUsername(txtUsernameCadastro.getText());
				user.setSenha(new String(pwdSenhaCadastro.getPassword()).trim());
				sistema.cadastroUsuario(user);
				System.out.println("Usuário cadastrado com sucesso!");
				//combobox
				usuarioComboBoxModel.addUsuarios(user);
				comboBoxBuscarPerfis.setModel(usuarioComboBoxModel);
				AngelaRedeSocial.removeAll();
				AngelaRedeSocial.repaint();
				AngelaRedeSocial.revalidate();
				AngelaRedeSocial.add(CadastroLogin);
				AngelaRedeSocial.repaint();
				AngelaRedeSocial.revalidate();
				
			}
		});
		
		//Voltar para a tela cadastro
		lblVoltarParaCadastro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AngelaRedeSocial.removeAll();
				AngelaRedeSocial.repaint();
				AngelaRedeSocial.revalidate();
				AngelaRedeSocial.add(TelaCadastro);
				AngelaRedeSocial.repaint();
				AngelaRedeSocial.revalidate();
			}
		});
		
		
		
		//Ir para o login
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AngelaRedeSocial.removeAll();
				AngelaRedeSocial.repaint();
				AngelaRedeSocial.revalidate();
				AngelaRedeSocial.add(TelaLogin);
				AngelaRedeSocial.repaint();
				AngelaRedeSocial.revalidate();
			}
		});
			
		//Fazer login
		btnLoginLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = txtUsernameLogin.getText();
				String senha = new String(pwdSenhaLogin.getPassword()).trim();
				usuario = sistema.login(username, senha);
				if (usuario == null) {
					System.out.println("Erro ao autenticar.");
				}else {
					System.out.println("Você está sendo redirecionado para o seu feed!");
					lblAsideUsername.setText(username);
					lblusuarioMeuPerfil.setText(username);
					AngelaRedeSocial.removeAll();
					AngelaRedeSocial.repaint();
					AngelaRedeSocial.revalidate();
					AngelaRedeSocial.add(perfilUsuario);
					AngelaRedeSocial.repaint();
					AngelaRedeSocial.revalidate();
				}
				}
		});
		
		//Adicionar uma bio
		lblAsideBio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String bio = JOptionPane.showInputDialog("Digite a sua biografia");
				usuario.setBio(bio);
				lblAsideBio.setText(usuario.getBio());
				lblBioMeuPerfil.setText(usuario.getBio());
				
			}
		});
		
		//Breguenai das fotinhas
		btnAdicionarFotoPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setDialogTitle("Escolha sua foto de perfil");
				fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
				int retorno = fileChooser.showOpenDialog(btnAdicionarFotoPerfil);
				
				if (retorno == JFileChooser.APPROVE_OPTION) {
					File file = fileChooser.getSelectedFile();
					//lblFotoPerfilFeed.setIcon(new ImageIcon(file.getPath()));
					ImageIcon icon = new ImageIcon(file.getPath());
					icon.setImage(icon.getImage().getScaledInstance(lblFotoPerfilFeed.getWidth(), lblFotoPerfilFeed.getHeight(), 1));
					lblFotoPerfilFeed.setIcon(icon);
				}
			}
		});
		
		//verInfos do usuario que selecionei no combobox
		comboBoxBuscarPerfis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Usuario usuarioSelecionado = (Usuario) comboBoxBuscarPerfis.getSelectedItem();
			int resp = JOptionPane.showConfirmDialog(tableUsers, "Você deseja seguir esse perfil?", "Selecione a opção", JOptionPane.YES_NO_CANCEL_OPTION);
			if(resp == JOptionPane.YES_OPTION) {
				sistema.follow(usuario, usuarioSelecionado);
				System.out.println("Usuario seguido");
			}else {
				System.out.println("Usuário não seguido.");
			}
			}
		});
		
		//Postara foto no feed
		btnPostarFotoFeed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Post p = new Post();
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setDialogTitle("Escolha uma foto para postar");
				fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
				int retorno = fileChooser.showOpenDialog(btnPostarFotoFeed);
				if (retorno == JFileChooser.APPROVE_OPTION) {
					File file = fileChooser.getSelectedFile();
					//lblFotoPerfilFeed.setIcon(new ImageIcon(file.getPath()));
					ImageIcon icon = new ImageIcon(file.getPath());
					icon.setImage(icon.getImage().getScaledInstance(lblFotoPerfilFeed.getWidth(), lblFotoPerfilFeed.getHeight(), 1));
					lblFotoPerfilFeed.setIcon(icon);
				}
				
				
				usuario.adicionarPost(p);
			}
		});
		
		
		
		//Ir para o JPanel MeuPerfil
		asideMeuPerfil.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//adicionar evento pra ir para o perfil
				//Usuario u = 
				AngelaRedeSocial.removeAll();
				AngelaRedeSocial.repaint();
				AngelaRedeSocial.revalidate();
				AngelaRedeSocial.add(MeuPerfil);
				AngelaRedeSocial.repaint();
				AngelaRedeSocial.revalidate();		
			}
		});
		
		//ver users seguidos
		btnSeguidores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabelaSeguiodores.setVisible(true);
				
				for (Usuario usu : sistema.verUsuariosSeguidos(usuario)) {
					tableModel.addRow(usu);
				}
				
			}
		});
		
		
		//Seguir algum user
		/*
		btnSeguirMeuPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Usuario seguirUsuario =
				sistema.follow(usuario, null);
				
			}
		});
		*/
		
		//Voltar para o Feed
		btnVoltarAoFeed.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AngelaRedeSocial.removeAll();
				AngelaRedeSocial.repaint();
				AngelaRedeSocial.revalidate();
				AngelaRedeSocial.add(perfilUsuario);
				AngelaRedeSocial.repaint();
				AngelaRedeSocial.revalidate();
			}
		});
		
		
		//Sair e voltar à tela de login
		lblAsideSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//sair 
				AngelaRedeSocial.removeAll();
				AngelaRedeSocial.repaint();
				AngelaRedeSocial.revalidate();
				AngelaRedeSocial.add(TelaLogin);
				txtUsernameLogin.setText("");
				pwdSenhaLogin.setText("");
				AngelaRedeSocial.repaint();
				AngelaRedeSocial.revalidate();
			}
		});
		
		
	}
}

