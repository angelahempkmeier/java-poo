package atividade6;

public abstract class Veiculo {
    private Cor cor;

    public abstract String info();

    public Cor getCor(){
        return cor;
    }
    public void setCor(Cor cor){
        this.cor = cor;
    }
}
