package exercicio2;

public class Main {
    public static void main(String[] args) {
        Carro infosCarro = new Carro("Strada", 12);
        infosCarro.getModelo();
        infosCarro.setModelo("Mobi");
        infosCarro.getQtdCarrosDisponiveis();
        infosCarro.setQtdCarrosDisponiveis(21);
        System.out.println("Modelo: " + infosCarro.getModelo() + "\n" +
                "Quantidade de carros disponíveis para aluguel: "
                + infosCarro.getQtdCarrosDisponiveis());

        Locador infosLocador = new Locador("Angela", 27, "Joinville");
        infosLocador.getNomeLocador();
        infosLocador.getIdadeLocador();
        infosLocador.getCidadeLocador();
        infosLocador.setNomeLocador("Julia");
        infosLocador.setIdadeLocador(21);
        infosLocador.setCidadeLocador("Rio do Sul");
        System.out.println("Nome do Locador: " + infosLocador.getNomeLocador() + "\n" +
                            "Idade do Locador: " + infosLocador.getIdadeLocador() + "\n" +
                            "Cidade do Locador: " + infosLocador.getCidadeLocador());

        Pagamento infosPagamento = new Pagamento(415.15f, false, 0, 0f);
        infosPagamento.setTaxaJuros(2.0f);
        infosPagamento.setDiasAtrasado(30);
        infosPagamento.setTemAtraso(true);
        infosPagamento.setValorTotal((float) (415.15f*Math.pow((1 + 30/30),2)));
        System.out.println("Devido ao atraso, o valor total para pagamento será de " +
                infosPagamento.getValorTotal() + "\n" + "Informações sobre multa: " +
                "\n" + "Tem atraso? "+ infosPagamento.getTemAtraso() + " Dias em atraso: " +
                infosPagamento.getDiasAtrasado() + " Valor dos juros: " + infosPagamento.getTaxaJuros());

        PeriodoDeLocacao infosPeriodo = new PeriodoDeLocacao(20);
        infosPeriodo.setQtdDias(13);
        System.out.println("Período (em dias) de locacao: "+ infosPeriodo.getQtdDias());

        Vendedor infosVendedor = new Vendedor("Pedro", 1020.10f, 14, false, 0);
        infosVendedor.setMetaAtingida(true);
        infosVendedor.setNomeVendedor("Henrique");
        infosVendedor.setQtdCarrosLocados(21);
        infosVendedor.setPorcBonus(70);
        infosVendedor.setSalario(1020.10f + 1020.10f*70/100);
        System.out.println("Nome do vendedor: " + infosVendedor.getNomeVendedor()
                        + "\n" + "Bateu meta? " + infosVendedor.getMetaAtingida() +
                "\n" + "Quantidade de carros locados: " + infosVendedor.getQtdCarrosLocados() +
                " Porcentagem de bônus: " + infosVendedor.getPorcBonus() +"% " +
                " Valor do salário: " +infosVendedor.getSalario());




    }
}
