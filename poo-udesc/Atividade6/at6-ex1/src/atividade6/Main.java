package atividade6;

public class Main {
    public static void main(String[] args) {
        Fabrica f = new Fabrica();
        for(int i =0; i<10;i++){
            Veiculo v = f.fabricar();
            System.out.println(v.info());
        }
    }
}