package atividade4.negocio;
import atividade4.dados.ContaBancaria;
import atividade4.dados.ContaCorrente;
import atividade4.dados.ContaSalario;

public class Sistema {
    private int quantidade;
    private ContaBancaria[] contaBancarias = new ContaBancaria[100];

    //construct
    public Sistema(){

    }
    //getters and setters
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public ContaBancaria[] getContaBancarias() {
        return contaBancarias;
    }

    public void setContaBancarias(ContaBancaria[] contaBancarias) {
        this.contaBancarias = contaBancarias;
    }

    //cadastrar conta
    public void cadastrarConta(ContaBancaria contaBancaria){
        if (quantidade<100){
            this.contaBancarias[quantidade] = contaBancaria; //o array recebe a contabancaria
            quantidade++;
        }else {
            System.out.println("Impossível cadastrar conta.");
        }
    }
    public String realizarSaque(ContaBancaria contaBancaria, float valor){
        if (valor>contaBancaria.getSaldo()){ //como eu tenho acesso ao saldo?
            return "Saldo insuficiente";
        }else {
            //contaBancaria.setSaldo(contaBancaria.getSaldo() - valor);
            contaBancaria.sacar(valor); //mantendo encapsulamento
            return contaBancaria.gerarExtrato(); //pq nao pode this.contaBancaria aqui?
        }
    }

    public boolean realizarDeposito(ContaCorrente contaCorrente, float valor){
        //contaCorrente.setSaldo(contaCorrente.getSaldo() + valor);

        return contaCorrente.depositar(valor); //chamando o metodo depositar de conta corrente
    }

    public boolean realizarDeposito(ContaSalario contaSalario, float valor, int cnpj){
        return contaSalario.depositarSalario(valor, cnpj); //encapsulamento
    }

    //métodos que retornam instâncias de tipos específicos
    public ContaCorrente[] getContasCorrentes(){
        //retorna array de ContaCorrente
        int max = 0;
        for (int i = 0; i<quantidade; i++){
            if (contaBancarias[i] instanceof ContaCorrente){ //instanceof testa se o obj é uma instancia da classe
                max++;
            }
        }
        //alocando um array de contacorrente
        ContaCorrente[] contas = new ContaCorrente[max];
        int qtd = 0;
        for (int i = 0;i<quantidade;i++){
            if (contaBancarias[i] instanceof ContaCorrente){
                contas[qtd] = (ContaCorrente) (contaBancarias[i]); //casting :o simplesmente foda d+
                qtd++;
            }
        }
        return contas;
        }
        public ContaSalario[] getContaSalarios(){
            int max = 0;
            for (int i =0; i<quantidade; i++){
                if (contaBancarias[i] instanceof ContaSalario){
                    max++;
                }
            }
            int qtd = 0;
            ContaSalario[] contas = new ContaSalario[max];
            for (int i =0; i < quantidade; i++){
                if (contaBancarias[i] instanceof ContaSalario){
                    contas[qtd] = (ContaSalario) (contaBancarias[i]);
                    qtd++;
                }
            }
            return contas;
        }
        //metodo get para saber quantas contas tem
        public int getQuantidadeContas(){
            return this.quantidade;
        }

        //get do array de contas para retornar as contas sem filtro
        public ContaBancaria[] getContasBancarias(){
        return contaBancarias;
        }

        //metodo de gerar extrato, polimorfismo faz com que cada extensao da superclasse chame seu proprio metodo gerarExtrato
        public String gerarExtrato(ContaBancaria conta){
            return conta.gerarExtrato();
        }

    }
