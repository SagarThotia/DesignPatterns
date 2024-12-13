package JavaTpoint.BehavioralDesignPattern.ObserverPattern;

public interface Observable
{
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}