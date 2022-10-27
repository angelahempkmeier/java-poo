public abstract class FormaGeometrica {
    protected int medida1;
    protected int medida2;

    public FormaGeometrica(){}

    public abstract int calculaArea();
    public abstract int calculaPerimetro();

    public int getMedida1() {
        return medida1;
    }

    public void setMedida1(int medida1) {
        this.medida1 = medida1;
    }

    public int getMedida2() {
        return medida2;
    }

    public void setMedida2(int medida2) {
        this.medida2 = medida2;
    }


}
