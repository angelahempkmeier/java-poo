package fatura;
public class GeraFatura {
    public static void main(String[] args) {
        Fatura fatura = new Fatura();
        fatura.numero = "001";
        fatura.descricao = "Mouse";
        fatura.preco = 25.50;
        fatura.quantComprada = 5;

        System.out.println("Produto: " +fatura.descricao);
        System.out.println("Valor total: " + fatura.valorFatura(fatura.quantComprada, fatura.preco));

    }
}