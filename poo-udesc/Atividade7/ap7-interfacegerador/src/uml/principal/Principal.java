package uml.principal;

import uml.dados.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Principal {

    public static int rand(int n){
        Random random = new Random();
        int res = random.nextInt(n);
        return res;
    }

    public static void main(String[] args) {
        Gerador gerador;
        List<Integer> resultado;
        List<Long> somatorio = new ArrayList<Long>();
        List<Double> mediaArit = new ArrayList<Double>();
        List<Double> mediaGeo = new ArrayList<Double>();
        List<Double> var = new ArrayList<Double>();
        List<Double> desvPad = new ArrayList<Double>();
        List<Long> ampl = new ArrayList<Long>();
        int i = 0, j = 0, k =0, l=0, m=0, n=0;

        //Naturais
        gerador = new Naturais();
        gerador.gerar(10);
        //gerador.gerar(rand(10));
        resultado = gerador.getSequencia();
        System.out.println("NATURAIS\n");
        System.out.println("Naturais: " + resultado);
        somatorio.add(gerador.somatorio());
        System.out.println("Somatório: " + somatorio.get(i));
        i++;
        mediaArit.add(gerador.mediaAritmetica());
        System.out.println("Média Aritmética: " + mediaArit.get(j));
        j++;
        mediaGeo.add(gerador.mediaGeometrica());
        System.out.println("Média Geométrica: " + mediaGeo.get(k));
        k++;
        var.add(gerador.variancia());
        System.out.println("Variância: " + var.get(l));
        l++;
        desvPad.add(gerador.desvioPadrao());
        System.out.println("Desvio Padrão: " + desvPad.get(m));
        m++;
        ampl.add(gerador.amplitude());
        System.out.println("Amplitude: " + ampl.get(n));
        n++;



        //Abundantes
        gerador = new Abundantes();
        gerador.gerar(10);
        //gerador.gerar(rand(5));
        resultado = gerador.getSequencia();
        System.out.println("ABUNDANTES:");
        System.out.println("Abundantes: " + resultado);
        somatorio.add(gerador.somatorio());
        System.out.println("Somatório: " + somatorio.get(i));
        i++;
        mediaArit.add(gerador.mediaAritmetica());
        System.out.println("Média Aritmética: " + mediaArit.get(j));
        j++;
        mediaGeo.add(gerador.mediaGeometrica());
        System.out.println("Média Geométrica: " + mediaGeo.get(k));
        k++;
        var.add(gerador.variancia());
        System.out.println("Variância: " + var.get(l));
        l++;
        desvPad.add(gerador.desvioPadrao());
        System.out.println("Desvio Padrão: " + desvPad.get(m));
        m++;
        ampl.add(gerador.amplitude());
        System.out.println("Amplitude: " + ampl.get(n));
        n++;

        //Fibo
        gerador = new Fibonacci();
        gerador.gerar(10);
        //gerador.gerar(rand(5));
        resultado = gerador.getSequencia();
        System.out.println("FIBONACCI");
        System.out.println("Fibo: " + resultado);
        somatorio.add(gerador.somatorio());
        System.out.println("Somatório: " + somatorio.get(i));
        i++;
        mediaArit.add(gerador.mediaAritmetica());
        System.out.println("Média Aritmética: " + mediaArit.get(j));
        j++;
        mediaGeo.add(gerador.mediaGeometrica());
        System.out.println("Média Geométrica: " + mediaGeo.get(k));
        k++;
        var.add(gerador.variancia());
        System.out.println("Variância: " + var.get(l));
        l++;
        desvPad.add(gerador.desvioPadrao());
        System.out.println("Desvio Padrão: " + desvPad.get(m));
        m++;
        ampl.add(gerador.amplitude());
        System.out.println("Amplitude: " + ampl.get(n));
        n++;

        //Fatorial
        gerador = new Fatorial();
        gerador.gerar(10);
        //gerador.gerar(rand(10));
        resultado = gerador.getSequencia();
        System.out.println("FATORIAL:");
        System.out.println("Fatorial: " + resultado);
        somatorio.add(gerador.somatorio());
        System.out.println("Somatório: " + somatorio.get(i));
        i++;
        mediaArit.add(gerador.mediaAritmetica());
        System.out.println("Média Aritmética: " + mediaArit.get(j));
        j++;
        mediaGeo.add(gerador.mediaGeometrica());
        System.out.println("Média Geométrica: " + mediaGeo.get(k));
        k++;
        var.add(gerador.variancia());
        System.out.println("Variância: " + var.get(l));
        l++;
        desvPad.add(gerador.desvioPadrao());
        System.out.println("Desvio Padrão: " + desvPad.get(m));
        m++;
        ampl.add(gerador.amplitude());
        System.out.println("Amplitude: " + ampl.get(n));
        n++;

        //Primos
        gerador = new Primos();
        gerador.gerar(10);
        //gerador.gerar(rand(10));
        resultado = gerador.getSequencia();
        System.out.println("PRIMOS:");
        System.out.println("Primos: " + resultado);
        somatorio.add(gerador.somatorio());
        System.out.println("Somatório: " + somatorio.get(i));
        i++;
        mediaArit.add(gerador.mediaAritmetica());
        System.out.println("Média Aritmética: " + mediaArit.get(j));
        j++;
        mediaGeo.add(gerador.mediaGeometrica());
        System.out.println("Média Geométrica: " + mediaGeo.get(k));
        k++;
        var.add(gerador.variancia());
        System.out.println("Variância: " + var.get(l));
        l++;
        desvPad.add(gerador.desvioPadrao());
        System.out.println("Desvio Padrão: " + desvPad.get(m));
        m++;
        ampl.add(gerador.amplitude());
        System.out.println("Amplitude: " + ampl.get(n));
        n++;

        //Quadrado
        gerador = new Quadrado();
        gerador.gerar(10);
        //gerador.gerar(rand(10));
        resultado = gerador.getSequencia();
        System.out.println("QUADRADO:");
        System.out.println("Quadrado: " + resultado);
        somatorio.add(gerador.somatorio());
        System.out.println("Somatório: " + somatorio.get(i));
        i++;
        mediaArit.add(gerador.mediaAritmetica());
        System.out.println("Média Aritmética: " + mediaArit.get(j));
        j++;
        mediaGeo.add(gerador.mediaGeometrica());
        System.out.println("Média Geométrica: " + mediaGeo.get(k));
        k++;
        var.add(gerador.variancia());
        System.out.println("Variância: " + var.get(l));
        l++;
        desvPad.add(gerador.desvioPadrao());
        System.out.println("Desvio Padrão: " + desvPad.get(m));
        m++;
        ampl.add(gerador.amplitude());
        System.out.println("Amplitude: " + ampl.get(n));
        n++;

        //Perfeito
        gerador = new Perfeito();
        gerador.gerar(4);
        //gerador.gerar(rand(10));
        resultado = gerador.getSequencia();
        System.out.println("PERFEITO:");
        System.out.println("Perfeito: " + resultado);
        somatorio.add(gerador.somatorio());
        System.out.println("Somatório: " + somatorio.get(i));
        i++;
        mediaArit.add(gerador.mediaAritmetica());
        System.out.println("Média Aritmética: " + mediaArit.get(j));
        j++;
        mediaGeo.add(gerador.mediaGeometrica());
        System.out.println("Média Geométrica: " + mediaGeo.get(k));
        k++;
        var.add(gerador.variancia());
        System.out.println("Variância: " + var.get(l));
        l++;
        desvPad.add(gerador.desvioPadrao());
        System.out.println("Desvio Padrão: " + desvPad.get(m));
        m++;
        ampl.add(gerador.amplitude());
        System.out.println("Amplitude: " + ampl.get(n));
        n++;
    }

}
