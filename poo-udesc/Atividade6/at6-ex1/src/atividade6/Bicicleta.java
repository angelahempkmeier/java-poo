package atividade6;

public class Bicicleta extends Veiculo{
    private int numeroMarchas;

    @Override
    public String info() {
        return "Bicileta:\n Número de marchas: " + this.getNumeroMarchas() + "Cor: " +getCor().getCor();
    }

    public int getNumeroMarchas() {
        return numeroMarchas;
    }

    public void setNumeroMarchas(int numeroMarchas) {
        this.numeroMarchas = numeroMarchas;
    }
}
