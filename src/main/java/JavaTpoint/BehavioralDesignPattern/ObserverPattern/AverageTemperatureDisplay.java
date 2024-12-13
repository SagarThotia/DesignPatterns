package JavaTpoint.BehavioralDesignPattern.ObserverPattern;

public class AverageTemperatureDisplay implements Observer
{
    private int sumOfTemperatures;
    private int totalTemperatures;

    public AverageTemperatureDisplay(Observable observable)
    {
        sumOfTemperatures = 0;
        totalTemperatures = 0;
        observable.registerObserver(this);
    }

    @Override
    public void update(int temperature, int humidity)
    {
        sumOfTemperatures += temperature;
        totalTemperatures++;
        display();
    }

    private void display()
    {
        System.out.println("Average Temperature for the past " + totalTemperatures + " records = " + (double) sumOfTemperatures);
    }
}
