public class CalculadoraComplexos implements OperacoesBasicas<Complexo>{

    @Override
    public Complexo somar(Complexo operador1, Complexo operador2) {
        Complexo c = new Complexo(operador1.getReal() + operador2.getReal(), operador1.getImaginario() + operador2.getImaginario());
        return c;
    }

    @Override
    public Complexo subtrair(Complexo operador1, Complexo operador2) {
        Complexo c = new Complexo(operador1.getReal() - operador2.getReal(), operador1.getImaginario() - operador2.getImaginario());
        return c;
    }
}
