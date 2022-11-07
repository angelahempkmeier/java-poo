package listatelefonica.negocio;

import listatelefonica.dados.Contato;

import java.util.*;

public class ListaTelefonica {
    //private Contato[] contatos = new Contato[100];
    private List<Contato> contatos = new ArrayList<Contato>();
    private Map<Character, List<Contato>> ctt = new HashMap<Character,List<Contato>>();
    private int quantCont;

    public ListaTelefonica(){
        List<Contato> lista;
        for (char i = 'A'; i<='Z'; i++){
            lista = new LinkedList<Contato>();
            ctt.put(i, lista);
        }
    }

    public void adicionarContato(Contato contato){
        /*
        String nome = contato.getNome().toUpperCase();
        List<Contato> contatosTemp = contatos.get(nome.charAt(0))
        contatos.add(contato);
        contatosTemp.add(contato);

         */
        contatos.add(contato);
        char n = contato.getNome().toUpperCase().charAt(0);
        ctt.put(n,contatos);
    }

    public void removerContato(Contato contato){
        contatos.remove(contato);
        //é o suficiente isso?
    }

    public List<Contato> buscarContatos(char letra){
        if (contatos.contains(letra)){
            return contatos;
        }
        return null;
    }

    //nao sei se ta certo isso
    /*public Map<Character, List<Contato>> buscarContatos(){
        List<Contato> l = new ArrayList<Contato>();
        for (char i = 'A'; i<= 'Z'; i++){
            char primeiraLetra = l.get(i).getNome().toUpperCase().charAt(0);
            if (primeiraLetra==i){
                ctt.put(i,contatos);
            }
        }
        return ctt;
    }
     */
    public Map<Character, List<Contato>> buscarContatos(){
        return ctt;
    }
    /*
    public Map<Character, List<Contato>> exibirContatoPorLetra(){
        return ctt;
    }

     */

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    public int getQuantCont(){
        return quantCont;
    }
    public void setQuantCont(int quantCont){
        this.quantCont = quantCont;
    }
}
