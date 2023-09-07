package employee;

public class Runner {
    public static void main(String[] args){
        Employee employee = new Employee("Harsh","Chairman");
        //employee.setName("Harsh");
        employee.setphone("6203104630");
        employee.setEmail("harshvirat894@gmail.com");
        //employee.setTitle("Chairman");
        employee.setEmployer("1");
        employee.setEmpployeegrade("A+");
        employee.setSalary("50,00,00,000");
        System.out.println(employee);
        System.out.println(employee.print_value_of_super_class());
    }
    
}
