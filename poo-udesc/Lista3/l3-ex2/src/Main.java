public class Main {
    public static void main(String[] args) {
        FormaGeometrica formaGeometrica;

        formaGeometrica = new TrianguloEquilatero();
        formaGeometrica.setMedida1(4);
        System.out.println(formaGeometrica.toString());

        formaGeometrica = new TrianguloEquilatero();
        formaGeometrica.setMedida1(10);
        System.out.println(formaGeometrica.toString());

        formaGeometrica = new Losango();
        formaGeometrica.setMedida1(4);
        formaGeometrica.setMedida2(1);
        System.out.println(formaGeometrica.toString());

        formaGeometrica = new Losango();
        formaGeometrica.setMedida1(10);
        formaGeometrica.setMedida2(5);
        System.out.println(formaGeometrica.toString());

        formaGeometrica = new Circulo();
        formaGeometrica.setMedida1(2);
        System.out.println(formaGeometrica.toString());

        formaGeometrica = new Circulo();
        formaGeometrica.setMedida1(5);
        System.out.println(formaGeometrica.toString());

    }
}