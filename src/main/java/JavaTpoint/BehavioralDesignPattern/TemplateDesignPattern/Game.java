package JavaTpoint.BehavioralDesignPattern.TemplateDesignPattern;

public abstract class Game
{
    public abstract void initialize();
    public abstract void start();
    public abstract void end();

    public final void play()
    {
        // initialize the game
        initialize();
        
        // start game
        start();

        // end game
        end();
    }
}
