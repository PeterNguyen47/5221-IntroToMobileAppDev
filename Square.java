package IntroMobileApp;

public class Square extends Shape {
    private static double length, height;
    public Square(String name){
        super(name);
    }

    public void setDimension(double length, double height){
        Square.length = length;
        Square.height = height;
    }

    public static void printDimensions(){
        System.out.println("Dimensions:\tLength: " + length + "\t\tHeight:\t" + height);
    }

    public static double getArea(){
        return length * height;
    }
}
