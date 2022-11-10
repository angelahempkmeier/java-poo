package atividade4.dados;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(){
        super();
    }

    public boolean depositar(float valor){
        this.setSaldo(this.getSaldo() + valor);
        return true;
    }

    public String gerarExtrato(){
        return "Conta Corrente\n " + super.gerarExtrato() + "\nSaldo Disponível: " + getSaldo();
    }

    public String toString(){
        return "Conta corrente:\n" + super.toString();
    }
}
