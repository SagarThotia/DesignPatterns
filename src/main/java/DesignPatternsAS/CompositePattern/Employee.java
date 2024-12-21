package DesignPatternsAS.CompositePattern;

// Leaf: Represents an employee
// Implements the OrganizationComponent interface and represents an individual object in the employee class.
public class Employee implements OrganizationComponent
{
    private String name;
    private String position;
    private long salary;

    // Constructor to initialize the employee with a name and position.
    public Employee(String name, String position, long salary)
    {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    // Displays details specific to an individual employee.
    @Override
    public void showDetails()
    {
        System.out.println("Employee: " + name + ", Position: " + position + ", Salary: " + salary);
    }
}
