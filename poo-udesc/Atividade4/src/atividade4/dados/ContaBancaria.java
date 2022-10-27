package atividade4.dados;

public class ContaBancaria {
    private int cpf;
    protected float saldo;

    //constructor
    public ContaBancaria() {
        this.saldo = 0;
    }

    //getters and setters

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float sacar(float valorSacar){
        if (saldo<valorSacar){
            return 0;
        }else{
            return valorSacar;
       }
    }

    public String gerarExtrato(){
        return "CPF: " + this.getCpf() + "\nSaldo: " + this.getSaldo();
    }

    //toString
    public String toString(){
        return "CPF: " + this.getCpf();
    }

}
