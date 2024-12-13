package JavaTpoint.BehavioralDesignPattern.ObserverPattern;

public class Demo
{
    private static void delay()
    {
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }
    public static void main(String[] args)
    {
        WeatherStation weatherStation = new WeatherStation();

        CurrentWeatherConditionDisplay currentWeatherConditionDisplay = new CurrentWeatherConditionDisplay(weatherStation);

        AverageTemperatureDisplay averageTemperatureDisplay = new AverageTemperatureDisplay(weatherStation);

        weatherStation.parametersChanged(20, 10);
        delay();
        weatherStation.parametersChanged(10, 30);
        delay();
        weatherStation.parametersChanged(50,60);
    }
}
