package aula06;

public class ControleRemoto implements Controlador{
    private int volume;
    private boolean isLigado;
    private boolean isTocando;

    public ControleRemoto() {
        this.volume = 50;
        this.isLigado = false;
        this.isTocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return isLigado;
    }

    public void setLigado(boolean ligado) {
        isLigado = ligado;
    }

    public boolean isTocando() {
        return isTocando;
    }

    public void setTocando(boolean tocando) {
        isTocando = tocando;
    }

    @Override
    public void ligar() {
        this.se
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Está ligado? " );
    }

    @Override
    public void fecharMenu() {

    }

    @Override
    public void maisVolume() {

    }

    @Override
    public void menosVolume() {

    }

    @Override
    public void ligarMudo() {

    }

    @Override
    public void desligarMudo() {

    }

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }

    //Métodos Abstratos



}
