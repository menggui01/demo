package com.example.demo;

import org.junit.Test;

public class FuctionTest {
    @Test
    public void test_02() {
        System.out.println("15");
        int c =add(3,5);
        System.out.println(c);

    }

    public static int add(int a, int b){
        return a+b;
    }
}
