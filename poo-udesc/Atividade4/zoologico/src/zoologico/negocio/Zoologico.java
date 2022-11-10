package zoologico.negocio;
import zoologico.dados.*;

public class Zoologico {
    private Animal[] animals = new Animal[100];
    private Viveiro[] viveiros = new Viveiro[50];
    private int quantAnimais = 0;
    private int quantViveiro = 0;

    public void cadastrarViveiro(Viveiro viveiro){
        viveiros[quantViveiro] = viveiro;
        quantViveiro++;
    }

    public void cadastrarAnimais(Animal animal){
        animals[quantAnimais] = animal;
        quantAnimais++;
    }

    public boolean alocarAnimais(Animal animal, Viveiro viveiro) {
        if (viveiro instanceof Aquario) {
            if (animal instanceof Peixe) {
                Aquario aquario = (Aquario) viveiro;
                Peixe peixe = (Peixe) animal;
                if (aquario.adicionaAnimais(peixe)) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else{
                if (animal instanceof Peixe) {
                    return false;
                } else {
                    if (viveiro.adicionaAnimais(animal)) {
                        return true;
                    } else {
                        return false;
                    }
                }
        }
    }
    public Viveiro[] getSoViveiro(){
        int quant = 0;
        for (int i = 0; i<quantViveiro; i++){
            if (!(viveiros[i] instanceof Aquario)){
                quant++;
            }
        }
        Viveiro viveirosTemp[] = new Viveiro[quant];
        int cont = 0;
        for (int i =0; i<quantViveiro; i++){
            if (!(viveiros[i] instanceof Aquario)){
                viveirosTemp[cont] = viveiros[i];
                cont++;
            }
        }
        return viveirosTemp;
    }

    public Aquario[] getSoAquario(){
        int quant = 0;
        for (int i = 0; i<quantViveiro; i++){
            if (viveiros[i] instanceof Aquario){
                quant++;
            }
        }
        Aquario[] aquariosTemp = new Aquario[quant];
        int cont = 0;
        for (int i = 0; i<quantViveiro; i++){
            if (viveiros[i] instanceof Aquario){
                aquariosTemp[cont] = (Aquario) viveiros[i];
                cont++;
            }
        }
        return aquariosTemp;
    }




    //getters e setters
    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public Viveiro[] getViveiros() {
        return viveiros;
    }

    public void setViveiros(Viveiro[] viveiros) {
        this.viveiros = viveiros;
    }

    public int getQuantAnimais() {
        return quantAnimais;
    }

    public void setQuantAnimais(int quantAnimais) {
        this.quantAnimais = quantAnimais;
    }

    public int getQuantViveiro() {
        return quantViveiro;
    }

    public void setQuantViveiro(int quantViveiro) {
        this.quantViveiro = quantViveiro;
    }
}
