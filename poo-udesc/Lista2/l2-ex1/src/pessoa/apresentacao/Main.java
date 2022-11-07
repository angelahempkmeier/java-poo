package pessoa.apresentacao;

import pessoa.dados.Pessoa;
import pessoa.negocio.Sistema;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Sistema sistema = new Sistema();
    public static void main(String[] args) {
        int op = -1;

        while (op!=0){
            op = Integer.parseInt(sc.nextLine());
            switch (op){
                case 1:
                    cadastrarPessoa();
                    break;
                case 2:
                    mostrarPessoas();
                    break;
                case 0:
                    break;
                default:
                    break;
            }
        }


    }
    public static void cadastrarPessoa(){
        Pessoa p = new Pessoa();
        System.out.println("Nome:");
        String nome = sc.nextLine();
        p.setNome(nome);
        System.out.println("Idade:");
        int idade = Integer.parseInt(sc.nextLine());
        p.setIdade(idade);
        System.out.println("CPF:");
        String cpf = sc.nextLine();
        p.setCpf(cpf);
        System.out.println("Cidade:");
        String cidade = sc.nextLine();
        p.setCidade(cidade);
        sistema.adicionarPessoas(p);
    }
    public static void mostrarPessoas(){
        Map<String, List<Pessoa>> mapa = sistema.getFaixasEtarias();
        mapa.forEach((chave, valor) -> {
            System.out.println(chave);
            for(Pessoa p : valor){
                System.out.println(p.toString());
            }//imprime a chave, dps imprime as pessoas da lista
        });
        //mapa.keySet();
    }

}