package JavaTpoint.BehavioralDesignPattern.TemplateDesignPattern;

public class Soccer extends Game
{
    @Override
    public void initialize() {
        System.out.println("Soccer Game Initialized! Start playing.");
    }

    @Override
    public void start() {
        System.out.println("Game Started. Welcome to the Soccer game!");
    }

    @Override
    public void end() {
        System.out.println("Game Finished!");
    }
}
