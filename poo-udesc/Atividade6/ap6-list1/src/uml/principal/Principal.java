package uml.principal;

import uml.dados.*;

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

        //Naturais
        gerador = new Naturais();
        gerador.gerar(10);
        //gerador.gerar(rand(10));
        resultado = gerador.getSequencia();
        System.out.println("Naturais: " + resultado);

        //Abundantes
        gerador = new Abundantes();
        gerador.gerar(5);
        //gerador.gerar(rand(5));
        resultado = gerador.getSequencia();
        System.out.println("Abundantes: " + resultado);

        //Fibo
        gerador = new Fibonacci();
        gerador.gerar(10);
        //gerador.gerar(rand(5));
        resultado = gerador.getSequencia();
        System.out.println("Fibo: " + resultado);

        //Fatorial
        gerador = new Fatorial();
        gerador.gerar(10);
        //gerador.gerar(rand(10));
        resultado = gerador.getSequencia();
        System.out.println("Fatorial: " + resultado);

        //Primos
        gerador = new Primos();
        gerador.gerar(10);
        //gerador.gerar(rand(10));
        resultado = gerador.getSequencia();
        System.out.println("Primos: " + resultado);

        //Quadrado
        gerador = new Quadrado();
        gerador.gerar(10);
        //gerador.gerar(rand(10));
        resultado = gerador.getSequencia();
        System.out.println("Quadrado: " + resultado);

        //Perfeito
        gerador = new Perfeito();
        gerador.gerar(4);
        //gerador.gerar(rand(10));
        resultado = gerador.getSequencia();
        System.out.println("Perfeito: " + resultado);
    }

}
