package atividadepratica2;

public class Grupo {
    private Pessoa[] pessoas = new Pessoa[5];
    private int numeroPessoas =0;

    //construtor vazio
    public Grupo(){

    }
    //metodo set
    public void setPessoas(Pessoa p){
        if(this.numeroPessoas < 5){
            pessoas[this.numeroPessoas] = p;
            this.numeroPessoas++;
        }
    }

    //método de ordenação de vetor
    public void ordena(){
        for(int i = 0; i<5; i++){
            for(int j=i+1; j<5; j++){
                if(this.pessoas[j].calculaImc() > this.pessoas[i].calculaImc()){
                    Pessoa aux = this.pessoas[j];
                    this.pessoas[j] = this.pessoas[i];
                    this.pessoas[i] = aux;
                }
            }
        }
    }
    

}
