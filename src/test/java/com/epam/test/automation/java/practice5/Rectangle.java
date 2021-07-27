package com.epam.test.automation.java.practice5;

public class Rectangle {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        if (a<= 0 || b<=0) {throw new IllegalArgumentException();}
        this.a = a;
        this.b = b;
    }

    public Rectangle(double a) {
        this.a = a;
        b=5;
    }

    public Rectangle() {
        a=4;
        b=3;
    }

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     */
    public double getSideA() {
        return this.a;
    }

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     */
    public double getSideB() {
        return this.b;
    }

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     */
    public double area() {
        return getSideA()*getSideB();
    }

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     */
    public double perimeter() {
        return 2*(getSideA()+getSideB());
    }

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     */
    public boolean isSquare() {
        return a == b;
    }

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     */
    public void replaceSides() {
        double temp = getSideA();
        this.a = getSideB();
        this.b = temp;
    }
}