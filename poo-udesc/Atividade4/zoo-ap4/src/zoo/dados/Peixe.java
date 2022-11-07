package zoo.dados;

public class Peixe extends Animal {
    private float temperaturaIdeal;

    //constructor
    public Peixe(){
        super();
    }

    //método calcula espaco ocupado
    public float calculaEspacoOcupado(){
        return super.calculaEspacoOcupado()*getAltura();
    }

    //getters and setter
    public float getTemperaturaIdeal() {
        return temperaturaIdeal;
    }

    public void setTemperaturaIdeal(float temperaturaIdeal) {
        this.temperaturaIdeal = temperaturaIdeal;
    }
}
