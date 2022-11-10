package SistemaViagem.dados;

public class Reserva {
    private int numReserva;
    private String dataVoo;
    private String horaVoo;
    private float preco;
    private String classeVoo;
    private boolean idaEVolta;
    private int poltrona;

    //construtor
    public Reserva(){}
    //referenciando a seta que liga Reserva a Cidade -origem e -destino
    private Cidade origem;
    private Cidade destino;
    //referenciando a seta que comeca e termnina na Reserva -Volta
    private Reserva Volta;

    //getters e setters
    public int getNumReserva(){
        return this.numReserva;
    }
    public void setNumReserva(int numReserva){
        this.numReserva = numReserva;
    }
    public String getDataVoo(){
        return this.dataVoo;
    }
    public void setDataVoo(String dataVoo){
        this.dataVoo = dataVoo;
    }
    public String getHoraVoo(){
        return this.horaVoo;
    }
    public void setHoraVoo(String horaVoo){
        this.horaVoo = horaVoo;
    }
    public float getPreco(){
        return this.preco;
    }
    public void setPreco(float preco){
        this.preco = preco;
    }
    public String getClasseVoo(){
        return this.classeVoo;
    }
    public void setClasseVoo(String classeVoo){
        this.classeVoo = classeVoo;
    }
    public boolean getIdaEVolta(){
        return this.idaEVolta;
    }
    public void setIdaEVolta(boolean idaEVolta){
        this.idaEVolta = idaEVolta;
    }
    public int getPoltrona(){
        return this.poltrona;
    }
    public void setPoltrona(int poltrona){
        this.poltrona = poltrona;
    }

    //método toString
    public String toString(){
        return numReserva + " " + dataVoo + " " + horaVoo + " " + preco + " " + classeVoo + " " + idaEVolta + " " + poltrona;
    }

}
