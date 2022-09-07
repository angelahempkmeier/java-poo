package alunos;
public class TesteAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "João";
        aluno1.matricula = 123456670;
        aluno1.cpf = "12345678-00";
        aluno1.email = "joao@meuemail.com";

        System.out.println("Aluno: " + aluno1.nome);
        System.out.println("Matrícula: " + aluno1.matricula);
        System.out.println("CPF: " + aluno1.cpf);
        System.out.println("Email: " + aluno1.email);
    }
}