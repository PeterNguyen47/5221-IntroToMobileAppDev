package IntroMobileApp;

public class EquilateralTriangle extends Triangle {
    private double s1;
    public EquilateralTriangle(String name) {
        super(name);
    }

    public void setDimension(double s1){
        super.setDimension(s1, s1, s1);
        this.s1 = s1;
    }
}
