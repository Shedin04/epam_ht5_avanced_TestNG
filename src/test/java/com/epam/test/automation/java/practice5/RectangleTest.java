package com.epam.test.automation.java.practice5;

import org.testng.*;
import org.testng.annotations.Test;

public class RectangleTest {
    private int result;
    private int a = 2;
    private int b = 3;

    @Test
    public void test1() {
        result = a * b;
        Rectangle input = new Rectangle(a, b);
        Assert.assertEquals(result, input.area());
    }

    @Test
    public void test2() {
        result = 2*(a + b);
        Rectangle input = new Rectangle(a, b);
        Assert.assertEquals(result, input.perimeter());
    }
}