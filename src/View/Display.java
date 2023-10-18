/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

/**
 *
 * @author DELL
 */

public class Display {
    public void displayCircle(double radius, double area, double perimeter) {
        System.out.println("Circle - Radius: " + radius);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }

    public void displayRectangle(double width, double length, double area, double perimeter) {
        System.out.println("Rectangle - Width: " + width);
        System.out.println("Length: " + length);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }

    public void displayTriangle(double a, double b, double c, double area, double perimeter) {
        System.out.println("Triangle - Side A: " + a);
        System.out.println("Side B: " + b);
        System.out.println("Side C: " + c);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}

