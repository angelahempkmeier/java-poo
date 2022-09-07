package fatura;

public class Fatura {
    String numero;
    String descricao;
    int quantComprada;
    double preco;

    public double valorFatura(int quantComprada, double preco){
        double total = quantComprada * preco;
        return total;
    }
}
