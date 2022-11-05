package uml.principal;

import uml.dados.CalculadoraEstatistica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Primeira coisa, definimos a classe:
public class Calculadora extends JFrame {

    private JPanel painel = new JPanel(); //painel principal

    private JPanel painelEntrada = new JPanel(); //elementos de entrada
    private JScrollPane painelScrollTabelaResultados = new JScrollPane();
    private JScrollPane painelScrollTabelaValores = new JScrollPane();

    private JLabel infoCaixaEntrada = new JLabel("Digite um valor");
    private JTextField caixaEntrada = new JTextField();

    private JButton botaoAdicionar = new JButton("Adicionar");
    private JButton botaoLimpar = new JButton("Limpar");
    private JButton botaoTirar = new JButton("Tirar último");


    //Atividade extra pra entregar
    private JPanel painel2 = new JPanel();
    private JLabel gerarValores = new JLabel("Gerar Valores");
    private JTextField entradaValores = new JTextField();
    private JButton botaoFibonacci = new JButton("Fibonacci");
    private JButton botaoPrimos = new JButton("Primos");
    private JButton botaoFatorial = new JButton("Fatorial");


    private JTable tabelaResultados;
    private JTable tabelaValores;

    //Abstract table factory
    private TabelaValores valores = new TabelaValores();
    private TabelaResultados resultados = new TabelaResultados();


    //Segunda coisa, construtor:
    public Calculadora(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Quando fechar, para de rodar.
        setBounds(100, 100, 900, 300 ); //Baixo, Direita, 900 de lardura, 300 de altura
        setTitle("Calculadora Estatística");
        setResizable(false); //Para renderizar legal

        setContentPane(painel);
        painel.setLayout(null);

        //como não tem borda, não aparece sem ter os elemtnos
        painelEntrada.setBounds(15, 80, 280, 173);
        painelEntrada.setLayout(null);
        painel.add(painelEntrada);

        //caixa de entrada ''digite um valor:''
        infoCaixaEntrada.setBounds(30, 30, 200, 15);
        painelEntrada.add(infoCaixaEntrada);

        //adicionou o espaço pra que possamos colocar um valor
        caixaEntrada.setBounds(30, 50, 200, 20);
        caixaEntrada.setColumns(10);
        painelEntrada.add(caixaEntrada);


        //botao adicionar
        botaoAdicionar.setBounds(77, 85, 117, 25);
        painelEntrada.add(botaoAdicionar);

        //botao limpar
        botaoLimpar.setBounds(77, 115, 117, 25);
        painelEntrada.add(botaoLimpar);

        //botao tirar
        botaoTirar.setBounds(77, 145, 117, 25);
        painelEntrada.add(botaoTirar);

        //adiciona a tabela la em cima
        painelScrollTabelaResultados.setBounds(10,10,880,50);
        painel.add(painelScrollTabelaResultados);

        //colocou a tabela de resultados la em cima dentro da tabela criar no painelScrollTabelaREsultados
        tabelaResultados = new JTable(resultados);
        painelScrollTabelaResultados.setViewportView(tabelaResultados);


        //fiz a tabela que vai ser colocada os valores
        painelScrollTabelaValores.setBounds(400,80,173,173);
        painel.add(painelScrollTabelaValores);

        //para colocar os vbalores
        tabelaValores = new JTable(valores);
        painelScrollTabelaValores.setViewportView(tabelaValores);

        //-----------------------------------//
        //ATIVIDADE PRA ENTREGA

        painel2.setBounds(300,80,800,173);
        painel2.setLayout(null);
        painel.add(painel2);

        gerarValores.setBounds(300, 20, 173, 15);
        painel2.add(gerarValores);

        entradaValores.setBounds(307,50, 200, 20);
        entradaValores.setColumns(10);
        painel2.add(entradaValores);

        botaoFibonacci.setBounds(350, 80, 117, 25);
        painel2.add(botaoFibonacci);

        botaoFatorial.setBounds(350, 110, 117, 25);
        painel2.add(botaoFatorial);

        botaoPrimos.setBounds(350, 140, 117, 25);
        painel2.add(botaoPrimos);

        botaoFibonacci.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n = Integer.parseInt(entradaValores.getText());
                for (int i = 0; i<n; i++){
                    if (i<2){
                        valores.adicionarValor(i);
                        resultados.atualizar();
                    }else {
                        int fibo = (i-2) + (i-1);
                        valores.adicionarValor(fibo);
                        resultados.atualizar();
                    }
                }
                entradaValores.setText("");
            }
        });

        botaoFatorial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int fat = 1;
                int n = Integer.parseInt(entradaValores.getText());
                for (int i = 1; i<=n;i++){
                    fat = fat*i;
                    valores.adicionarValor(fat);
                    resultados.atualizar();
                    entradaValores.setText("");
                }
            }
        });

        botaoPrimos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n = Integer.parseInt(entradaValores.getText());
                //preciso chegar na quantidade n
                //preciso verificar se eh divisivel por apenas dois numeros
                int cont = 0;
                int aux = 2;
                for (int i = 0; cont<n; i++){
                    int div = 0;
                    for(int j = 1; j<=aux;j++ ){
                        if (aux%j == 0){ //acho que ta indo por infinito
                            div++;
                        }
                    }
                    if (div == 2){
                        valores.adicionarValor(aux);
                        resultados.atualizar();
                        cont++;
                    }aux++;
                }
                entradaValores.setText("");
            }
        });

        botaoAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valores.adicionarValor(Integer.parseInt(caixaEntrada.getText()));
                resultados.atualizar();
                caixaEntrada.setText("");
            }
        });

        botaoLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valores.limpar();
                resultados.atualizar();
                caixaEntrada.setText("");
            }
        });

        botaoTirar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valores.tirarUltimo();
                resultados.atualizar();
                caixaEntrada.setText("");
            }
        });

    }

    public static void main(String[] args){
        Calculadora calculadora = new Calculadora();
        calculadora.setVisible(true);
    }


}




