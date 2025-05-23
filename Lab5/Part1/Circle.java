public class Circle extends Shape{
    protected  double radius;

    Circle(){
        this.radius=1.0;
    }
    
    Circle(double radius){
        this.radius=radius;
    }
    Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius=radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius=radius;
    }

    @Override
    public double  getArea(){
        return this.radius*this.radius*Math.PI;
    }

    @Override
    public double getPerimeter(){
        return 2*Math.PI*this.radius;
    }

    @Override
    public String toString(){
        return String.format("Circle[%s,radius=%f]",super.toString(),this.radius);        
    }

}
