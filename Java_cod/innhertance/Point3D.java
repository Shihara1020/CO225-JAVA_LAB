public class Point3D extends Point2D {
    private int z;
    public Point3D(){
        super();
        this.z=0;
    }

    public Point3D(int x,int y,int z){
        super(x,y);
        this.z=z;
    }

    public int getZ(){
        return this.z;
    }

    public void setZ(){
        this.z=z;
    }
    
    @Override
    public String toString(){
        return String.format("(%d,%d,%d)",getX(),getY(),this.z);
    }
    
}
