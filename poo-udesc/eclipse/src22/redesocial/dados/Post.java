package redesocial.dados;

import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

public class Post {
    private ImageIcon foto; //era string
    private String legenda;
    private List<Usuario> favoritos = new ArrayList<Usuario>();
    private int id;
    private int idUsuario;
    private int favoritar; //new
    private List<Integer> contagemFavs = new ArrayList<Integer>();//new
	int i = 0;//new
	
    public Post(){}

    public int favoritarFoto(Usuario u) {//new
    	favoritos.add(u);
    	return favoritos.size();
    }
    
    public ImageIcon getFoto() {
		return foto;
	}

	public void setFoto(ImageIcon foto) {
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
    
    public int getIdUsuario() {
    	return idUsuario;
    }
    
    public void setIdUsuario(int idUsuario) {
    	this.idUsuario = idUsuario;
    }
    /*
    public void setFotoByte(ImageIcon foto) {
    	
    }
    */
    
}
