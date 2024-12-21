package DesignPatternsAS.DecoratorPattern;

// Component Interface
// Defines the common interface for both the concrete component and decorators.
public interface DataSource
{
    void  writeData(String data); // Method to write data
    String readData(); // Method to read data
}
