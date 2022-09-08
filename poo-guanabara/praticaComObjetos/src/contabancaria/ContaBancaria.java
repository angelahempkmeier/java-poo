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
        this.setSaldo(0);
        this.setStatus(false);
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
            setTipo(tipo);
            setStatus(true);
            //System.out.println("Qual tipo de conta você quer abrir? CC ou CP?");
            //this.tipo = sc.next(); //tá dando erro na entrada do if quando eu libero essa opcao
            System.out.println("Sua conta é do tipo " + this.tipo);
            if("CC".equals(tipo)){
                this.setSaldo(50.0f); //tem que referenciar o objeto c/ this
                //this.saldo = this.saldo + 50.0f;
                //System.out.println("Entrou aqui");
                System.out.println("O saldo é de " + this.saldo);
            } else if ("CP".equals(tipo)) {
                this.setSaldo(150.0f);
                //this.saldo = this.saldo + 150.0f;
                System.out.println("O saldo é de " + this.saldo);
            }
        }
    }
    public void fecharConta() {
        if (this.getSaldo() != 0) {
            System.out.println("Você não pode fechar sua conta.");
        } else {
            setStatus(false);
            System.out.println("A sua conta foi fechada.");
        }
    }
    public void depositar(float valorDeposito){
        if (!this.getStatus()){
            System.out.println("ERRO: Abra sua conta primeiro!");
        }else{
            System.out.println("Quanto você deseja depositar?");
            valorDeposito = sc.nextFloat();
            //this.saldo = this.saldo + valorDeposito;
            this.setSaldo(getSaldo() + valorDeposito);
            System.out.println("Depósito realizado com sucesso! O valor do saldo de " + this.getDono() + " é de R$ " + this.getSaldo());
        }
    }
    public void sacar(float valorSacado){
        System.out.println("Digite o quanto você quer sacar!");
        valorSacado = sc.nextFloat();
        if(!this.getStatus()){
            System.out.println("Abra sua conta primeiro.");
        }else {
            if (valorSacado > this.getSaldo()) {
                System.out.println("Operação inválida.");
            } else {
                //this.saldo = this.saldo - valorSacado;
                setSaldo(getSaldo() - valorSacado);
                System.out.println("Foi retirado R$ " + valorSacado + " de sua conta e o saldo atual é de " + this.getSaldo());
            }
        }
    }
    public float pagarMensal(){
        float cobrancaMensal;
        if(this.getStatus()) {
            if (this.getTipo() == "CC") {
                cobrancaMensal = 12.0f;
            } else {
                cobrancaMensal = 20.0f;
            }
            if (this.getSaldo() > cobrancaMensal){
                this.setSaldo(getSaldo() - cobrancaMensal);
                //this.saldo = this.saldo - cobrancaMensal;
            }else {
                System.out.println("Saldo insuficiente. Contate o banco.");
            }
        }else{
            System.out.println("Cobrança não permitida.");
        }
        return this.saldo;
    }
    public void estadoAtual(){
        System.out.println("--------------------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Dono " + this.getDono());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }


}
