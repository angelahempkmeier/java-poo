package sorteador;
import java.util.Random;

public class Sorteador {
    private int n = 3;
    Pessoa[] pessoa = new Pessoa[n];

    //constructor
    public Sorteador(Pessoa p) {
        
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Pessoa sortearProxima(){
        Random random = new Random();
        int indice = random.nextInt(n);
        Pessoa sortear = pessoa[indice];
        return sortear;
    }

    public void setNome(String angela) {
    }
}
