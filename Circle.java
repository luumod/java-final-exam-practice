public class Circle extends Geometry{
    private double radius;
    Circle(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }
}