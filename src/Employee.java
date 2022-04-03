public class Employee{
    private int id;
    private String fullName;
    private String department;

    public Employee(int id, String fullName, String department){
        this.id = id;
        this.fullName = fullName;
        this.department = department;
    }

    public int getId(){
        return this.id;
    }

    public String getFullName(){
        return this.fullName;
    }

    public String getDepartment(){
        return this.department;
    }
}