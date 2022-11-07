package atividadepratica2;
public class Main {
    public static void main(String[] args) {
        Grupo g = new Grupo();

        //cinco instâncias da classe Pessoa para adicionar no vetor da classe Grupo
        Pessoa p1 = new Pessoa();
        p1.setNome("João");
        p1.setAltura(1.70f);
        p1.setIdade(19);
        p1.setMassa(70.0f);

        Pessoa p2 = new Pessoa();
        p2.setNome("Julia");
        p2.setAltura(1.65f);
        p2.setIdade(19);
        p2.setMassa(62.5f);

        Pessoa p3 = new Pessoa();
        p3.setNome("Marcos");
        p3.setAltura(1.79f);
        p3.setIdade(20);
        p3.setMassa(75);

        Pessoa p4 = new Pessoa();
        p4.setNome("Luiza");
        p4.setAltura(1.68f);
        p4.setIdade(20);
        p4.setMassa(65);

        Pessoa p5 = new Pessoa();
        p5.setNome("Leticia");
        p5.setAltura(1.66f);
        p5.setIdade(20);
        p5.setMassa(69);

        //adicionando as pessoas ao grupo com o metodo set
        g.setPessoas(p1);
        g.setPessoas(p2);
        g.setPessoas(p3);
        g.setPessoas(p4);
        g.setPessoas(p5);

        //realizar a ordenacao
        g.ordena();

        //exibindo no console
        for(int i=0; i<5; i++){
            System.out.println("Nome: " + g.getPessoas()[i].getNome());
        }







    }
}