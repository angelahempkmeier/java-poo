package aula02;
public class Main {
    public static void main(String[] args) {
        Caderno c1 = new Caderno();
        c1.quantPaginas = 48;
        c1.valor = 0.15;
        c1.estaUsado = true;
        c1.comprarCaderno();
        c1.valorDoCaderno(c1.quantPaginas, c1.valor);
    }
}