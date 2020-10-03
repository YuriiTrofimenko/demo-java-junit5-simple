package org.tyaa.demo.java.junit5;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PersonTest {

    @BeforeAll
    public static void beforeAll(){
        System.out.println("beforeAll");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("afterAll");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("beforeEach");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("afterEach");
    }

    @Test
    public void notExpectedExceptionOnConstructor () {
        Person p1 = null;
        try {
            p1 = new Person(1, "");
        } catch (Exception ex) {

        }
        assertNotNull(p1);
    }
}
