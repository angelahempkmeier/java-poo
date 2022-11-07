package atividade4.apresentacao;
import atividade4.dados.*;
import atividade4.negocio.Sistema;

import java.util.Scanner;

public class Principal {
    private static Sistema sistema = new Sistema();
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int opcao = -1;

        while (opcao != 0){
            imprimeMenu();
            System.out.println("Digite a opção desejada:");
            opcao = Integer.parseInt(sc.nextLine());
            switch (opcao){
                case 0:
                    break;
                case 1:
                    cadastrarConta();
                    break;
                case 2:
                    realizarSaque();
                    break;
                case 3:
                    realizarDeposito();
                    break;
                case 4:
                    mostrarExtrato();
                    break;
            }
        }
    }
    private static ContaCorrente novaContaCorrente(){
        ContaCorrente contaCorrente = new ContaCorrente();
        System.out.println("Digite o CPF: ");
        contaCorrente.setCpf(sc.nextInt());
        return contaCorrente;
    }
    private static ContaSalario novaContaSalario(){
        ContaSalario contaSalario = new ContaSalario();
        System.out.println("Digite o CPF:");
        contaSalario.setCpf(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite o CNPJ da Empresa:");
        contaSalario.setCnpjEmpresa(Integer.parseInt(sc.nextLine()));
        return contaSalario;
    }
    private static void cadastrarConta(){
        System.out.println("Digite o tipo de conta que você quer cadastrar:");
        System.out.println("1: Conta Corrente");
        System.out.println("2: Conta Salário");
        int opcao = Integer.parseInt(sc.nextLine());
        switch (opcao) {
            case 1:
                sistema.cadastrarConta(novaContaCorrente());
                break;
            case 2:
                sistema.cadastrarConta(novaContaSalario());
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
    private static void  exibirContas(){
        for (int i = 0; i< sistema.getQuantidadeContas(); i++){
            System.out.println("Conta " + i + ": \n" + sistema.getContaBancarias()[i].toString() + "\n");
        }
    }
    private static ContaBancaria escolherContaBancaria(){
        exibirContas();
        System.out.println("Escolha uma conta");
        int conta = Integer.parseInt(sc.nextLine());
        if (conta < sistema.getQuantidadeContas()){
            return sistema.getContaBancarias()[conta];
        }else {
            return null;
        }
    }
    private static void realizarSaque(){
        ContaBancaria conta = escolherContaBancaria();
        if (conta != null){
            System.out.println("Digite o valor a ser sacado:");
            float valor = Float.parseFloat(sc.nextLine());
            System.out.println(sistema.realizarSaque(conta, valor));
        }
    }

    private static void realizarDeposito(){
        ContaBancaria conta = escolherContaBancaria();
        if (conta != null){
            if (conta instanceof  ContaCorrente){
                System.out.println("Digite um valor a ser depositado: ");
                float valor = Float.parseFloat(sc.nextLine());
                sistema.realizarDeposito((ContaCorrente)(conta), valor);
                System.out.println("Depósito realizado com sucesso!");
                System.out.println(sistema.gerarExtrato((ContaCorrente)(conta)));
            }else {
                System.out.println("Digite o valor a ser depositado: ");
                float valor = Float.parseFloat(sc.nextLine());
                System.out.println("Digite o CNPJ da empresa: ");
                int cnpj = Integer.parseInt(sc.nextLine());
                if (sistema.realizarDeposito((ContaSalario) (conta), valor, cnpj)){
                    System.out.println("Depósito realizado com sucesso!");
                    System.out.println(sistema.gerarExtrato((ContaSalario)(conta)));
                }else {
                    System.out.println("Falha ao depositar!");
                }
            }
        }
    }

    private static void mostrarExtrato(){
        ContaBancaria conta = escolherContaBancaria();
        if (conta != null){
            System.out.println(sistema.gerarExtrato(conta));
        }
    }
    private static void imprimeMenu(){
        System.out.println("Escolha a opção:");
        System.out.println("1: Cadastrar Conta");
        System.out.println("2: Realizar Saque");
        System.out.println("3: Realizar Depósito");
        System.out.println("4: Exibir Extrato");
        System.out.println("0: Sair");

    }
}
