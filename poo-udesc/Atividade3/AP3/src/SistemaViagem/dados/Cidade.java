package SistemaViagem.dados;

public class Cidade {
    private String nome;
    private String estado;

    //construtor
    public Cidade(){

    }

    public String getNome(){
        return this.nome; //pode ser sem no get
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEstado(){
        return this.estado; //pode ser sem no get
    }
    public void setEstado(String estado){
        this.estado = estado;
    }

    public String toString(){
        return nome + " " + estado;
    }


}
