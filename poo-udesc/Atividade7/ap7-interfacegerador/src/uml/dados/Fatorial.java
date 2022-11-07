package uml.dados;

public class Fatorial extends Gerador {

    public Fatorial(){
        super();
    }

    @Override
    public void gerar(int quantidade) {
        int fat = 1;
        for (int i = 1; i<=quantidade;i++){
            fat = fat*i;
            super.getSequencia().add(fat);
        }
    }
}
