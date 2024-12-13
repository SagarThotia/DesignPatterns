package JavaTpoint.CreationalDesignPattern.PrototypePattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrototypeDemo
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Employee id: ");
        int empid = Integer.parseInt(br.readLine());

        System.out.print("Enter Employee Name: ");
        String name = br.readLine();

        System.out.print("Enter Employee Designation: ");
        String designation = br.readLine();

        System.out.print("Enter Employee Address: ");
        String address = br.readLine();

        System.out.print("Enter Employee Salary: ");
        double salary = Double.parseDouble(br.readLine());

        EmployeeRecord employeeRecord1 = new EmployeeRecord(empid, name, designation, salary, address);
        employeeRecord1.showRecord();
        EmployeeRecord employeeRecord2 = (EmployeeRecord) employeeRecord1.getClone();
        employeeRecord2.showRecord();
    }
}
