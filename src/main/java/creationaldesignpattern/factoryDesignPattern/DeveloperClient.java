package creationaldesignpattern.factoryDesignPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DeveloperClient
{
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the designation of employee: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String employ = br.readLine();
        Employee employee = EmployeeFactory.getEmployee(employ);
        System.out.println("Employee designation: " + employ + ", Salary: " + employee.salary());
    }
}
