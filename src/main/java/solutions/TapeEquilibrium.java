package solutions;

import java.util.ArrayList;

public class TapeEquilibrium {
    public static int solution(int[] A) {
        int sumA = 0;
        int sumB = 0;

        //I get the sum of all the elements in the array
        for (int i = 0; i < A.length; i++) {
            sumA+=A[i];
        }
        //I set as default the minDifference as the Max Value an Integer can save.
        int minDifference = Integer.MAX_VALUE;

        for (int i = 0; i < A.length-1; i++) {
            sumA -= A[i];
            sumB += A[i];
            if (Math.abs(sumB - sumA) < minDifference) {
                minDifference = Math.abs(sumB - sumA);
            }
        }

        return minDifference;
    }
}
