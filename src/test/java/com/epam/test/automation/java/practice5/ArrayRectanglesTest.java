package com.epam.test.automation.java.practice5;

import org.testng.*;
import org.testng.annotations.Test;

public class ArrayRectanglesTest {
    private int result = 0;
    private int n=2;

    @Test
    public void test1() {
        n=2;
        Rectangle[] rectangle = new Rectangle[n];
        rectangle[0] = new Rectangle(4, 4);
        rectangle[1] = new Rectangle(5, 5);
        ArrayRectangles input = new ArrayRectangles(n);
        input.addRectangle(rectangle[0]); input.addRectangle(rectangle[1]);
        if (rectangle[0].getSideA() == rectangle[0].getSideB()) result++;
        if (rectangle[1].getSideA() == rectangle[1].getSideB()) result++;
        Assert.assertEquals(input.numberSquares(), result);
    }

    @Test
    public void test2() {
        n=2;
        Rectangle[] rectangle = new Rectangle[n];
        rectangle[0] = new Rectangle(8, 4);
        rectangle[1] = new Rectangle(5, 15);
        ArrayRectangles input = new ArrayRectangles(n);
        input.addRectangle(rectangle[0]); input.addRectangle(rectangle[1]);
        result = 2;
        Assert.assertEquals(input.numberSquares(), result); //не находит макс. площадь
    }
}