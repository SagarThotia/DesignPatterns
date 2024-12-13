package JavaTpoint.BehavioralDesignPattern.TemplateDesignPattern;

public class TemplatePatternDemo
{
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class<?> c = Class.forName("JavaTpoint.BehavioralDesignPattern.TemplateDesignPattern.Chess");
        Game game = (Game) c.newInstance();
        game.play();
    }
}
