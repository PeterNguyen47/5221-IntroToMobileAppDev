package IntroMobileApp;

public class Triangle extends Shape {
    private static double a, b, c;
    public Triangle(String name){
        super(name);
    }

    public void setDimension(double a, double b, double c){
        Triangle.a = a;
        Triangle.b = b;
        Triangle.c = c;
    }

    public static void printDimensions(){
        System.out.println("Dimension:\tSide 1: " + a + "\n\t\t\tSide 2: " + b + "\n\t\t\tSide 3: " + c);
    }

    public static double getArea(){
        double s = 0.5 * (a + b + c);
        return Math.sqrt((s) * (s - a) * (s - b) * (s - c));
    }
}
