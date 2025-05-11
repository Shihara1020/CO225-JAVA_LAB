public class Circle {
    private Point center;
    private double radius;

    public Circle(){
        this.center=new Point(0,0);
        this.radius=1.0;
    }

    public Circle(int xCneter,int yCenter,double radius){
        this.center=new Point(xCneter, yCenter);
        this.radius=radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius=radius;

    }
    public Point getCenter(){
        return this.center;
    }

    public void setCenter(Point center){
        this.center=center;
    }

    public int getCenterX(){
        return this.center.getX();
    }


    
}
