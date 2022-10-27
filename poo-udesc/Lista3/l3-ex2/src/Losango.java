public class Losango extends FormaGeometrica {

    @Override
    public void setMedida1(int diagonalMaior) {
        super.setMedida1(diagonalMaior);
    }
    @Override
    public int getMedida1() {
        return super.getMedida1();
    }
    @Override
    public void setMedida2(int diagonalMenor) {
        super.setMedida2(diagonalMenor);
    }
    @Override
    public int getMedida2() {
        return super.getMedida2();
    }

    @Override
    public int calculaArea() {
        return getMedida1()*getMedida2()/2;
    }

    @Override
    public int calculaPerimetro() {
        return (int) ((int) 4*(Math.sqrt((getMedida1()*getMedida1()/4)+(getMedida2()*getMedida2()/4))));
    }

    public String toString(){
        return "LOSÂNGO" + "\n" + "Diagonal Maior: " + getMedida1() + "\nDiagonal Menor: "
                + getMedida2() + "\nÁrea = " + this.calculaArea()
                + "\nPerimetro: " + this.calculaPerimetro() + "\n";
    }
}
