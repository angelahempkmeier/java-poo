package zoologico.dados;

public class Peixe extends Animal{
    private float temperaturaIdeal;

    public Peixe(){
        super();
    }

    //método
    public float calculaEspacoOcupado(){
        return super.calculaEspacoOcupado()*getAltura();
    }

    //getters and setters
    public float getTemperaturaIdeal() {
        return temperaturaIdeal;
    }

    public void setTemperaturaIdeal(float temperaturaIdeal) {
        this.temperaturaIdeal = temperaturaIdeal;
    }
}
