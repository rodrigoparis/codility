package solutions;

import java.util.ArrayList;
import java.util.HashSet;

public class FrogRiverOne {
    public static int solution(int[] leaves, int end) {
        HashSet<Integer> steps = new HashSet<>();

        for (int i = 0; i < leaves.length; i++) {
            if (!steps.contains(Integer.valueOf(leaves[i]))) {
                steps.add(leaves[i]);
            }
            if (steps.size() == end) {
                return i;
            }

        }
        return -1;

    }
}
