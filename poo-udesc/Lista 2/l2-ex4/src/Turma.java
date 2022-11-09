import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class Turma {
    List<Aluno> alunoList = new ArrayList<Aluno>();

    public Turma(){}

    public void adicionarAluno(Aluno aluno){
        alunoList.add(aluno);
    }
    private void ordenarAlunosPorMedia(){
        List<Aluno> alunoPorMedia = new ArrayList<Aluno>();
        for (int i = 0; i< alunoList.size(); i++){
            for (int j = 1; j < alunoList.size(); j++){
                if (Double.compare(alunoList.get(i).calcularMedia(),alunoList.get(j).calcularMedia()) < 0){
                    alunoPorMedia.add(alunoList.get(i));
                    alunoList.set(i,alunoPorMedia.get(i));
                }else {
                    alunoPorMedia.add(alunoList.get(j));
                    alunoList.set(j,alunoPorMedia.get(j));
                }
            }

        }
    }

    public boolean testaQuantAlunos(){
        if (alunoList.size()<6){
            return false;
        }else {
            return true;
        }
    }

    public List<Equipe<Aluno>> separarEmEquipes(){
        if (testaQuantAlunos()){
            List<Equipe<Aluno>> equipeAlunos = new LinkedList<Equipe<Aluno>>();
            ordenarAlunosPorMedia();
            int tamanho = alunoList.size();
            int comeco = 0;
            int fim = tamanho - 1;
            for (int i = 0; i < tamanho; i++){
                String nomeEquipe = "EQUIPE " + i;
                Equipe<Aluno> equipe1 = new Equipe<Aluno>();
                equipe1.setNome(nomeEquipe);
                if (alunoList.size()%4==0){
                    equipe1.adicionarAlunoNaEquipe(alunoList.get(comeco));
                    comeco++;
                    equipe1.adicionarAlunoNaEquipe(alunoList.get(comeco));
                    comeco++;
                    equipe1.adicionarAlunoNaEquipe(alunoList.get(fim));
                    fim--;
                    equipe1.adicionarAlunoNaEquipe(alunoList.get(fim));
                    fim--;
                    tamanho -= 4;
                }else if (alunoList.size()%3==0){
                    equipe1.adicionarAlunoNaEquipe(alunoList.get(comeco));
                    comeco++;
                    equipe1.adicionarAlunoNaEquipe(alunoList.get(comeco));
                    comeco++;
                    equipe1.adicionarAlunoNaEquipe(alunoList.get(fim));
                    fim--;
                    tamanho -= 3;
                }
                equipeAlunos.add(equipe1);
            }
            return equipeAlunos;
        }else {
            return null;
        }
    }

    public List<Aluno> getAlunoList() {
        return alunoList;
    }

    public void setAlunoList(List<Aluno> alunoList) {
        this.alunoList = alunoList;
    }
}
