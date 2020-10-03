package org.tyaa.demo.java.junit5;

public class Main {
    public static void main(String[] args) {
        // Person p1 = new Person();
        // p1 = new Person(1, "Noname");
        /* p1.setId(1);
        p1.setName("Noname"); */
        Person p1 =
                Person.builder()
                .id(1)
                .name("Noname")
                .build();
        System.out.println(p1.getName());
    }
}
