package solutions;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OddOcurrencesInArray {

    public static int unpairedNumberFA(int[] numbers) {

        List<Integer> numbersToList = Arrays.stream(numbers).boxed().collect(Collectors.toList());

        for (int i = 0; i < numbers.length / 2; i++) {
            Integer checkNumber = numbers[i];
            long repetitions = numbersToList.stream().filter(integer -> integer == checkNumber).count();
            if (repetitions < 2) {
                return checkNumber;
            }
        }
        return 0;
    }

    public static int unpairedNumberSA(int[] numbers) {
    //It improves performance as .contains in Set is more efficient than in Lists.
        Set<Integer> numbersList = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            int check = numbers[i];
            if (numbersList.contains(numbers[i])) {
                numbersList.remove(check);
            } else {
                numbersList.add(numbers[i]);
            }
        }
        return numbersList.iterator().next();
    }
}
