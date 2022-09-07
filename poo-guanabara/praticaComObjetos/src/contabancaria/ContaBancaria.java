package contabancaria;

import java.util.Scanner;

public class ContaBancaria {
    public int numConta;
    protected String tipo; //CC: conta corrente, CP: conta poupança
    private String dono;
    private float saldo;
    private boolean status; //contaAberta(true) ou contaFechada(false)

    Scanner sc = new Scanner(System.in);
    //construtor - default da conta, sem saldo e status de fechada
    public ContaBancaria(){
        this.saldo = 0;
        this.status = false;
    }

    //getters e setters
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public boolean getStatus(){
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    //métodos
    public void abrirConta(){
        if(this.status == false){
            setTipo(this.tipo);
            setStatus(true);
            System.out.println("Qual tipo de conta você quer abrir? CC ou CP?");
            this.tipo = sc.nextLine();
            System.out.println("Sua conta é do tipo " + this.tipo);
            if(tipo == "CC"){
                setSaldo(50.0f);
                //this.saldo = this.saldo + 50.0f;
                //System.out.println("Entrou aqui");
                System.out.println("O saldo é de " + this.saldo);
            } else if (tipo == "CP") {
                this.saldo = this.saldo + 150.0f;
                System.out.println("O saldo é de " + this.saldo);
            }
        }
    }
    public void fecharConta() {
        if (this.saldo != 0) {
            System.out.println("Você não pode fechar sua conta.");
        } else {
            setStatus(false);
            System.out.println("A sua conta foi fechada.");
        }
    }
    public float depositar(float valorDeposito){
        if (!this.status){
            System.out.println("ERRO: Abra sua conta primeiro!");
        }else{
            System.out.println("Quanto você deseja depositar?");
            valorDeposito = sc.nextFloat();
            this.saldo = this.saldo + valorDeposito;
            System.out.println("O valor do seu saldo é de R$ " + this.saldo);
        }
        return this.saldo;
    }
    public float sacar(float valorSacado){
        System.out.println("Digite o quanto você quer sacar!");
        valorSacado = sc.nextFloat();
        if(!getStatus()){
            System.out.println("Abra sua conta primeiro.");
        }else {
            if (valorSacado > this.saldo) {
                System.out.println("Operação inválida.");
            } else {
                this.saldo = this.saldo - valorSacado;
            }
        }
        return this.saldo;
    }
    public float pagarMensal(){
        if(this.status) {
            float cobrancaMensal;
            if (this.tipo == "CC") {
                cobrancaMensal = 12.0f;
            } else {
                cobrancaMensal = 20.0f;
            }
            if (this.saldo > cobrancaMensal){
                this.saldo = this.saldo - cobrancaMensal;
            }else {
                System.out.println("Saldo insuficiente. Contate o banco.");
            }
        }else{
            System.out.println("Cobrança não permitida.");
        }
        return this.saldo;
    }
}
