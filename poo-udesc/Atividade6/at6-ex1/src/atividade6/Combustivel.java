package atividade6;

public enum Combustivel {
    GASOLINA("gasolina"),
    ALCOOL("alcool"),
    DIESEL("diesel"),
    GAS("gas");

    private String combustivel;
    private Combustivel(String combustivel){
        this.combustivel = combustivel;
    }

    //getters and setters

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
}
