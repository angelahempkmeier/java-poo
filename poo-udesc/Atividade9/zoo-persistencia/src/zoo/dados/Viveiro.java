package zoo.dados;

public class Viveiro {
    protected String nome;
    protected float comprimento;
    protected float largura;
    protected Animal[] animais = new Animal[100];
    protected int quantAnimais;

    //constructor
    public Viveiro(){}

    //método calcula espaco
    public float calculaEspaco(){
        return getComprimento()*getLargura();
    }

    //método espaco ocupado
    private float espacoOcupado(){
        float espOcu = 0;
        for (int i=0; i<quantAnimais; i++){
            espOcu = espOcu + animais[i].calculaEspacoOcupado();
        }
        return espOcu;
    }

    //metodo espaco disponivel
    public float espacoDisponivel(){
        return calculaEspaco() - espacoOcupado();
    }

    //método adiciona animal
    //imaginei que aqui verificaria se existe um animal tipo peixe pra adc no aquario
    //FAZER MESMO, eh ideal!
    public boolean adicionarAnimal(Animal animal){
        if (espacoDisponivel() >= animal.calculaEspacoOcupado()*0.70){
            //preciso adicionar um animal no viveiro, ou seja, adicionar meu objeto animal no animais
            for (int i = 0; i<quantAnimais; i++){
                animais[quantAnimais] = animal;
                quantAnimais++;
            }
            return true;
        }else {
            return false;
        }
    }

    //getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public Animal[] getAnimais() {
        return animais;
    }

    public void setAnimais(Animal[] animais) {
        this.animais = animais;
    }

    public String toString(){
        return "Nome: " + this.getNome() + "\nComprimento: " + this.getComprimento() + "\nLargura: " +  this.getLargura();
    }

}
