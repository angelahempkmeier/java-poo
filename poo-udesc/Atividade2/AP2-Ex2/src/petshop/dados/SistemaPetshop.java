package petshop.dados;
import java.util.Scanner;
public class SistemaPetshop {
    private Veterinario[] veterinarios = new Veterinario[10];
    private int quantidadeVeterinarios;
    Scanner sc = new Scanner(System.in);
    //Veterinario nomeVeterinario = new Veterinario();
    Veterinario infosVet = new Veterinario();
    private Animal[] listaAnimais = new Animal[50];
    private int nAnimal;


    //constructor
    public SistemaPetshop(){}

    //getters e setters


    public int getQuantidadeVeterinarios() {
        return quantidadeVeterinarios;
    }

    public void setQuantidadeVeterinarios(int quantidadeVeterinarios) {
        this.quantidadeVeterinarios = quantidadeVeterinarios;
    }

    public Veterinario[] getVeterinarios() {
        return veterinarios;
    }

    public void setVeterinarios(Veterinario[] veterinarios) {
        this.veterinarios = veterinarios;
    }

    public Veterinario getInfosVet() {
        return infosVet;
    }

    public void setInfosVet(Veterinario infosVet) {
        this.infosVet = infosVet;
    }

    public void cadastrarVeterinario(){
        System.out.println("Nome: ");
        String nomeVeterinario = sc.nextLine();
        System.out.println("Salário: ");
        float salario = Float.parseFloat(sc.nextLine()); //passando string p float
        Veterinario veterinario = new Veterinario();
        veterinario.setNomeVeterinario(nomeVeterinario);
        veterinario.setSalario(salario);
        this.veterinarios[quantidadeVeterinarios] = veterinario;
        quantidadeVeterinarios++;
    }

    public void exibirVEterinarios(){
        for (int i = 0; i<quantidadeVeterinarios; i++) {
            System.out.println(veterinarios[i] + ", " + i);
        }
    }

    public void cadastrarEnderecoVeterinario(){
        exibirVEterinarios();
        System.out.println("Escolha o veterinário");
        int posicaoVet = Integer.parseInt(sc.nextLine());
        Veterinario v;
        v = veterinarios[posicaoVet];
        System.out.println("Digite a rua: ");
        String rua = sc.nextLine();
        System.out.println("Número:");
        int num = Integer.parseInt(sc.nextLine());
        System.out.println("Cidade: ");
        String cidade = sc.nextLine();
        System.out.println("Estado: ");
        String estado = sc.nextLine();
        System.out.println("Bairro: ");
        String bairro = sc.nextLine();
        System.out.println("CEP: ");
        int cep = Integer.parseInt(sc.nextLine());
        Endereco endereco = new Endereco();
        endereco.setBairro(bairro);
        endereco.setCep(cep);
        endereco.setCidade(cidade);
        endereco.setRua(rua);
        endereco.setEstado(estado);
        endereco.setNumeroCasa(num);
        v.setEnderecoVeterinario(endereco);
    }

    public void cadastrarAnimal(){
        exibirVEterinarios();
        System.out.println("Escolha o veterinário");
        int posicaoVet = Integer.parseInt(sc.nextLine());
        Veterinario v;
        v = veterinarios[posicaoVet];
        Animal animal = new Animal();
        System.out.println("Nome: ");
        String nome = sc.nextLine();
        System.out.println("Espécie: ");
        String especie = sc.nextLine();
        System.out.println("Descricao: ");
        String descricao = sc.nextLine();
        animal.setNomeAnimal(nome);
        animal.setEspecieAnimal(especie);
        animal.setDescricaoAnimal(descricao);
        v.setAnimaisAtendidos(animal);
        this.listaAnimais[nAnimal] = animal;
        nAnimal++;
    }

    public void mostrarAnimais(){
        exibirVEterinarios();
        System.out.println("Escolha o veterinário");
        int posicaoVet = Integer.parseInt(sc.nextLine());
        Veterinario v;
        v = veterinarios[posicaoVet];
        for (int i = 0; i<v.getAnimaisAtendidos().length;i++){
            if (v.getAnimaisAtendidos()[i] != null){
                System.out.println(v.getAnimaisAtendidos()[i]);
            }else {
                break;
            }
        }
    }

    public void cadastrarDono(){
        for (int i = 0; i<nAnimal; i++) {
            System.out.println(listaAnimais[i] + ", " + i);
        }
        System.out.println("Escolha o animal para cadastrar o dono: ");
        int posicao = Integer.parseInt(sc.nextLine());
        Dono dono = new Dono();
        System.out.println("Nome: ");
        String nome = sc.nextLine();
        System.out.println("CPF:");
        int cpf = Integer.parseInt(sc.nextLine());
        dono.setCpfDono(cpf);
        dono.setNomeDono(nome);
        listaAnimais[posicao] .setDonoAnimal(dono);
    }



}
