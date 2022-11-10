package zoo.apresentacao;

import zoo.dados.Animal;
import zoo.dados.Aquario;
import zoo.dados.Peixe;
import zoo.dados.Viveiro;
import zoo.negocio.Zoologico;

import java.util.Scanner;
//Preciso: poder cadastrar viveiro, cadastrar animais, alocar animais, mostrar aquarios, mostrar viveiros,
// ter um menu
//O que eu vi:
public class Main {
    static Scanner sc = new Scanner(System.in);
    static Zoologico zoo = new Zoologico();

    public static void main(String[] args) {
        int op = -1;
        while (op != 0){
            imprimirMenu();
            op = Integer.parseInt(sc.nextLine());
            switch (op){
                case 0:
                    break;
                case 1:
                    zoo.cadastrarViveiro(novoViveiro());
                    break;
                case 2:
                    zoo.cadastrarViveiro(novoAquario());
                    break;
                case 3:
                    zoo.cadastrarAnimais(novoAnimal());
                    break;
                case 4:
                    zoo.cadastrarAnimais(novoPeixe());
                    break;
                case 5:
                    mostrarViveiros();
                    break;
                case 6:
                    mostrarAquarios();
                    break;
                case 7:
                    mostrarAnimal();
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

    }

    //menu
    public static void imprimirMenu(){
        System.out.println("1: Cadastar viveiro");
        System.out.println("2: Cadastar aquario");
        System.out.println("3: Cadastrar animal");
        System.out.println("4: Cadastrar peixe");
        System.out.println("5: Mostrar viveiro");
        System.out.println("6: Mostrar aquario");
        System.out.println("7: Mostrar animal");
        System.out.println("0: sair");
    }

    //cadastrar viveiro
    public static Viveiro novoViveiro(){
        Viveiro viveiro = new Viveiro();
        System.out.println("Digite o nome do viveiro:");
        viveiro.setNome(sc.nextLine());
        System.out.println("Digite o comprimento:");
        viveiro.setComprimento(Float.parseFloat(sc.nextLine()));
        System.out.println("Digite a largura:");
        viveiro.setLargura(Float.parseFloat(sc.nextLine()));

        return viveiro;
    }
    //cadastrar aquario
    public static Aquario novoAquario(){
        Aquario aquario = new Aquario();
        System.out.println("Digite o nome do aquário:");
        aquario.setNome(sc.nextLine());
        System.out.println("Digite o comprimento:");
        aquario.setComprimento(Float.parseFloat(sc.nextLine()));
        System.out.println("Digite a largura:");
        aquario.setLargura(Float.parseFloat(sc.nextLine()));
        System.out.println("Digite a altura:");
        aquario.setAltura(Float.parseFloat(sc.nextLine()));
        System.out.println("Digite a temperatura:");
        aquario.setTemperatura(Float.parseFloat(sc.nextLine()));

        return aquario;
    }

    //mostrar viveiro:
    public static void mostrarViveiros(){
        Viveiro[] viveiros = zoo.getSoViveiros();
        for (int i = 0; i<viveiros.length;i++) {
            System.out.println("n: " + i + "\nViveiro: " + viveiros[i]);
        }
    }

    //mostrar aquario:
    public static void mostrarAquarios(){
        Aquario[] aquarios = zoo.getSoAquarios();
        for (int i = 0; i<zoo.getSoAquarios().length; i++){
            System.out.println("n:" + i + "\nAquario: " + aquarios[i]);
        }
    }

    public static void mostrarAnimal(){
        Animal[] animals = zoo.getAnimais();
        for (int i = 0; i<animals.length; i++){
            System.out.println("n: " + i + "\nAnimal: " + animals[i]);
        }
    }

    //cadastrar animal
    public static Animal novoAnimal(){
        Animal animal = new Animal();
        System.out.println("Digite o nome:");
        animal.setNome(sc.nextLine());
        System.out.println("Digite a idade:");
        animal.setIdade(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite a cor: ");
        animal.setCor(sc.nextLine());
        System.out.println("Digite a espécie: ");
        animal.setEspecie(sc.nextLine());
        System.out.println("Digite o comprimento:");
        animal.setComprimento(Float.parseFloat(sc.nextLine()));
        System.out.println("Digite a largura: ");
        animal.setLargura(Float.parseFloat(sc.nextLine()));
        System.out.println("Digite a altura: ");
        animal.setAltura(Float.parseFloat(sc.nextLine()));


        System.out.println("--------------------------------------------------");
        System.out.println("VIVEIROS:");
        mostrarViveiros();
        System.out.println("Digite o número do viveiro que você deseja cadastrar seu animal:");
        int escolhaViv = Integer.parseInt(sc.nextLine());

        if (escolhaViv>zoo.getSoViveiros().length){
            System.out.println("Escolha inválida, digite um novo número:");
            escolhaViv = Integer.parseInt(sc.nextLine());
        }else {
            Viveiro[] viveiro = new Viveiro[zoo.getSoViveiros().length];
            boolean b = zoo.alocarAnimal(animal, viveiro[escolhaViv]);
            if (b){
                System.out.println("Animal cadastrado com sucesso!");
            }
        }

        return animal;
    }

    public static Peixe novoPeixe(){
        Peixe peixe = new Peixe();
        System.out.println("Digite o nome:");
        peixe.setNome(sc.nextLine());
        System.out.println("Digite a idade:");
        peixe.setIdade(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite a cor: ");
        peixe.setCor(sc.nextLine());
        System.out.println("Digite a espécie: ");
        peixe.setEspecie(sc.nextLine());
        System.out.println("Digite o comprimento:");
        peixe.setComprimento(Float.parseFloat(sc.nextLine()));
        System.out.println("Digite a largura: ");
        peixe.setLargura(Float.parseFloat(sc.nextLine()));
        System.out.println("Digite a altura: ");
        peixe.setAltura(Float.parseFloat(sc.nextLine()));
        System.out.println("Digite a temperatura: ");
        peixe.setTemperaturaIdeal(Float.parseFloat(sc.nextLine()));

        System.out.println("--------------------------------------------------");
        System.out.println("AQUARIOS:");
        mostrarAquarios();
        System.out.println("Digite o número do aquario que você deseja cadastrar seu animal:");
        int escolhaAqu = Integer.parseInt(sc.nextLine());

        if (escolhaAqu>zoo.getSoAquarios().length){
            System.out.println("Escolha inválida, digite um novo número:");
            escolhaAqu = Integer.parseInt(sc.nextLine());
        }else {
            Aquario[] aquario = new Aquario[zoo.getSoAquarios().length];
            boolean b = zoo.alocarAnimal(peixe, aquario[escolhaAqu]);
            System.out.println("Peixe cadastrado com sucesso!");
        }

        return peixe;
    }



}
