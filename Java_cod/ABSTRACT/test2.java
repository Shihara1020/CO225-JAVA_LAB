abstract public class Shape{
    private String color;
    private Boolean filled;

    Shape(){
        this.color="red";
        this.filled=true;
    }
    Shape(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }
    
    public abstract void setArea(double radius);
    public abstract double getPerimeter();
    public abstract String toString();
}