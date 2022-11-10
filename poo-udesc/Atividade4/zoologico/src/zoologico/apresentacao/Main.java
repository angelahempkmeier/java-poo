package zoologico.apresentacao;
import zoologico.dados.*;
import zoologico.negocio.Zoologico;
import java.util.Scanner;

public class Main {
    private static Zoologico zoo = new Zoologico();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = -1;
        imprimirMenu();
        opcao = Integer.parseInt(sc.nextLine());
        while (opcao != 0){
            switch (opcao){
                case 0:
                    break;
                case 1:
                    cadastrarViveiro();
                    break;
                case 2:
                    cadastrarAnimal();
                    break;
                case 3:
                    mostrarViveiros();
                    break;
                case 4:
                    mostrarAnimais();
                    break;
            }
        }
    }

    public static void imprimirMenu(){
        System.out.println("Digite a opção escolhida:");
        System.out.println("0: Sair");
        System.out.println("1: Cadastrar Viveiro");
        System.out.println("2: Cadastrar Animal");
        System.out.println("3: Mostrar Viveiros");
        System.out.println("4: Mostrar Animais");
    }

    public static Viveiro novoViveiro(){
        Viveiro viveiro = new Viveiro();
        System.out.println("Digite o nome: ");
        viveiro.setNomeViveiro(sc.nextLine());
        System.out.println("Digite o comprimento:");
        viveiro.setComprimentoViveiro(Float.parseFloat(sc.nextLine()));
        System.out.println("Digite a largura: ");
        viveiro.setLarguraViveiro(Float.parseFloat(sc.nextLine()));
        return viveiro;
    }

    public static Aquario novoAquario(){
        Aquario aquario = new Aquario();
        System.out.println("Nome:");
        aquario.setNomeViveiro(sc.nextLine());
        System.out.println("Digite o comprimento:");
        aquario.setComprimentoViveiro(Float.parseFloat(sc.nextLine()));
        System.out.println("Digite a largura: ");
        aquario.setLarguraViveiro(Float.parseFloat(sc.nextLine()));
        System.out.println("Digite a altura: ");
        aquario.setAltura(Float.parseFloat(sc.nextLine()));
        System.out.println("Digite a temperatura:");
        aquario.setTemperatura(Float.parseFloat(sc.nextLine()));

        return aquario;
    }
    public static void cadastrarViveiro(){
        System.out.println("Qual viveiro você deseja cadastrar?");
        System.out.println("1: Viveiro");
        System.out.println("2: Aquário");

        int escolha = Integer.parseInt(sc.nextLine());

        switch (escolha){
            case 1:
                zoo.cadastrarViveiro(novoViveiro());
                break;
            case 2:
                zoo.cadastrarViveiro(novoAquario());
                break;
            default:
                System.out.println("Escolha inválida!");
                break;
        }
    }

    private static void cadastrarAnimal(){
        System.out.println("Digite o tipo de animal que você quer cadastrar:");
        System.out.println("1: Animal");
        System.out.println("2: Peixe");
        int escolha = Integer.parseInt(sc.nextLine());

        switch (escolha){
            case 1:
                zoo.cadastrarAnimais(novoAnimal());
                break;
            case 2:
                zoo.cadastrarAnimais(novoPeixe());
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }

        public static Animal novoAnimal() {
            Animal animal = new Animal();

            System.out.println("Digite o nome:");
            animal.setNome(sc.nextLine());
            System.out.println("Digite a cor: ");
            animal.setCor(sc.nextLine());
            System.out.println("Digite a especie: ");
            animal.setEspecie(sc.nextLine());
            System.out.println("Digite a idade: ");
            animal.setIdade(Integer.parseInt(sc.nextLine()));
            System.out.println("Digite o comprimento: ");
            animal.setComprimento(Float.parseFloat(sc.nextLine()));
            System.out.println("Digite a altura: ");
            animal.setAltura(Float.parseFloat(sc.nextLine()));

            mostrarViveiros();
            System.out.println("Digite o número do viveiro:");
            int viv = Integer.parseInt(sc.nextLine());
            while ((viv >= zoo.getSoViveiro().length)) {
                System.out.println("Número inválido");
                System.out.println("Digite o número do viveiro:");
                viv = Integer.parseInt(sc.nextLine());
            }
            while (!zoo.alocarAnimais(animal, zoo.getSoViveiro()[viv])){
                System.out.println("Não foi possível colocar nesse viveiro");
                mostrarViveiros();
                System.out.println("Digite o número do viveiro: ");
                viv = Integer.parseInt(sc.nextLine());
                while (viv >= zoo.getSoViveiro().length){
                    System.out.println("Número inválido, digite outro número para o viveiro");
                    viv = Integer.parseInt(sc.nextLine());
                }
            }
            return animal;
        }
    private static void mostrarViveiros(){
        Viveiro[] viveiros = zoo.getViveiros();
        for(int i =0; i< zoo.getQuantViveiro(); i++){
            System.out.println(viveiros[i]);
        }
    }

    private static void mostrarAnimais(){
        Animal[] animals = zoo.getAnimals();
        for (int i = 0; i< zoo.getQuantAnimais(); i++){
            System.out.println(animals[i]);
        }
    }

    private static Peixe novoPeixe(){
        Peixe peixe = new Peixe();

        System.out.println("Digite o nome:");
        peixe.setNome(sc.nextLine());
        System.out.println("Digite a cor: ");
        peixe.setCor(sc.nextLine());
        System.out.println("Digite a espécie:");
        peixe.setEspecie(sc.nextLine());
        System.out.println("Digite a idade:");
        peixe.setAltura(Float.parseFloat(sc.nextLine()));
        System.out.println("Digite a largura:");
        peixe.setAltura(Float.parseFloat(sc.nextLine()));
        System.out.println("Digite o comprimento:");
        peixe.setComprimento(Float.parseFloat(sc.nextLine()));
        System.out.println("Digitea temperatura ideal:");
        peixe.setTemperaturaIdeal(Float.parseFloat(sc.nextLine()));

        mostrarAquarios();
        System.out.println("Digite o número do aquário:");
        int aq = Integer.parseInt(sc.nextLine());
        while (aq >= zoo.getSoAquario().length){
            System.out.println("Não foi possível alocar nesse aquário");
            mostrarAquarios();
            System.out.println("Digite o número do aquário:");
            aq = Integer.parseInt(sc.nextLine());
            while (aq >= zoo.getSoAquario().length){
                System.out.println("Número inválido, digite outro número para o aquário");
                aq = Integer.parseInt(sc.nextLine());
            }
        }
        return peixe;
    }

    public static void mostrarAquarios(){
        Aquario aquario[] = zoo.getSoAquario();
        for (int i = 0; i < aquario.length; i++){
            System.out.println(i + ":" + aquario[i].getNomeViveiro());
        }
    }
}
