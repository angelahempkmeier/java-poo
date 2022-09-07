package contabancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria();
        c1.numConta = 1234;
        c1.tipo = "CC";
        c1.getDono();
        c1.setDono("Angela");
        c1.getSaldo();
        c1.getStatus();

        c1.abrirConta();
        //c1.fecharConta();
        //c1.depositar(10.0f);
        //c1.sacar(21.0f);
    }
}