package atividade4.dados;

public class ContaSalario extends ContaBancaria{
    private int cnpjEmpresa;

    //constructor

    public ContaSalario() {
        super();
    }

    //getters and setters
    public int getCnpjEmpresa() {
        return cnpjEmpresa;
    }

    public void setCnpjEmpresa(int cnpjEmpresa) {
        this.cnpjEmpresa = cnpjEmpresa;
    }

    //depositar
    public boolean depositarSalario(float valorSalario, int cnpj){
        if (cnpj == cnpjEmpresa){
            this.setSaldo(this.getSaldo() + valorSalario);
            return true;
        }else {
            return false;
        }
    }

    public String gerarExtrato(){
        return "Conta Salário:\n" + super.gerarExtrato() + "\nCNPJ Empresa:" + getCnpjEmpresa();
    }

    public String toString(){
        return "Conta Salário:\n" + super.toString() + "CNPJ Empresa:" + this.getCnpjEmpresa();
    }
}
