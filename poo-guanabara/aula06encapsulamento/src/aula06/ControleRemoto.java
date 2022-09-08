package aula06;

public class ControleRemoto implements Controlador{
    private int volume;
    private boolean isLigando;
    private boolean isTocando;

    public ControleRemoto() {
        this.volume = 50;
        this.isLigando = false;
        this.isTocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getIsLigando() {
        return isLigando;
    }

    public void setIsLigando(boolean isLigando) {
        isLigando = isLigando;
    }

    public boolean getIsTocando() {
        return isTocando;
    }

    public void setIsTocando(boolean isTocando) {
        isTocando = isTocando;
    }

    @Override
    public void ligar() {
        this.setIsLigando(true);
    }

    @Override
    public void desligar() {
        this.setIsLigando(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Está ligado? " +this.getIsLigando());
        System.out.println("Está tocando? " +this.getIsTocando());
        System.out.println("Volume: " +this.getVolume());
        for (int i=0; i<=this.getVolume();i+=10){
            System.out.println("[]");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if (this.getIsLigando()){
            this.setVolume(getVolume() + 5);
        }
    }

    @Override
    public void menosVolume() {
        if (this.getIsLigando()){
            this.setVolume(getVolume() - 5);
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getIsLigando() && this.getVolume()>0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getIsLigando() && this.getVolume() == 0){
            this.setVolume(50);
        }

    }

    @Override
    public void play() {
        if (this.getIsLigando() && !this.getIsTocando()){
            this.setIsTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.getIsLigando() && this.getIsTocando()){
            this.setIsTocando(false);
        }
    }
}
