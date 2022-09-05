package atividadepratica1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String[] nomePessoa = new String[5];
        int[] idadePessoa = new int[5];
        int ordemDescrescente = 150;
        int j = 0;

        for(int i=0; i<3; i++){
            nomePessoa[i] = leitor.next();
            idadePessoa[i] = leitor.nextInt();
        }
        
        for(int i=0;i<3;i++){
            System.out.println(nomePessoa[i]);
            System.out.println(idadePessoa[i]);
        }
    }
}