package exercicio2;

public class Locador {
    private String nomeLocador;
    private int cpfLocador;
    private int idadeLocador;
    private String sexoLocador;
    private String cidadeLocador;

    //constructor todas as infos
    public Locador(String nomeLocador, int cpfLocador, int idadeLocador, String sexoLocador, String cidadeLocador) {
        this.nomeLocador = nomeLocador;
        this.cpfLocador = cpfLocador;
        this.idadeLocador = idadeLocador;
        this.sexoLocador = sexoLocador;
        this.cidadeLocador = cidadeLocador;
    }
    //construtor versão enxuta
    public Locador(String nomeLocador, int idadeLocador, String cidadeLocador) {
        this.nomeLocador = nomeLocador;
        this.idadeLocador = idadeLocador;
        this.cidadeLocador = cidadeLocador;
    }
    //getters and setters


    public String getNomeLocador() {
        return nomeLocador;
    }

    public void setNomeLocador(String nomeLocador) {
        this.nomeLocador = nomeLocador;
    }

    public int getCpfLocador() {
        return cpfLocador;
    }

    public void setCpfLocador(int cpfLocador) {
        this.cpfLocador = cpfLocador;
    }

    public int getIdadeLocador() {
        return idadeLocador;
    }

    public void setIdadeLocador(int idadeLocador) {
        this.idadeLocador = idadeLocador;
    }

    public String getSexoLocador() {
        return sexoLocador;
    }

    public void setSexoLocador(String sexoLocador) {
        this.sexoLocador = sexoLocador;
    }

    public String getCidadeLocador() {
        return cidadeLocador;
    }

    public void setCidadeLocador(String cidadeLocador) {
        this.cidadeLocador = cidadeLocador;
    }
    //tooString
    @Override
    public String toString() {
        return "Locador{" +
                "nomeLocador='" + nomeLocador + '\'' +
                ", cpfLocador=" + cpfLocador +
                ", idadeLocador=" + idadeLocador +
                ", sexoLocador='" + sexoLocador + '\'' +
                ", cidadeLocador='" + cidadeLocador + '\'' +
                '}';
    }

    //equals

}
