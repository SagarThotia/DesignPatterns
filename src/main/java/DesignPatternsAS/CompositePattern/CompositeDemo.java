package DesignPatternsAS.CompositePattern;

public class CompositeDemo
{
    public static void main(String[] args)
    {
        // Create individual employees (leaf components)

        OrganizationComponent emp1 = new Employee("Sagar", "Architect", 500000);
        OrganizationComponent emp2 = new Employee("Albina", "Developer", 200000);

        // Creating an engineering department and add employees to it.
        Department engineering = new Department("Engineering");
        engineering.addComponent(emp1);
        engineering.addComponent(emp2);

        OrganizationComponent contractor1 = new Contractor("Micheal", "Kaglon", 30000);
        engineering.addComponent(contractor1);

        // Creating another employee and a marketing department, then add the employee to this department.
        OrganizationComponent emp3 = new Employee("Sam", "Manager", 600000);
        Department marketing = new Department("Marketing");
        marketing.addComponent(emp3);

        // Creating a top-level department (head office) and add sub-departments (engineering and marketing)
        Department headOffice = new Department("Head Office");
        headOffice.addComponent(engineering);
        headOffice.addComponent(marketing);

        // Display the entire organization structure by calling showDetails
        headOffice.showDetails();
    }
}
