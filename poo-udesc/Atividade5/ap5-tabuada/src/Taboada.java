import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.HashMap;

public class Taboada {
    public static void main(String[] args) {
        Map<Integer, List<Integer>> taboadas = new HashMap<Integer, List<Integer>>();

        for (int i = 1; i<=10;i++){
            List<Integer> taboada = new ArrayList<Integer>();
            taboadas.put(i,taboada);
            for (int j = 1; j<=10;j++){
                taboada.add(i*j);
            }
        }

        System.out.println(taboadas);

    }



}
