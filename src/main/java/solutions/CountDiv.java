package solutions;

import java.util.ArrayList;

public class CountDiv {
    public static int solutionB(int A, int B, int K) {


        /*Fuerza Bruta
        int count = 0;
        for (int i = A; i <= B; i++) {
            if (i % K == 0) {
                count++;
            }
        }
        */




        return A%K == 0 ? (B/K - A/K) +1 : (B/K - A/K) ;
    }
}
