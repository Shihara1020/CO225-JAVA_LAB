abstract public class Shape{
    protected String color;
    protected Boolean filled;

    Shape(){
        this.color="red";
        this.filled=true;

    }
    Shape(String color,boolean filled ){
        this.color=color;
        this.filled=filled;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public boolean isFilled(){
        return this.filled;
    }

    public void setFilled(boolean filled){
        this.filled=filled;
    }

    public String toString(){
        return String.format("Shape[color=%s,filled=%b]",this.color,this.filled);
    }

    abstract double getArea();
    abstract double getPerimeter();    

}