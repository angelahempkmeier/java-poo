package pessoa.negocio;

import pessoa.dados.Pessoa;

import java.util.*;

public class Sistema {
    Map<String, List<Pessoa>> faixaEtaria = new LinkedHashMap<String, List<Pessoa>>();
    public Sistema(){
        List<Pessoa> crianca = new LinkedList<Pessoa>();
        String faixaCrianca = "1 até 12 crianças";
        faixaEtaria.put(faixaCrianca, crianca);

        List<Pessoa> adolescente = new LinkedList<Pessoa>();
        String faixaAdolescente = "13 até 18: adolescente";
        faixaEtaria.put(faixaAdolescente, adolescente);

        List<Pessoa> jovens = new LinkedList<Pessoa>();
        String faixaJovem = "19 até 25: jovens";
        faixaEtaria.put(faixaJovem, jovens);

        List<Pessoa> adultos = new LinkedList<Pessoa>();
        String faixaAdulto = "26 até 59: adultos";
        faixaEtaria.put(faixaAdulto, adultos);

        List<Pessoa> idosos = new LinkedList<Pessoa>();
        String faixaIdosos = "60 anos ou mais";
        faixaEtaria.put(faixaIdosos, idosos);
    }

    public void adicionarPessoas(Pessoa pessoa){
        List<Pessoa> temp;
        if (pessoa.getIdade()>=1 && pessoa.getIdade()<=12){
            temp = faixaEtaria.get("1 até 12 crianças");
            temp.add(pessoa);
            faixaEtaria.put("1 até 12 crianças", ordenarIdade(temp));
            //to pegando a lista associada a string, adicionando uma pessoa, e sobrescrevendo com a string e a lista orndenada
        } else if (pessoa.getIdade()<=18) {
            temp = faixaEtaria.get("13 até 18: adolescente");
            temp.add(pessoa);
            faixaEtaria.put("13 até 18: adolescente", ordenarIdade(temp));
        } else if (pessoa.getIdade()<=25) {
            temp = faixaEtaria.get("19 até 25: jovens");
            temp.add(pessoa);
            faixaEtaria.put("19 até 25: jovens", ordenarIdade(temp));
        } else if (pessoa.getIdade()<=59) {
            temp = faixaEtaria.get("26 até 59: adultos");
            temp.add(pessoa);
            faixaEtaria.put("26 até 59: adultos", ordenarIdade(temp));
        } else if (pessoa.getIdade()>=60) {
            temp = faixaEtaria.get("60 anos ou mais");
            temp.add(pessoa);
            faixaEtaria.put("60 anos ou mais", ordenarIdade(temp));
        }
    }

    public List<Pessoa> ordenarIdade(List<Pessoa> lista){
        /*cadastroPessoas.forEach((chave, valor) -> {
            System.out.println(chave);
            for(Pessoa p : valor){}
        });
         */
        for(int i = 0; i<lista.size(); i++){
            for (int j = i+1;j<lista.size() - 1;j++){
                int comparacao = lista.get(i).getNome().compareToIgnoreCase(lista.get(j).getNome());
                if (comparacao>0){
                    Pessoa p;
                    p = lista.get(i);
                    lista.set(i,lista.get(j));
                    lista.set(j,p);
                }
            }
        }
        return lista;
    }

    public Map<String, List<Pessoa>> getFaixasEtarias(){
        return faixaEtaria;
    }


}
