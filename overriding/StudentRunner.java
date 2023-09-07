package overriding;

public class StudentRunner {
    public static void main(String[] args){
        Student definite = new Student();
        //now you can call method of both person and student class;
        definite.getName(); //calling method from person class;
        definite.getYear(); //calling method from student class;
        

        //now calling method of only person class which is super class
        //Person definite1 = new Person();
        String value = definite.toString();
        System.out.println(value);
        System.out.println(definite);
    }
}
