package uml.dados;

public class Abundantes extends Gerador {

    public Abundantes(){
        super();
    }

    @Override
    public void gerar(int quantidade) {
        int ab = 0;
        int cont = 0;
        int i = 0;
        do {
            if (eAbundante(i)) {
                super.getSequencia().add(i);
                cont++;
            }
            i++;

        }while (cont<=quantidade-1);

    }

    private boolean eAbundante(int n){
        int ab = 0;
        for (int i =1; i<=n/2;i++){
            if (n % i == 0){
                ab += i;
            }
            //verificar se esta entrando no numero que eu quero
        }
        return ab>n;
    }
}
