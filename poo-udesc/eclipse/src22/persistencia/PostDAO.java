package persistencia;

import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import exceptions.DeleteExceptions;
import exceptions.InsertException;
import exceptions.SelectException;
import exceptions.UpdateException;
import redesocial.dados.Post;
import redesocial.dados.Usuario;

public class PostDAO {
	
	private static PostDAO instance = null;
	
	
	private PreparedStatement insert;
	private PreparedStatement delete;
	private PreparedStatement deleteFromIdUsuario;
	private PreparedStatement update; //n eh necessario
	private PreparedStatement select;
	private PreparedStatement selectAll; //n eh necessario
	private PreparedStatement selectByIdUsuario;
	private PreparedStatement newId;
	private PreparedStatement verCurtidas;
	
	
	//método para pegar as curtidas do post - funcao count select from essa tabela especifica id e no * engloba num count
	

	
	
	
	private PostDAO () throws SQLException, ClassNotFoundException {
		Connection conexao = Conexao.getConexao();
	
		insert = conexao.prepareStatement("insert into post values (DEFAULT,?,?,NULL)");
		delete = conexao.prepareStatement("delete from post where id_post = ?");
		deleteFromIdUsuario = conexao.prepareStatement("delete from post where id_usuario = ?");
		update = conexao.prepareStatement("update post set id_usuario = ?, legenda = ?, foto = ? where id_post = ?");
		select = conexao.prepareStatement("select * from post where id_post = ?");
		selectAll = conexao.prepareStatement("select * from post");
		selectByIdUsuario = conexao.prepareStatement("select * from post where id_usuario = ?");
		newId = conexao.prepareStatement("select nextval('id_post')");
		verCurtidas = conexao.prepareStatement("select count(*) from usuario_post where id_post = ?");
		
		
	}
	
	public static PostDAO getInstance() throws SQLException, ClassNotFoundException{
		if(instance == null) {
			instance = new PostDAO();
		}
		return instance;
	}
	
	public int newId() throws SelectException {
	    try {
	      ResultSet result = newId.executeQuery();
	      if (result.next())
	        return result.getInt(1);
	    } catch (SQLException exc) {
	      throw new SelectException("Não foi possível gerar o próximo ID de Posts!");
	    }

	    return 0;
	  }
	
	
	public void verCurtidas(Post post) throws SQLException, ClassNotFoundException{
		ResultSet rs;
		select.setInt(1, post.getId());
		rs = select.executeQuery();
		try {
			if(rs.next()) {
				post = new Post();
				post.setId(rs.getInt("id_post"));
			}
		}catch(Exception e) {
			
		}

	}
	
	public void insert(Post post) throws InsertException {
		try {
			//byte[] bytes = post.getFoto().getImage().getSource().
			insert.setInt(1, post.getIdUsuario());
			insert.setString(2, post.getLegenda());
			//insert.setBytes(4, post.getFoto()); //usar blob?
			insert.executeUpdate();
		}catch (Exception e) {
			throw new InsertException("Não foi possível inserir o post.");
			}
	}
	
	public void delete(Post post) throws DeleteExceptions {
		try {
			delete.setInt(1, post.getId());
			delete.executeUpdate();
		}catch(Exception e) {
			throw new DeleteExceptions("Não foi possível deletar o post do usuário.");
		}
	}
	
	public void deleteFromIdUsuario(Post post) throws DeleteExceptions {
		try {
			deleteFromIdUsuario.setInt(1, post.getIdUsuario());
			deleteFromIdUsuario.executeUpdate();
		}catch(Exception e) {
			throw new DeleteExceptions("Não foi possível deletar o post do usuário.");
		}
	}
	
	public void update(Post post) throws UpdateException {
		try {
			//set id_usuario = ?, legenda = ?, foto = ? where id_post = ?"
			update.setInt(1, post.getIdUsuario());
			update.setString(2, post.getLegenda());
			//update.setArray(3, post.getFoto());
			update.setInt(4, post.getId());
			update.executeUpdate();
		}catch(Exception e) {
			throw new UpdateException("Não foi possível atualizar o post.");
		}
	}
	
	public Post select(int idPost) throws SelectException{
		ResultSet rs;
		Post post = null;
		try {
			select.setInt(1, idPost);
			rs = select.executeQuery();
			if(rs.next()) {
				post = new Post();
				post.setId(rs.getInt("id_post"));
				post.setIdUsuario(rs.getInt("id_usuario"));
				post.setLegenda(rs.getString("legenda"));
				post.setFoto(null);
			}
			return post;
			
		}catch(Exception e) {
			throw new SelectException("Não foi possível encontrar o post.");
		}
		
	}
		
		
	
	public List<Post> selectAll() throws SelectException{
		ResultSet rs;
		Post post = null;
		List<Post> posts = new ArrayList<Post>();
		try {
			rs = selectAll.executeQuery();
			while(rs.next()) {
				post = new Post();
				post.setId(rs.getInt("id_post"));
				post.setIdUsuario(rs.getInt("id_usuario"));
				post.setLegenda(rs.getString("legenda"));
				post.setFoto(null);
				posts.add(post);
			}
			return posts;
			
		}catch(Exception e) {
			throw new SelectException("Não foi possível encontrar os posts.");
		}
	}
	
	public Post selectByIdUsuario(int idUsuario) throws SelectException{
		ResultSet rs;
		Post post = null;
		try {
			select.setInt(1, idUsuario);
			rs = select.executeQuery();
			if(rs.next()) {
				post = new Post();
				post.setId(rs.getInt("id_post"));
				post.setIdUsuario(rs.getInt("id_usuario"));
				post.setLegenda(rs.getString("legenda"));
				//post.setFoto(null);
			}
			return post;
			
		}catch(Exception e) {
			throw new SelectException("Não foi possível encontrar o post pelo id do usuário.");
		}
		
	}
	
	public static Image iconToImage(Icon icon) {
		if(icon instanceof ImageIcon) {
			return ((ImageIcon)icon).getImage();
		}else {
			int w = icon.getIconWidth();
			int h = icon.getIconHeight();
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			GraphicsDevice gd = ge.getDefaultScreenDevice();
			GraphicsConfiguration gc = gd.getDefaultConfiguration();
			BufferedImage image = gc.createCompatibleImage(w, h);
			Graphics2D g = image.createGraphics();
			icon.paintIcon(null, g, 0, 0);
			g.dispose();
			return image;
			
		}
	}
	
	
	
	
}


//pegar o file choser, passar pra file input string e esse file input string sera passado como parametro do setbytestring - 1o parametro
//posicao na quer, 2o fileinputstring, 3o tamanho do arquivo () -----cria o objeto post e a imagem

















