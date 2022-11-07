package listatelefonica.apresentacao;

import listatelefonica.dados.Contato;
import listatelefonica.negocio.ListaTelefonica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int op=-1;
    //static List<Contato> contatoList = new ArrayList<Contato>();
    //static List<ListaTelefonica> listaTelefonicas = new ArrayList<ListaTelefonica>();
    static ListaTelefonica listaTelefonicas = new ListaTelefonica();
    public static void main(String[] args) {
        while (op != 0){
            imprimirMenu();
            System.out.println("Escolha uma opção:");
            op = Integer.parseInt(sc.nextLine());
            switch (op) {
                case 1:
                    novoContato();
                    break;
                case 2:
                    removerContato();
                    break;
                case 3:
                    exibirContatos();
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
        System.out.println("Digite o nome: ");
        String nome = sc.nextLine();
        contato.setNome(nome);
        System.out.println("Digite o telefone: ");
        int telefone = Integer.parseInt(sc.nextLine());
        contato.setTelefone(telefone);
        return contato;
    }
    public static void adicionarContato(){
        int cont = 0;
        listaTelefonicas.adicionarContato(novoContato());
        cont++;
        System.out.println("Contato adicionado com sucesso.");
        System.out.println(novoContato());
    }

    public static void removerContato(){
        System.out.println("Digite a letra inicial que corresponde ao contato que você quer remover:");
        String letra = sc.nextLine().toUpperCase();
        System.out.println("CONTATOS:");
        exibirContatos(letra.charAt(0));
        System.out.println("Digite o contato que você quer excluir:");
        int excluir = Integer.parseInt(sc.nextLine());
        if (excluir < listaTelefonicas.buscarContatos(letra.charAt(0)).size()){
            listaTelefonicas.removerContato(listaTelefonicas.buscarContatos(letra.charAt(0)).get(excluir));
        }else {
            System.out.println("Número inválido, digite novamente:");
            excluir = Integer.parseInt(sc.nextLine());
        }
    }

    public static void exibirContatos(){
        listaTelefonicas.buscarContatos().forEach((chave, lista ) -> {
            System.out.println(chave + ":");
            for (Contato contato : lista){
                System.out.println(" " + contato.toString());
            }
        });
    }

    public static void exibirContatos(char letra){
        for (int i = 0; i<listaTelefonicas.buscarContatos(letra).size();i++){
            System.out.println(i + ":");
            System.out.println(listaTelefonicas.buscarContatos(letra).get(i).toString());
        }

    }

}
