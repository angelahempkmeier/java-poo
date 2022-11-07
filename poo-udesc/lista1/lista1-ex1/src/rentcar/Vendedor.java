package rentcar;

public class Vendedor {
    private String nomeVendedor;
    private int cpfVendedor;
    private float salario;
    private int qtdCarrosLocados;
    private boolean metaAtingida;
    private int porcBonus;

    //constructor


    public Vendedor(String nomeVendedor, int cpfVendedor, float salario, int qtdCarrosLocados, boolean metaAtingida, int porcBonus) {
        this.nomeVendedor = nomeVendedor;
        this.cpfVendedor = cpfVendedor;
        this.salario = salario;
        this.qtdCarrosLocados = qtdCarrosLocados;
        this.metaAtingida = metaAtingida;
        this.porcBonus = porcBonus;
    }

    public Vendedor(String nomeVendedor, float salario, int qtdCarrosLocados, boolean metaAtingida, int porcBonus) {
        this.nomeVendedor = nomeVendedor;
        this.salario = salario;
        this.qtdCarrosLocados = qtdCarrosLocados;
        this.metaAtingida = metaAtingida;
        this.porcBonus = porcBonus;
    }

    //getters and setters


    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    public int getCpfVendedor() {
        return cpfVendedor;
    }

    public void setCpfVendedor(int cpfVendedor) {
        this.cpfVendedor = cpfVendedor;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getQtdCarrosLocados() {
        return qtdCarrosLocados;
    }

    public void setQtdCarrosLocados(int qtdCarrosLocados) {
        this.qtdCarrosLocados = qtdCarrosLocados;
    }

    public int getPorcBonus() {
        return porcBonus;
    }

    public void setPorcBonus(int porcBonus) {
        this.porcBonus = porcBonus;
    }

    public boolean getMetaAtingida(){
        return metaAtingida;
    }
    public void setMetaAtingida(boolean metaAtingida){
        this.metaAtingida = metaAtingida;
    }

    //toString

    @Override
    public String toString() {
        return "Vendedor{" +
                "nomeVendedor='" + nomeVendedor + '\'' +
                ", cpfVendedor=" + cpfVendedor +
                ", salario=" + salario +
                ", qtdCarrosLocados=" + qtdCarrosLocados +
                ", metaAtingida=" + metaAtingida +
                ", porcBonus=" + porcBonus +
                '}';
    }

    //equals
}


