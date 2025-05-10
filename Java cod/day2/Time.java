public class Time {
    private int second;
    private int minute;
    private int hour;
    
    public Time(){
        this.second=0;
        this.minute=0;
        this.hour=0;
    }

    public Time(int second,int minute,int hour){
        this.second=second;
        this.minute=minute;
        this.hour=hour;
    }

    public int getSecond(){
        return this.second;
    }

    public void setHour(int hour){
        this.hour=hour;
    }

    public String toString(){
        return String.format("%02d:%02d:%4d",this.hour,this.minute,this.second);
    }

    public Time nextSecond(){
        this.second+=1;
        return this;
    }
    
}
