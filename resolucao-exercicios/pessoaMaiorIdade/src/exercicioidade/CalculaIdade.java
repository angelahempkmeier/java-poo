package exercicioidade;
public class CalculaIdade {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.idade = 15;
        pessoa.nome = "José";
        pessoa.sexo = "masculino";
        System.out.println(pessoa.nome); //só pra escrever a pessoa
        pessoa.maiorDeIdade(pessoa.idade); //chamou o método
    }
}