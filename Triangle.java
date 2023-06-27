public class Triangle extends Geometry{
    private double above,height;
    public Triangle(double above,double height){
        this.above = above;
        this.height = height;
    }
    public double getArea(){
        return above*height/2;
    }
}