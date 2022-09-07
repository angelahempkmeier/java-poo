package aula02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    public void status(){
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
    }
    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("Erro.");
        }else {
            System.out.println("Estou rabiscando.");
        }
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }

}
