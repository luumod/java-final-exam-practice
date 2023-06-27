public class Rectangle extends Geometry{
    private double height,width;
    Rectangle(double height,double width){
        this.height = height;
        this.width = width;
    }
    public double getArea(){
        return height*width;
    }
}
