package solutions;

import java.util.ArrayList;
import java.util.Arrays;

public class Triangle {

    public static int Triangle(int[] n) {

        if (n.length < 3){
            return 0;
        }
        Arrays.sort(n);

        for (int i = 0; i < n.length-2; i++) {
            if ((long) n[i] + n[i++] > n[i+2]){
                return 1;
            }

        }
        return 0;
    }
}
