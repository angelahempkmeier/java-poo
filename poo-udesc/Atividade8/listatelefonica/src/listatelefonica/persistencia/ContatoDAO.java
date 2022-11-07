package listatelefonica.persistencia;

import listatelefonica.dados.Contato;

import java.util.*;

public class ContatoDAO {
    ArquivoContatoDAO arquivoContatoDAO = new ArquivoContatoDAO();

    public void insert(Contato contato) {
        arquivoContatoDAO.salvaContato(contato);
    }

    public void delete(Contato contato) {
        List<Contato> contatoList = arquivoContatoDAO.leContatos();
        contatoList.remove(contato);
        arquivoContatoDAO.salvaContatos(contatoList);
    }

    public Map<Character, List<Contato>> getAll() {
        Map<Character, List<Contato>> mapContatos = new HashMap<Character, List<Contato>>();

        for (char i = 'A'; i < 'Z'; i++) {
            List<Contato> lista = new LinkedList<Contato>();
            mapContatos.put(i, lista);
        }
        List<Contato> listaContatos = arquivoContatoDAO.leContatos();

        for (Contato c : listaContatos){
            String nome = c.getNome().toUpperCase();
            List<Contato> contatoTemp = mapContatos.get(nome.charAt(0));
            contatoTemp.add(c);
        }
        return mapContatos;
    }
}