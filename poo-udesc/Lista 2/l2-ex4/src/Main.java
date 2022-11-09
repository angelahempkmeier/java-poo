import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Aluno aluno = new Aluno();
    static Turma turma = new Turma();
    static int op = -1;
    public static void main(String[] args) {
        while (op != 0){
            imprimirMenu();
            System.out.println("Escolha uma opção:");
            op = Integer.parseInt(sc.nextLine());
            switch (op){
                case 1:
                    adicionarAlunos();
                    break;
                case 2:
                    exibirEquipes();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        }
    }

    public static void adicionarAlunos(){
        System.out.println("Digite o nome do aluno:");
        String nome = sc.nextLine();
        aluno.setNome(nome);
        System.out.println("Digite a idade do aluno:");
        int idade = Integer.parseInt(sc.nextLine());
        aluno.setIdade(idade);
        System.out.println("Agora, entre com as notas: ");
        entrarComNotas();
    }

    public static void exibirEquipes(){
        turma.separarEmEquipes();
        System.out.println(turma.separarEmEquipes());
    }

    public static void entrarComNotas(){
        List<Double> notas = new ArrayList<Double>();
        for (int i = 0; i< 5; i++){
            System.out.println("Digite a nota: " + i);
            notas.add(Double.parseDouble(sc.nextLine()));
            aluno.setNotas(notas);
        }
        System.out.println("A média é " + aluno.calcularMedia());
    }
    public static void imprimirMenu(){
        System.out.println("------MENU------");
        System.out.println("1: Adicionar Alunos");
        System.out.println("2: Exibir Equipes");
        System.out.println("3: Sair");
    }

}