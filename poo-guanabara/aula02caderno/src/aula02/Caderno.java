package aula02;

public class Caderno {
    String tipo; //com pauta, sem pauta, de desenho, califragia
    int quantPaginas;
    String marca;
    String uso;
    double valor;
    boolean estaUsado;

    public void comprarCaderno(){
        if(this.estaUsado == true){
            System.out.println("Não vou comprar, o caderno está usado.");
        }else {
            System.out.println("Quero ver esse.");
        }
    }
    public void valorDoCaderno(int quantPaginas, double valor){
        double total = this.quantPaginas * this.valor;
        System.out.println("Total: " + total);
        System.out.printf("Total: %.2f" , total);
    }

}


