import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Equipe<T> {
    private String nome;
    private List<Aluno> alunos = new ArrayList<>(4);
    private List<T> e = new LinkedList<T>();
    public Equipe() {
    }

    public String toString(){
        return "EQUIPE: \n" + getAlunos();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void adicionarAlunoNaEquipe(T aluno){
        e.add(aluno);
    }

}
