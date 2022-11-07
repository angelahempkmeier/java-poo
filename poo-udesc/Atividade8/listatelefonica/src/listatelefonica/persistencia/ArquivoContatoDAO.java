package listatelefonica.persistencia;

import listatelefonica.dados.Contato;

import java.util.LinkedList;
import java.util.List;

public class ArquivoContatoDAO {
    private final String caminho = "src/listatelefonica/files/contatos.csv";
    private static EditorTexto arquivo = new EditorTexto();

    private String toCSV(Contato contato){
        String s = "";
        s += contato.getNome() + ",";
        s += contato.getTelefone();

        return s;
    }

    private Contato fromCSV(String linhaCSV){
        String[] atributos = linhaCSV.split(","); //abrigando dentro de um array de string a linha separada por vírgula
        Contato contato = new Contato();

        contato.setNome(atributos[0]);
        contato.setTelefone(Integer.parseInt(atributos[1]));

        return contato;
    }

    public List<Contato> stringToListaContatos(List<String> arquivo){
        List<Contato> contatos = new LinkedList<Contato>();
        for (String linha : arquivo){
            contatos.add(fromCSV(linha));
        }
        return contatos;
    }

    public List<String> listaContatosToString(List<Contato> ctt){
        List<String> arq = new LinkedList<String>();
        for (Contato c : ctt){
            arq.add(toCSV(c));
        }
        return arq;
    }


    public List<Contato> leContatos(){
        return stringToListaContatos(arquivo.leTexto(caminho));
    }

    public void salvaContatos(List<Contato> contatos){
        arquivo.gravaTexto(caminho, listaContatosToString(contatos));
    }

    public void salvaContato(Contato contato){
        arquivo.gravaTexto(caminho, toCSV(contato));
    }
}
