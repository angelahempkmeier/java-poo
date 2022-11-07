package uml.dados;

import uml.ISequencia;

import java.util.*;

public class CalculadoraEstatistica implements ISequencia {
    private static CalculadoraEstatistica instance = null;
    protected List<Integer> sequencia = new LinkedList<Integer>();

    private CalculadoraEstatistica(){}

    public static CalculadoraEstatistica getInstance(){
        if (instance == null){
            instance = new CalculadoraEstatistica();
        }
        return instance;
    }

    public List<Integer> getValores(){
        return this.sequencia;
    }

    public void adicionarValor(int valor){
        sequencia.add(valor);
    }

    public void limparValores(){
        sequencia.clear();
    }

    public void tirarUltimoValor(){
        if (sequencia.size() > 0){
            sequencia.remove(sequencia.size() - 1);
        }
    }

    public int fibo(int n){
        if (n<2){
            return n;
        }else {
            return fibo(n-1) + fibo(n -2);
        }
    }



    public int sortear(){
        Random r = new Random();
        return sequencia.get(r.nextInt(sequencia.size()));
    }

    public long somatorio(){
        long soma = 0;
        for (long num : sequencia){
            soma += num;
        }
        return soma;
    }

    public long produtorio(){
        long produto = 1;
        for (int num : sequencia){
            produto *= num;
        }
        return produto;
    }

    public double mediaGeometrica(){
        double resultado;
        resultado = Math.pow(produtorio(), 1.0 / (double) sequencia.size());
        return resultado;
    }

    public double mediaAritmetica(){
        return somatorio()/(double) sequencia.size();
    }

    public double variancia(){
        double media = mediaAritmetica();
        double soma = 0;

        for (int num : sequencia){
            soma += Math.pow(num - media,2);
        }
        return soma / (double) sequencia.size();
    }

    @Override
    public double desvioPadrao() {
        return Math.sqrt(variancia());
    }

    public long amplitude(){
        return Collections.max(sequencia) - Collections.min(sequencia);
    }
}
