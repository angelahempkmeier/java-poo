
/*
Quadrante: preciso fazer pro caso de ter ordem par
Nao ta rodando certo o criar matriz, nao sei pq
 */

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Matriz<Integer> matriz = new Matriz<Integer>(5);
    static int menor = 0;
    public static void main(String[] args) {
        int op = -1;
        while (op != 0){
            imprimirMenu();
            System.out.println("Digite a opção:");
            op = Integer.parseInt(sc.nextLine());
            switch (op){
                case 1:
                    criarMatriz();
                    break;
                case 2:
                    mostrarMatriz();
                    break;
                case 3:
                    mostrarMenor();
                    break;
                case 4:
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
    static void imprimirMenu(){
        System.out.println("--------MENU--------");
        System.out.println("1: Criar Matriz");
        System.out.println("2: Mostrar Matriz");
        System.out.println("3: Menor valor");
        System.out.println("0: Sair");
    }

    public static void criarMatriz(){
        for (int i = 0; i<=4;i++){
            for (int j = 0; j<=4; j++) {
                int leitor;
                System.out.println("Digite o elemento " + i + "x" + j + "da matriz:");
                leitor = Integer.parseInt(sc.nextLine());
                matriz.set(leitor, i, j);
                if (menor<=leitor){
                    menor = leitor;
                }
            }
        }
    }
    public static void mostrarMenor(){
        System.out.println("O menor número digitado foi: " + menor);
    }

    public static void mostrarMatriz(){
        System.out.println("Matriz:");
        for (int i =0; i<5; i++){
            for (int j = 0; j<5; j++){
                System.out.println(matriz.get(5,5));
            }
        }
    }

    /*
    MÉTODO INCOMPLETO E ERRADO!!!!!!!!!!!!!!!!!!!
    public static void quadrante(){
        System.out.println("Qual quadrante você quer ver? 1, 2, 3 ou 4?");
        int q = Integer.parseInt(sc.nextLine());
        Quadrante quadrante;
        matriz.getElementosQuadrante(quadrante);
    }

     */

}