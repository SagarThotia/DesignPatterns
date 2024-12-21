package DesignPatternsAS.SingletonPattern;

public class SingletonMain
{
    public static void main(String[] args)
    {
        // Get the only object available (first call will create the instance)
        Singleton singleton1 = Singleton.getInstance();

        // Get the only object available (first call will create to new instance)
        Singleton singleton2 = Singleton.getInstance();

        // Check if both references point to the same instance
        System.out.println("Are both instance the same? " + (singleton1 == singleton2));
    }
}
