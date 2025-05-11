public class Cyclinder extends Circle{
    private double height;

    public Cyclinder(double height,double radius){
        super(radius);
        this.height=height;
    }

    public double getHeight(){
        return this.height;
    }
    public double getVolume(){
        return super.getArea()*height;
    }
    @Override
    public double getArea(){
        return 2*Math.PI*super.getRadius()*height;
    }
    @Override
    public String toString(){
        return String.format("Cyclinder");
    }

    
}
