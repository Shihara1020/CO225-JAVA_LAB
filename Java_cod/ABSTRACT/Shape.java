public interface Shape{
   
    default double getarea(){
        return 0.0;
    };
    default public String display(){
        return "The color is red";
    }
}