package solutions;

public class MaxCounters {

    public static int [] solution(int x, int [] array){
        int[] counters = new int[x];
        int maxValue = 0;
        int minValue = 0;


        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j <= counters.length; j++) {
                if (array[i] == j) {
                    counters[array[i] - 1] += 1;
                    if (counters[array[i] - 1] > maxValue) {
                        maxValue = counters[array[i] - 1];
                    }
                } else if (array[i] == x + 1) {
                    for (int k = 0; k < counters.length; k++) {
                        counters[k] = maxValue;
                    }
                }
            }
        }

        return counters;
    }

    public static int [] solutionB(int x, int [] array){
        int[] counters = new int[x];
        int maxValue = 0;
        int minValue = 0;

        for (int i = 0; i < array.length; i++) {
            int operation = array[i];
            if (operation == x+1){
                // obtengo el valor mayor y lo asigno a todas los contadores
                minValue = maxValue;
            } else {
                operation--;
                counters[operation] = Math.max(counters[operation]+1, minValue+1);
                maxValue = Math.max(maxValue, counters[operation]);
            }
        }

        for (int i = 0; i < counters.length; i++) {
            counters[i] = Math.max(counters[i],minValue);
        }

        return counters;
    }
}
