package JavaTpoint.BehavioralDesignPattern.CommandDesignPattern;

public class ChangingChannelCommand implements Command
{
    private final TV tv;

    public ChangingChannelCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute()
    {
        tv.changeChannel();
    }
}
