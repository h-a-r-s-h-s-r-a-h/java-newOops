package employee;

public class Employee extends Person{
    private String title;
    private String employer;
    private String employeeGrade;
    private String salary;

    Employee(String name, String title){
        super(name);
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public String getEmployer(){
        return this.employer;
    }
    public void setEmployer(String new_employer){
        this.employer = new_employer;
    }

    public String getEmployeegrade(){
        return this.employeeGrade;
    }
    public void setEmpployeegrade(String new_grade){
        this.employeeGrade= new_grade;
    }

    public String getSalary(){
        return this.salary;
    }
    public void setSalary(String new_salary){
        this.salary = new_salary;
    }
    
    public String toString(){
        return String.format("name-[%s] ,phone-[%s] ,email-[%s] ,title-[%s] ,employer-[%s] ,employeegrade[%s] ,salary-[%s]"
        ,this.getName(),getPhone(),getEmail(),title,employer,employeeGrade,salary);
    }
    public String print_value_of_super_class(){
        return super.toString();
    }
}
