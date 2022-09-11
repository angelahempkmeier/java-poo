package imobiliaria;

public class Imoveis {
    private float largura;
    private float comprimento;
    private float preco;

    //constructor
    public Imoveis() {}

    //getters and setters
    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    //toString
    @Override
    public String toString() {
        return "Imoveis{" +
                "largura=" + largura +
                ", comprimento=" + comprimento +
                ", preco=" + preco +
                '}';
    }

    public float calculaAreaTotal(){
        float areaTotal;
        areaTotal = this.getComprimento()*this.getLargura();
        return areaTotal;
    }

}
