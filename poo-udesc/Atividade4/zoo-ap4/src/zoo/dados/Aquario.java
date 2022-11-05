package zoo.dados;

public class Aquario extends Viveiro{
    private float altura;
    private float temperatura;

    //constructor
    public Aquario(){
        super();
    }

    //calcula espaco sobrescrevendo o metodo do viveiro
    public float calculaEspaco(){
        return getAltura()*getComprimento()*getLargura();
    }

    //getters e setters
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

    public String toString(){
        return super.toString() + "\nAltura:" + this.getAltura() + "\nTemperatura ideal: " + this.getTemperatura();
    }

}
