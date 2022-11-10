package sistemaviagem.dados;

public class Cidade {
    private String nome;
    private String estado;

    public Cidade(){}

    public String toString(){
        return "Nome: " + this.nome + "\nEstado: " + this.estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
