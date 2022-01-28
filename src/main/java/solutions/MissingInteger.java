package solutions;

import java.util.HashSet;
import java.util.LinkedList;

public class MissingInteger {
    public static int solution(int[] A) {

        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> listB = new LinkedList<>();
        for (int i = 1; i <= A.length; i++) {
            list.add(i);
        }

        for (int i = 0; i < A.length; i++) {
            listB.add(A[i]);
        }

        HashSet<Integer> checkFullArray = new HashSet<>(listB);
        int max = 0;
        for (int a : checkFullArray) {
            if (a > max) {
                max = a;
            }
        }

        int min = Integer.MAX_VALUE;

        for (int a : list) {
            if (!listB.contains(a) && a < min) {
                min = a;
            }
        }
        if (checkFullArray.size() == max) {
            return checkFullArray.size() + 1;
        }
        return min > 0 ? min : 1;
    }

    public static int solutionB(int[] A) {
        HashSet<Integer> listOfNumbers = new HashSet<>();

        for (int i = 1; i <= A.length+1; i++) {
            listOfNumbers.add(i);
        }

        for (int num : A) {
            listOfNumbers.remove(num);
        }

        return listOfNumbers.iterator().next();
    }
}
