import java.util.Random;

public class Complexo {
    private int real;
    private int imaginario;

    public Complexo() {
        Random r = new Random();
        real = r.nextInt(100);
        imaginario = r.nextInt(100);
    }

    public Complexo(int real, int imaginario){
        this.real = real;
        this.imaginario = imaginario;
    }

    public String toString(){
        return "(" + this.real + " + " + this.imaginario + "i)";
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginario() {
        return imaginario;
    }

    public void setImaginario(int imaginario) {
        this.imaginario = imaginario;
    }
}
