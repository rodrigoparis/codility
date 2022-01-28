package solutions;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    public static int fibonacci(Integer n, HashMap<Integer, Integer> memo) {
        // 0 1 1 2 3 5 8 13 21 34 55
        if (n == 0 || n == 1){
            return n;
        }

        if (memo.containsKey(n)){
            return memo.get(n);
        }


        memo.put(n, (fibonacci(n-1, memo) + fibonacci(n-2, memo)));

        return memo.get(n);



    }
}
