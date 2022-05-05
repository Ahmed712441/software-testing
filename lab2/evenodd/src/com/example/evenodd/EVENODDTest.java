package com.example.evenodd;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EVENODDTest {
    @Test
    public void test0() {
        assertTrue(EVENODD.check_even_odd(8) == "even");
    }
    @Test
    public void test1() {
        assertTrue(EVENODD.check_even_odd(5.5) == "neither even nor odd");
    }
    @Test
    public void test2() {
        assertTrue(EVENODD.check_even_odd(0) == "even");
    }
    @Test
    public void test3() {
        assertTrue(EVENODD.check_even_odd(9) == "odd");
    }
    @Test
    public void test4() {
        assertTrue(EVENODD.check_even_odd(-1) == "neither even nor odd");
    }
    @Test
    public void test5() {
        assertTrue(EVENODD.check_even_odd(-1.5) == "neither even nor odd");
    }
    @Test
    public void test6() {
        assertTrue(EVENODD.check_even_odd(-4) == "neither even nor odd");
    }
    @Test
    public void test7() {
        assertTrue(EVENODD.check_even_odd(-2.5) == "neither even nor odd");
    }

}