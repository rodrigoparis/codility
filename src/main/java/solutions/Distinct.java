package solutions;

import java.util.*;
import java.util.stream.Collectors;

public class Distinct {
    public static long distinct(int[] numbers) {
        List<Integer> numbersToList = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        Collections.sort(numbersToList);

        return numbersToList.stream().distinct().count();

    }
}
