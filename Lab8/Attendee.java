import  java.util.*;
public class Attendee {
    String name;
    String email;
    public Attendee(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    @Override
    public String toString() {
        return "Attendee [name=" + name + ", email=" + email + "]";
    }
    @Override
    public int hashCode() {
        return Objects.hash(email.toLowerCase());

    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) return false;
        Attendee attendee = (Attendee) obj;
        return email.equalsIgnoreCase(attendee.email);

    }

}
