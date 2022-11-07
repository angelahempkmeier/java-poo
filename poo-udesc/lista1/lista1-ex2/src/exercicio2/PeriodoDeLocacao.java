package exercicio2;

public class PeriodoDeLocacao {
    private int qtdDias;
    private int diaLocacao;
    private int diaDevolucao;
    private String mesLocacao;
    private String mesDevolucao;

    //constructors
    public PeriodoDeLocacao(int qtdDias, int diaLocacao, int diaDevolucao, String mesLocacao, String mesDevolucao) {
        this.qtdDias = qtdDias;
        this.diaLocacao = diaLocacao;
        this.diaDevolucao = diaDevolucao;
        this.mesLocacao = mesLocacao;
        this.mesDevolucao = mesDevolucao;
    }

    public PeriodoDeLocacao(int qtdDias) {
        this.qtdDias = qtdDias;
    }

    //getters and setters


    public int getQtdDias() {
        return qtdDias;
    }

    public void setQtdDias(int qtdDias) {
        this.qtdDias = qtdDias;
    }

    public int getDiaLocacao() {
        return diaLocacao;
    }

    public void setDiaLocacao(int diaLocacao) {
        this.diaLocacao = diaLocacao;
    }

    public int getDiaDevolucao() {
        return diaDevolucao;
    }

    public void setDiaDevolucao(int diaDevolucao) {
        this.diaDevolucao = diaDevolucao;
    }

    public String getMesLocacao() {
        return mesLocacao;
    }

    public void setMesLocacao(String mesLocacao) {
        this.mesLocacao = mesLocacao;
    }

    public String getMesDevolucao() {
        return mesDevolucao;
    }

    public void setMesDevolucao(String mesDevolucao) {
        this.mesDevolucao = mesDevolucao;
    }

    //toString


    @Override
    public String toString() {
        return "PeriodoDeLocacao{" +
                "qtdDias=" + qtdDias +
                ", diaLocacao=" + diaLocacao +
                ", diaDevolucao=" + diaDevolucao +
                ", mesLocacao='" + mesLocacao + '\'' +
                ", mesDevolucao='" + mesDevolucao + '\'' +
                '}';
    }

    //equals
}
