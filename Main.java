package IntroMobileApp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Square Object
        System.out.println("Input length and height for a Square: ");
        Square sq = new Square("Shape:\t\tSquare");
        sq.setDimension(s.nextDouble(), s.nextDouble());
        System.out.println(Square.getName());
        Square.printDimensions();
        System.out.println("Area:\t\t" + Square.getArea());

        // Circle Object
        System.out.println("\nInput a radius for a Circle: ");
        Circle c = new Circle("Shape:\t\tCircle");
        c.setDimension(s.nextDouble());
        System.out.println(Circle.getName());
        Circle.printDimensions();
        System.out.println("Area:\t\t" + Circle.getArea());

        // Triangle Object
        System.out.println("\nInput a, b, and c for a Triangle: ");
        Triangle t = new Triangle("Shape:\t\tTriangle");
        t.setDimension(s.nextDouble(), s.nextDouble(), s.nextDouble());
        System.out.println(Triangle.getName());
        Triangle.printDimensions();
        System.out.println("Area:\t\t" + Triangle.getArea());

        // Equilateral Triangle Object
        System.out.println("\nInput a side for an Equilateral Triangle: ");
        EquilateralTriangle et = new EquilateralTriangle("Shape:\t\tEquilateral Triangle");
        et.setDimension(s.nextDouble());
        System.out.println(EquilateralTriangle.getName());
        EquilateralTriangle.printDimensions();
        System.out.println("Area:\t\t" + EquilateralTriangle.getArea());
    }
}
