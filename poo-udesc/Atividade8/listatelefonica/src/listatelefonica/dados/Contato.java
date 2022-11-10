package listatelefonica.dados;

public class Contato {
    private String nome;
    private int telefone;

    public Contato(){}

    public String getNome() {
        return nome;
    }

    public boolean equals(Object o){
        if(o instanceof Contato) {
            Contato c = (Contato) o;
            if (this.telefone == c.getTelefone()) {
                return true;
            } else {
                return false;
            }
        }else {
            return false;
            }
        }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String toString(){
        return "Nome:" + getNome() + "\nTelefone: " + getTelefone();
    }
}
