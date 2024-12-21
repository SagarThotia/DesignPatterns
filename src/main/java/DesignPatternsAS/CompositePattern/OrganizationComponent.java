package DesignPatternsAS.CompositePattern;

// Common interface
// Defines a common interface for all objects in the hierarchy (both individual and composite objects)
public interface OrganizationComponent
{
    // Method to display details of the component,
    // to be implemented by both leaf and composite classes
    void showDetails();
}
