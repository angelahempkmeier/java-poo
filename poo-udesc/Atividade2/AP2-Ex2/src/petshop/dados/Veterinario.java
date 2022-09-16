package petshop.dados;

public class Veterinario {
    private String nomeVeterinario;
    private float salario;
    private int quantidadeAnimais;
    private Animal[] animaisAtendidos = new Animal[10];
    private Endereco enderecoVeterinario = new Endereco();


    //constructor
    public Veterinario(){}

    //atribuicao vetor animais
    //???

    //método get e set

    public String getNomeVeterinario() {
        return nomeVeterinario;
    }

    public void setNomeVeterinario(String nomeVeterinario) {
        this.nomeVeterinario = nomeVeterinario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getQuantidadeAnimais() {
        return quantidadeAnimais;
    }

    public void setQuantidadeAnimais(int quantidadeAnimais) {
        this.quantidadeAnimais = quantidadeAnimais;
    }

    public Animal[] getAnimaisAtendidos() {
        return animaisAtendidos;
    }

    public void setAnimaisAtendidos(Animal animal) {
        //this.animaisAtendidos = animaisAtendidos;
        if(quantidadeAnimais < animaisAtendidos.length){
            this.animaisAtendidos[quantidadeAnimais] = animal;
            quantidadeAnimais++;
        }
    }

    public Endereco getEnderecoVeterinario() {return enderecoVeterinario;}

    public void setEnderecoVeterinario(Endereco enderecoVeterinario) {this.enderecoVeterinario = enderecoVeterinario;
    }
}
