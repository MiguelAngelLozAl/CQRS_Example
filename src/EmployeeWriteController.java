public class EmployeeWriteController implements IEmployee{
    private String firstname;
    private String lastname;
    private String department;

    public EmployeeWriteController(String firstname, String lastname, String department){
        this.firstname = firstname;
        this.lastname = lastname;
        this.department = department;
    }

    public void saveEmployee(){
        Employee e = new Employee(  employees.size() + 1, 
                                    this.firstname + " " + this.lastname,
                                    this.department);
        employees.add(e);
        System.out.println("\n¡Employee added successfully!");
        System.out.println("Press any key to continue ...\n");
        new java.util.Scanner(System.in).nextLine();
    }
}
