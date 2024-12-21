package DesignPatternsAS.DecoratorPattern;

// Concrete Component: Implements basic data source functionality
// The core functionality of data source, which writes and reads data from a file.
public class FileDataSource implements DataSource
{
    private String fileName; // Name of the file.

    public FileDataSource(String fileName)
    {
        this.fileName = fileName;
    }

    @Override
    public void writeData(String data) {
        System.out.println("Writing data to file: " + data);
        // Actual file writing logic here
    }

    @Override
    public String readData()
    {
        System.out.println("Reading data from file");
        return "file data"; // Example return value, replace with actual file reading
    }
}
