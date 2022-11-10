package uml.principal;

import uml.dados.CalculadoraEstatistica;

import javax.swing.table.AbstractTableModel;

public class TabelaValores extends AbstractTableModel {
    private String[] colunas = {"Valores"};

    private CalculadoraEstatistica calculadora = CalculadoraEstatistica.getInstance();

    @Override
    public int getRowCount() { //retorna quantidade de linhas na tabela
        return calculadora.getValores().size();
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return calculadora.getValores().get(rowIndex);
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    public void adicionarValor(int valor){
        calculadora.adicionarValor(valor);
        fireTableStructureChanged(); //adiciona visualmente na table de valores
    }

    public void limpar(){
        calculadora.limparValores();
        fireTableStructureChanged();
    }

    public void tirarUltimo(){
        calculadora.tirarUltimoValor();
        fireTableStructureChanged();
    }

    public void fibo(int n){
        calculadora.fibo(n);
        fireTableStructureChanged();
    }
}
