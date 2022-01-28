package solutions;

import java.util.*;
import java.util.stream.Collectors;

public class PermMissingElem {
    public static int solution(int[] array) {

        //List<Integer> lista = Arrays.stream(array).boxed().collect(Collectors.toList());
        HashSet<Integer> lista = new HashSet<>();

        for (int i = 1; i <= array.length + 1; i++) {
            lista.add(i);
        }

        for (int i = 0; i < array.length; i++) {
            lista.remove((Integer) array[i]);
        }


        return lista.iterator().next();
    }
}
