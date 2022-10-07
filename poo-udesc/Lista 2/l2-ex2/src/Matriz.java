import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Matriz <T> {
    private int ordem;
    List<List<T>> matriz = new ArrayList<List<T>>();

    public Matriz(int ordem){
        for(int i=0;i<ordem;i++){
            //instanciar lista
            List<T> l = new ArrayList<T>();
            //for pra colocar zeros na lista
            for (int j = 0; j<ordem; j++){
                l.add(null);
            }
            matriz.add(l);

        }
    }

    public boolean set(T objeto, int i, int j){
        if (i>ordem || j>ordem){
            return false;
        }else {
            matriz.get(i).set(j,objeto);
            return true;
        }
    }

    public T get(int i, int j){
        if (i>ordem || j>ordem){
            return null;
        }else {
            return matriz.get(i).get(j);
        }
    }

    public List<T> getLinha(int linha){
        return matriz.get(linha);
    }

    public List<T> getColuna(int coluna){
        List<T> l = new ArrayList<T>();
        for (int i = 0; i<ordem;i++){
            l.add(matriz.get(i).get(coluna));
        }
        return l;
    }

    public List<T> getElementosQuadrante(Quadrante quadrante){
        List<T> eQuad = new LinkedList<T>();
        if (quadrante == Quadrante.PRIMEIRO){
            for (int i = 0; i<ordem/2;i++){
                for (int j = 0; j<= ordem/2; j++){
                    eQuad.add(matriz.get(i).get(j));
                }
            }
        }else if (quadrante == Quadrante.SEGUNDO){
            for (int i = 0; i<ordem/2;i++){
                for (int j = ordem/2; j<ordem; j++){
                    eQuad.add(matriz.get(i).get(j));
                }
            }
        } else if (quadrante == Quadrante.TERCEIRO) {
            for (int i=ordem/2; i<ordem;i++){
                for (int j=0;j<ordem/2;j++){
                    eQuad.add(matriz.get(i).get(j));
                }
            }
        } else if (quadrante == Quadrante.QUARTO) {
            for (int i = ordem/2;i<ordem;i++){
                for (int j = ordem/2;j<ordem;j++){
                    eQuad.add(matriz.get(i).get(j));
                }
            }
        }
        return eQuad;
    }
}
