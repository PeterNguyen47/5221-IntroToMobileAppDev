package IntroMobileApp;

public class Shape {
    private static String name;

    public Shape(String name) {
        Shape.name = name;
    }

    /** returns the name of the shape */
    public static String getName() {
        return name;
    }

    /** returns the area of the shape */
    public static double getArea() {
        return 0.0;
    }

    public static void printDimensions(){
        System.out.println("No Dimensions");
    }
}