package SistemaViagem.dados;

public class Cliente {
    private int cpf;
    private String nome;
    private String endereco;
    private int telefone;

    //constructor
    public Cliente(){}

    //gettes e setters
    public int getCpf(){
        return this.cpf;
    }
    public void setCpf(int cpf){
        this.cpf = cpf;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getEndereco(){
        return this.endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public int getTelefone(){
        return this.telefone;
    }
    public void setTelefone(int telefone){
        this.telefone = telefone;
    }

    //método toString
    public String toString(){
        return cpf + " " + nome + " " + endereco + " " + telefone;
    }

    //método reservarIda

    //método ReservarVolta

}
