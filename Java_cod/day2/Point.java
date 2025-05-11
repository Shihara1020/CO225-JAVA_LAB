public class Point {
    private int x;
    private int y;

    public Point(){
        this.x=0;
        this.y=0;
    }

    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }

    public void setX(int x){
        if(x<0)
            throw new IllegalArgumentException("Invalid hour"+x);

        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }

    public String toString(){
        return String.format("(%d,%d)",this.x,this.y);
    }

    public int[] getXY(){
        int[] result=new int[2];
        result[0]=this.x;
        result[1]=this.y;
        return result;
    }

    public double distance(Point another){
        int diffX=(this.x-another.x);
        int diffY=(this.y-another.y);
        return (diffX+diffY);

    }


    
}
