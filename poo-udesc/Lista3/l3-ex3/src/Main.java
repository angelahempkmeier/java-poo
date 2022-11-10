import grafos.Digrafo;
import grafos.Grafo;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Digrafo digrafo = new Digrafo();
        Grafo grafo = new Grafo();
        System.out.println("DIGRAFO");
        digrafo.adicionarVertice();
        digrafo.adicionarVertice();
        digrafo.adicionarVertice();
        digrafo.adicionarVertice();
        digrafo.adicionarVertice();
        digrafo.adicionarAresta(0, 2);
        digrafo.adicionarAresta(0, 1);
        digrafo.adicionarAresta(1, 1);
        digrafo.adicionarAresta(2, 0);
        digrafo.adicionarAresta(2, 1);
        digrafo.adicionarAresta(2, 3);
        digrafo.adicionarAresta(3, 4);
        digrafo.adicionarAresta(4, 1);
        System.out.println(digrafo.toString());

        System.out.println("GRAFO");
        grafo.adicionarVertice();
        grafo.adicionarVertice();
        grafo.adicionarVertice();
        grafo.adicionarVertice();
        grafo.adicionarVertice();
        grafo.adicionarAresta(0, 1);
        grafo.adicionarAresta(0, 2);
        grafo.adicionarAresta(1, 1);
        grafo.adicionarAresta(1, 2);
        grafo.adicionarAresta(1, 3);
        grafo.adicionarAresta(1, 4);
        grafo.adicionarAresta(2, 3);
        grafo.adicionarAresta(3, 4);
        System.out.println(grafo.toString());
    }

}