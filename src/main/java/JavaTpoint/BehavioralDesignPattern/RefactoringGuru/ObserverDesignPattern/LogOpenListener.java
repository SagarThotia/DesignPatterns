package JavaTpoint.BehavioralDesignPattern.RefactoringGuru.ObserverDesignPattern;

import java.io.File;

public class LogOpenListener implements EventsListener
{
    private final File log;

    public LogOpenListener(File fileName) {
        this.log = new File(fileName.toURI());
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Save to log " + log + " : Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }
}
