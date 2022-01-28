package solutions;

public class CyclicRotation {

    public static int[] CyclicRotation(int[] array, int n) {
        if (array.length == 0 || array.length == n) {
            return array;
        }
        for (int i = 0; i < n; i++) {
            array = oneMovement(array);
        }

        return array;
    }

    static int[] oneMovement(int[] array) {
        int length = array.length;
        int start = array[length - 1];

        for (int i = length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = start;
        return array;
    }
}
