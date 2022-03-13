using ConsoleAppCQRSPattern.Models;  
namespace ConsoleAppCQRSPattern.Commands {  
    public interface IEmployeeCommands {  
        void SaveEmployeeData(Employee employee);  
    }  
}  