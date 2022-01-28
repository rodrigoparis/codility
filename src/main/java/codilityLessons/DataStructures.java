package codilityLessons;

import java.util.*;

public class DataStructures {

    public static void maps() {
        Map<Person, Diamond> mapa = new HashMap();
        mapa.put(new Person("Luis"), new Diamond("African Diamond"));
        System.out.println(mapa.get(new Person("Luis")).getName());


    }

    public static void linkedList() {
        LinkedList<String> colors = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        colors.push("Hello");
        colors.listIterator();
    }

    public static void stack() {
        List<String> colors = List.of("red", "pink");
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(4);
        System.out.println(stack.peek()); // it returns the last added element
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());

    }

    public static void queue() {
        Queue<String> supermarket = new LinkedList<>();

        supermarket.add("Juan");
        supermarket.add("Marcelo");
        supermarket.add("Laura");
        supermarket.add("Ricardo");
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek()); // it returns the first added element
        System.out.println(supermarket.poll()); // returns and remove the first element in queue
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek()); // it returns the first added element
        supermarket.offer("Miriam");

    }


}
