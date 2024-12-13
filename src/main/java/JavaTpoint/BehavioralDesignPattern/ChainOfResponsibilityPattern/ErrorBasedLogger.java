package JavaTpoint.BehavioralDesignPattern.ChainOfResponsibilityPattern;

public class ErrorBasedLogger extends Logger
{
    public ErrorBasedLogger(int levels)
    {
        this.levels = levels;
    }

    @Override
    protected void displayInfo(String message)
    {
        System.out.println("ERROR LOGGER INFO: " + message);
    }
}
