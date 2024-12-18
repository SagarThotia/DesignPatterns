package JavaTpoint.BehavioralDesignPattern.RefactoringGuru.ObserverDesignPattern;


import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    Map<String, List<EventsListener>> listeners = new HashMap<>();

    public EventManager(String... operations) {
        for (String operation : operations) {
            this.listeners.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, EventsListener listener)
    {
        List<EventsListener> users = listeners.get(eventType);
        users.add(listener);
    }

    public void unsubscribe(String eventType, EventsListener listener)
    {
        List<EventsListener> users = listeners.get(eventType);
        users.remove(listener);
    }

    public void notify(String eventType, File file)
    {
        List<EventsListener> users = listeners.get(eventType);
        for (EventsListener listener: users)
        {
            listener.update(eventType, file);
        }
    }
}
