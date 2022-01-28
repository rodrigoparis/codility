package codilityLessons;

import java.util.Map;
import java.util.Set;

public class Lesson1 {
    private static void forEachMapping() {
        Set<String> days = Set.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
        for (String day : days) {
            System.out.println(day);
        }
        System.out.println("**********");
        days.forEach(System.out::println);

        Map<String, String> daysOfWeek = Map.of("mon", "Monday", "tue", "Tuesday", "wed", "Wednesday",
                "thu", "Thursday", "fri", "Friday", "sat", "Saturday", "sun", "Sunday");

        for (Map.Entry<String, String> entry : daysOfWeek.entrySet()) {
            System.out.println(entry.getKey() + " stands for " + entry.getValue());
        }
    }

    static void notExceedFibonacciN(int n) {
        int a = 0;
        int b = 1;
        int c;

        while (a <= n) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
    }

    static void numberOfDigits(int n) {
        int cont = 0;
        while (n > 0) {
            n /= 10;
            cont++;
        }
        System.out.println(cont);
    }

    static void invertedTriangle(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void invertedTriangleHardCode(int n, int aux) {
        for (int i = 0; i < aux; i++) {
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * n - 1; j++) {
                System.out.print("* ");
            }
            n--;
            System.out.println();
        }
    }

    static void printTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void challengeBinaryGap(){

    }
}