package employee;

public class Person {
    private String name;
    private String phone;
    private String email;

    Person(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public String getPhone(){
        return this.phone;
    }
    public void setphone(String new_phone){
        this.phone = new_phone;
    }

    public String getEmail(){
        return this.email;
    }
    public void setEmail(String new_email){
        this.email = new_email;
    }
    public String toString(){
        return String.format("name -[%s] , phone -[%s] , email -[%s]",name,phone,email);
    }
    
}
