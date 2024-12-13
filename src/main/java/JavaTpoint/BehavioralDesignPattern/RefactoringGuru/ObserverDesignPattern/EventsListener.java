package JavaTpoint.BehavioralDesignPattern.RefactoringGuru.ObserverDesignPattern;

import java.io.File;

public interface EventsListener
{
    public void update(String eventType, File file);
}
