package redesocial.dados;

import java.util.ArrayList;
import java.util.List;

public class Post {
    private String foto;
    private String legenda;
    private List<Usuario> favoritos = new ArrayList<Usuario>();
    private int id;

    public Post(){}

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getLegenda() {
        return legenda;
    }

    public void setLegenda(String legenda) {
        this.legenda = legenda;
    }

    public List<Usuario> getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(List<Usuario> favoritos) {
        this.favoritos = favoritos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
