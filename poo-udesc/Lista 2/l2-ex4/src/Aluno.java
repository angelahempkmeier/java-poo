import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private int idade;
    //private double nota[]; //5
    private List<Double> notas = new ArrayList<Double>(5);
    public Aluno() {
    }

    public double calcularMedia(){
        double media = 0;
        for (int i = 0; i < notas.size(); i++){
            media += notas.get(i);
        }
        return media/notas.size();
    }

    public String toString(){
        return "Nome do aluno: " + getNome() + ", cuja idade é " + getIdade() +
                " anos e a média das 5 notas igual a " + this.calcularMedia();
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }
}
