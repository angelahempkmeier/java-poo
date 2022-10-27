package grafos;

import java.util.List;

public class Grafo extends Digrafo{
    public Grafo(){
        super();
    }
    @Override
    public void adicionarAresta(int origem, int destino) {
        List<Integer> list = matrizAdjacencia.get(origem);
        list.set(destino, 1);
        List<Integer> list2 = matrizAdjacencia.get(destino);
        list2.set(origem,1);
    }
}
