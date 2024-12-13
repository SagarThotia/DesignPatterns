package JavaTpoint.BehavioralDesignPattern.ChainOfResponsibilityPattern;

public abstract class Logger
{
    protected static int OUTPUTINFO = 1;
    protected static int ERRORINFO = 2;
    protected static int DEBUGINFO = 3;
    protected int levels;
    protected Logger nextLevelLogger;

    public void setNextLevelLogger(Logger nextLevelLogger)
    {
        this.nextLevelLogger = nextLevelLogger;
    }

    public void logMessage(int levels, String message)
    {
        if(this.levels <= levels)
        {
            displayInfo(message);
        }
        if(nextLevelLogger != null)
        {
            nextLevelLogger.logMessage(levels, message);
        }
    }

    protected abstract void displayInfo(String message);
}
