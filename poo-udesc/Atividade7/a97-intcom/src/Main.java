public class Main {
    public static void main(String[] args) {
        CalculadoraInteiros calcI = new CalculadoraInteiros();
        System.out.println(calcI.somar(2,2));
        CalculadoraComplexos calcC = new CalculadoraComplexos();
        System.out.println(calcC.somar(new Complexo(2,3),new Complexo(7,5)));
    }

}