package JavaTpoint.BehavioralDesignPattern.ChainOfResponsibilityPattern;

public class ConsoleBasedLogger extends Logger
{
    public ConsoleBasedLogger(int levels)
    {
        this.levels = levels;
    }

    @Override
    protected void displayInfo(String message)
    {
        System.out.println("CONSOLE LOGGER INFO: " + message);
    }
}
