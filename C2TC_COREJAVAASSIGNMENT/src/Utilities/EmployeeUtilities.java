package Utilities;
import ASSIGNMENT1.Employee.Employee;

public class EmployeeUtilities {
    public void printEmployeeDetails(Employee e) {
        System.out.println("ID: " + e.getEmployeeId());
        System.out.println("Name: " + e.getName());
        System.out.println("Salary: " + e.getSalary());
    }
    public void updateSalary(Employee e, double newSalary) {
        e.setSalary(newSalary);
    }
}