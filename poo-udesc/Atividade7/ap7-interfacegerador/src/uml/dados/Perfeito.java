package uml.dados;

public class Perfeito extends Gerador{
    public Perfeito(){
        super();
    }

    @Override
    public void gerar(int quantidade) {
        int cont = 1;
        for (int i = 1; cont <= quantidade; i++) {
            if (ePerfeito(i)) {
                super.getSequencia().add(i);
                cont++;
            }
        }
    }
    private boolean ePerfeito(int n){
        int perf = 0;
        for (int i = 1; i < n; i++){
            if (n % i == 0){
                perf += i;
            }
        }
        return n == perf;
    }
}
