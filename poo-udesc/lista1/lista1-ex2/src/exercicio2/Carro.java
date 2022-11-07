package exercicio2;

public class Carro {
    private String modelo;
    private String montadora;
    private String placa;
    private int qtdCarrosDisponiveis;
    private int qtdCarrosAlugados;

    //construct

    public Carro(String modelo, String montadora, String placa) {
        this.modelo = modelo;
        this.montadora = montadora;
        this.placa = placa;
    }

    public Carro(String modelo, int qtdCarrosDisponiveis) {
        this.modelo = modelo;
        this.qtdCarrosDisponiveis = qtdCarrosDisponiveis;
    }

    //getters and setters


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMontadora() {
        return montadora;
    }

    public void setMontadora(String montadora) {
        this.montadora = montadora;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getQtdCarrosDisponiveis() {
        return qtdCarrosDisponiveis;
    }

    public void setQtdCarrosDisponiveis(int qtdCarrosDisponiveis) {
        this.qtdCarrosDisponiveis = qtdCarrosDisponiveis;
    }

    public int getQtdCarrosAlugados() {
        return qtdCarrosAlugados;
    }

    public void setQtdCarrosAlugados(int qtdCarrosAlugados) {
        this.qtdCarrosAlugados = qtdCarrosAlugados;
    }

    //toString
    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", montadora='" + montadora + '\'' +
                ", placa='" + placa + '\'' +
                ", qtdCarrosDisponiveis=" + qtdCarrosDisponiveis +
                ", qtdCarrosAlugados=" + qtdCarrosAlugados +
                '}';
    }

    //equals
}
