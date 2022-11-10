package uml.dados;

public class Primos extends Gerador {

    public Primos(){
        super();
    }

    @Override
    public void gerar(int quantidade) {
        int cont = 0;
        for (int i = 0;cont<=quantidade-1; i++){
            if (ePrimo(i)){
                super.getSequencia().add(i);
                cont++;
            }
        }
    }

    private boolean ePrimo(int n){
        int div = 0;
        for (int i = 1;i<=n; i++){
            if(n%i == 0){
                div++;
            }
        }
        return div == 2;
    }
}
