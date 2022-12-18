package redesocial.dados;
import java.util.List;
import java.util.ArrayList;

public class Usuario {
    private int id;
    private String username;
    private String senha;
    private String nome;
    private String sobrenome;
    private String bio;
    private List<Usuario> listaDeUsuarios = new ArrayList<Usuario>();
    private List<Post> listaDePosts= new ArrayList<Post>();

    public Usuario(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public List<Usuario> getListaDeUsuarios() {
        return listaDeUsuarios;
    }

    public void setListaDeUsuarios(List<Usuario> listaDeUsuarios) {
        this.listaDeUsuarios = listaDeUsuarios;
    }

    public List<Post> getListaDePosts() {
        return listaDePosts;
    }

    public void setListaDePosts(List<Post> listaDePosts) {
        this.listaDePosts = listaDePosts;
    }

    public void adicionarPost(Post p){
        listaDePosts.add(p);
    }

    public boolean equals(Object o){
        if (o instanceof Usuario){
            Usuario u = (Usuario) o;
            if (this.username == getUsername()){
                return true;
            }
        }return false;
    }
    
    public String toString() {
    	return "" + this.getUsername();
    }

}
