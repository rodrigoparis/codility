package solutions;

import java.util.*;

public class PermCheck {
    public static int solution(int[] array) {

        HashSet<Integer> checker = new HashSet<>();

        // I fill ckecker with the permutation version of the incomming array
        for (int i = 1; i <= array.length; i++) {
            checker.add(i);
        }

        //I remove from checker the elements that matches with my array
        for (int a : array) {
            checker.remove(a);
        }
        // If there is any element left in checker
       return checker.isEmpty() ? 1 : 0;
    }
}
