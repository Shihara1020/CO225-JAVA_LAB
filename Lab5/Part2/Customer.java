public class Customer{
    private String name;
    boolean member;
    String memberType;

    Customer(String name){
        this.name=name;
        this.member=false;
    }

    public String getName(){
        return this.name;
    }

    public boolean isMember(){
        return this.member;
    }
    
    public void setMember(boolean member){
        this.member=member;
    }

    public String getMembertype(){
        return this.memberType;
    }

    public void setMemberType(String type){
        this.memberType=type;
    }
    @Override
    public String toString(){
        return String.format("Customer[name=%s,member=%b,memberType=%s]",this.name,this.member,this.memberType);
    }
}