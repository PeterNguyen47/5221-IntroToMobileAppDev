package IntroMobileApp;

public class Circle extends Shape {
    private static double radius;
    public Circle(String name){
        super(name);
    }

    public void setDimension(double radius){
        Circle.radius = radius;
    }

    public static void printDimensions(){
        System.out.println("Dimensions:\tRadius:\t" + radius);
    }

    public static double getArea() {
        return Math.PI * Math.pow(radius,2);
    }
}
