package solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaxProductOfThree {

    static  int[]smallest = new int[] {Integer.MAX_VALUE, Integer.MAX_VALUE};
    static  int[]largest = new int[] {Integer.MIN_VALUE, Integer.MIN_VALUE,Integer.MIN_VALUE};

    public static int maxProduct(int[] n) {

        for (int i = 0; i < n.length; i++) {
            isSmaller(n[i]);
            isLarger(n[i]);
        }

        int max = 1;
        int min =largest[0];

        for (int i = 0; i < 3; i++) {
            if (i<2){
                min*=smallest[i];
            }
            max*=largest[i];
        }


        return Math.max(min,max);
    }

    static void isSmaller(int a){
        if (a < smallest[0]){
            smallest[1] = smallest[0];
            smallest[0] = a;
        } else if(a < smallest[1]){
            smallest[1] = a;
        }
    }

    static void isLarger(int a){
        if (a> largest[0]){
            largest[2] = largest[1];
            largest[1] = largest[0];
            largest[0] = a;
        } else if(a > largest[1]){
            largest[2] = largest[1];
            largest[1] = a;
        } else if(a > largest[2]){
            largest[2] = a;
        }
    }
}
