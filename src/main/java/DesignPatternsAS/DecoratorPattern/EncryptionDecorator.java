package DesignPatternsAS.DecoratorPattern;

// Concrete Decorator: Adds encryption behavior
// This decorator adds encryption functionality by modifying the write and read operation
public class EncryptionDecorator extends DataSourceDecorator
{
    public EncryptionDecorator(DataSource source)
    {
        super(source);
    }

    @Override
    public void writeData(String data)
    {
        String encryptedData = encrypt(data); // Encrypt data before writing
        super.writeData(encryptedData); // Call the base write method with encrypted data
    }

    @Override
    public String readData()
    {
        String data = super.readData(); // Retrieve the data
        return decrypt(data); // Decrypt the data before returning
    }

    private String encrypt(String data)
    {
        // Placeholder for encryption logic
        return "encrypted(" + data + ")";
    }

    private String decrypt(String data)
    {
        // Placeholder for decryption logic
        return data.replace("encrypted(", "").replace(")", "");
    }
}
