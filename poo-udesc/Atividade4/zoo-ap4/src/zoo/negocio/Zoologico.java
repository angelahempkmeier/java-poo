package zoo.negocio;
import zoo.dados.*;

public class Zoologico {
    private Animal[] animais = new Animal[100];
    private Viveiro[] viveiros = new Viveiro[50];
    private int quantViv = 0;
    private int quantAnim = 0;

    public Zoologico(){}

    //método pra cadastrar viveiro
    public void cadastrarViveiro(Viveiro viveiro){
            viveiros[quantViv] = viveiro;
            quantViv++;
    }

    //método pra cadastrar animal
    public void cadastrarAnimais(Animal animal){
        animais[quantAnim] = animal;
        quantAnim++;
    }

    //método alocar animal
    public boolean alocarAnimal(Animal animal, Viveiro viveiro){
        //aqui acredito ter que verificar se eh peixe ou n etc

            if (viveiro instanceof Aquario){
                if (animal instanceof Peixe){
                    Peixe peixe = (Peixe) animal;
                    Aquario aquario = (Aquario) viveiro;
                    if (aquario.adicionarAnimal(peixe)){
                        return true;
                    }else {
                        return false;
                    }
                }else {
                    return false;
                }
            }else {
                if (animal instanceof Peixe){
                    return false;
                }else {
                    if (viveiro.adicionarAnimal(animal)){
                        return true;
                    }else {
                        return false;
                    }

                }
            }
    }

    //getSoAquarios
    public Aquario[] getSoAquarios(){
        int quantAqua = 0;
        for (int i=0; i<quantViv;i++){
            if (viveiros[i] instanceof Aquario){
                quantAqua++;
            }
        }
        Aquario[] soAquarios = new Aquario[quantAqua];
        int contAqua = 0;
        for (int i =0; i<quantViv; i++){
            if (viveiros[i] instanceof Aquario){
                soAquarios[contAqua] = (Aquario) viveiros[i];
                contAqua++;;
            }
        }
        return soAquarios;
    }

    public Viveiro[] getSoViveiros(){
        int quantV = 0;
        //contabilizando quantos viveiros temos
        for (int i =0; i<quantViv;i++){
            if (!(viveiros[i] instanceof Aquario)){
                quantV++;
            }
        }
        //alocando os viveiros dentro de um obj
        Viveiro[] soViveiros = new Viveiro[quantV];
        int contViv = 0;
        for (int i = 0; i<quantViv;i++){
            if (!(viveiros[i] instanceof Aquario)) {
                soViveiros[contViv] = viveiros[i];
                contViv++;
            }
        }
        return soViveiros;
    }

    //getters and setters
    public Animal[] getAnimais() {
        return animais;
    }

    public void setAnimais(Animal[] animais) {
        this.animais = animais;
    }

    public Viveiro[] getViveiros() {
        return viveiros;
    }

    public void setViveiros(Viveiro[] viveiros) {
        this.viveiros = viveiros;
    }

    public int getQuantViv() {
        return quantViv;
    }

    public void setQuantViv(int quantViv) {
        this.quantViv = quantViv;
    }

    public int getQuantAnim() {
        return quantAnim;
    }

    public void setQuantAnim(int quantAnim) {
        this.quantAnim = quantAnim;
    }
}
