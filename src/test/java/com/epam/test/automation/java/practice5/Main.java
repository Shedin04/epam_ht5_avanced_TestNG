package com.epam.test.automation.java.practice5;

public class Main {

    public static void main(String[] args) {
        Rectangle sides = new Rectangle(4, 4);
        System.out.println(sides.area() + " | " + sides.perimeter() + " | " + sides.isSquare());
        sides.replaceSides();
        System.out.println("-------------");
        ArrayRectangles test = new ArrayRectangles(1);
        test.addRectangle(sides);
        System.out.println(test.numberSquares());
    }
}