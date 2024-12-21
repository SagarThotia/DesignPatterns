package DesignPatternsAS.CompositePattern;

import java.util.ArrayList;
import java.util.List;

// Composite: Represents a department.
// Implements the OrganizationComponent interface and represents a composite object containing other components.
public class Department implements OrganizationComponent
{
    private String name; // Name of the department

    private List<OrganizationComponent> components = new ArrayList<>(); // List to store child components (either employees or sub-departments)

    // Constructor to initialize the department with a name.t
    public Department(String name)
    {
        this.name = name;
    }

    // Adds a component (employee or department) to the department.
    public void addComponent(OrganizationComponent component)
    {
        components.add(component);
    }

    // Removes a component (employee or department) from the department.
    public void removeComponent(OrganizationComponent component)
    {
        components.remove(component);
    }

    // Displays details of the department and recursively shows details of all its components.
    @Override
    public void showDetails()
    {
        System.out.println("Department: " + name);
        for(OrganizationComponent component: components)
        {
            component.showDetails(); // Delegates the call to each child component.
        }
    }
}
