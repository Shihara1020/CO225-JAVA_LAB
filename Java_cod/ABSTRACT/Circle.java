public class Circle implements  Shape {
    double radius;

    Circle(double radius){
        this.radius=radius;
    }
    
    @Override
    public String toString(){
        return super.toString()+"the radius is"+this.radius;
    }

    // @Override
    // public double getarea(){
    //     return this.radius*this.radius*Math.PI;

    // }
    
}
