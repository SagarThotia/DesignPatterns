package DesignPatternsAS.SingletonPattern;
// Singleton class
public class Singleton
{
    // Static variable to hold the single instance of the class
    // Using 'Volatile' to ensure visibility of changes to instance across threads
    private static volatile Singleton instance; // Lazy instantation
    // private static Singleton instance = new Singleton(); // Eager instantiation.

    // Private Constructor to prevent instantiation from outside.
    public Singleton()
    {
        // Guard clause to prevent reflection-based instantiation.
        if(instance != null)
        {
            throw new RuntimeException("Use getInstance() method to create");
        }
        System.out.println("Singleton instance created.");
    }

    // Method to maintain singleton property during deserialization
    protected Object readResolve()
    {
        return getInstance();
    }

    // prevent cloning of the singleton instance
    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException("Singleton, cannot be clone.");
    }

    // Static method to get the single instance of the class
    public static Singleton getInstance()
    {
        // First check for existing instance without synchronization for performance.
        // Lazy instantiation.
        if(instance == null)
        {
            // Synchronize on the class to ensure thread safety during instantiation.
            synchronized (Singleton.class)
            {
                // Double-checked looking to avoid unnecessary synchronization.
                if(instance == null)
                {
                    System.out.println("Creating first instance");
                    instance = new Singleton();
                }
            }
        }
        System.out.println("Fetching instance");
        return instance;
    }
}
