public class Author{
    private String name;
    private String email;
    private char gender;
    
    public Author(String name,String email,char gender){
        this.email=email;
        this.name=name;
        this.gender=gender;
    }    
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return  this.email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public char getGender(){
        return this.gender;
    }
    public String toString(){
        return String.format("%s (%c) at %s ",this.name,this.gender,this.email);
    }
}
