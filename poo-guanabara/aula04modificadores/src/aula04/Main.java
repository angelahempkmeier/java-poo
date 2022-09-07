package aula04;
public class Main {
    public static void main(String[] args) {
        //Caneta c1 = new Caneta(); //por causa do constructor receber parametros, meu obj tb precisa
        Caneta c1 = new Caneta("NIC", "Amarelo", 0.4f);
        //c1.setModelo("BIC");
        //c1.setPonta(0.5f);
        c1.status();
        //System.out.println("Eu tenho uma caneta " +c1.modelo + " de ponta " + c1.getPonta());
        //aqui no sout, o get dá acesso ao atributo ponta que é privado!!! mindblowing
    }
}