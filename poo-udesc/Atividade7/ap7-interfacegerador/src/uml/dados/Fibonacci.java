package uml.dados;

public class Fibonacci extends Gerador {

    public Fibonacci(){
        super();
    }

    @Override
    public void gerar(int quantidade) {
        int fib = 0;
        for (int i = 0; i<quantidade;i++){
            if(i==0){
                fib = 0;
                super.getSequencia().add(fib);
            } else if (i==1){
                fib = 1;
                super.getSequencia().add(fib);
            }else{
                fib = getSequencia().get(i-1) + getSequencia().get(i-2);
                super.getSequencia().add(fib);
            }
        }
    }
}
