package solutions;

import java.util.*;

public class PassingCars {
    public static int solution(int[] cars) {

        int passingCars = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] == 0) {
                for (int j = i + 1; j < cars.length; j++) {
                    if (cars[j] == 1) {
                        passingCars++;
                    }
                }
            }
        }

        return passingCars > 1000000000 ? -1 : passingCars;

    }

    public static int solutionB(int[] cars) {

        int goingEast = 0;
        long passingCars = 0;


        for (int i = 0; i < cars.length; i++) {
            if (cars[i] == 0) {
                goingEast++;
            } else {
                passingCars += goingEast;
            }
        }

        if (passingCars > 1000000000) return -1;

        return (int) passingCars;

    }
}
