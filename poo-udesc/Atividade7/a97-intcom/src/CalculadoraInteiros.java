public class CalculadoraInteiros implements OperacoesBasicas<Integer> {
    @Override
    public Integer somar(Integer operador1, Integer operador2) {
        return operador1 + operador2;
    }

    @Override
    public Integer subtrair(Integer operador1, Integer operador2) {
        return operador1 - operador2;
    }
}
