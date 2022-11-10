package zoologico.dados;

public class Aquario extends Viveiro{
    private float altura;
    private float temperatura;

    public Aquario(){
        super();
    }

    public float calculaEspaco(){
        return super.calculaEspaco()*getAltura();
    }

    //metodo de adicionar ajustado aqui
    public boolean adicionaAnimais(Animal animal1){
        if (espacoDisponivel() >= (animal1.calculaEspacoOcupado()*0.7)){
            if (animal1 instanceof Peixe){
                Peixe p = (Peixe) animal1;
                if (p.getTemperaturaIdeal() < (getTemperatura() - 3) || p.getTemperaturaIdeal() > (getTemperatura() + 3)){
                    return false;
                }
            }else {
                return false;
            }
            animal[quantAnimais] = animal1;
            quantAnimais++;
            return true;
        }
        return false;
    }


    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }
}
