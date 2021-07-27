package com.epam.test.automation.java.practice5;

public class Main {

    public static void main(String[] args) {
        Rectangle sides = new Rectangle(4, 4);
        System.out.println(sides.area() + " | " + sides.perimeter() + " | " + sides.isSquare());
        sides.replaceSides();
        System.out.println("-------------");
        ArrayRectangles test = new ArrayRectangles(2);
        test.addRectangle(sides);
        Rectangle side2 = new Rectangle(3, 6);
        test.addRectangle(side2);
        System.out.println(test.numberSquares());
    }
}