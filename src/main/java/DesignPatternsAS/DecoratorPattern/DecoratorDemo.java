package DesignPatternsAS.DecoratorPattern;

// Demo class to illustrate the use of the decorator pattern
public class DecoratorDemo
{
    public static void main(String[] args)
    {
        // Create a basic file data source
        DataSource fileDataSource = new FileDataSource("data.txt");

        DataSource encryption = new EncryptionDecorator(
                new CompressionDecorator(fileDataSource)
        );
        encryption.writeData("test data");
        encryption.readData();

        DataSource encryption1 = new CompressionDecorator(
                new EncryptionDecorator(fileDataSource)
        );
        encryption1.writeData("test data");
        encryption1.readData();
    }
}

// Requirement: Let's say we have to encrypt the data. So for that, we can either create a separate encryption
// method or we can change the same file in the data source or create a new method. But this happens a lot of time.
// That you need to do encryption in some scenarios and not to do encryption in some scenarios, in that case we will
// either pass a flag, Instead of writing all that legacy code, Our decorator pattern is used.
