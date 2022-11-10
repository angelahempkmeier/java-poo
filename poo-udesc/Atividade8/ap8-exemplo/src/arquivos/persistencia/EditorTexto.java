package arquivos.persistencia;
import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class EditorTexto {

    public void gravaTexto(String caminho, List<String> dados){
        FileWriter arquivo;

        try {
            arquivo = new FileWriter(caminho);
            for (int i = 0; i<dados.size(); i++){
                arquivo.write(dados.get(i) + "\n");
            }
            arquivo.close();
        }catch (Exception e){
            System.err.println("Erro ao manipular o arquivo");
            System.exit(0);
        }
    }

    public void gravaTexto(String caminho, String linha){
        FileWriter arquivo;
        try {
            arquivo = new FileWriter(caminho, true);
            arquivo.write(linha);
            arquivo.close();
        }catch (Exception e){
            System.err.println("Erro ao manipular o arquivo.");
            System.exit(0);
        }
    }

    public List<String> leTexto(String caminho){
        List<String> dados = new LinkedList<String>();

        FileReader arquivo;
        BufferedReader lerArquivo;

        try {
            arquivo = new FileReader(caminho);
            lerArquivo = new BufferedReader(arquivo);
            String s = lerArquivo.readLine();

            while (s != null){
                dados.add(s);
                s = lerArquivo.readLine();
            }
            arquivo.close();
        }catch (Exception e){
            System.err.println("Erro ao manipular o arquivo.");
            System.exit(0);
        }
        return dados;
    }

}
