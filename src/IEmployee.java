import java.util.ArrayList;

public interface IEmployee {
    public ArrayList<Employee> employees = new ArrayList<Employee>(){
        {
            add(new Employee(1, "William Smith", "Sales"));
            add(new Employee(2, "Nicolas Fox", "Management"));
        }
    };
}
