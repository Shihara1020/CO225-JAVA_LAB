public class Line {
    private Point begin;
    private Point end;

    public Line(int x1,int y1,int x2,int y2){
        this.begin=new Point(x1,y1);
        this.begin=new Point(y1,y2);

    } 

    public Line(Point begin,Point end){
        this.begin=begin;
        this.end=end;
    }

    public Point getBegin(){
        return this.begin;
    }
    public void setBegin(Point begin){
        this.begin=begin;
    }

    public Point getEnd(){
        return this.end;
    }

    public void setEnd(Point end){
        this.end=end;
    }

    public int getBeginX(){
        return this.begin.getX();
    }
    
    public int getBeginY(){
        return this.begin.getY();
    }

    public void setBeginX(int x){
        this.begin.setX(x);
    }
    public void setBeginY(int y){
        this.begin.setY(y);
    }

    public int[] getBeginXY(int x,int y){
        int[] arr=new int[2];
        arr[0]=this.begin.getX();
        arr[1]=this.begin.getY();

        return arr;
    }

    public void setBeginXY(int x,int y){
        this.begin.setXY(x,y);
    }

    public int getEndX(){
        return this.end.getX();
    }
    public void setEndX(int x){
        this.end.setX(x);
    }

    public int getEndY(){
        return this.end.getY();
    }
    public void setEndY(int y){
        this.end.setY(y);
    }

    public void setEndXY(int x,int y){
        this.end.setXY(x, y);
    }

    public String toString(){
        return String.format("Line [Begin=(%d,%d),end(%d,%d)]",this.begin.getX(),this.begin.getY(),this.end.getX(),this.end.getY());

    }

    public double getLength(){
        return begin.distance(end);
    }



}
