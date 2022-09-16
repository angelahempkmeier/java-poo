package petshop.dados;

public class Animal {
    private String nomeAnimal;
    private String especieAnimal;
    private String descricaoAnimal;
    //object dono dentro de animal
    Dono donoAnimal = new Dono();

    //constructor
    public Animal(){}

    //get e set

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public String getEspecieAnimal() {
        return especieAnimal;
    }

    public void setEspecieAnimal(String especieAnimal) {
        this.especieAnimal = especieAnimal;
    }

    public String getDescricaoAnimal() {
        return descricaoAnimal;
    }

    public void setDescricaoAnimal(String descricaoAnimal) {
        this.descricaoAnimal = descricaoAnimal;
    }

    public Dono getDonoAnimal() {
        return donoAnimal;
    }

    public void setDonoAnimal(Dono donoAnimal) {
        this.donoAnimal = donoAnimal;
    }
    
}
