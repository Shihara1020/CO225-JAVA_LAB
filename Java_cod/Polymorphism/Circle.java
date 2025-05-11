public class Circle{
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return this.radius;
    }

    public String toString(){
        return String.format("Circle's %d",this.getRadius());
    }
    public double getArea(){
        return Math.PI*getRadius()*getRadius();
    }
}