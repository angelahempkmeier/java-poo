package uml.dados;

public class Quadrado extends Gerador {

    public Quadrado(){
        super();
    }

    @Override
    public void gerar(int quantidade) {
        int cont = 0;
        for (int i = 0;cont<=quantidade - 1; i++){
            if (eInteira(i)){
                super.getSequencia().add(i);
                cont++;
            }
        }
    }

    private boolean eInteira(int n){
        return Math.sqrt(n)%1 == 0;
    }
}
