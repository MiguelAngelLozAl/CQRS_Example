import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int option = 0;

        do{
            System.out.println("Welcome to the system");
            System.out.println("----------------------------------");
            System.out.println("1. Employees' List");
            System.out.println("2. Add Employee");
            System.out.println("3. Exit");
            System.out.print("\nType an option: ");
            option = Integer.parseInt(reader.readLine());

            if(option == 1){
                EmployeeReadController readController = new EmployeeReadController();
                ArrayList<Employee> employees = readController.getEmployees();

                System.out.println("\n\n----------------------------------");
                System.out.println("Employees' List");
                System.out.println("----------------------------------\n");
                for (Employee employee : employees) {
                    System.out.println( "ID: " + employee.getId() + 
                                        "\nName: " + employee.getFullName() +
                                        "\nDepartment: " + employee.getDepartment() + "\n");
                }
                System.out.println("----------------------------------");
                System.out.println("Press any key to continue ...\n");
                new java.util.Scanner(System.in).nextLine();

            } else if(option == 2){
                System.out.println("\n\n----------------------------------");
                System.out.println("Add Employee");
                System.out.println("----------------------------------");
                System.out.print("Firstname: ");
                String firstname = reader.readLine();
                System.out.print("Lastname: ");
                String lastname = reader.readLine();
                System.out.print("Department: ");
                String department = reader.readLine();

                EmployeeWriteController writeController = new EmployeeWriteController ( firstname, 
                                                                                        lastname,
                                                                                        department);
                writeController.saveEmployee();

            } else if(option != 1 && option != 2 && option != 3){
                System.out.println("\nInvalid option");
                System.out.println("Press any key to continue ...\n");
                new java.util.Scanner(System.in).nextLine();
            }

        } while(option != 3);
    }
}
