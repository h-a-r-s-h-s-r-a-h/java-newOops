package student;
public class Student extends Person {
    private String collegeName;
    private String year;

    public String getCollege(){
        return this.collegeName;
    }
    public void setCollege(String new_name){
        this.collegeName = new_name;
    }

    public String getYear(){
        return this.year;
    }
    public void setYear(String new_year){
        this.year = new_year;
    }
}