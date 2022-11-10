package sistemaviagem.negocio;

import sistemaviagem.dados.Cidade;
import sistemaviagem.dados.Cliente;
import sistemaviagem.dados.Reserva;

import java.security.PublicKey;

public class ReservaPassagem {
    private Cliente[] listaDeClientes = new Cliente[50];
    private Cidade[] listaDeCidades = new Cidade[50];
    private int quantCidades = 0;
    private int quantClientes = 0;

    public ReservaPassagem(){}

    //cadastrar cidade
    public void cadastrarCidade(Cidade cidade){
        listaDeCidades[quantCidades] = cidade;
        quantCidades++;
    }

    //cadastrar cliente
    public void cadastrarCliente(Cliente cliente){
        listaDeClientes[quantClientes] = cliente;
        quantClientes++;
    }

    //reservarIda
    public void cadastrarIda(Cliente cliente, Reserva reserva){
        cliente.reservaIda(reserva);
    }

    //reservarVolta
    public void reservarVolta(Cliente cliente, Reserva ida, Reserva volta){
        cliente.reservaVolta(ida, volta);
    }

    //mostrar reservas
    public Reserva[] mostrarReserva(int cpfCliente){
        for (int i = 0; i<quantClientes; i++){
            if (listaDeClientes[i].getCpf() == cpfCliente){
                return listaDeClientes[i].
            }
        }

    }


    //mostrar clientes
    public Cliente[] mostrarClientes(){
        return listaDeClientes;
    }

    //mostrar cidades
    public Cidade[] mostrarCidades(){
        return listaDeCidades;
    }


    public Cliente[] getListaDeClientes() {
        return listaDeClientes;
    }

    public void setListaDeClientes(Cliente[] listaDeClientes) {
        this.listaDeClientes = listaDeClientes;
    }

    public Cidade[] getListaDeCidades() {
        return listaDeCidades;
    }

    public void setListaDeCidades(Cidade[] listaDeCidades) {
        this.listaDeCidades = listaDeCidades;
    }

    public int getQuantCidades() {
        return quantCidades;
    }

    public void setQuantCidades(int quantCidades) {
        this.quantCidades = quantCidades;
    }

    public int getQuantClientes() {
        return quantClientes;
    }

    public void setQuantClientes(int quantClientes) {
        this.quantClientes = quantClientes;
    }
}
