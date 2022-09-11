package rentcar;

public class Pagamento {
    private String metodoPagamento;
    private float valorTotal;
    private boolean temDesconto;
    private boolean temAtraso;
    private int diasAtrasado;
    private float taxaJuros;

    //constructor


    public Pagamento(String metodoPagamento, float valorTotal, boolean temDesconto, boolean temAtraso, int diasAtrasado, float taxaJuros) {
        this.metodoPagamento = metodoPagamento;
        this.valorTotal = valorTotal;
        this.temDesconto = temDesconto;
        this.temAtraso = temAtraso;
        this.diasAtrasado = diasAtrasado;
        this.taxaJuros = taxaJuros;
    }

    public Pagamento(float valorTotal, boolean temAtraso, int diasAtrasado, float taxaJuros) {
        this.valorTotal = valorTotal;
        this.temAtraso = temAtraso;
        this.diasAtrasado = diasAtrasado;
        this.taxaJuros = taxaJuros;
    }

    //getters and setters


    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getDiasAtrasado() {
        return diasAtrasado;
    }

    public void setDiasAtrasado(int diasAtrasado) {
        this.diasAtrasado = diasAtrasado;
    }

    public float getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(float taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public boolean getTemDesconto(){
        return temDesconto;
    }
    public void setTemDesconto(boolean temDesconto){
        this.temDesconto = temDesconto;
    }

    public boolean getTemAtraso(){
        return temAtraso;
    }
    public void setTemAtraso(boolean temAtraso){
        this.temAtraso = temAtraso;
    }

    //toString


    @Override
    public String toString() {
        return "Pagamento{" +
                "metodoPagamento='" + metodoPagamento + '\'' +
                ", valorTotal=" + valorTotal +
                ", temDesconto=" + temDesconto +
                ", temAtraso=" + temAtraso +
                ", diasAtrasado=" + diasAtrasado +
                ", taxaJuros=" + taxaJuros +
                '}';
    }

    //equals
}
