package veiculos;

public class Veiculo {
    String modelo;
    String marca;
    int ano;
    double valorLocacao;
    int quantDias;

    //se o veículo for de passeio, recebe um desconto de R$20
    public double passeio(int quantDias, double valorLocacao){
        double total = quantDias*(valorLocacao - 20);
        return total;
    }
    //se o veiculo for utilitário, há um acréscimo de R$40
    public  double utilitario(int quantDias, double valorLocacao){
        double total = quantDias*(valorLocacao + 40);
        return total;
    }


}
