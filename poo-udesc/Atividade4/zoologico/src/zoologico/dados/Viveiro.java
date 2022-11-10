package zoologico.dados;

public class Viveiro {
    protected String nomeViveiro;
    protected float comprimentoViveiro;
    protected float larguraViveiro;
    protected Animal[] animal = new Animal[100];
    protected float espOcu = 0;
    protected float espDispo;
    protected int quantAnimais = 0;

    public Viveiro(){

    }
    public float calculaEspaco(){
        return getComprimentoViveiro()*getLarguraViveiro();
    }

    private float espacoOcupado(){
        for (int i =0; i<quantAnimais;i++){
            if (animal[i].calculaEspacoOcupado() != 0){
                setEspOcu(getEspOcu() + espOcu); //???
                return espOcu;
            }else {
                setEspOcu(0);
                return espOcu;
            }
        }
        return espOcu;
    }

    public float espacoDisponivel(){
        espDispo = calculaEspaco() - espacoOcupado();
        return espDispo;
    }

    public boolean adicionaAnimais(Animal animal1){
        if (espacoDisponivel()>=animal1.calculaEspacoOcupado()*0.7){
            for (int i = 0; i<quantAnimais;i++){
                animal[quantAnimais] = animal1;
                quantAnimais++;
            }
            return true;
        }else {
            return false;
        }
    }

    //getters and setters

    public String getNomeViveiro() {
        return nomeViveiro;
    }

    public void setNomeViveiro(String nomeViveiro) {
        this.nomeViveiro = nomeViveiro;
    }

    public float getComprimentoViveiro() {
        return comprimentoViveiro;
    }

    public void setComprimentoViveiro(float comprimentoViveiro) {
        this.comprimentoViveiro = comprimentoViveiro;
    }

    public float getLarguraViveiro() {
        return larguraViveiro;
    }

    public void setLarguraViveiro(float larguraViveiro) {
        this.larguraViveiro = larguraViveiro;
    }

    public Animal[] getAnimal() {
        return animal;
    }

    public void setAnimal(Animal[] animal) {
        this.animal = animal;
    }

    public float getEspOcu() {
        return espOcu;
    }

    public void setEspOcu(float espOcu) {
        this.espOcu = espOcu;
    }

    public float getEspDispo() {
        return espDispo;
    }

    public void setEspDispo(float espDispo) {
        this.espDispo = espDispo;
    }

    public int getQuantAnimais() {
        return quantAnimais;
    }

    public void setQuantAnimais(int quantAnimais) {
        this.quantAnimais = quantAnimais;
    }
}
