package imobiliaria;

public class Imobiliaria {
    private String nome;
    private Imoveis[] imoveisDisponiveis;
    private int qtdImoveis = 0;
    Imoveis imoveis = new Imoveis();

    //construtor
    public Imobiliaria() {}

    public void adicionarImoveis(Imoveis imoveis){
        imoveisDisponiveis[qtdImoveis] = imoveis;
        qtdImoveis++;
    }

    public Imoveis[] filtrarPorArea(float x){
        int controle = 0;
        for (int i = 0; i<qtdImoveis; i++ ){
            if(imoveis[i].calculaAreaTotal() >= x){

            }
        }
        return imoveisDisponiveis;
    }

}
