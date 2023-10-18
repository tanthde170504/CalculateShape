/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Circle;
import Model.Rectangle;
import Model.Triangle;
import View.Display;

/**
 *
 * @author DELL
 */

public class Manager {
    private Circle circle;
    private Rectangle rectangle;
    private Triangle triangle;
    private Display display;

    public Manager() {
        circle = new Circle();
        rectangle = new Rectangle();
        triangle = new Triangle();
        display = new Display();
    }

    public void inputCircle(double radius) {
        circle.setRadius(radius);
    }

    public void inputRectangle(double width, double length) {
        rectangle.setWidth(width);
        rectangle.setLength(length);
    }

    public void inputTriangle(double a, double b, double c) {
        triangle.setA(a);
        triangle.setB(b);
        triangle.setC(c);
    }

    public void calculate() {
        display.displayCircle(circle.getRadius(), circle.getArea(), circle.getPerimeter());
        display.displayRectangle(rectangle.getWidth(), rectangle.getLength(), rectangle.getArea(), rectangle.getPerimeter());
        display.displayTriangle(triangle.getA(), triangle.getB(), triangle.getC(), triangle.getArea(), triangle.getPerimeter());
    }
}


