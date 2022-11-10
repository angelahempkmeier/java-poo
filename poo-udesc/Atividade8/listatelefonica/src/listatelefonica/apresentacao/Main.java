package listatelefonica.apresentacao;

import listatelefonica.dados.Contato;
import listatelefonica.negocio.ListaTelefonica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int op=-1;

    static ListaTelefonica listaTelefonicas = new ListaTelefonica();
    public static void main(String[] args) {
        while (op != 0){
            mostrarMenu();
            System.out.println("Escolha uma opção:");
            op = Integer.parseInt(sc.nextLine());
            switch (op) {
                case 1:
                    listaTelefonicas.adicionarContato(novoContato());
                    break;
                case 2:
                    listaTelefonicas.removerContato(escolherContato());
                    break;
                case 3:
                    mostrarPessoas();
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

    public static void imprimirMenu(){
        System.out.println("-----MENU-----");
        System.out.println("1: Novo Contato");
        System.out.println("2: Remover Contato");
        System.out.println("3: Exibir Contatos");
        System.out.println("0: Sair");
    }


    public static Contato novoContato(){
        Contato contato = new Contato();
        System.out.println("Digite o nome da pessoa: ");
        contato.setNome(sc.nextLine());
        System.out.println("Digite o telefone: ");
        contato.setTelefone(Integer.parseInt(sc.nextLine()));

        return contato;
    }

    public static void mostrarPessoas(){
        for (int i = 0; i<listaTelefonicas.getAll().size(); i++){
            System.out.println(listaTelefonicas.getAll());
        }
    }

    public static void mostrarPessoa(char letra){
        listaTelefonicas.getAll().get(letra);
    }

    private static Contato escolherContato(){
        mostrarPessoas();
        System.out.println("Escolha a inicial da letra que você quer remover: ");
        String letra = sc.nextLine().toUpperCase();
        int escolha = Integer.parseInt(sc.nextLine());
        if (escolha < listaTelefonicas.getAll().size()){
            return listaTelefonicas.getLista(letra.charAt(0)).get(escolha);
        }else {
            return null;
        }
    }

    private static void mostrarMenu(){
        System.out.println("-----MENU-----");
        System.out.println("1: Novo Contato");
        System.out.println("2: Remover Contato");
        System.out.println("3: Exibir Contato");
        System.out.println("0: Sair");

    }

}
