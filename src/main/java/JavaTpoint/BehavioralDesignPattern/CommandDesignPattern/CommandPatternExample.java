package JavaTpoint.BehavioralDesignPattern.CommandDesignPattern;

public class CommandPatternExample
{
    public static void main(String[] args)
    {
        // Create devices
        TV tv = new TV();
        Stereo stereo = new Stereo();

        // Create command objects
        Command turnOnTVCommand = new TurnOnCommand(tv);
        Command turnOffTVCommand = new TurnOffCommand(tv);
        Command adjustVolumeStereoCommand = new AdjustVolumeCommand(stereo);
        Command changeChannelTVCommand = new ChangingChannelCommand(tv);

        // Create remote control
        RemoteControl remote = new RemoteControl();

        // Set and execute commands
        remote.setCommand(turnOnTVCommand);
        remote.pressButton();

        remote.setCommand(adjustVolumeStereoCommand);
        remote.pressButton();

        remote.setCommand(changeChannelTVCommand);
        remote.pressButton();

        remote.setCommand(turnOffTVCommand);
        remote.pressButton();
    }
}
