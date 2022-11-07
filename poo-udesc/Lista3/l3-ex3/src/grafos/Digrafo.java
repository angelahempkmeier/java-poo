package grafos;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Digrafo {
    protected Map<Integer, List<Integer>> matrizAdjacencia = new HashMap<Integer, List<Integer>>();

    public Digrafo(){
        /*for (int i = 0; i<matrizAdjacencia.size();i++){
            List<Integer> list = new LinkedList<Integer>();
            matrizAdjacencia.put(i, list);
        }
         */
    }

    public void adicionarVertice(){
        //quero adicionar apenas UM vertice, nao faria sentido colocar o put dentro do for
        List<Integer> list = new LinkedList<Integer>();
        matrizAdjacencia.put(matrizAdjacencia.size(), list);
        for (int i = 0; i< matrizAdjacencia.size();i++){
            if (i != matrizAdjacencia.size() - 1){
                matrizAdjacencia.get(i).add(0);
            }else {
                for (int j = 0; j < matrizAdjacencia.size() ; j++){
                    matrizAdjacencia.get(i).add(0); //pegando o ultimo
                }
            }
        }
    }

    public void adicionarAresta(int origem, int destino){
        List<Integer> list = matrizAdjacencia.get(origem);
        list.set(destino, 1);
        //peguei a linha de origem, por ex, 0, e agora vou no destino, por ex 2, e substiuo o 0 q estava por 1
    }

    public String toString(){
        StringBuffer str = new StringBuffer();
        for (Map.Entry<Integer, List<Integer>> map : matrizAdjacencia.entrySet()){
            List <Integer> value = map.getValue();
            for (int i : value){
                str.append("\t" + i);
            }
            str.append("\n");
        }
        return str.toString();
    }
}
