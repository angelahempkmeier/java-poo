public class TrianguloEquilatero extends FormaGeometrica {

    @Override
    public void setMedida1(int lado) {
        super.setMedida1(lado);
    }

    @Override
    public int getMedida1() {
        return super.getMedida1();
    }

    @Override
    public int calculaArea() {
        return (int) ((Math.sqrt(3)/4)*getMedida1()*getMedida1());
    }

    @Override
    public int calculaPerimetro() {
        return 3*getMedida1();
    }

    public String toString(){
        return "TRIÂNGULO EQUILÁTERO" + "\n" + "Lado: " + getMedida1() + "\nÁrea = " + this.calculaArea()
                + "\nPerimetro: " + this.calculaPerimetro() + "\n";
    }
}
