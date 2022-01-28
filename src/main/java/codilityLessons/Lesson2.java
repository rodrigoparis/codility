package codilityLessons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lesson2 {


    public static void first() {
        String[] shoppingList = {"Tomato", "Potato", "Carrot"};
        String[] emptyList = {};

        for (String a : shoppingList) {
            System.out.println("Item = " + a);
        }
        for (int i = 0; i < shoppingList.length; i++) {
            System.out.println("shoppingList item n°"+ i +": " + shoppingList[i]);
        }
    }

    public static  int [] reversedArray(int [] array){
        int [] reversedArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
          reversedArray[i] = array[array.length-i-1];
        }

        return reversedArray;
    }
}
