using ConsoleAppCQRSPattern.Models;  
namespace ConsoleAppCQRSPattern.Repositories {  
    public interface IEmployeeQueriesRepository {  
        Employee GetByID(int employeeID);  
    }  
}  