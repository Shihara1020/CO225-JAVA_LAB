public class Square extends Rectangle  {
    Square(){
        super();
    }
    Square(double side){
        super(side,side);
    }
    Square(double side,String color,boolean filled){
        super(side,side,color,filled);
    }
    public double getSide(){
        return super.length;
    }
    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }
    @Override
    public String toString(){
        return String.format("Square[%s]",super.toString());
    }
    
}
