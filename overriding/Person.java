package overriding;

public class Person extends Object {
    private String name;
    private String email;
    private String phone;

    public String getName(){
        return this.name;
    }
    public void setName(String new_name){
        this.name = new_name;
    }

    public String getEmail(){
        return this.email;
    }
    public void setEmail(String new_email){
        this.email = new_email;
    }

    public String getPhone(){
        return this.phone;
    }
    public void setphone(String new_phone){
        this.phone = new_phone;
    }
    public String toString() {
        return "Harsh";
    }
    
}
