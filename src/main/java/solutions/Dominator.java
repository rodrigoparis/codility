package solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Dominator {

    public static int solution(int[] A) {
        if (A.length == 0) {
            return -1;
        }
        Map<Integer, Integer> values = new HashMap();
//Guardo en el mapa cada numero encontrado en el array como key y con las repeticiones como values
        for (int i = 0; i < A.length; i++) {
            if (values.get(A[i]) == null) {
                values.put(A[i], 1);
            } else {
                values.replace(A[i], values.get(A[i]) + 1);
            }
        }

        //Si me queda un mapa de un solo elemento devuelvo 0
        if (values.size() == 1) {
            return 0;
        }

        int max = Integer.MIN_VALUE;
        int dominator = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : values.entrySet()) {
            if (entry.getValue() > max) {
                dominator = entry.getKey();
                max = entry.getValue();
                if (dominator > Math.ceil(A.length / 2)) {
                    break;
                }
            }
        }
        if (max == 1) {
            return -1;
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i] == dominator) {
                return i;
            }
        }



        return -1;
    }


}

