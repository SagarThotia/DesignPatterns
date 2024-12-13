package JavaTpoint.BehavioralDesignPattern.StrategyDesignPattern;

public class Multiplication implements Strategy
{
    @Override
    public float calculation(float number1, float number2) {
        return number1 * number2;
    }
}
