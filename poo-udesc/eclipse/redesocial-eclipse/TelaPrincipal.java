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
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import java.awt.image.*;

public class TelaPrincipal extends JFrame {

	private JPanel AngelaRedeSocial;
	private JTextField txtCadastroLogin;
	private JTextField txtPreenchaInfos;
	private JTextField txtNomeCadastro;
	private JTextField txtSobrenomeCadastro;
	private JTextField txtUsernameCadastro;
	private JTextField txtUsernameLogin;
	
	private Sistema sistema = new Sistema();
	private Usuario usuario = new Usuario();
	private Post post = new Post();
	private JPasswordField pwdSenhaCadastro;
	private JPasswordField pwdSenhaLogin;
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
		btnCadastrarCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//aqui fazer o cadastro da pessoa
				usuario.setNome(txtNomeCadastro.getText());
				usuario.setSobrenome(txtSobrenomeCadastro.getText());
				usuario.setUsername(txtUsernameCadastro.getText());
				usuario.setSenha(new String(pwdSenhaCadastro.getPassword()).trim());
				sistema.cadastroUsuario(usuario);
				System.out.println("Usuário cadastrado com sucesso!");
				AngelaRedeSocial.removeAll();
				AngelaRedeSocial.repaint();
				AngelaRedeSocial.revalidate();
				AngelaRedeSocial.add(CadastroLogin);
				AngelaRedeSocial.repaint();
				AngelaRedeSocial.revalidate();
				
			}
		});
		btnCadastrarCadastro.setBackground(new Color(223, 150, 74));
		btnCadastrarCadastro.setBounds(162, 184, 117, 25);
		TelaCadastro.add(btnCadastrarCadastro);
		
		pwdSenhaCadastro = new JPasswordField();
		pwdSenhaCadastro.setText("Digite sua senha");
		pwdSenhaCadastro.setBounds(205, 124, 129, 19);
		TelaCadastro.add(pwdSenhaCadastro);
		
		JButton btnCadastro = new JButton("CADASTRO");
		btnCadastro.setBackground(new Color(223, 149, 74));
		btnCadastro.setFont(new Font("Chandas", Font.BOLD, 12));
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
		
		JPanel perfilUsuario = new JPanel();
		AngelaRedeSocial.add(perfilUsuario, "name_25199243360317");
		perfilUsuario.setLayout(null);
		
		JPanel asidePerfil = new JPanel();
		asidePerfil.setBackground(new Color(223, 149, 74));
		asidePerfil.setBounds(0, 0, 148, 253);
		perfilUsuario.add(asidePerfil);
		asidePerfil.setLayout(null);
		
		JPanel asideMeuPerfil = new JPanel();
		asideMeuPerfil.setBounds(0, 114, 148, 30);
		asidePerfil.add(asideMeuPerfil);
		asideMeuPerfil.setBackground(new Color(255, 163, 72));
		asideMeuPerfil.setLayout(null);
		
		JLabel lblMeuPerfil = new JLabel("Meu Perfil");
		lblMeuPerfil.setBounds(65, 6, 71, 15);
		asideMeuPerfil.add(lblMeuPerfil);
		
		JPanel asideBuscarUsuarios = new JPanel();
		asideBuscarUsuarios.setBackground(new Color(255, 163, 72));
		asideBuscarUsuarios.setBounds(0, 179, 148, 30);
		asidePerfil.add(asideBuscarUsuarios);
		asideBuscarUsuarios.setLayout(null);
		
		JLabel lblBuscarPerfis = new JLabel("Buscar Perfis");
		lblBuscarPerfis.setBounds(50, 6, 93, 15);
		asideBuscarUsuarios.add(lblBuscarPerfis);
		
		JLabel fotoPerfilUsuario = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/profile.png")).getImage();
		fotoPerfilUsuario.setIcon(new ImageIcon(img));
		
		fotoPerfilUsuario.setBounds(34, 12, 70, 58);
		asidePerfil.add(fotoPerfilUsuario);
		
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
		btnLoginLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = txtUsernameLogin.getText();
				String senha = new String(pwdSenhaLogin.getPassword()).trim();
				Usuario u = sistema.login(username, senha);
				if (u == null) {
					System.out.println("Erro ao autenticar.");
				}else {
					System.out.println("Você está sendo redirecionado para o seu feed!");
					AngelaRedeSocial.removeAll();
					AngelaRedeSocial.repaint();
					AngelaRedeSocial.revalidate();
					AngelaRedeSocial.add(perfilUsuario);
					AngelaRedeSocial.repaint();
					AngelaRedeSocial.revalidate();
				}
			
				
				}
		});
	
	}
}
