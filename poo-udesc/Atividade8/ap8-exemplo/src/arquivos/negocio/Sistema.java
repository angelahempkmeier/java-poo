package arquivos.negocio;

import arquivos.dados.Pessoa;

import java.util.List;
import arquivos.persistencia.PessoasDAO;

public class Sistema {
    private PessoasDAO pessoaDAO = new PessoasDAO();
    public Sistema(){}

    public void adicionaPessoa(Pessoa p){
        pessoaDAO.insert(p);
    }
    public void removerPessoa(Pessoa p){
        pessoaDAO.delete(p);
    }

    public List<Pessoa> getList(){
        return pessoaDAO.getAll();
    }

}
