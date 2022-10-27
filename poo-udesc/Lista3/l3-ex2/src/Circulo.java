public class Circulo extends FormaGeometrica {

    @Override
    public void setMedida1(int raio) {
        super.setMedida1(raio);
    }

    @Override
    public int getMedida1() {
        return super.getMedida1();
    }

    @Override
    public int calculaArea() {
        return (int) Math.PI*getMedida1()*getMedida1();
    }

    @Override
    public int calculaPerimetro() {
        return (int) Math.PI*2*getMedida1();
    }


    public String toString(){
        return "CIRCULO" + "\n" + "Lado: " + getMedida1() + "\nÁrea = " + this.calculaArea()
                + "\nPerimetro: " + this.calculaPerimetro() + "\n";
    }
}
