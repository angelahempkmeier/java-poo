package petshop.dados;

public class Endereco {
    private String rua;
    private int numeroCasa;
    private String bairro;
    private String cidade;
    private String estado;
    private int cep;

    //constructor
    public Endereco(){}

    //métodos get e set
    public String getRua(){
        return this.rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public int getNumeroCasa(){
        return this.numeroCasa;
    }
    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {return this.estado; }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCep() {
        return this.cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }
}
