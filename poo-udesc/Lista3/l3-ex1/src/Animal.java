public abstract class Animal {
    String nome;

    public Animal(){}

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public abstract String emitirSom();

    public String toString(){
        System.out.println(getNome() + ": " + this.emitirSom());
        return getNome() + this.emitirSom();
    }
}
