package redesocial.negocio;
import java.util.*;
import redesocial.dados.Post;
import redesocial.dados.Usuario;

import java.util.List;

public class Sistema {
    private List<Usuario> usuarios = new LinkedList<Usuario>();
    private static Sistema instance = null;
    private int quantUsuarios;
    private Usuario usuario;

    private Sistema(){
    	
    }
    
    public static Sistema getInstance() {
    	if (instance == null){
            instance = new Sistema();
        }
        return instance;
    }
    

    public void cadastroUsuario(Usuario usuario){
        usuarios.add(usuario);
    }
    public List<Usuario> usuariosCadastrados(){
        return usuarios;
    }
    /*
    public Usuario login(String username, String senha){
        //Usuario usuario = new Usuario(); login é de pessoa que ja existe
        for (int i = 0; i<usuarios.size(); i++){
            if (usuarios.get(i).getUsername().equals(username) && usuarios.get(i).getSenha().equals(senha)){
                return usuarios.get(i);
            }
        }
        return null;
    }*/
    
    public boolean login(String username, String senha){
        //Usuario usuario = new Usuario(); login é de pessoa que ja existe
        for (int i = 0; i<usuarios.size(); i++){
            if (usuarios.get(i).getUsername().equals(username) && usuarios.get(i).getSenha().equals(senha)){
            	this.usuario = usuarios.get(i);
                return true;
            }
        }
        return false;
    }
    
    
    public Usuario getUsuarioLogado() {
    	return this.usuario;
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
    
    //nao tenho ctz
    public void follow(Usuario usuarioLogado, Usuario usuarioASerSeguido) {
    	usuarioLogado.getListaDeUsuarios().add(usuarioASerSeguido);
    	
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
