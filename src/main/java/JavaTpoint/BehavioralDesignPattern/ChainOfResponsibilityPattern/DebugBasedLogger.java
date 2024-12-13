package JavaTpoint.BehavioralDesignPattern.ChainOfResponsibilityPattern;

public class DebugBasedLogger extends Logger
{
    public DebugBasedLogger(int levels)
    {
        this.levels = levels;
    }

    @Override
    protected void displayInfo(String message)
    {
        System.out.println("DEBUG LOGGER INFO: " + message);
    }
}
