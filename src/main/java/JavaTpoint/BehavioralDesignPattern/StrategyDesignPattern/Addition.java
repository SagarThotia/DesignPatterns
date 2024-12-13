package JavaTpoint.BehavioralDesignPattern.StrategyDesignPattern;

public class Addition implements Strategy
{
    @Override
    public float calculation(float number1, float number2) {
        return number1 + number2;
    }
}
