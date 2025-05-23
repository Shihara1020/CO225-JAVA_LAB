public class Rectangle extends Shape {
    protected  double width;
    protected  double length;

    Rectangle(){
        this.width=1.0;
        this.length=1.0;
    }
    
    Rectangle(double width,double length){
        this.width=width;
        this.length=length;
    }

    Rectangle(double width,double length,String color,boolean filled){
        super(color,filled);
        this.width=width;
        this.length=length;
    }

    public double getWidth(){
        return this.width;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double getLength(){
        return this.length;
    }
    public void setLength(double length){
        this.length=length;
    }
    
    @Override
    public double getArea(){
        return this.length*this.width;
    }
    @Override
    public double getPerimeter(){
        return this.length*2+this.width*2;
    }
    @Override
    public String toString(){
        return String.format("Rectangle[%s.width=%f,length=%f]",super.toString(),this.width,this.length);
    }

}
