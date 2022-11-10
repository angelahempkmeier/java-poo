package sistemaviagem.dados;

public class Cliente {
    private int cpf;
    private String nome;
    private String endereco;
    private int telefone;
    private Reserva[] reservas = new Reserva[20];
    private int quantRes = 0;

    public Cliente(){}

    //reservaIda
    public void reservaIda(Reserva reserva){
        if (quantRes < reservas.length) {
            reservas[quantRes] = reserva;
            quantRes++;
        }else {
            System.out.println("Lista cheia!");
        }
    }

    //reservaVolta
    public void reservaVolta(Reserva ida, Reserva volta){
        if (quantRes < reservas.length){
            reservas[quantRes] = volta;
            ida.setVolta(volta); //associando a ida c a volta
            quantRes++;
        }else {
            System.out.println("Lista cheia.");
        }
    }

    //toString
    public String toString(){
        return "Cliente: " + this.getNome() + "\n CPF: " + this.getCpf() + "\nEndereço: " + this.getEndereco() + "\nTelefone: " + this.getTelefone();
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public Reserva[] getReservas() {
        return reservas;
    }

    public void setReservas(Reserva[] reservas) {
        this.reservas = reservas;
    }
}
