package uml.dados;

public class Naturais extends Gerador {

    public Naturais(){
        super();
    }

    @Override
    public void gerar(int quantidade) {
        for (int i = 0; i<quantidade; i++){
            super.getSequencia().add(i);
        }
    }




}
