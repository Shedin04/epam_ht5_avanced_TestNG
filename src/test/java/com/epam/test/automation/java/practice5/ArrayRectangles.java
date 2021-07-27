package com.epam.test.automation.java.practice5;

public class ArrayRectangles {
    private Rectangle[] rectangleArray;

    public ArrayRectangles(int n) {
        rectangleArray = new Rectangle[n];
    }

    public ArrayRectangles(Rectangle ... rectangleArray) {
        this.rectangleArray = new Rectangle[rectangleArray.length];
        this.rectangleArray = rectangleArray;
    }

    public boolean addRectangle(Rectangle rectangle) {
        for (int i = 0; i < rectangleArray.length; i++)
        {
            if (rectangleArray[i] == null)
            {
                rectangleArray[i] = rectangle;
                return true;
            }
        }
        return false;
    }

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     */
    public int numberMaxArea() {
        int index = 0;
        for (int i = 0; i < rectangleArray.length-1; i++) {
            if (rectangleArray[i].area() > rectangleArray[i + 1].area()) {
                index = i;
            }
        }
        return index;
    }

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     */
    public int numberMinPerimeter() {
        int index = 0;
        for (int i = 0; i < rectangleArray.length-1; i++) {
            if (rectangleArray[i].perimeter() < rectangleArray[i + 1].perimeter()) {
                index = i;
            }
        }
        return index;
    }

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     */
    public int numberSquares() {
        int count = 0;
        for (int i = 0; i < rectangleArray.length; i++) {
            if (rectangleArray[i].isSquare()) {
                count++;
            }
        }
        return count;
    }
}
