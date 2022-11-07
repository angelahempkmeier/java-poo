package arquivos.persistencia;

import arquivos.dados.Pessoa;

import java.util.List;

public class PessoasDAO {
    private ArquivoPessoaDAO arquivoPessoaDAO = new ArquivoPessoaDAO();

    public void insert(Pessoa pessoa){
        arquivoPessoaDAO.salvaPessoaArquivo(pessoa);
    }

    public void delete(Pessoa pessoa){
        List<Pessoa> pessoas = arquivoPessoaDAO.lePessoasArquivo();
        pessoas.remove(pessoa);
        arquivoPessoaDAO.salvaPessoasArquivo(pessoas);
    }

    public List<Pessoa> getAll(){
        return arquivoPessoaDAO.lePessoasArquivo();
    }
}
