import java.util.List;

import exceptions.InsertException;
import persistencia.Conexao;
import persistencia.PostDAO;
import persistencia.UserDAO;
import persistencia.UsuarioDAO;
import redesocial.dados.Post;
import redesocial.dados.Usuario;

public class Main {
	
	public static void main(String[] args) throws InsertException {
		Usuario u = new Usuario();
		//Post p = new Post();
		//UsuarioDAO usuarioDAO = null;
		/*u.setNome("Joana");
		u.setSenha("123");
		u.setUsername("joana");
		u.setBio("professora");*/
		//usuarioDAO.insert(u);
		
		//p.setIdUsuario(3);
		//p.setLegenda("sem foto");
		
		
		
		
		Conexao.setSenha("postgres");
		
		try {
			Usuario u0;
			Usuario u1;
			List<Usuario> seg;
			UserDAO userDAO = UserDAO.getInstance();
			//Post p1;
			//userDAO.insert(u);
			//u = userDAO.select(1);
			//userDAO.delete(u);
			u0 = userDAO.select(10);
			System.out.println(u0.toString());
			//u1 = userDAO.select(11);
			//userDAO.insertSegue(u0, u1);
			seg = userDAO.selectAllSeguidores(10);
			for(Usuario usu : seg) {
				System.out.println(usu.toString());
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
}