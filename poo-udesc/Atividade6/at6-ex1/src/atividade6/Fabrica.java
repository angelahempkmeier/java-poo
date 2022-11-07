package atividade6;
import java.util.Random;

public class Fabrica {

    public Veiculo fabricar(){
        Random r = new Random();
        if (r.nextInt(2) == 1){
            Carro c = new Carro();
            c.setCor(Cor.values()[r.nextInt(Cor.values().length)]);
            //Cor.valuer pega o array de cores, dentro do indice ta pegando randomicamente o array de cores
            c.setCombustivel(Combustivel.values()[r.nextInt(Combustivel.values().length)]);
            c.setNumeroPortas(5);
            return c;
        }else{
            Bicicleta b = new Bicicleta();
            b.setCor(Cor.values()[r.nextInt(Cor.values().length)]);
            b.setNumeroMarchas(20);
            return b;
        }
    }
}
