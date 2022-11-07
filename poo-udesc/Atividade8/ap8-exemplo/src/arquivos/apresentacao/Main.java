package arquivos.apresentacao;

import arquivos.dados.Pessoa;
import arquivos.negocio.Sistema;
import java.util.Scanner;

public class Main {
    private static Sistema sistema = new Sistema();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    private static Pessoa novaPessoa(){
        Pessoa p = new Pessoa();

        System.out.println("Digite o nome");
        p.setNome(sc.nextLine());

        System.out.println("Digite a idade:");
        p.setAltura(Integer.parseInt(sc.nextLine()));

        System.out.println("Digite a altura:");
        p.setAltura(Float.parseFloat(sc.nextLine()));

        System.out.println("Digite a massa:");
        p.setMassa(Float.parseFloat(sc.nextLine()));

        return p;
    }

    private static void mostrarPessoas(){
        for (int i = 0; i<sistema.getList().size(); i++){
            System.out.println("Pessoa " + i);
            System.out.println(sistema.getList().get(i));
            System.out.println();
        }
    }

    private static Pessoa escolherPessoa(){
        mostrarPessoas();
        System.out.println("Escolha uma pessoa: ");
        int escolha = Integer.parseInt(sc.nextLine());
        if (escolha < sistema.getList().size()){
            return sistema.getList().get(escolha);
        }else {
            return null;
        }
    }
    public static void imprimeMenu(){
        System.out.println("---------MENU--------");
        System.out.println("0: Sair");
        System.out.println("1: Cadastrar Pessoa");
        System.out.println("2: Remover Pessoa");
        System.out.println("3: Mostrar Pessoas");
    }

    public static void menu(){
        int opcao = -1;
        while (opcao != 0){
            imprimeMenu();
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao){
                case 1:
                    System.out.println("Cadastrar Pessoa");
                    sistema.adicionaPessoa(novaPessoa());
                    break;
                case 2:
                    System.out.println("Remover Pessoa:");
                    sistema.removerPessoa(escolherPessoa());
                    break;
                case 3:
                    System.out.println("Mostrar Pessoas:");
                    mostrarPessoas();
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}