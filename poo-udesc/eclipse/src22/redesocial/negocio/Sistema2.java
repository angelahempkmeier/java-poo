package redesocial.negocio;
import java.sql.SQLException;
import java.util.*;
import redesocial.dados.Post;
import redesocial.dados.Usuario;

import java.util.List;

import exceptions.InsertException;
import exceptions.SelectException;
import persistencia.Conexao;
import persistencia.PostDAO;
import persistencia.UserDAO;
import persistencia.UsuarioDAO;

public class Sistema2 {
    private List<Usuario> usuarios = new LinkedList<Usuario>();
    private static Sistema2 instance = null;
    private int quantUsuarios;
    private Usuario usuario;
    private UserDAO usuarioDAO;
    //private PostDAO postDAO;
/*
    private Sistema2(String senha) throws ClassNotFoundException, SQLException{
    	Conexao.setSenha(senha);
    	usuarioDAO = UserDAO.getInstance();
    }
    */
    
    public Usuario getUsuarioLogado() {
    	return this.usuario;
    }
    
    public static Sistema2 getInstance() {
    	if (instance == null){
            instance = new Sistema2();
        }
        return instance;
    }
    
    /*
    public static Sistema2 getInstance() {
    	if (instance == null){
            instance = new Sistema2();
        }
        return instance;
    }
    */
    
    public List<Usuario> usuariosCadastrados() throws SelectException{
        return usuarioDAO.selectAll();
    }
    
    public void inserirUsuario(Usuario u) throws InsertException, SelectException {
    	usuarioDAO.insert(u);
    }
    
    
    public void deslogaUsuario() {
    	if (this.usuario != null) {
    		this.usuario = null;
    	}
    }
    
    public List<Post> verFeed(Usuario usuario){
        return usuario.getListaDePosts();
    }

    //adicionar o post na lista
    public void postarFoto(Usuario usuario, Post post){
        usuario.adicionarPost(post);
    }



    public Usuario buscarUsuario(String username){
        //Usuario usuario = new Usuario();
        for (int i = 0; i<usuarios.size();i++){
            if (usuarios.get(i).getUsername().equals(username)){
                return usuarios.get(i);
            }
        }
        return null;
    }

    public List<Usuario> verUsuariosSeguidos(Usuario usuario){
        return usuario.getListaDeUsuarios();
    }

    public void unfollow(Usuario usuarioLogado, Usuario usuarioUnfollowed){
        if (usuarioLogado.getListaDeUsuarios().contains(usuarioUnfollowed)){
            usuarioLogado.getListaDeUsuarios().remove(usuarioUnfollowed);
        }else {
            System.out.println("ERROR!");
        }
    }
    
    public void follow(Usuario usuarioLogado, Usuario usuarioASerSeguido) throws Exception, InsertException {
    	usuarioDAO.insertSegue(usuarioLogado, usuarioASerSeguido);
    	//usuarioLogado.getListaDeUsuarios().add(usuarioASerSeguido);
    	
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public int getQuantUsuarios() {
        return quantUsuarios;
    }

    public void setQuantUsuarios(int quantUsuarios) {
        this.quantUsuarios = quantUsuarios;
    }
    
    
    
    
    
    
    
    
    
}
