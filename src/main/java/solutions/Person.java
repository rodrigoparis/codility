package solutions;

import java.util.*;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return (name.length() % 2 == 0) ? 2 : 1;
    }

    public static class HashMapExample {

        public static void main(String[] args) {
            Map<Person, String> jobs = new HashMap<>();
            jobs.put(new Person("Paula"), "Doctor");
            jobs.put(new Person("Marti"), "Engineer");
            jobs.put(new Person("Anna"), "Teacher");
            jobs.put(new Person("Paul"), "Actor");
            List<String> lista = new ArrayList<>();
            lista.add("hola");
            lista.add("chau");
            lista.forEach(System.out::println);
            lista.add(1,"cómo estás?");
            System.out.println("Despues del add");
            lista.forEach(System.out::println);

            Set<String> test = new TreeSet<>();
            test.add("Hola");


        }


    }

}

