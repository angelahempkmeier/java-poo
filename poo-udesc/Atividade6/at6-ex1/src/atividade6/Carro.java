package atividade6;

public class Carro extends Veiculo  {
    private int numeroPortas;
    private Combustivel combustivel;

    @Override
    public String info() {
        return "Carro:\n Numero de portas: " + this.getNumeroPortas() + "Combustivel: " +combustivel.getCombustivel() + "Cor: " +getCor().getCor();
    }
    //tem que ser combustivel.getcombustivel pra retornar a string

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public Combustivel getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(Combustivel combustivel) {
        this.combustivel = combustivel;
    }
}
