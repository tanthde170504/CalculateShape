/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author DELL
 */
import Controller.Manager;
import java.util.Scanner;

public class Main {
    private static final Scanner in = new Scanner(System.in);

    private static double checkInputDouble() {
        while (true) {
            try {
                return Double.parseDouble(in.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Re-input");
            }
        }
    }

    public static void main(String[] args) {
        Manager manager = new Manager();

        System.out.print("Please input side A of Triangle: ");
        double a = checkInputDouble();
        System.out.print("Please input side B of Triangle: ");
        double b = checkInputDouble();
        System.out.print("Please input side C of Triangle: ");
        double c = checkInputDouble();
        manager.inputTriangle(a, b, c);

        System.out.print("Please input side width of Rectangle: ");
        double width = checkInputDouble();
        System.out.print("Please input length of Rectangle: ");
        double length = checkInputDouble();
        manager.inputRectangle(width, length);

        System.out.print("Please input radius of Circle: ");
        double radius = checkInputDouble();
        manager.inputCircle(radius);

        manager.calculate();
    }
}
