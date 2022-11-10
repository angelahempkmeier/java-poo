package pessoa.dados;

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    private String cidade;

    public Pessoa(){}

    //método equals
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Pessoa){
            Pessoa p = (Pessoa) obj;
            if (this.cpf == getCpf()){
                return true;
            }
        }return false;
    }

    public String toString(){
        return "Nome: " + this.getNome() + "\nCPF: " + this.getCpf() +
                "\nIdade: " + this.getIdade() + "\nCidade: " + this.getCidade();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

}
