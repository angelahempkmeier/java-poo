package persistencia;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import exceptions.DeleteExceptions;
import exceptions.InsertException;
import exceptions.SelectException;
import exceptions.UpdateException;
import redesocial.dados.Post;
import redesocial.dados.Usuario;

public class UsuarioDAO {
	private static UsuarioDAO instance = null;
	private static PostDAO postDAO;
	
	private PreparedStatement insert;
	private PreparedStatement delete;
	private PreparedStatement update;
	private PreparedStatement select;
	private PreparedStatement selectAll;
	private PreparedStatement newId;
	private PreparedStatement insertSegue;
	private PreparedStatement login;
	private PreparedStatement sql;


	//método segue que passa 2 usuarios como parametro - inserir
	//método dessegue????? - caso eu consiga
	Connection conexao = Conexao.getConexao();
	private UsuarioDAO () throws SQLException, ClassNotFoundException {
		//Connection conexao = Conexao.getConexao();
		sql = conexao.prepareStatement("select count(*) from usuario where username = ? and senha = ?");
		insert = conexao.prepareStatement("insert into usuario values (?,?,?,?,?)");
		delete = conexao.prepareStatement("delete from usuario where id_usuario = ?");
		update = conexao.prepareStatement("update usuario set username = ?, senha = ?, nome =?, bio = ? where id_usuario = ?");
		select = conexao.prepareStatement("select * from usuario where id_usuario = ?");
		selectAll = conexao.prepareStatement("select * from usuario");
		newId = conexao.prepareStatement("select nextval('id_usuario')");
		insertSegue = conexao.prepareStatement("insert into usuario_usuario values (?,?)");
		login = conexao.prepareStatement("select from usuario username = ? and senha = ?");
		postDAO = PostDAO.getInstance();

	}
	
	public static UsuarioDAO getInstance() throws SQLException, ClassNotFoundException {
		if(instance == null) {
			instance = new UsuarioDAO();
		}
		return instance;
	}
	
	public int newId() throws SelectException {
	    try {
	      ResultSet result = newId.executeQuery();
	      if (result.next())
	        return result.getInt(1);
	    } catch (SQLException exc) {
	      throw new SelectException("Não foi possível gerar o próximo ID do Usuário!");
	    }
	    return 0;
	  }
	
	public void insert(Usuario usuario) throws InsertException {
		try {
			usuario.setId(newId());
			insert.setInt(1, usuario.getId());
			insert.setString(2, usuario.getUsername());
			insert.setString(3, usuario.getSenha());
			insert.setString(4, usuario.getNome());
			insert.setString(5, usuario.getBio());
			insert.executeUpdate();
			/*
			if(usuario.getListaDePosts() != null) {
				for(int i = 0; i< usuario.getListaDePosts().size(); i++) {
					usuario.getListaDePosts().get(i).setIdUsuario(usuario.getId());
					//postDAO.insert(usuario.getListaDePosts().get(i));
				}
			}
			*/
		}catch (Exception e) {
			throw new InsertException("Não foi possível inserir o usuário.");
			}
	}
	
	public void insertSegue(Usuario usuario_seguido, Usuario usuario_seguidor ) throws SelectException, InsertException {
		try {
			insertSegue.setInt(1, usuario_seguido.getId());
			insertSegue.setInt(2, usuario_seguidor.getId());
			insertSegue.executeUpdate();
		}catch(SQLException e) {
			throw new InsertException("Não foi possível inserir os usuários.");
		}
	}
	
	
	public void delete(Usuario usuario) throws DeleteExceptions {
		try {
			if(usuario.getListaDePosts() != null) {
				for(int i = 0; i< usuario.getListaDePosts().size(); i++) {
					postDAO.delete(usuario.getListaDePosts().get(i));
				}
			}
			delete.setInt(1, usuario.getId());
			delete.executeUpdate();
		}catch(Exception e) {
			throw new DeleteExceptions("Não foi possível deletar o usuário.");
		}
	}
	
	public void update(Usuario usuario) throws UpdateException {
		try {
			update.setInt(1, usuario.getId());
			update.setString(2, usuario.getUsername());
			update.setString(3, usuario.getSenha());
			update.setString(4, usuario.getNome());
			update.setString(5, usuario.getBio());
			update.executeUpdate();
			
			//aqui tenho q fazer o update dos posts?
		}catch(Exception e) {
			throw new UpdateException("Não foi possível atualizar o usuário.");
		}
	}
	
	public Usuario select(int idUsuario) throws SelectException{
		ResultSet rs;
		Usuario usuario = null;
		try {
			select.setInt(1, idUsuario);
			rs = select.executeQuery();
			if(rs.next()) {
				usuario = new Usuario();
				usuario.setId(rs.getInt("id_usuario"));
				usuario.setUsername(rs.getString("username"));
				usuario.setSenha(rs.getString("senha"));
				usuario.setNome(rs.getString("nome"));
				usuario.setBio(rs.getString("bio"));
				
				Post post = postDAO.selectByIdUsuario(usuario.getId());
				//usuario.setListaDePosts(usuario.getListaDePosts().add(post));
			}
			return usuario;
			
		}catch(Exception e) {
			throw new SelectException("Não foi possível encontrar o usuário.");
		}
		
	}
	

	public List<Usuario> selectAll() throws SelectException{
		ResultSet rs;
		Usuario usuario = null;
		List<Usuario> usuarios = new ArrayList<Usuario>();
		try {
			rs = select.executeQuery();
			while(rs.next()) {
				usuario = new Usuario();
				usuario.setId(rs.getInt("id_usuario"));
				usuario.setUsername(rs.getString("username"));
				usuario.setSenha(rs.getString("senha"));
				usuario.setNome(rs.getString("nome"));
				usuario.setBio(rs.getString("bio"));
				usuarios.add(usuario);
				
				//aqui eu preciso retornar todos os posts?
				//
			}
			return usuarios;
			
		}catch(Exception e) {
			throw new SelectException("Não foi possível encontrar os usuários.");
		}
		
	}
	


	public Usuario login(String username, String senha) throws Exception {
		Usuario usuario = null;
		//ResultSet rsSQL = sql.executeQuery();
		sql.setString(1, username);
		sql.setString(2, senha);
		ResultSet rs = sql.executeQuery();
		
		try {
			if(rs.next()) {
				
					login.setString(1, username);
					login.setString(2, senha);
					usuario = new Usuario();
					usuario.setUsername(username);
					usuario.setSenha(senha);
				
			}
			return usuario;
		}catch (Exception e) {
			throw new Exception(e.toString());
		}
		//return usuario;
	}
	
	
}
