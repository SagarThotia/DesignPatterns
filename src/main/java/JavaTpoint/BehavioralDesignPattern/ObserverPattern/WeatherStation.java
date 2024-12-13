package JavaTpoint.BehavioralDesignPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable
{
    private List<Observer> observers;
    private int temperature;
    private int humidity;

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    private boolean hasObserver(Observer observer)
    {
        int index = observers.indexOf(observer);
        return index >= 0;
    }

    @Override
    public void registerObserver(Observer observer)
    {
        if(!hasObserver(observer))
            observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer)
    {
        if(hasObserver(observer))
            observers.remove(observers.lastIndexOf(observer));
    }

    @Override
    public void notifyObservers()
    {
        observers.forEach(observer -> observer.update(temperature, humidity));
    }

    public void parametersChanged(int temperature, int humidity)
    {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObservers();
    }
}



/*
  Either observable will polling the data.
  Either observer will push the data.
  Argument: If you are calling multiple get method calls to get multiple data. what if there are a lot of data?.
  Argument: If we want to add a one more parameter's method.
 */