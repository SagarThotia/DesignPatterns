package DesignPatternsAS.SingletonPattern.SingletonApp;

public enum Singleton
{
    INSTANCE;

    // Singleton-specific methods can be added herre
    public void showMessage()
    {
        
        System.out.println("Hello from Singleton!");
    }
}
