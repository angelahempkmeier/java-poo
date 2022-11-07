package atividadepratica1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String[] nomePessoa = new String[5];
        int[] idadePessoa = new int[5];
        //int ordemDescrescente = 150;
        //int j = 0;
        int[] auxIdade = new int[5];
        String[] auxNome = new String[5];

        for(int i=0; i<5; i++){
            nomePessoa[i] = leitor.next();
            idadePessoa[i] = leitor.nextInt();
        }

        //ordenacao do vetor
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(idadePessoa[j]>idadePessoa[i]){
                    auxIdade[i] = idadePessoa[j];
                    idadePessoa[j] = idadePessoa[i];
                    idadePessoa[i] = auxIdade[i];
                    auxNome[i] = nomePessoa[j];
                    nomePessoa[j] = nomePessoa[i];
                    nomePessoa[i] = auxNome[i];
                }
            }
        }

        for(int i=0;i<5;i++){
            System.out.println(nomePessoa[i]);
            System.out.println(idadePessoa[i]);
        }
    }
}