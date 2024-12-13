package JavaTpoint.BehavioralDesignPattern.RefactoringGuru.TemplateMethodPattern;
/**
 * Base class of social network
 */
public abstract class Network
{
    protected String userName;
    protected String password;

    public Network()
    {

    }

    /**
     * Publish the data to whatever network.
     */
    public boolean post(String message)
    {
        // Authenticate before posting. Every network uses a different authentication method.
        if(logIn(this.userName, this.password))
        {
            // Send the post data.
            boolean result = sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }
    protected abstract boolean logIn(String userName, String password);
    protected abstract boolean sendData(byte[] data);
    protected abstract void logOut();
}
