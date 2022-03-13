using ConsoleAppCQRSPattern.Models;  
namespace ConsoleAppCQRSPattern.Repositories {  
    public interface IEmployeeCommandsRepository {  
        void SaveEmployee(Employee employee);  
    }  
}  