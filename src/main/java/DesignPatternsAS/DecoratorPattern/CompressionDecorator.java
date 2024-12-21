package DesignPatternsAS.DecoratorPattern;

// Concrete Decorator: Adds compression behavior
// This decorator adds compression functionality by modifying the write and read operation.
public class CompressionDecorator extends DataSourceDecorator
{
    public CompressionDecorator(DataSource source)
    {
        super(source);
    }

    @Override
    public void writeData(String data) {
        String compressedData = compress(data); // Compress data before calling
        super.writeData(compressedData); // Call the base write method with compressed
    }

    @Override
    public String readData()
    {
        String data = super.readData(); // Retrieve the data
        return decompress(data); // Decompress the data before returning
    }

    private String compress(String data)
    {
        // Placeholder for compression logic
        return "compressed(" + data + ")";
    }

    private String decompress(String data)
    {
        // Placeholder for decompression logic
        return data.replace("compressed(", "").replace(")", "");
    }
}
