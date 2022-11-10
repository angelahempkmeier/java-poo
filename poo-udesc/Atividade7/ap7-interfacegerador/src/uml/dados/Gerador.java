package uml.dados;

import uml.ISequencia;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Gerador implements ISequencia {
    private List<Integer> sequencia = new ArrayList<Integer>();

    public Gerador(){}

    public abstract void gerar(int quantidade);

    public List<Integer> getSequencia(){
        return sequencia;
    }

    @Override
    public int sortear() {
        Random r = new Random();
        return sequencia.get(r.nextInt(sequencia.size()));
    }

    @Override
    public long somatorio() {
        long soma =0;
        for (long num : sequencia){
            soma += num;
        }
        return soma;
    }

    @Override
    public double mediaAritmetica() {
        double media = 0;
        double mediafinal;
        for (int num : sequencia){
            media += num;
        }
        mediafinal = media/sequencia.size();
        return mediafinal;
    }

    /*
    public double mediaAritmetica(){
        return somatorio()/(double) sequencia.size();

     */

    public long produtorio(){
        long produto = 1;
        for (int num : sequencia){
            if (num>0){
                produto *= num;
            }
        }
        return produto;
    }

    @Override
    public double mediaGeometrica() {
        double resultado;
        resultado = Math.pow(produtorio(), 1.0/(double) sequencia.size());
        return resultado;
    }

    @Override
    public double variancia() {
        double media = mediaAritmetica();
        double soma = 0;
        for (int num : sequencia){
            soma += Math.pow(num - media, 2);
        }
        return soma/((double) sequencia.size() - 1);
    }

    @Override
    public double desvioPadrao() {
        return Math.pow(variancia(), 0.5);
    }


    @Override
    public long amplitude() {
        long maior = 0;
        long menor = -1;
        for (int num : sequencia){
            if (num >= maior){
                maior = num;
            } else if (menor <= num) {
                menor = num;
            }
        }
        return (maior - menor);
    }
    /*
    public int amplitude(){
    return Collections.max(sequencia) - Collections.min(sequencia);
    }
     */
}
