package petshop.usuario;

import petshop.dados.SistemaPetshop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemaPetshop pessoa = new SistemaPetshop();
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        while(opcao != -1) {

            System.out.println("MENU: ");
            System.out.println("1: cadastrar veterinário");
            System.out.println("2: mostrar veterinário");
            System.out.println("3: Cadastrar endereço veterinário");
            System.out.println("4: Cadastrar animal");
            System.out.println("5: Mostrar animais");
            System.out.println("6: Cadastrar dono");
            System.out.println("0: Sair");
            System.out.println("Digite a opção: ");
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao){
                case 1:
                    System.out.println("Cadastrar veterinário");
                    pessoa.cadastrarVeterinario();
                    break;
                case 2:
                    System.out.println("Mostrar veterinário");
                    pessoa.exibirVEterinarios();
                    break;
                case 3:
                    System.out.println("Cadastrar endereço veterinário: ");
                    pessoa.cadastrarEnderecoVeterinario();
                    break;
                case 4:
                    System.out.println("Cadastrar animal");
                    pessoa.cadastrarAnimal();
                    break;
                case 5:
                    System.out.println("Mostrar animais: ");
                    pessoa.mostrarAnimais();
                    break;
                case 6:
                    System.out.println("Cadastrar dono: ");
                    pessoa.cadastrarDono();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    opcao = -1;
                    break;
                default:
                    System.out.println("Opção inválida: ");
                    break;
            }
        }
    }
}