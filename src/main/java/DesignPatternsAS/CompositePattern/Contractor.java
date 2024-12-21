package DesignPatternsAS.CompositePattern;

public class Contractor implements OrganizationComponent
{
    private String name;
    private String vendorName;
    private long salary;

    // Constructor to initialize the employee with a name and position.
    public Contractor(String name, String vendorName, long salary)
    {
        this.name = name;
        this.vendorName = vendorName;
        this.salary = salary;
    }

    // Displays details specific to an individual employee.
    @Override
    public void showDetails()
    {
        System.out.println("Contractor: " + name + ", Vendor: " + vendorName + ", Salary: " + salary);
    }
}
