package listatelefonica.negocio;

import listatelefonica.dados.Contato;
import listatelefonica.persistencia.ContatoDAO;

import java.util.*;

public class ListaTelefonica {
    private ContatoDAO contatoDAO = new ContatoDAO();

    public ListaTelefonica() {
    }

    public void adicionarContato(Contato contato) {
        contatoDAO.insert(contato);

    }

    public void removerContato(Contato contato){
        contatoDAO.delete(contato);
    }

    public List<Contato> getLista(char letra){
        return contatoDAO.getAll().get(letra);
    }

    public Map<Character, List<Contato>> getAll(){
        return contatoDAO.getAll();
    }

}