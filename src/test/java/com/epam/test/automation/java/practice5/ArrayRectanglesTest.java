package com.epam.test.automation.java.practice5;

import org.testng.*;
import org.testng.annotations.Test;

public class ArrayRectanglesTest {
    private int result = 0;
    private int a;
    private int b;

    @Test
    public void test1() {
        a = 4;
        b = 4;
        if (a == b ) result = 1;
        Rectangle sides = new Rectangle(a, b);
        ArrayRectangles input = new ArrayRectangles(1);
        input.addRectangle(sides);
        Assert.assertEquals(result, input.numberSquares());
    }
}