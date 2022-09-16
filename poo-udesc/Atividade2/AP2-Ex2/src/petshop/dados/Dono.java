package petshop.dados;

public class Dono {
    private String nomeDono;
    private int cpfDono;
    //object endereco > dono
    Endereco enderecoDono = new Endereco();

    //constructor
    public Dono(){}

    //get e set

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public int getCpfDono() {
        return cpfDono;
    }

    public void setCpfDono(int cpfDono) {
        this.cpfDono = cpfDono;
    }

    public Endereco getEnderecoDono() {
        return enderecoDono;
    }

    public void setEnderecoDono(Endereco enderecoDono) {
        this.enderecoDono = enderecoDono;
    }

}
