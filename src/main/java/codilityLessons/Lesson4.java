package codilityLessons;

public class Lesson4 {
    //                           1<= m <= 1 000 000
    public static boolean excercise(int m, int [] A, int [] B){
        int n = A.length;
        int sum_a = sum(A);
        int sum_b = sum(B);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int change = B[j] - A[i];
                sum_a += change;
                sum_b -= change;
                if (sum_a == sum_b) return true;
                sum_a -= change;
                sum_b += change;
            }
        }
        return false;
    }

    public static int sum(int [] A){
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum+= A[i];
        }
        return sum;
    }
}
