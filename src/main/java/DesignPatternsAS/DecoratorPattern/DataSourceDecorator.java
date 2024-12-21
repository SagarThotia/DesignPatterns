package DesignPatternsAS.DecoratorPattern;

// Base Decorator: Wraps a data source and forwards operations
// A base decorator class that stores a reference to a
// DataSource and delegates the calls to it.
public class DataSourceDecorator implements DataSource
{
    protected DataSource wrappee; // Wrapped DataSource component

    public DataSourceDecorator(DataSource source)
    {
        this.wrappee = source;
    }

    @Override
    public void writeData(String data)
    {
        wrappee.writeData(data); // Delegates writing to the wrapped component.
    }

    @Override
    public String readData()
    {
        return wrappee.readData(); // Delegates reading to the wrapped component.
    }
}

// Here read and write data implementations not give